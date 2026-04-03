package com.kh.chap06_method.controller;

// static 메소드
public class MethodTest2 { // 클래스 영역 시작

	// 1. 매개변수 X, 반환값 X
	public static void method1() { // 메소드 영역 시작
		
		System.out.println("매개변수와 반환값이 없는 메소드");
	} // 메소드 영역 끝
	
	// 2. 매개변수 X, 반환값 O
	public static String method2() { // 메소드 영역 시작
		
		return "매개변수는 없지만 반환값은 있는 메소드";
	} // 메소드 영역 끝
	
	// 3. 매개변수 O, 반환값 X
	public static void method3(String name, int age) { // 메소드 영역 시작
		
		System.out.println(age + "살의 " + name + "님 환영합니다^^");
	} // 메소드 영역 끝
	
	// 4. 매개변수 O, 반환값 O
	public static int method4(int num1, int num2) {
		
		// return num1, num2;
		// > 항상 반환값 (리턴값) 은 최대 1개까지임!!
		//	 즉, 2개 이상의 값을 한번에 리턴 불가
		return num1 + num2;
	}
	
} // 클래스 영역 끝
