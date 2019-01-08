package com.xtool.iot808data.devstat;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import com.xtool.iot808data.pos.posModel;

@Document(collection="devstat")
public class devstatModel extends posModel implements Serializable {

	public static final String COLLECTION_NAME="devstat";
	/**
	 * 
	 */
	private static final long serialVersionUID = -6782148686074534530L;
	
	@Field public Long aflags;
	@Field public Long stat;
	@Field public devstatExtrasItem[] exitems;
	
	public Long getAflags() {
		return aflags;
	}
	public void setAflags(Long aflags) {
		this.aflags = aflags;
	}
	public Long getStat() {
		return stat;
	}
	public void setStat(Long stat) {
		this.stat = stat;
	}
	public devstatExtrasItem[] getExitems() {
		return exitems;
	}
	public void setExitems(devstatExtrasItem[] exitems) {
		this.exitems = exitems;
	}
	
	
}
