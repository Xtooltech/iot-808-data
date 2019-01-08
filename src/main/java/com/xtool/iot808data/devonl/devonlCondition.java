package com.xtool.iot808data.devonl;

import java.util.Date;

import com.xtool.enterprise.data.DataSearchCondition;
import com.xtool.enterprise.data.FieldCondition;

public class devonlCondition extends DataSearchCondition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7437922719613648621L;
	public FieldCondition<String> sno;
	public FieldCondition<String> svrname;
	public FieldCondition<String> svrip;
	public FieldCondition<Integer> svrport;
	public FieldCondition<String> chnip;
	public FieldCondition<Integer> chnport;
	public FieldCondition<String> monip;
	public FieldCondition<Integer> monport;
	public FieldCondition<Date> onltime;
	public FieldCondition<Boolean> isonl;
	public FieldCondition<Date> reftime;
	public FieldCondition<Integer> refdura;
	public FieldCondition<Date> offtime;
	public FieldCondition<String> getSno() {
		return sno;
	}
	public FieldCondition<String> getSvrname() {
		return svrname;
	}
	public FieldCondition<String> getSvrip() {
		return svrip;
	}
	public FieldCondition<Integer> getSvrport() {
		return svrport;
	}
	public FieldCondition<String> getChnip() {
		return chnip;
	}
	public FieldCondition<Integer> getChnport() {
		return chnport;
	}
	public FieldCondition<String> getMonip() {
		return monip;
	}
	public FieldCondition<Integer> getMonport() {
		return monport;
	}
	public FieldCondition<Date> getOnltime() {
		return onltime;
	}
	public FieldCondition<Boolean> getIsonl() {
		return isonl;
	}
	public FieldCondition<Date> getReftime() {
		return reftime;
	}
	public FieldCondition<Integer> getRefdura() {
		return refdura;
	}
	public FieldCondition<Date> getOfftime() {
		return offtime;
	}
	public void setSno(FieldCondition<String> sno) {
		this.sno = sno;
	}
	public void setSvrname(FieldCondition<String> svrname) {
		this.svrname = svrname;
	}
	public void setSvrip(FieldCondition<String> svrip) {
		this.svrip = svrip;
	}
	public void setSvrport(FieldCondition<Integer> svrport) {
		this.svrport = svrport;
	}
	public void setChnip(FieldCondition<String> chnip) {
		this.chnip = chnip;
	}
	public void setChnport(FieldCondition<Integer> chnport) {
		this.chnport = chnport;
	}
	public void setMonip(FieldCondition<String> monip) {
		this.monip = monip;
	}
	public void setMonport(FieldCondition<Integer> monport) {
		this.monport = monport;
	}
	public void setOnltime(FieldCondition<Date> onltime) {
		this.onltime = onltime;
	}
	public void setIsonl(FieldCondition<Boolean> isonl) {
		this.isonl = isonl;
	}
	public void setReftime(FieldCondition<Date> reftime) {
		this.reftime = reftime;
	}
	public void setRefdura(FieldCondition<Integer> refdura) {
		this.refdura = refdura;
	}
	public void setOfftime(FieldCondition<Date> offtime) {
		this.offtime = offtime;
	}
	
}
