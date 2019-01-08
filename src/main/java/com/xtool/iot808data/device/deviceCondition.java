package com.xtool.iot808data.device;


import java.util.Date;
import com.xtool.enterprise.data.DataSearchCondition;
import com.xtool.enterprise.data.FieldCondition;

public class deviceCondition extends DataSearchCondition {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4923531908572440218L;
	public FieldCondition<String> sno;
	public FieldCondition<String> btmac;
	public FieldCondition<Integer> dtype;
	public FieldCondition<String> iccid;
	public FieldCondition<String> manid;
	public FieldCondition<String> model;
	public FieldCondition<String> province;
	public FieldCondition<String> city;
	public FieldCondition<String> authkey;
	public FieldCondition<Date> regtime;
	public FieldCondition<Date> prodtime;
	public FieldCondition<String> hwver;
	public FieldCondition<String> swver;
	public FieldCondition<String> otgid;
	
	public FieldCondition<String> getSno() {
		return sno;
	}
	public void setSno(FieldCondition<String> sno) {
		this.sno = sno;
	}
	public FieldCondition<String> getBtmac() {
		return btmac;
	}
	public void setBtmac(FieldCondition<String> btmac) {
		this.btmac = btmac;
	}
	public FieldCondition<Integer> getDtype() {
		return dtype;
	}
	public void setDtype(FieldCondition<Integer> dtype) {
		this.dtype = dtype;
	}
	public FieldCondition<String> getIccid() {
		return iccid;
	}
	public void setIccid(FieldCondition<String> iccid) {
		this.iccid = iccid;
	}
	public FieldCondition<String> getManid() {
		return manid;
	}
	public void setManid(FieldCondition<String> manid) {
		this.manid = manid;
	}
	public FieldCondition<String> getModel() {
		return model;
	}
	public void setModel(FieldCondition<String> model) {
		this.model = model;
	}
	public FieldCondition<String> getProvince() {
		return province;
	}
	public void setProvince(FieldCondition<String> province) {
		this.province = province;
	}
	public FieldCondition<String> getCity() {
		return city;
	}
	public void setCity(FieldCondition<String> city) {
		this.city = city;
	}
	public FieldCondition<String> getAuthkey() {
		return authkey;
	}
	public void setAuthkey(FieldCondition<String> authkey) {
		this.authkey = authkey;
	}
	public FieldCondition<Date> getRegtime() {
		return regtime;
	}
	public void setRegtime(FieldCondition<Date> regtime) {
		this.regtime = regtime;
	}
	public FieldCondition<Date> getProdtime() {
		return prodtime;
	}
	public void setProdtime(FieldCondition<Date> prodtime) {
		this.prodtime = prodtime;
	}
	public FieldCondition<String> getHwver() {
		return hwver;
	}
	public void setHwver(FieldCondition<String> hwver) {
		this.hwver = hwver;
	}
	public FieldCondition<String> getSwver() {
		return swver;
	}
	public void setSwver(FieldCondition<String> swver) {
		this.swver = swver;
	}
	public FieldCondition<String> getOtgid() {
		return otgid;
	}
	public void setOtgid(FieldCondition<String> otgid) {
		this.otgid = otgid;
	}
}
