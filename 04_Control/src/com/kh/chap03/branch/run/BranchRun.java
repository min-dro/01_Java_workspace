package com.kh.chap03.branch.run;

import com.kh.chap03.branch.A_Break;
import com.kh.chap03.branch.B_Continue;

public class BranchRun { // 클래스 영역 시작

	/*
	 * * 분기문
	 * > 조건문, 반복문을 제외한 그 이외의 흐름을 제어할 때 사용하는 구문
	 * 	 주로 반복문을 "보조" 해주는 역할로 많이 쓰임
	 * 
	 * [ 종류 ]
	 * 1. break문 : 반복을 빠져나가게 해주는 역할 (즉, 반복을 멈춰주는 역할)
	 * 2. continue문 : 반복문의 다음 증감식 또는 다음 조건식으로 넘어가게 해주는 역할
	 * 					(즉, 다음 반복 회차로 바로 넘어가게 유도하는 구문)
	 */
	
	public static void main(String[] args) { // main 영역 시작

		A_Break a = new A_Break();
		
		// a.method1();
		// a.method2();
		// a.method3();
		// a.method4();
		// a.method5();
		
		// System.out.println("프로그램이 종료됩니다");
		
		B_Continue b = new B_Continue();
		
		// b.method1();
		// b.method2();
		b.method3();
	} // main 영역 끝

} // 클래스 영역 끝
