package com.xtool.iot808data.order;

import com.xtool.enterprise.data.DataSearchResult;

public interface IorderMaintainer {
	public boolean add(orderModel data);
	public boolean update(orderModel data, boolean ignoreNull);
	public DataSearchResult<orderModel> search(orderCondition condition);
}
