package com.xtool.iot808data.devstat;

import com.xtool.enterprise.data.DataSearchResult;

public interface IdevstatMaintainer {
	public boolean add(devstatModel data);
	public boolean update(devstatModel data, boolean ignoreNull);
	public boolean upsert(devstatModel data, boolean ignoreNull);
	public DataSearchResult<devstatModel> search(devstatCondition condition);
}
