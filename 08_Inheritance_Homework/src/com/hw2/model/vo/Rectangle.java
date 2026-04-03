package com.hw2.model.vo;

public class Rectangle extends Point{ // 클래스 영역 시작

	private int width;
	private int height;
	
	public Rectangle() {}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() { // 메소드 영역 시작
		return width;
	} // 메소드 영역 끝

	public void setWidth(int width) { // 메소드 영역 시작
		this.width = width;
	} // 메소드 영역 끝

	public int getHeight() { // 메소드 영역 시작
		return height;
	} // 메소드 영역 끝

	public void setHeight(int height) { // 메소드 영역 시작
		this.height = height;
	} // 메소드 영역 끝
	
	public void draw() { // 메소드 영역 시작
		super.draw();
		System.out.println("면적 : " + (width * height));
		System.out.println("둘레 : " + (2 * (width + height)));
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
