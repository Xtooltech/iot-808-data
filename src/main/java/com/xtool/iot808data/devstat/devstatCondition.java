package com.xtool.iot808data.devstat;

import com.xtool.enterprise.data.FieldCondition;
import com.xtool.iot808data.pos.posCondition;

public class devstatCondition extends posCondition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8226905135742982721L;

	public FieldCondition<Long> aflags;
	public FieldCondition<Long> stat;
	public FieldCondition<Long> getAflags() {
		return aflags;
	}
	public void setAflags(FieldCondition<Long> aflags) {
		this.aflags = aflags;
	}
	public FieldCondition<Long> getStat() {
		return stat;
	}
	public void setStat(FieldCondition<Long> stat) {
		this.stat = stat;
	}
	
	
}
