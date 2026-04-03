package com.kh.chap01_poly.part01_basic.model.vo;

// 자식클래스
public class Child2 extends Parent { // 클래스 영역 시작

	// 필드부
	private int n;

	// 생성자부
	public Child2() {}

	public Child2(int x, int y, int n) {
		super(x, y);
		this.n = n;
	}

	// 메소드부
	public int getN() { // 메소드 영역 시작
		return n;
	} // 메소드 영역 끝

	public void setN(int n) { // 메소드 영역 시작
		this.n = n;
	} // 메소드 영역 끝

	public void printChild2() { // 메소드 영역 시작
		
		System.out.println("나는 두번째 자식이야");
	} // 메소드 영역 끝

	// 마찬가지로 오버라이딩
	@Override
	public void print() {
		
		System.out.println("나는 두번째 자식이야");
	}
} // 클래스 영역 끝
