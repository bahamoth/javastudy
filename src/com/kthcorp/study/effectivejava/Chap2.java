package com.kthcorp.study.effectivejava;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chap2 {

	public static <K,V> Map<K, V> newHashMap()
	{
		return new HashMap();
	}
	
	public static void main(String[] args) {
		
		Map<List<Integer>, HashMap<Double, HashMap<String, String>>> 
		tmpHashmap =	newHashMap();
		
		Map<List<Integer>, HashMap<Double, HashMap<String, String>>> 
		tmpHashmap2 = new HashMap();
		
		Map<List<Integer>, HashMap<Double, HashMap<String, String>>> 
		tmpHashmap3 = 
				new HashMap<List<Integer>, HashMap<Double, HashMap<String, String>>>();
		
		SlavePoi slavePoi = new SlavePoi
				.SlavePoiBuilder(0,0).name("서울대")
				.positionX(100)
				.positionY(200)
				.build();
		
		SlavePoi slavePoi2 = new SlavePoi.SlavePoiBuilder(1,1).name("개똥이").build();
		
		System.out.println(slavePoi.getName() + " : " + slavePoi2.getName());
		GeometryFactory.getInstance();
		
		long elapsedTime = System.nanoTime();
		for (int i = 0 ; i < Integer.MAX_VALUE ; ++i )
		{
			String tmpString = new String("qwertyuiopasdfghjklzxcvbnm");
		}
		elapsedTime = System.nanoTime() - elapsedTime;
		System.out.println("elapsed time newing immutable class : " + elapsedTime/ 1000000000.0);
		
		elapsedTime = System.nanoTime();
		for (int i = 0 ; i < Integer.MAX_VALUE ; ++i )
		{
			String tmpString = "qwertyuiopasdfghjklzxcvbnm";
		}
		elapsedTime = System.nanoTime() - elapsedTime;
		System.out.println("elapsed time pointing single instance : " + elapsedTime/ 1000000000.0);
		
		elapsedTime = System.nanoTime();
		Long testLong = 0L;
		for (int i = 0 ; i < Integer.MAX_VALUE ; ++i )
		{
			testLong += i;
		}
		elapsedTime = System.nanoTime() - elapsedTime;
		System.out.println("Long : " + elapsedTime/ 1000000000.0);
		
		elapsedTime = System.nanoTime();
		long testLong2 = 0L;
		for (int i = 0 ; i < Integer.MAX_VALUE ; ++i )
		{
			testLong2 += i;
		}
		elapsedTime = System.nanoTime() - elapsedTime;
		System.out.println("long : " + elapsedTime/ 1000000000.0);
		
		elapsedTime = System.nanoTime();
		Long testLong3 = 0L;
		for (int i = 0 ; i < Integer.MAX_VALUE ; ++i )
		{
			testLong3 += Long.valueOf(i);
		}
		elapsedTime = System.nanoTime() - elapsedTime;
		System.out.println("Long valueof: " + elapsedTime/ 1000000000.0);
	}

}
