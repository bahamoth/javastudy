package com.kthcorp.study.basic;

public class TestStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String testString = "�Ｚ ����� �ȴ�Ÿ�� 3�� KTH";
		
		System.out.println("contains : " +testString.contains("�ܼ�"));
		System.out.println("indesOf : " + testString.indexOf("�����"));
		System.out.println("startsWith : "+ testString.startsWith("�Ｚ"));
		System.out.println("endsWith : " + testString.endsWith("kTH".toUpperCase()));
		
	}

}
