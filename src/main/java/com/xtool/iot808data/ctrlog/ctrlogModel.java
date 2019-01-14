package com.xtool.iot808data.ctrlog;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection="ctrlog")
public class ctrlogModel
{
	public static final String COLLECTION_NAME="ctrlog";
	
	@Id	public String id;
	@Field public String sno;
	@Field public String ctrname;
	@Field public String ctrparam;
	@Field public String uid;
	@Field public String appid;
	@Field public Integer ctrstat;
	@Field public String ctres;
	@Field public Date ctrtime;
	@Field public Date logtime;
	public String getId() {
		return id;
	}
	public String getSno() {
		return sno;
	}
	public String getCtrname() {
		return ctrname;
	}
	public String getCtrparam() {
		return ctrparam;
	}
	public String getUid() {
		return uid;
	}
	public String getAppid() {
		return appid;
	}
	public Integer getCtrstat() {
		return ctrstat;
	}
	public String getCtres() {
		return ctres;
	}
	public Date getCtrtime() {
		return ctrtime;
	}
	public Date getLogtime() {
		return logtime;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public void setCtrname(String ctrname) {
		this.ctrname = ctrname;
	}
	public void setCtrparam(String ctrparam) {
		this.ctrparam = ctrparam;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public void setCtrstat(Integer ctrstat) {
		this.ctrstat = ctrstat;
	}
	public void setCtres(String ctres) {
		this.ctres = ctres;
	}
	public void setCtrtime(Date ctrtime) {
		this.ctrtime = ctrtime;
	}
	public void setLogtime(Date logtime) {
		this.logtime = logtime;
	}
	
}
