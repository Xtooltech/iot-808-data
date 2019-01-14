package com.xtool.iot808data.ctrlog;

import com.xtool.enterprise.data.DataSearchCondition;
import com.xtool.enterprise.data.FieldCondition;

import java.util.Date;

public class ctrlogCondition extends DataSearchCondition {
    
    /**
	 * 
	 */
    private static final long serialVersionUID = -1688277268138110226L;
 
	public FieldCondition<String> sno;
	public FieldCondition<String> ctrname;
	public FieldCondition<String> ctrparam;
	public FieldCondition<String> uid;
	public FieldCondition<String> appid;
	public FieldCondition<Integer> ctrstat;
	public FieldCondition<String> ctres;
	public FieldCondition<Date> ctrtime;
	public FieldCondition<Date> logtime;
	public FieldCondition<String> getSno() {
		return sno;
	}
	public FieldCondition<String> getCtrname() {
		return ctrname;
	}
	public FieldCondition<String> getCtrparam() {
		return ctrparam;
	}
	public FieldCondition<String> getUid() {
		return uid;
	}
	public FieldCondition<String> getAppid() {
		return appid;
	}
	public FieldCondition<Integer> getCtrstat() {
		return ctrstat;
	}
	public FieldCondition<String> getCtres() {
		return ctres;
	}
    public FieldCondition<Date> getCtrtime() {
        return ctrtime;
    }
	public FieldCondition<Date> getLogtime() {
		return logtime;
	}
	public void setSno(FieldCondition<String> sno) {
		this.sno = sno;
	}
	public void setCtrname(FieldCondition<String> ctrname) {
		this.ctrname = ctrname;
	}
	public void setCtrparam(FieldCondition<String> ctrparam) {
		this.ctrparam = ctrparam;
	}
	public void setUid(FieldCondition<String> uid) {
		this.uid = uid;
	}
	public void setAppid(FieldCondition<String> appid) {
		this.appid = appid;
	}
	public void setCtrstat(FieldCondition<Integer> ctrstat) {
		this.ctrstat = ctrstat;
	}
	public void setCtres(FieldCondition<String> ctres) {
		this.ctres = ctres;
	}
	public void setCtrtime(FieldCondition<Date> ctrtime) {
		this.ctrtime = ctrtime;
	}
	public void setLogtime(FieldCondition<Date> logtime) {
		this.logtime = logtime;
	}
	
}
