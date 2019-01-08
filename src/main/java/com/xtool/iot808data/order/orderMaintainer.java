package com.xtool.iot808data.order;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.util.StringUtils;
import com.mongodb.client.result.UpdateResult;
import com.xtool.enterprise.data.DataSearchResult;
import com.xtool.iot808data.MongoQueryParser;

public class orderMaintainer implements IorderMaintainer {
	
	@Autowired
	public MongoTemplate mongoTemplate;
	
	public boolean add(orderModel data) {
		return mongoTemplate.insert(data,orderModel.COLLECTION_NAME)!=null;
	}

	public boolean update(orderModel data, boolean ignoreNull) {
		if(data==null || StringUtils.isEmpty(data.oid)|| StringUtils.isEmpty(data.stat))return false;
		
		int amnt=data.amount==null?0:data.amount;
		Date etime=data.etime==null?new Date():data.etime;
		
		Query query=new Query();
		Criteria criteria=Criteria.where("oid").is(data.oid);
		query.addCriteria(criteria);
		
		Update update=new Update();
		update.set("stat",data.stat);
		if(data.desc!=null || !ignoreNull) update.set("desc", data.desc);
		
		update.set("amount", amnt);
		update.set("etime", etime);
		
		UpdateResult result= mongoTemplate.updateFirst(query, update, orderModel.COLLECTION_NAME);
		return result.getModifiedCount()>0;
	}
	
	public DataSearchResult<orderModel> search(orderCondition condition) {
		
		return MongoQueryParser.search(
				  mongoTemplate
				, orderCondition.class
				, condition
				, orderModel.class
				, orderModel.COLLECTION_NAME
		);
	}
}
