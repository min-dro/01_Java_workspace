package com.method.hw3.run;

import com.method.hw3.controller.StaticSample;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // 메소드 영역 시작
		StaticSample.setValue("Java");
		System.out.println("value : " + StaticSample.getValue());
		StaticSample.toUpper();
		System.out.println("대문자로 : " + StaticSample.getValue());
		System.out.println("길이 : " + StaticSample.valueLength());
		System.out.println("PROGRAMMING 붙여서 : " 
		+ StaticSample.valueConcat("PROGRAMMING"));
		StaticSample.setChar(0, 'C');
		System.out.println("J => C : " + StaticSample.getValue());

	} // 메소드 영역 끝

} // 클래스 영역 끝
