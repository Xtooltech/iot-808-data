package com.xtool.iot808data.devstat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.util.StringUtils;
import com.mongodb.client.result.UpdateResult;
import com.xtool.enterprise.data.DataSearchResult;
import com.xtool.iot808data.MongoQueryParser;

public class devstatMaintainer implements IdevstatMaintainer {

	@Autowired
	public MongoTemplate mongoTemplate;
	
	@Override
	public boolean add(devstatModel data) {
		return mongoTemplate.insert(data,devstatModel.COLLECTION_NAME)!=null;
	}

	@Override
	public boolean update(devstatModel data, boolean ignoreNull) {
		if(data==null || StringUtils.isEmpty(data.sno))return false;
		Query query=new Query();
		Criteria criteria=Criteria.where("sno").is(data.sno);
		query.addCriteria(criteria);
		Update update=new Update();
		
		if(data.lng!=null || !ignoreNull)update=update.set("lng", data.lng);
		if(data.lat!=null || !ignoreNull)update=update.set("lat", data.lat);
		if(data.alt!=null || !ignoreNull)update=update.set("alt", data.alt);
		if(data.speed!=null || !ignoreNull)update=update.set("speed", data.speed);
		if(data.angle!=null || !ignoreNull)update=update.set("angle", data.angle);
		if(data.dtime!=null || !ignoreNull)update=update.set("dtime", data.dtime);
		if(data.svrtime!=null || !ignoreNull)update=update.set("svrtime", data.svrtime);
		if(data.gd_lng!=null || !ignoreNull)update=update.set("gd_lng", data.gd_lng);
		if(data.gd_lat!=null || !ignoreNull)update=update.set("gd_lat", data.gd_lat);
		if(data.p_event!=null || !ignoreNull)update=update.set("p_event", data.p_event);
		if(data.aflags!=null || !ignoreNull)update=update.set("aflags", data.aflags);
		if(data.stat!=null || !ignoreNull)update=update.set("stat", data.stat);
		if(data.exitems!=null || !ignoreNull)update=update.set("exitems", data.exitems);
		
		UpdateResult result= mongoTemplate.updateMulti(query, update, devstatModel.COLLECTION_NAME);
		return result.getModifiedCount()>0;
	}

	@Override
	public boolean upsert(devstatModel data, boolean ignoreNull) {
		Query query=new Query();
		Criteria criteria=Criteria.where("sno").is(data.sno);
		query.addCriteria(criteria);
		
		if( mongoTemplate.exists(query, devstatModel.COLLECTION_NAME)) {
			return update(data, ignoreNull);
		}else {
			return add(data);
		}
	}

	@Override
	public DataSearchResult<devstatModel> search(devstatCondition condition) {
		
		return MongoQueryParser.search(
				  mongoTemplate
				, devstatCondition.class
				, condition
				, devstatModel.class
				, devstatModel.COLLECTION_NAME
		);
	}

}
