package com.xtool.iot808data.devonl;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="devonl")
public class devonlModel {
	public static final String COLLECTION_NAME="devonl";
	@Id	public String id;
	@Field public String sno;
	@Field public String svrname;
	@Field public String svrip;
	@Field public Integer svrport;
	@Field public String chnip;
	@Field public Integer chnport;
	@Field public String monip;
	@Field public Integer monport;
	@Field public Date onltime;
	@Field public Boolean isonl;
	@Field public Date reftime;
	@Field public Integer refdura;
	@Field public Date offtime;
	public String getId() {
		return id;
	}
	public String getSno() {
		return sno;
	}
	public String getSvrname() {
		return svrname;
	}
	public String getSvrip() {
		return svrip;
	}
	public Integer getSvrport() {
		return svrport;
	}
	public String getChnip() {
		return chnip;
	}
	public Integer getChnport() {
		return chnport;
	}
	public String getMonip() {
		return monip;
	}
	public Integer getMonport() {
		return monport;
	}
	public Date getOnltime() {
		return onltime;
	}
	public Boolean getIsonl() {
		return isonl;
	}
	public Date getReftime() {
		return reftime;
	}
	public Integer getRefdura() {
		return refdura;
	}
	public Date getOfftime() {
		return offtime;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public void setSvrname(String svrname) {
		this.svrname = svrname;
	}
	public void setSvrip(String svrip) {
		this.svrip = svrip;
	}
	public void setSvrport(Integer svrport) {
		this.svrport = svrport;
	}
	public void setChnip(String chnip) {
		this.chnip = chnip;
	}
	public void setChnport(Integer chnport) {
		this.chnport = chnport;
	}
	public void setMonip(String monip) {
		this.monip = monip;
	}
	public void setMonport(Integer monport) {
		this.monport = monport;
	}
	public void setOnltime(Date onltime) {
		this.onltime = onltime;
	}
	public void setIsonl(Boolean isonl) {
		this.isonl = isonl;
	}
	public void setReftime(Date reftime) {
		this.reftime = reftime;
	}
	public void setRefdura(Integer refdura) {
		this.refdura = refdura;
	}
	public void setOfftime(Date offtime) {
		this.offtime = offtime;
	}
	
}
