package com.kthcorp.study.headfirstjava;

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog merry = new Dog();
		merry.name = "�޸�";
		merry.bark();
		System.out.println("/////////////////////////////////////");
		
		Dog baduki = merry;
		baduki.bark();
		System.out.println("/////////////////////////////////////");
		
		baduki.name = "�ٵ���";
		baduki.bark();
		merry.bark();
		System.out.println("/////////////////////////////////////");
		
		baduki = new Dog();
		merry.name = "�޸���ϱ�";
		baduki.name = "�ٵ��̶�ϱ�";
		baduki.bark();
		merry.bark();
		System.out.println("/////////////////////////////////////");
	}

}
