package com.xtool.iot808data.devparam;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection="devparam")
public class devparamModel implements Serializable
{
    public static final String COLLECTION_NAME="devparam";

	/**
	 * 
	 */
	private static final long serialVersionUID = -727745273911054133L;

	@Id public String id;
	@Field public String sno;
	@Field public Integer p0001;
	@Field public String p0010;
	@Field public String p0013;
	@Field public Integer p0018;
	@Field public Integer p0027;
	@Field public Integer p0029;
	@Field public Integer p0030;
	@Field public Byte p0055;
	@Field public Byte p0056;
	
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
	
	public Integer getP0001()
    {
		return p0001;
	}
	
	public void setP0001(Integer p0001)
    {
		this.p0001 = p0001;
	}
	
	public String getP0010()
    {
		return p0010;
	}
	
	public void setP0010(String p0010)
    {
		this.p0010 = p0010;
	}
	
	public String getP0013()
    {
		return p0013;
	}
	
	public void setP0013(String p0013)
    {
		this.p0013 = p0013;
	}
	
	public Integer getP0018()
    {
		return p0018;
	}
	
	public void setP0018(Integer p0018)
    {
		this.p0018 = p0018;
	}
	
	public Integer getP0027()
    {
		return p0027;
	}
	
	public void setP0027(Integer p0027)
    {
		this.p0027 = p0027;
	}
	
	public Integer getP0029()
    {
		return p0029;
	}
	
	public void setP0029(Integer p0029)
    {
		this.p0029 = p0029;
	}
	
	public Integer getP0030()
    {
		return p0030;
	}
	
	public void setP0030(Integer p0030)
    {
		this.p0030 = p0030;
	}
	
	public Byte getP0055()
    {
		return p0055;
	}
	
	public void setP0055(Byte p0055)
    {
		this.p0055 = p0055;
	}
	
	public Byte getP0056()
    {
		return p0056;
	}
	
	public void setP0056(Byte p0056)
    {
		this.p0056 = p0056;
	}
	
}
