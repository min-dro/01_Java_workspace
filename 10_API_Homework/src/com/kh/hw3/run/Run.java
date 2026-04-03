package com.kh.hw3.run;

import com.kh.hw3.controller.SetDate;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		SetDate tw1 = new SetDate();
		
		System.out.println(tw1.todayPrint());
		System.out.println(tw1.setDay());

	} // main 영역 끝

} // 클래스 영역 끝
