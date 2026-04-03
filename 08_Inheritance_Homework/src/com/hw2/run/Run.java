package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Point;
import com.hw2.model.vo.Rectangle;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		Point p[] = new Point[4];
		// Circle c[] = new Circle[2];
		// Rectangle r[] = new Rectangle[2];
		
		/*c*/p[0] = new Circle(1, 2, 3);
		/*c*/p[1] = new Circle(3, 3, 4);
		
		/*r[0]*/p[2] = new Rectangle(-1, -2, 5, 2);
		/*r[1]*/p[3] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("===== circle =====");
		/*
		for(int i = 0; i < c.length; i++) {
			c[i].draw();
		}
		
		System.out.println("===== rectangle =====");
		for(int i = 0; i < r.length; i++) {
			r[i].draw();
		}
		*/
		for(int i = 0; i < p.length; i++) {
			p[i].draw();
			if(i == 1) {
				System.out.println("===== rectangle =====");
			}
		}
	} // main 영역 끝

} // 클래스 영역 끝
