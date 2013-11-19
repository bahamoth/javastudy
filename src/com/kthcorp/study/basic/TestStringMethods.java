package com.kthcorp.study.basic;

public class TestStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String testString = "»ï¼º º¸¶ó¸Å ¿È´ÏÅ¸¿ö 3Ãþ KTH";
		
		System.out.println("contains : " +testString.contains("½Ü¼þ"));
		System.out.println("indesOf : " + testString.indexOf("º¸¶ó¸Í"));
		System.out.println("startsWith : "+ testString.startsWith("»ï¼º"));
		System.out.println("endsWith : " + testString.endsWith("kTH".toUpperCase()));
		
	}

}
