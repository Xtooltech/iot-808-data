package com.xtool.iot808data.pos;

import java.util.List;

public interface IposMaintainer
{
	boolean add(posModel position);
	boolean add(posModel[] positions);
	boolean updateGaodeLocationRange(posModel[] positions);
	posModel getById(String id);
	List<String> getAllDevicesLastedPos();
}
