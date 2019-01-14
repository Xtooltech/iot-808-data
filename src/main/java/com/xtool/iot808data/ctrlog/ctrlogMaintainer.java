package com.xtool.iot808data.ctrlog;


import com.xtool.enterprise.data.DataSearchResult;
import com.xtool.iot808data.MongoQueryParser;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.util.StringUtils;


public class ctrlogMaintainer implements IctrlogMaintainer
{
	@Autowired
	public MongoTemplate mongoTemplate;
	
	@Override
	public boolean add(ctrlogModel data) {
		return mongoTemplate.insert(data, ctrlogModel.COLLECTION_NAME)!=null;
	}

	@Override
	public boolean addRange(ctrlogModel[] data) {
		ctrlogModel[] result= mongoTemplate.insert(data,ctrlogModel.COLLECTION_NAME);
		return result!=null && result.length>0;
	}

	@Override
	public ctrlogModel getById(String id) {
		if(StringUtils.isEmpty(id)) return null;
		Query query=new Query(Criteria.where("_id").is(new ObjectId(id)));
		return mongoTemplate.findOne(query, ctrlogModel.class, ctrlogModel.COLLECTION_NAME);
	}
    
    @Override
    public DataSearchResult<ctrlogModel> search(ctrlogCondition condition) {
        return MongoQueryParser.search(
            mongoTemplate
            , ctrlogCondition.class
            , condition
            , ctrlogModel.class
            , ctrlogModel.COLLECTION_NAME
        );
    }
}
