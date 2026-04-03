package com.kh.chap02_inherit.model.vo;

// 자식클래스
public class Ship extends Vehicle { // 클래스 영역 시작

	// 필드부
	private int propeller; // 프로펠러갯수
	
	// 생성자부
	public Ship() { }

	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}

	// 메소드부
	public int getPropeller() { // 메소드 영역 시작
		return propeller;
	} // 메소드 영역 끝

	public void setPropeller(int propeller) { // 메소드 영역 시작
		this.propeller = propeller;
	} // 메소드 영역 끝

	// information 오버라이딩
	@Override
	public String information() { // 메소드 영역 시작
		
		return super.information() + ", propeller : " + propeller;
	} // 메소드 영역 끝
	
	// howToMove 오버라이딩
	@Override
	public void howToMove() {
		
		System.out.println("프로펠러를 돌리면서 물살을 가르며 나아간다.");
	}
	
} // 클래스 영역 끝
