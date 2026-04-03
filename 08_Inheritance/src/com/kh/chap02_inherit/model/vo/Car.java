package com.kh.chap02_inherit.model.vo;

// 자식클래스
public class Car extends Vehicle { // 클래스 영역 시작

	// 필드부
	private int tire; // 바퀴갯수

	// 생성자부
	public Car() { }

	public Car(String name, double mileage, String kind, int tire) {
		
		super(name, mileage, kind);
		
		this.tire = tire;
	}

	// 메소드부
	public int getTire() { // 메소드 영역 시작
		return tire;
	} // 메소드 영역 끝

	public void setTire(int tire) { // 메소드 영역 시작
		this.tire = tire;
	} // 메소드 영역 끝

	public String information() { // 메소드 영역 시작
	
		return super.information() + ", tire : " + tire;
	} // 메소드 영역 끝
	
	// howToMove 오버라이딩
	@Override
	public void howToMove() {
		
		System.out.println("바퀴를 굴려 움직인다.");
	}
	
} // 클래스 영역 끝
