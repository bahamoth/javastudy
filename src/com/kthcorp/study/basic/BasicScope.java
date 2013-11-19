package com.kthcorp.study.basic;

public class BasicScope {
	public static void main(String[] args) {
		
		int a = 1;
		{
			int b = 2;
			System.out.println("a: "+a);
			System.out.println("b: "+b);
			//System.out.println("c: "+c);
			System.out.println("abc: "+BasicScope.abc);
			int c = 3;
		}
	}
	static int abc = 10;
}
