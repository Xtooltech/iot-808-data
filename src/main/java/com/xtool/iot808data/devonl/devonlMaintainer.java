package com.xtool.iot808data.devonl;

import java.util.Calendar;
import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.util.StringUtils;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.xtool.enterprise.data.DataSearchResult;
import com.xtool.iot808data.MongoQueryParser;
import com.xtool.iot808data.device.deviceModel;

public class devonlMaintainer implements IdevonlMaintainer {

	@Autowired
	public MongoTemplate mongoTemplate;
	
	@Override
	public boolean add(devonlModel data) {
		return mongoTemplate.insert(data,devonlModel.COLLECTION_NAME)!=null;
	}

	@Override
	public boolean addRange(devonlModel[] data) {
		devonlModel[] result= mongoTemplate.insert(data,devonlModel.COLLECTION_NAME);
		return result!=null && result.length>0;
	}

	@Override
	public boolean remove(String sno) {
		Query query=new Query();
		Criteria criteria=Criteria.where("sno").is(sno);
		query.addCriteria(criteria);
		DeleteResult result= mongoTemplate.remove(query, devonlModel.COLLECTION_NAME);
		return result.getDeletedCount()>0;
	}

	@Override
	public boolean upsert(devonlModel data, boolean ignoreNull) {
		Query query=new Query();
		Criteria criteria=Criteria.where("sno").is(data.sno);
		query.addCriteria(criteria);
		if( mongoTemplate.exists(query, devonlModel.COLLECTION_NAME)) {
			return update(data, ignoreNull);
		}else {
			return add(data);
		}
	}

	@Override
	public boolean update(devonlModel data, boolean ignoreNull) {
		if(data==null || data.sno==null || data.sno.equals(""))return false;
		Query query=new Query();
		Criteria criteria=Criteria.where("sno").is(data.sno);
		query.addCriteria(criteria);
		Update update=new Update();
		update.set("svrname",data.svrname);
		if(data.svrip!=null || !ignoreNull)update=update.set("svrip", data.svrip);
		if(data.svrport!=null || !ignoreNull)update=update.set("svrport", data.svrport);
		if(data.chnip!=null || !ignoreNull)update=update.set("chnip", data.chnip);
		if(data.chnport!=null || !ignoreNull)update=update.set("chnport", data.chnport);
		if(data.monip!=null || !ignoreNull)update=update.set("monip", data.monip);
		if(data.monport!=null || !ignoreNull)update=update.set("monport", data.monport);
		if(data.onltime!=null || !ignoreNull)update=update.set("onltime", data.onltime);
		if(data.isonl!=null || !ignoreNull)update=update.set("isonl", data.isonl);
		if(data.reftime!=null || !ignoreNull)update=update.set("reftime", data.reftime);
		if(data.refdura!=null || !ignoreNull)update=update.set("refdura", data.refdura);
		if(data.offtime!=null || !ignoreNull)update=update.set("offtime", data.offtime);
		UpdateResult result= mongoTemplate.updateMulti(query, update, devonlModel.COLLECTION_NAME);
		return result.getModifiedCount()>0;
	}

	@Override
	public deviceModel getById(String id) {
		if(StringUtils.isEmpty(id)) return null;
		Query query=new Query(Criteria.where("_id").is(new ObjectId(id)));
		return mongoTemplate.findOne(query, deviceModel.class, devonlModel.COLLECTION_NAME);
	}

	@Override
	public DataSearchResult<devonlModel> search(devonlCondition condition) {
		return MongoQueryParser.search(
				  mongoTemplate
				, devonlCondition.class
				, condition
				, devonlModel.class
				, devonlModel.COLLECTION_NAME
		);
	}

	@Override
	public boolean refresh(String sno, int refdura) {
		Query query=new Query(Criteria.where("sno").is(sno));
		Date now =new Date();
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(now);
		calendar.add(Calendar.SECOND, refdura);
		Update update=new Update();
		update.set("refdura", refdura)
		.set("reftime", now)
		.set("offtime", calendar.getTime());
		UpdateResult result=mongoTemplate.updateFirst(query, update, devonlModel.COLLECTION_NAME);
		return result.getModifiedCount()>0;
	}

}
