package com.xtool.iot808data.inorder;

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

public class inorderMaintainer implements IinorderMaintainer {

	@Autowired
	public MongoTemplate mongoTemplate;
	
	@Override
	public boolean add(inorderModel data) {
		return mongoTemplate.insert(data,inorderModel.COLLECTION_NAME)!=null;
	}

	@Override
	public boolean upsert(inorderModel data, boolean ignoreNull) {
		Query query=new Query();
		Criteria criteria=Criteria.where("oid").is(data.oid);
		query.addCriteria(criteria);
		
		if( mongoTemplate.exists(query, inorderModel.COLLECTION_NAME)) {
			return update(data, ignoreNull);
		}else {
			return add(data);
		}
	}
	@Override
	public boolean update(inorderModel data, boolean ignoreNull) {
		
		if(data==null || StringUtils.isEmpty(data.oid))return false;
		Query query=new Query();
		Criteria criteria=Criteria.where("oid").is(data.oid);
		query.addCriteria(criteria);
		Update update=new Update();
		
		if(data.sno!=null || !ignoreNull)update=update.set("sno", data.sno);
		if(data.uid!=null || !ignoreNull)update=update.set("uid", data.uid);
		if(data.appid!=null || !ignoreNull)update=update.set("appid", data.appid);
		if(data.otype!=null || !ignoreNull)update=update.set("otype", data.otype);
		if(data.lng!=null || !ignoreNull)update=update.set("lng", data.lng);
		if(data.lat!=null || !ignoreNull)update=update.set("lat", data.lat);
		if(data.btime!=null || !ignoreNull)update=update.set("btime", data.btime);
		
		UpdateResult result= mongoTemplate.updateFirst(query, update, inorderModel.COLLECTION_NAME);
		return result.getModifiedCount()>0;
	}

	@Override
	public DataSearchResult<inorderModel> search(inorderCondition condition) {
		
		return MongoQueryParser.search(
				  mongoTemplate
				, inorderCondition.class
				, condition
				, inorderModel.class
				, inorderModel.COLLECTION_NAME
		);
	}

	@Override
	public boolean remove(String oid) {
		if(StringUtils.isEmpty(oid))return false;
		Query query=new Query();
		Criteria criteria=Criteria.where("oid").is(oid);
		query.addCriteria(criteria);
		DeleteResult result= mongoTemplate.remove(query, inorderModel.COLLECTION_NAME);
		return result.getDeletedCount()>0;
	}

}
