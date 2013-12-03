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
				System.out.println("�簢�� �߽��� ����Ѵ�.");
			if (snum == shapeNum.circle)
				System.out.println("�� �߽��� ����Ѵ�.");
			if (snum == shapeNum.triangle)
				System.out.println("�ﰢ�� �߽��� ����Ѵ�.");
			System.out.println("������ ȸ���Ѵ�.");
		} else
		{
			System.out.println("x, y �� �߽����� �Ƹ޹ٸ� ȸ���Ѵ�.");
		}
	}
	public void playSound(shapeNum snum) {	
		if (snum != shapeNum.ameba)
		{
			if (snum == shapeNum.square)
				System.out.println("�׸� �Ҹ� ������ �о�´�.");
			if (snum == shapeNum.circle)
				System.out.println("�� �Ҹ� ������ �о�´�.");
			if (snum == shapeNum.triangle)
				System.out.println("�ﰢ�� �Ҹ� ������ �о�´�.");
			System.out.println("�Ҹ�����(.aif)�� ����Ѵ�.");
		} else
		{
			System.out.println("�Ƹ޹� �Ҹ������� �о�´�.");
			System.out.println("�Ҹ�����(.hif)�� ����Ѵ�.");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LarryStyle ls = new LarryStyle();
		ls.playSound(shapeNum.square);
		ls.rotate(shapeNum.square, 0, 0);
	}

}
