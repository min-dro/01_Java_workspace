package com.kh.field.example2.model.vo;

public class Circle { // 클래스 영역 시작

	public static final double PI = 3.14;
	private static int  radius = 1;
	
	public Circle() { // 생성자 영역 시작
		getAreaOfCircle();
		getSizeOfCircle();
	} // 생성자 영역 끝
	
	public void incrementRadius() { // 메소드 영역 시작
		radius++;
	} // 메소드 영역 끝
	
	public void getAreaOfCircle() { // 메소드 영역 시작
		System.out.println(radius * radius * PI);
	} // 메소드 영역 끝
	
	public void getSizeOfCircle() { // 메소드 영역 시작
		System.out.println(radius * 2 * PI);
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
