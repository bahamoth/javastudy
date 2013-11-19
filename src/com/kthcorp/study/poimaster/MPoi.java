package com.kthcorp.study.poimaster;

import org.apache.commons.lang3.math.NumberUtils;

public class MPoi {
	private String[] poi;
	private String name = "";
	private double x = 0;
	private double y = 0;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	
	MPoi(String[] param)
	{
		set(param);
	}
	
	MPoi(String name, double x, double y)
	{
		setName(name);
		setX(x);
		setY(y);
	}
	
	MPoi(String name, double x, double y, String addr1, String addr2, String addr3, String addr4)
	{
		
	}
	
	String[] get()
	{
		return poi;
	}
	
	double getX()
	{
		return x;
	}
	
	double getY()
	{
		return y;
	}
	
	String getName()
	{
		return name;
	}
	
	void set(String[] param)
	{
		if (param == null)
			return;
		poi = param;
		x = NumberUtils.toDouble(poi[14], 0);
		y = NumberUtils.toDouble(poi[15], 0);
		if (!poi[1].equals(""))
			name = poi[1];
	}
	
	void setName(String name)
	{
		this.name = name;		
	}
	
	void setX(double x)
	{
		this.x = x;
	}
	
	void setY(double y)
	{
		this.y = y;
	}
}
