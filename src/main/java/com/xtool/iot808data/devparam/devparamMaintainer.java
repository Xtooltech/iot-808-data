package com.xtool.iot808data.devparam;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.xtool.iot808data.device.deviceModel;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Collection;


public class devparamMaintainer implements IdevparamMaintainer
{
	@Autowired
	public MongoTemplate mongoTemplate;
	
	@Override
	public boolean add(devparamModel devparam)
    {
		return mongoTemplate.insert(devparam, devparamModel.COLLECTION_NAME) != null;
	}

	
	@Override
	public boolean add(devparamModel[] devparams)
    {
		Collection<devparamModel> result = mongoTemplate.insert(Arrays.asList(devparams), devparamModel.COLLECTION_NAME);
		return (result != null) && (result.size() > 0);
	}
	

	@Override
    public boolean remove(String sno)
    {
        Query query = new Query();
        Criteria criteria = Criteria.where("sno").is(sno);
        query.addCriteria(criteria);
        DeleteResult result = mongoTemplate.remove(query, devparamModel.COLLECTION_NAME);
        return result.getDeletedCount() > 0;
    }


	@Override
	public boolean upsert(devparamModel devparam, boolean ignoreNull)
    {
        Query query = new Query();
        Criteria criteria = Criteria.where("sno").is(devparam.sno);
        query.addCriteria(criteria);
        if( mongoTemplate.exists(query, deviceModel.COLLECTION_NAME))
        {
            return update(devparam, ignoreNull);
        }
        else
            {
            return add(devparam);
        }
	}
    
    private boolean update(devparamModel devparam, boolean ignoreNull)
    {
        if (devparam==null || devparam.sno==null || devparam.sno.equals(""))
        {
            return false;
        }
        
        Query query = new Query();
        Criteria criteria = Criteria.where("sno").is(devparam.sno);
        query.addCriteria(criteria);
        
        Update update = new Update();
        if (devparam.getP0001() != null || !ignoreNull)
        {
            update = update.set("p0001", devparam.getP0001());
        }
        if (devparam.getP0010() != null || !ignoreNull)
        {
            update = update.set("p0010", devparam.getP0010());
        }
        if (devparam.getP0013() != null || !ignoreNull)
        {
            update = update.set("p0013", devparam.getP0013());
        }
        if (devparam.getP0018() != null || !ignoreNull)
        {
            update = update.set("p0018", devparam.getP0018());
        }
        if (devparam.getP0027() !=null || !ignoreNull)
        {
            update = update.set("p0027", devparam.getP0027());
        }
        if (devparam.getP0029() != null || !ignoreNull)
        {
            update = update.set("p0029", devparam.getP0029());
        }
        if (devparam.getP0030() !=null || !ignoreNull)
        {
            update = update.set("p0030", devparam.getP0030());
        }
        if (devparam.getP0055() != null || !ignoreNull)
        {
            update = update.set("p0055", devparam.getP0055());
        }
        if (devparam.getP0056() != null || !ignoreNull)
        {
            update = update.set("p0056", devparam.getP0056());
        }
        
        UpdateResult result= mongoTemplate.updateFirst(query, update, devparam.COLLECTION_NAME);
        return result.getModifiedCount()>0;
    }
    

	@Override
    public devparamModel getById(String id)
    {
        if (StringUtils.isEmpty(id))
        {
            return null;
        }
        Query query = new Query(Criteria.where("_id").is(new ObjectId(id)));
        return mongoTemplate.findOne(query, devparamModel.class, devparamModel.COLLECTION_NAME);
    }

}
