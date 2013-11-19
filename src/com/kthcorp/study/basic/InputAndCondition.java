package com.kthcorp.study.basic;

import java.util.Scanner;

public class InputAndCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ssss = new Scanner(System.in);
		
		int a = ssss.nextInt();
		
		if (a > 5)
		{
			System.out.println("5보다 크다");			
		}
		else if (a < 5)
		{
			System.out.println("5보다 작다");
		}
		else
		{
			System.out.println("5와 같다");
		}
		
	}

}
