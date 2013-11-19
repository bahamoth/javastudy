package com.kthcorp.study.basic;

public class ChoosePerson {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (true)
		{
			int a = Integer.MAX_VALUE;
			Person gapsun = new Person("±è°³¶Ë", 30);
			
			System.out.println(gapsun.getName());
			
			gapsun.setName("±è°©¼ø");
			
			System.out.println(gapsun.getName());			
		}
	}

}
