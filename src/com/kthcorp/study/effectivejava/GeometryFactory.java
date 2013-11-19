package com.kthcorp.study.effectivejava;


public class GeometryFactory
{
	private static final GeometryFactory instance = new GeometryFactory();
	private GeometryFactory()
	{		
	}
	
	public static GeometryFactory getInstance()
	{
		System.out.println("geom factory called");
		return instance;
	}
}
