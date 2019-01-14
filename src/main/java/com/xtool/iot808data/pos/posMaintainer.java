package com.xtool.iot808data.pos;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import com.xtool.enterprise.data.DataSearchResult;
import com.xtool.iot808data.MongoQueryParser;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.BulkOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.util.StringUtils;

import java.util.*;


public class posMaintainer implements IposMaintainer
{
	@Autowired
	public MongoTemplate mongoTemplate;
	
	@Override
	public boolean add(posModel position)
    {
		return mongoTemplate.insert(position, posModel.COLLECTION_NAME) != null;
	}

	
	@Override
	public boolean add(posModel[] positions)
    {
		Collection<posModel> result = mongoTemplate.insert(Arrays.asList(positions), posModel.COLLECTION_NAME);
		return (result != null) && (result.size() > 0);
	}
	

	@Override
    public boolean updateGaodeLocationRange(posModel[] positions)
    {
        if (positions == null || positions.length == 0)
        {
            return false;
        }
        try
        {
            BulkOperations bulkOperations = mongoTemplate.bulkOps(BulkOperations.BulkMode.UNORDERED, Match.class);
            for (posModel position : positions)
            {
                Query query = new Query();
                query.addCriteria(Criteria.where("sno").is(position.sno));
                query.addCriteria(Criteria.where("dtime").is(position.dtime));

                Update update = new Update();
                update.set("gd_lat", position.gd_lat);
                update.set("gd_lng", position.gd_lng);

                bulkOperations.updateOne(query, update);
            }
            bulkOperations.execute();
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }


	@Override
	public posModel getById(String id)
    {
		if (StringUtils.isEmpty(id))
        {
            return null;
        }
		Query query = new Query(Criteria.where("_id").is(new ObjectId(id)));
		return mongoTemplate.findOne(query, posModel.class, posModel.COLLECTION_NAME);
	}
	

	@Override
    public List<String> getAllDevicesLastedPos()
    {
        return null;
    }
    
    
    @Override
    public DataSearchResult<posModel> search(posCondition condition)
    {
        return MongoQueryParser.search(
            mongoTemplate
            , posCondition.class
            , condition
            , posModel.class
            , posModel.COLLECTION_NAME
        );
    }
    
    
}
