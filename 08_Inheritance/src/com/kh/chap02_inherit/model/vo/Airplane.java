package com.kh.chap02_inherit.model.vo;

// 자식클래스 - 부모클래스의 코드를 상속받아 (풀려받아) 필요한 코드를 덧붙여 쓰겠다. (즉, 확정시키겠다)
public class Airplane extends Vehicle { // 클래스 영역 시작

	// 필드부
	private int tire; // 바퀴갯수
	private int wing; // 날개갯수
	
	// 생성자부
	public Airplane() { }

	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}

	// 메소드부
	public int getTire() { // 메소드 영역 시작
		return tire;
	} // 메소드 영역 끝

	public void setTire(int tire) { // 메소드 영역 시작
		this.tire = tire;
	} // 메소드 영역 끝

	public int getWing() { // 메소드 영역 시작
		return wing;
	} // 메소드 영역 끝

	public void setWing(int wing) { // 메소드 영역 시작
		this.wing = wing;
	} // 메소드 영역 끝

	// information 오버라이딩
	public String information() { // 메소드 영역 시작
		
		return super.information() + ", tire : " + tire + ", wing : " + wing;
	} // 메소드 영역 끝
	
	// howToMove 오버라이딩
	public void howToMove() {
		
		System.out.println("바퀴를 굴려 달리다가 날개를 펼치며 날아간다.");
	}
	
} // 클래스 영역 끝
