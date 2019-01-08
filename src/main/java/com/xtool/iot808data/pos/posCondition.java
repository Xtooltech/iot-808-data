package com.xtool.iot808data.pos;

import java.util.Date;


import com.xtool.enterprise.data.DataSearchCondition;
import com.xtool.enterprise.data.FieldCondition;

public class posCondition extends DataSearchCondition
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4514658282435775220L;
	
	public FieldCondition<String> sno;
	public FieldCondition<Double> lng;
	public FieldCondition<Double> lat;
	public FieldCondition<Double> alt;
	public FieldCondition<Double> speed;
	public FieldCondition<Double> angle;
	public FieldCondition<Date> dtime;
	public FieldCondition<Date> svrtime;
	public FieldCondition<Double> gd_lng;
	public FieldCondition<Double> gd_lat;
	public FieldCondition<Byte> p_event;
	
	public FieldCondition<String> getSno()
    {
		return sno;
	}
	
	public void setSno(FieldCondition<String> sno)
    {
		this.sno = sno;
	}
	
	public FieldCondition<Double> getLng()
    {
		return lng;
	}
	
	public void setLng(FieldCondition<Double> lng)
    {
		this.lng = lng;
	}
	
	public FieldCondition<Double> getLat()
    {
		return lat;
	}
	
	public void setLat(FieldCondition<Double> lat)
    {
		this.lat = lat;
	}
	
	public FieldCondition<Double> getAlt()
    {
		return alt;
	}
	
	public void setAlt(FieldCondition<Double> alt)
    {
		this.alt = alt;
	}
	
	public FieldCondition<Double> getSpeed()
    {
		return speed;
	}
	
	public void setSpeed(FieldCondition<Double> speed)
    {
		this.speed = speed;
	}
	
	public FieldCondition<Double> getAngle()
    {
		return angle;
	}
	
	public void setAngle(FieldCondition<Double> angle)
    {
		this.angle = angle;
	}
	
	public FieldCondition<Date> getDtime()
    {
		return dtime;
	}
	
	public void setDtime(FieldCondition<Date> dtime)
    {
		this.dtime = dtime;
	}
	
	public FieldCondition<Date> getSvrtime()
    {
		return svrtime;
	}
	
	public void setSvrtime(FieldCondition<Date> svrtime)
    {
		this.svrtime = svrtime;
	}
	
	public FieldCondition<Double> getGd_lng()
    {
		return gd_lng;
	}
	
	public void setGd_lng(FieldCondition<Double> gd_lng)
    {
		this.gd_lng = gd_lng;
	}
	
	public FieldCondition<Double> getGd_lat()
    {
		return gd_lat;
	}
	
	public void setGd_lat(FieldCondition<Double> gd_lat)
    {
		this.gd_lat = gd_lat;
	}
	
	public FieldCondition<Byte> getP_event()
    {
		return p_event;
	}
	
	public void setP_event(FieldCondition<Byte> p_event)
    {
		this.p_event = p_event;
	}
	
}
