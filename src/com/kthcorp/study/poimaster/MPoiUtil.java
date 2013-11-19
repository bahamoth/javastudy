package com.kthcorp.study.poimaster;

import java.util.ArrayList;
import java.util.List;

public class MPoiUtil {
	static double getDistance(MPoi src, MPoi dest)
	{		
		return Math.sqrt(Math.pow(src.getX() - dest.getX(), 2) + Math.pow(src.getY()- dest.getY(), 2));
	}
	static double getDistance(double x, double y, MPoi poi)
	{
		return Math.sqrt(Math.pow(x - poi.getX(), 2) + Math.pow(y- poi.getY(), 2));
	}
	static List<MPoi> getNearPois(List<MPoi> pois)
	{
		List<MPoi> ret = new ArrayList<MPoi>();		
		
		return ret;
	}
}
