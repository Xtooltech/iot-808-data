package com.xtool.iot808data.devparam;


public interface IdevparamMaintainer
{
	boolean add(devparamModel devparam);
	boolean add(devparamModel[] devparams);
	boolean remove(String sno);
	boolean upsert(devparamModel devparam, boolean ignoreNull);
	devparamModel getById(String id);
}
