package com.kh.chap04_field.model.vo;

// 필드에서 사용 가능한 접근제한자 4가지
public class FieldTest2 { // 클래스 영역 시작
	
	/*
	 * * 접근제한자 종류
	 * 
	 * (+)public
	 * : 어디서든 (같은패키지, 다른 패키지든 모두) 모두 접근 가능하게 하고 싶다.
	 * 
	 * (#)protected
	 * : 같은 패키지면 무조선 접근 가능,
	 * 	 다흔 패키지면 원칙상 접근 불가능 (즉, 같은 패키지에서만 접근 가능하게 하고 싶다) 하나,
	 * 	 "상속" 이라는 구조를 가진 클래스에서는 다른 패키지더라도 접근 가능하게 하고 싶다.
	 * 	 (상속은 다음 단원에서 배울 것)
	 * 
	 * (~)default
	 * : 오로지 같은 패키지에서만 접근 가능하게 하고 싶다.
	 * 
	 * (-)private
	 * : 오직 해당 클래스 영역 안에서만 접근 가능하게 하고 싶다.
	 * 
	 * 위에서부터 아래로 내려갈수록 접근할 수 있는 범위가 점점 좁아진다!!
	 * +, #, ~, - 는 "클래스 다이어그램" 상의 표기이다.
	 */
	
	// 필드부
	// 접근 제한자 종류별고 필드를 구성
	public String pub = "public";
	protected String pro = "protected";
	/* default */ String df = "default"; // 생략 시 default (쓰면 오히려 오류)
	private String pri = "private";
	
	// 연습용 static 변수
	public static String sta = "FieldTest2";
	
	// 연습용 static 메소드
	public static void test() { // 메소드 영역 시작
		
		System.out.println("반가워");
	} // 메소드 영역 끝

} // 클래스 영역 끝
