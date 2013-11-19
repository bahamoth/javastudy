package com.kthcorp.study.basic;

public class Person {
	
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	Person(String name, int age, int height, double yunbong, int weight, String companyName)
	{
		
	}
	
	Person (String name, int age)
	{
		this.name = name;
		this.age = age;		
	}
	
	Person (String name)
	{
		this.name = name;
	}
	
	protected void finalize()
	{
		System.out.println("finalized ??");
		int a[] = new int[1];
		a[2] = 10;
		System.out.println("finalized !!");
	}
	
	private String name = "";
	private  int age = 0;	
}
