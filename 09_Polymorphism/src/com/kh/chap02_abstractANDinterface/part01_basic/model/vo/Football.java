package com.kh.chap02_abstractANDinterface.part01_basic.model.vo;

public class Football extends Sports { // 클래스 영역 시작 

	@Override
	public void rule() { // 메소드 영역 시작
		
		System.out.println("손이 아닌 받로 공을 차야한다.");
	} // 메소드 영역 끝
	// > 미완성된 클래스인 추상클래스를 상속받게 되면 부모클래스에 있는 추상메소드 (미완성된 메소드) 를
	//	 강제로 "오버라이딩" 을 통해 완성시켜줘야 추후 쓸 수 있게됨!! (호출해서 쓸 수 있게 됨)
	
} // 클래스 영역 끝
