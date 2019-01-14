package com.xtool.iot808data.pos;

import com.xtool.enterprise.data.DataSearchResult;

import java.util.List;

public interface IposMaintainer
{
	boolean add(posModel position);
	boolean add(posModel[] positions);
	boolean updateGaodeLocationRange(posModel[] positions);
	posModel getById(String id);
	List<String> getAllDevicesLastedPos();
    DataSearchResult<posModel> search(posCondition condition);
}
