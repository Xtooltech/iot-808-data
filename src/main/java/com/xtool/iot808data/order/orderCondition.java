package com.xtool.iot808data.order;

import java.util.Date;

import com.xtool.enterprise.data.DataSearchCondition;
import com.xtool.enterprise.data.FieldCondition;

public class orderCondition extends DataSearchCondition{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2763973129309599629L;

	public FieldCondition<String> oid;
	public FieldCondition<String> sno;
	public FieldCondition<String> uid;
	public FieldCondition<String> appid;
	public FieldCondition<String> otype;
	public FieldCondition<Date> btime;
	public FieldCondition<Date> etime;
	public FieldCondition<Integer> amount;
	public FieldCondition<String> stat;
	public FieldCondition<String> desc;
	public FieldCondition<String> getOid() {
		return oid;
	}
	public void setOid(FieldCondition<String> oid) {
		this.oid = oid;
	}
	public FieldCondition<String> getSno() {
		return sno;
	}
	public void setSno(FieldCondition<String> sno) {
		this.sno = sno;
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
	public FieldCondition<Date> getBtime() {
		return btime;
	}
	public void setBtime(FieldCondition<Date> btime) {
		this.btime = btime;
	}
	public FieldCondition<Date> getEtime() {
		return etime;
	}
	public void setEtime(FieldCondition<Date> etime) {
		this.etime = etime;
	}
	public FieldCondition<Integer> getAmount() {
		return amount;
	}
	public void setAmount(FieldCondition<Integer> amount) {
		this.amount = amount;
	}
	public FieldCondition<String> getStat() {
		return stat;
	}
	public void setStat(FieldCondition<String> stat) {
		this.stat = stat;
	}
	public FieldCondition<String> getDesc() {
		return desc;
	}
	public void setDesc(FieldCondition<String> desc) {
		this.desc = desc;
	}
	
	
}
