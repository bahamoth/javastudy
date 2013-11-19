package com.kthcorp.study.basic;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader("d:/test.txt"));
			
			String str = null;
			while ((str = reader.readLine()) !=  null)
			{
				System.out.println(str);
				String tokens[] = str.split("");
				
				System.out.print("ID : " + tokens[0]);
				System.out.print(" Name : " + tokens[1]);
				System.out.print(" X : " + tokens[2]);
				System.out.println(" Y : " + tokens[3]);
			}
			
			reader.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
