package com.kh.chap01_poly.part02_electronic.model.vo;

// 자식클래스
public class Tablet extends Electronic { // 클래스 영역 시작

	// 필드부
	private boolean penFlag;

	// 생성자부
	public Tablet() {}

	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand, name, price);
		this.penFlag = penFlag;
	}

	// 메소드부
	public boolean isPenFlag() { // 메소드 영역 시작
		return penFlag;
	} // 메소드 영역 끝

	public void setPenFlag(boolean penFlag) { // 메소드 영역 시작
		this.penFlag = penFlag;
	} // 메소드 영역 끝

	@Override
	public String toString() { // 메소드 영역 시작
		return "Tablet [brand=" + super.getBrand() + ", name=" + super.getName() + ", price="
			+ super.getPrice() + ", penFlag=" + penFlag + "]";
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
