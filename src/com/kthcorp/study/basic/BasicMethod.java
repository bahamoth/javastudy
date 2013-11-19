package com.kthcorp.study.basic;

public class BasicMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		BasicMethod.add(10, 20);
		
		BasicMethod.add(10.0f, 20.2f);
		
		BasicMethod.add(10, 20.1f);
		
	}
	
	static int add(int Alpha, int Beta)
	{
		System.out.println("Add result int : " + (Alpha + Beta));
		return Alpha + Beta;
	}
	
	static float add(float Alpha, float Beta)
	{
		System.out.println("Add result float : " + (Alpha + Beta));
		return Alpha + Beta;
	}

}
