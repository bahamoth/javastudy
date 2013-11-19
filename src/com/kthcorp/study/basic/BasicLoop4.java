package com.kthcorp.study.basic;

import java.util.ArrayList;
import java.util.List;

public class BasicLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1, 2,3,4,5,6,7,8,9,10};
		
		for (int i : a)
		{
			System.out.println(i);
		}
		
		List<String> tmpStrings = new ArrayList();
		
		tmpStrings.add("test");
		tmpStrings.add("for");
		tmpStrings.add("each");
		
		for (String tmpStr : tmpStrings)
		{
			System.out.println(tmpStr);
		}
	}

}
