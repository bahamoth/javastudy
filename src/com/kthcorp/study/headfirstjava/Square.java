package com.kthcorp.study.headfirstjava;

public class Square extends Shape {
	public void rotate()
	{
		System.out.println("사각형 중심을 계산한다.");
		super.rotate();
	}
	public void playSound()
	{
		System.out.println("네모 소리 파일을 읽어온다.");
		super.playSound();
	}
}
