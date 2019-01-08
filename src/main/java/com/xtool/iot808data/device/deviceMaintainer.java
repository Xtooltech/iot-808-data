package com.xtool.iot808data.device;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.xtool.enterprise.data.DataSearchResult;
import com.xtool.iot808data.MongoQueryParser;

@Component
public class deviceMaintainer implements IdeviceMaintainer {

	@Autowired
	public MongoTemplate mongoTemplate;
	
	public boolean add(deviceModel data) {
		return mongoTemplate.insert(data,deviceModel.COLLECTION_NAME)!=null;
	}

	public boolean addRange(deviceModel[] data) {
		deviceModel[] result= mongoTemplate.insert(data,deviceModel.COLLECTION_NAME);
		return result!=null && result.length>0;
	}

	public boolean remove(String sno) {
		Query query=new Query();
		Criteria criteria=Criteria.where("sno").is(sno);
		query.addCriteria(criteria);
		DeleteResult result= mongoTemplate.remove(query, deviceModel.COLLECTION_NAME);
		return result.getDeletedCount()>0;
	}

	public boolean upsert(deviceModel data, boolean ignoreNull) {
		Query query=new Query();
		Criteria criteria=Criteria.where("sno").is(data.sno);
		query.addCriteria(criteria);
		if( mongoTemplate.exists(query, deviceModel.COLLECTION_NAME)) {
			return update(data, ignoreNull);
		}else {
			return add(data);
		}
	}
	public boolean update(deviceModel data, boolean ignoreNull) {
		if(data==null || data.sno==null || data.sno.equals(""))return false;
		Query query=new Query();
		Criteria criteria=Criteria.where("sno").is(data.sno);
		query.addCriteria(criteria);
		Update update=new Update();
		update.set("btmac",data.btmac);
		if(data.dtype!=null || !ignoreNull)update=update.set("dtype", data.dtype);
		if(data.iccid!=null || !ignoreNull)update=update.set("iccid", data.iccid);
		if(data.manid!=null || !ignoreNull)update=update.set("manid", data.manid);
		if(data.model!=null || !ignoreNull)update=update.set("model", data.model);
		if(data.province!=null || !ignoreNull)update=update.set("province", data.province);
		if(data.city!=null || !ignoreNull)update=update.set("city", data.city);
		if(data.authkey!=null || !ignoreNull)update=update.set("authkey", data.authkey);
		if(data.regtime!=null || !ignoreNull)update=update.set("regtime", data.regtime);
		if(data.prodtime!=null || !ignoreNull)update=update.set("prodtime", data.prodtime);
		if(data.hwver!=null || !ignoreNull)update=update.set("hwver", data.hwver);
		if(data.swver!=null || !ignoreNull)update=update.set("swver", data.swver);
		if(data.otgid!=null || !ignoreNull)update=update.set("otgid", data.otgid);
		UpdateResult result= mongoTemplate.updateFirst(query, update, deviceModel.COLLECTION_NAME);
		return result.getModifiedCount()>0;
	}
	public deviceModel getById(String id) {
		if(StringUtils.isEmpty(id)) return null;
		Query query=new Query(Criteria.where("_id").is(new ObjectId(id)));
		return mongoTemplate.findOne(query, deviceModel.class, deviceModel.COLLECTION_NAME);
	}

	public DataSearchResult<deviceModel> search(deviceCondition condition) {
		
		return MongoQueryParser.search(
				  mongoTemplate
				, deviceCondition.class
				, condition
				, deviceModel.class
				, deviceModel.COLLECTION_NAME
		);
	}

}
