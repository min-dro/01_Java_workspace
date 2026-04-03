package com.hw2.model.vo;

public class Circle extends Point { // 클래스 영역 시작

	private int radius;

	public Circle() {}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() { // 메소드 영역 시작
		return radius;
	} // 메소드 영역 끝

	public void setRadius(int radius) { // 메소드 영역 시작
		this.radius = radius;
	} // 메소드 영역 끝
	
	public void draw() { // 메소드 영역 시작
		super.draw();
		System.out.printf("면적 : %.1f\n", (radius * radius * Math.PI));
		System.out.printf("둘레 : %.1f\n", (Math.PI * radius * 2));
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
