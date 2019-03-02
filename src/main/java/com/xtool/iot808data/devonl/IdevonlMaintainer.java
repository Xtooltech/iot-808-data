package com.xtool.iot808data.devonl;

import com.xtool.enterprise.data.DataSearchResult;
import com.xtool.iot808data.device.deviceModel;

public interface IdevonlMaintainer {
	public boolean add(devonlModel data);
	public boolean addRange(devonlModel[] data);
	public boolean remove(String sno);
	public boolean upsert(devonlModel data,boolean ignoreNull);
    public boolean bupsert(devonlModel[] datas, boolean ignoreNull);
	public boolean update(devonlModel data, boolean ignoreNull);
	public deviceModel getById(String id);
	public DataSearchResult<devonlModel> search(devonlCondition condition);
	public boolean refresh(String sno,int refdura);
}
