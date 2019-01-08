package com.xtool.iot808data.devparam;

import com.xtool.enterprise.data.DataSearchCondition;
import com.xtool.enterprise.data.FieldCondition;


public class devparamCondition extends DataSearchCondition
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4514658282435775220L;
	
	public FieldCondition<String> sno;
	public FieldCondition<Integer> p0001;
	public FieldCondition<String> p0010;
	public FieldCondition<String> p0013;
	public FieldCondition<Integer> p0018;
	public FieldCondition<Integer> p0027;
	public FieldCondition<Integer> p0029;
	public FieldCondition<Integer> p0030;
	public FieldCondition<Byte> p0055;
	public FieldCondition<Byte> p0056;

	public FieldCondition<String> getSno()
    {
		return sno;
	}
	
	public void setSno(FieldCondition<String> sno)
    {
		this.sno = sno;
	}
	
	public FieldCondition<Integer> getP0001()
    {
		return p0001;
	}
	
	public void setP0001(FieldCondition<Integer> p0001)
    {
		this.p0001 = p0001;
	}
	
	public FieldCondition<String> getP0010()
    {
		return p0010;
	}
	
	public void setLat(FieldCondition<String> p0010)
    {
		this.p0010 = p0010;
	}
	
	public FieldCondition<String> getP0013()
    {
		return p0013;
	}
	
	public void setP0013(FieldCondition<String> p0013)
    {
		this.p0013 = p0013;
	}
	
	public FieldCondition<Integer> getP0018()
    {
		return p0018;
	}
	
	public void setP0018(FieldCondition<Integer> p0018)
    {
		this.p0018 = p0018;
	}
	
	public FieldCondition<Integer> getP0027()
    {
		return p0027;
	}
	
	public void setP0027(FieldCondition<Integer> p0027)
    {
		this.p0027 = p0027;
	}
	
	public FieldCondition<Integer> getP0029()
    {
		return p0029;
	}
	
	public void setP0029(FieldCondition<Integer> p0029)
    {
		this.p0029 = p0029;
	}
	
	public FieldCondition<Integer> getP0030()
    {
		return p0030;
	}
	
	public void setP0030(FieldCondition<Integer> p0030)
    {
		this.p0030 = p0030;
	}
	
	public FieldCondition<Byte> getP0055()
    {
		return p0055;
	}
	
	public void setGd_lng(FieldCondition<Byte> p0055)
    {
		this.p0055 = p0055;
	}
	
	public FieldCondition<Byte> getP0056()
    {
		return p0056;
	}
	
	public void setP0056(FieldCondition<Byte> p0056)
    {
		this.p0056 = p0056;
	}
	
}
