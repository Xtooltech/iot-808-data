package com.xtool.iot808data.device;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="devs")
public class deviceModel {
	
	public static final String COLLECTION_NAME="devs";
	@Id
	public String id;
	@Field public String sno;
	@Field public String btmac;
	@Field public Integer dtype;
	@Field public String iccid;
	@Field public String manid;
	@Field public String model;
	@Field public String province;
	@Field public String city;
	@Field public String authkey;
	@Field public Date regtime;
	@Field public Date prodtime;
	@Field public String hwver;
	@Field public String swver;
	@Field public String otgid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getBtmac() {
		return btmac;
	}
	public void setBtmac(String btmac) {
		this.btmac = btmac;
	}
	public Integer getDtype() {
		return dtype;
	}
	public void setDtype(Integer dtype) {
		this.dtype = dtype;
	}
	public String getIccid() {
		return iccid;
	}
	public void setIccid(String iccid) {
		this.iccid = iccid;
	}
	public String getManid() {
		return manid;
	}
	public void setManid(String manid) {
		this.manid = manid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAuthkey() {
		return authkey;
	}
	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}
	public Date getRegtime() {
		return regtime;
	}
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}
	public Date getProdtime() {
		return prodtime;
	}
	public void setProdtime(Date prodtime) {
		this.prodtime = prodtime;
	}
	public String getHwver() {
		return hwver;
	}
	public void setHwver(String hwver) {
		this.hwver = hwver;
	}
	public String getSwver() {
		return swver;
	}
	public void setSwver(String swver) {
		this.swver = swver;
	}
	public String getOtgid() {
		return otgid;
	}
	public void setOtgid(String otgid) {
		this.otgid = otgid;
	}
	
	
}
