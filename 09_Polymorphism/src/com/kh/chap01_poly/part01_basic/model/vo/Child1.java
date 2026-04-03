package com.kh.chap01_poly.part01_basic.model.vo;

// 자식클래스
public class Child1 extends Parent { // 클래스 영역 시작

	// 필드부
	private int z;

	// 생성자부
	public Child1() {}

	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	// 메소드부
	public int getZ() { // 메소드 영역 시작
		return z;
	} // 메소드 영역 끝

	public void setZ(int z) { // 메소드 영역 시작
		this.z = z;
	} // 메소드 영역 끝

	public void printChild1() { // 메소드 영역 시작
		
		System.out.println("나는 첫번째 자식이야");
	} // 메소드 영역 끝
	
	// print 메소드를 오버라이딩
	@Override
	public void print() {
		
		System.out.println("나는 첫번째 자식이야");
	}
	
} // 클래스 영역 끝
