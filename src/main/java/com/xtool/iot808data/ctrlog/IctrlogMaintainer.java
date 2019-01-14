package com.xtool.iot808data.ctrlog;

import com.xtool.enterprise.data.DataSearchResult;


public interface IctrlogMaintainer
{
	boolean add(ctrlogModel data);
	boolean addRange(ctrlogModel[] data);
	ctrlogModel getById(String id);
    DataSearchResult<ctrlogModel> search(ctrlogCondition condition);
}
