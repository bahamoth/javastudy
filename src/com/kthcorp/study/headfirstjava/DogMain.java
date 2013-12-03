package com.kthcorp.study.headfirstjava;

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog merry = new Dog();
		merry.name = "∏ﬁ∏Æ";
		merry.bark();
		System.out.println("/////////////////////////////////////");
		
		Dog baduki = merry;
		baduki.bark();
		System.out.println("/////////////////////////////////////");
		
		baduki.name = "πŸµœ¿Ã";
		baduki.bark();
		merry.bark();
		System.out.println("/////////////////////////////////////");
		
		baduki = new Dog();
		merry.name = "∏ﬁ∏Æ∂Û¥œ±Ò";
		baduki.name = "πŸµœ¿Ã∂Û¥œ±Ò";
		baduki.bark();
		merry.bark();
		System.out.println("/////////////////////////////////////");
	}

}
