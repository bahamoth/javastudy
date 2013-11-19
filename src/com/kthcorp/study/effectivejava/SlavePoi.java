package com.kthcorp.study.effectivejava;

import java.util.List;

public class SlavePoi
{
	private String name;
	private double x;
	private double y;
	private List<String> address;
	
	static class SlavePoiBuilder implements Builder<SlavePoi>
	{
		private String name = "";
		private double x;
		private double y;
		private List<String> address;
		
		public SlavePoiBuilder(double x, double y)
		{
			this.x = x;
			this.y = y;
		}
		
		public SlavePoiBuilder name(String name)
		{
			this.name = name;
			return this;
		}
		
		public SlavePoiBuilder positionX(double x)
		{
			this.x = x;
			return this;
		}
		
		public SlavePoiBuilder positionY(double y)
		{
			this.y = y;
			return this;
		}
		
		public SlavePoiBuilder address(List<String> address)
		{
			this.address = address;
			return this;
		}
		
		public SlavePoi build()
		{
			return new SlavePoi(this);
		}		
	}
		
	private SlavePoi(SlavePoiBuilder builder)
	{
		this.setName(builder.name);
		this.setX(builder.x);
		this.setY(builder.y);
		this.setAddress(builder.address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}
}
