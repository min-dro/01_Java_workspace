package com.hw2.model.vo;

public class Point { // 클래스 영역 시작

	private int x;
	private int y;
	
	public Point() {}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() { // 메소드 영역 시작
		return x;
	} // 메소드 영역 끝

	public void setX(int x) { // 메소드 영역 시작
		this.x = x;
	} // 메소드 영역 끝

	public int getY() { // 메소드 영역 시작
		return y;
	} // 메소드 영역 끝

	public void setY(int y) { // 메소드 영역 시작
		this.y = y;
	} // 메소드 영역 끝
	
	public void draw() { // 메소드 영역 시작
		System.out.println("(x, y) : (" + x + ", " + y + ")");
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
