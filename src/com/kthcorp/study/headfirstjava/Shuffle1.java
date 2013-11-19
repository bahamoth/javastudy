package com.kthcorp.study.headfirstjava;

public class Shuffle1 {

	//1
	public static void main(String[] args) {
		
		//2
		int x = 3;
		//3
		while (x > 0)
		{
			//4
			if (x > 2)
			{
				System.out.print("a");
			}
			
			//5
			x = x - 1;
			System.out.print("-");
			
			//7
			if (x == 1)
			{
				System.out.print("d");
				x = x-1;
			}
			
			//6
			if (x == 2)
			{
				System.out.print("b c");
			}
		}		

	}

}
