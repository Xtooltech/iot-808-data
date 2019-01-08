package com.xtool.iot808data.devstat;

import java.io.Serializable;

public class devstatExtrasItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3842860651021850729L;

	public Integer n;
	public String v;
	
	public Integer getN() {
		return n;
	}
	public void setN(Integer n) {
		this.n = n;
	}
	public String getV() {
		return v;
	}
	public void setV(String v) {
		this.v = v;
	}
	
	
}
