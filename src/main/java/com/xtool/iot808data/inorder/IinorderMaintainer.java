package com.xtool.iot808data.inorder;

import com.xtool.enterprise.data.DataSearchResult;

public interface IinorderMaintainer {
	
	public boolean add(inorderModel data);
	public boolean update(inorderModel data, boolean ignoreNull);
	public boolean upsert(inorderModel data, boolean ignoreNull);
	public boolean remove(String oid);
	public DataSearchResult<inorderModel> search(inorderCondition condition);
	
}
