package com.kh.chap02_inherit.model.vo;

// 부모클래스 - 공통 필드, 공통 메소드들을 정의해둘 것
// > 항상 부모클래스를 제일 먼저 만들기!!
public class Vehicle { // 클래스 영역 시작

	// 필드부
	private String name; // 이름
	private double mileage; // 움직인 거리
	private String kind; // 종류
	
	// 생성자부
	public Vehicle() { }

	public Vehicle(String name, double mileage, String kind) {
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}
	// 메소드부
	public String getName() { // 메소드 영역 시작
		return name;
	} // 메소드 영역 끝

	public void setName(String name) { // 메소드 영역 시작
		this.name = name;
	} // 메소드 영역 끝

	public double getMileage() { // 메소드 영역 시작
		return mileage;
	} // 메소드 영역 끝

	public void setMileage(double mileage) { // 메소드 영역 시작
		this.mileage = mileage;
	} // 메소드 영역 끝

	public String getKind() { // 메소드 영역 시작
		return kind;
	} // 메소드 영역 끝

	public void setKind(String kind) { // 메소드 영역 시작
		this.kind = kind;
	} // 메소드 영역 끝

	public String information() { // 메소드 영역 시작
		
		return "name : " + name + ", mileage : " + mileage + ", kind : " + kind;
	} // 메소드 영역 끝
	
	// 탈것이라면 응당 움직일 수 있어야함!!
	// > 이 움직이는 행위를 메소드로 나타내볼 것
	public void howToMove() { // 메소드 영역 시작
		
		System.out.println("그냥.. 움직인다.");
	} // 메소드 영역 끝
	
	
} // 클래스 영역 끝
