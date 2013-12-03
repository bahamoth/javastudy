package com.kthcorp.study.headfirstjava;

public class LarryStyle {
	enum shapeNum {
		square,
		circle,
		triangle,
		ameba
	}
	
	public void rotate(shapeNum snum, double x, double y) {
		if (snum != shapeNum.ameba)
		{
			if (snum == shapeNum.square)
				System.out.println("사각형 중심을 계산한다.");
			if (snum == shapeNum.circle)
				System.out.println("원 중심을 계산한다.");
			if (snum == shapeNum.triangle)
				System.out.println("삼각형 중심을 계산한다.");
			System.out.println("도형을 회전한다.");
		} else
		{
			System.out.println("x, y 를 중심으로 아메바를 회전한다.");
		}
	}
	public void playSound(shapeNum snum) {	
		if (snum != shapeNum.ameba)
		{
			if (snum == shapeNum.square)
				System.out.println("네모 소리 파일을 읽어온다.");
			if (snum == shapeNum.circle)
				System.out.println("원 소리 파일을 읽어온다.");
			if (snum == shapeNum.triangle)
				System.out.println("삼각형 소리 파일을 읽어온다.");
			System.out.println("소리파일(.aif)을 재생한다.");
		} else
		{
			System.out.println("아메바 소리파일을 읽어온다.");
			System.out.println("소리파일(.hif)을 재생한다.");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LarryStyle ls = new LarryStyle();
		ls.playSound(shapeNum.square);
		ls.rotate(shapeNum.square, 0, 0);
	}

}
