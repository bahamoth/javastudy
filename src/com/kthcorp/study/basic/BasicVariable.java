package com.kthcorp.study.basic;

import java.util.ArrayList;
import java.util.List;

public class BasicVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog[] d = new Dog[3];
		
		d[0] = new Dog();
		d[0].foo();
		
		Dog[][] d2 = new Dog[3][];
		for (int i=0; i<3 ; ++i)
		{
			d2[i] = new Dog[4];
			for (int j = 0 ; j<4 ; ++j)
			{
				d2[i][j] = new Dog();
			}
		}
		
		d2[2][3].foo();
		
	}

}

class Dog
{
	void foo()
	{
		System.out.println("asddsa");
	}
	
}