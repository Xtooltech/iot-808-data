package com.xtool.iot808data.pos;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="pos")
public class posModel implements Serializable
{
    public static final String COLLECTION_NAME="pos";

	/**
	 * 
	 */
	private static final long serialVersionUID = -727745273911054133L;

	@Id public String id;
	@Field public String sno;
	@Field public Double lng;
	@Field public Double lat;
	@Field public Double alt;
	@Field public Double speed;
	@Field public Double angle;
	@Field public Date dtime;
	@Field public Date svrtime;
	@Field public Double gd_lng;
	@Field public Double gd_lat;
	@Field public Integer p_event;
	
	public String getId()
    {
		return id;
	}
	
	public void setId(String id)
    {
		this.id = id;
	}
	
	public String getSno()
    {
		return sno;
	}
	
	public void setSno(String sno)
    {
		this.sno = sno;
	}
	
	public Double getLng()
    {
		return lng;
	}
	
	public void setLng(Double lng)
    {
		this.lng = lng;
	}
	
	public Double getLat()
    {
		return lat;
	}
	
	public void setLat(Double lat)
    {
		this.lat = lat;
	}
	
	public Double getAlt()
    {
		return alt;
	}
	
	public void setAlt(Double alt)
    {
		this.alt = alt;
	}
	
	public Double getSpeed()
    {
		return speed;
	}
	
	public void setSpeed(Double speed)
    {
		this.speed = speed;
	}
	
	public Double getAngle()
    {
		return angle;
	}
	
	public void setAngle(Double angle)
    {
		this.angle = angle;
	}
	
	public Date getDtime()
    {
		return dtime;
	}
	
	public void setDtime(Date dtime)
    {
		this.dtime = dtime;
	}
	
	public Date getSvrtime()
    {
		return svrtime;
	}
	
	public void setSvrtime(Date svrtime)
    {
		this.svrtime = svrtime;
	}
	
	public Double getGd_lng()
    {
		return gd_lng;
	}
	
	public void setGd_lng(Double gd_lng)
    {
		this.gd_lng = gd_lng;
	}
	
	public Double getGd_lat()
    {
		return gd_lat;
	}
	
	public void setGd_lat(Double gd_lat)
    {
		this.gd_lat = gd_lat;
	}
	
	public Integer getP_event()
    {
		return p_event;
	}
	
	public void setP_event(Integer p_event)
    {
		this.p_event = p_event;
	}
	
}
