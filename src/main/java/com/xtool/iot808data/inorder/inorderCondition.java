package com.xtool.iot808data.inorder;

import java.util.Date;

import com.xtool.enterprise.data.DataSearchCondition;
import com.xtool.enterprise.data.FieldCondition;

public class inorderCondition extends DataSearchCondition{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1188419218525983433L;
	
	public FieldCondition<String> sno;
	public FieldCondition<String> oid;
	public FieldCondition<String> uid;
	public FieldCondition<String> appid;
	public FieldCondition<String> otype;
	public FieldCondition<Double> lng;
	public FieldCondition<Double> lat;
	public FieldCondition<Date> btime;
	public FieldCondition<String> getSno() {
		return sno;
	}
	public void setSno(FieldCondition<String> sno) {
		this.sno = sno;
	}
	public FieldCondition<String> getOid() {
		return oid;
	}
	public void setOid(FieldCondition<String> oid) {
		this.oid = oid;
	}
	public FieldCondition<String> getUid() {
		return uid;
	}
	public void setUid(FieldCondition<String> uid) {
		this.uid = uid;
	}
	public FieldCondition<String> getAppid() {
		return appid;
	}
	public void setAppid(FieldCondition<String> appid) {
		this.appid = appid;
	}
	public FieldCondition<String> getOtype() {
		return otype;
	}
	public void setOtype(FieldCondition<String> otype) {
		this.otype = otype;
	}
	public FieldCondition<Double> getLng() {
		return lng;
	}
	public void setLng(FieldCondition<Double> lng) {
		this.lng = lng;
	}
	public FieldCondition<Double> getLat() {
		return lat;
	}
	public void setLat(FieldCondition<Double> lat) {
		this.lat = lat;
	}
	public FieldCondition<Date> getBtime() {
		return btime;
	}
	public void setBtime(FieldCondition<Date> btime) {
		this.btime = btime;
	}
}
