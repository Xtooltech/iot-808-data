package com.xtool.iot808data.device;

//import org.springframework.data.mongodb.repository.MongoRepository;

import com.xtool.enterprise.data.DataSearchResult;

public interface IdeviceMaintainer {//extends MongoRepository<deviceModel, String> {
	
	public boolean add(deviceModel data);
	public boolean addRange(deviceModel[] data);
	public boolean remove(String sno);
	public boolean upsert(deviceModel data,boolean ignoreNull);
	public boolean update(deviceModel data, boolean ignoreNull);
	public deviceModel getById(String id);
	public DataSearchResult<deviceModel> search(deviceCondition condition);
}
