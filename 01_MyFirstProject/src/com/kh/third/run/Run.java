package com.kh.third.run;

import com.kh.third.MyName;	// MyName 클래스 선언

public class Run { // Run 클래스 영역 시작

	public static void main(String[] args) { // main 메소드 영역 시작
		
		// MyName 클래스의 callName 메소드 호출
		// > 다른 클래스의 메소드를 호출하므로 대변할이름을 먼저 만들기
		
		// 1. MyName 클래스를 대변할이름 만들기
		MyName mn = new MyName();	// MyName 클래스 부르기
		
		// 2. 그 대변할이름을 통해 메소드를 호출
		mn.callName(); // MyName 클래스에 있는 callName 메소드 호출
	
	} // main 메소드 영역 끝
	
} // Run 클래스 영역 끝
