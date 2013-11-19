package com.kthcorp.study.basic;

import java.util.Scanner;

public class BasicInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a = 0;		
		a = scan.nextInt();
		
		a = a / 3;
		System.out.println("you typed "+a);
		scan.close();
		
	}

}
