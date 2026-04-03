package com.kh.chap01.condition.run;

import com.kh.chap01.condition.A_If;
import com.kh.chap01.condition.B_Else;
import com.kh.chap01.condition.C_Switch;

public class ConditionRun { // 클래스 영역 시작

	/*
	 * * 프로그램은 기본적으로 "위에서부터 아래로" 코드가 순차적으로 실행됨 (프로그램의 기본 흐름)
	 * 하지만, 이 순차적인 흐름을 바꾸고자 할 때 "제어문" 이라는 걸 통해서 바꿀 수 있다. (직접 제어 가능)
	 * 
	 * [ 종류 ]
	 * 1. "선택적" 으로 실행하는 선택문 : 조건문 (if문, if-else문, if-else if문, switch문)
	 * 2. "반복적" 으로 실행하는 반복문 : 반복문 (for문, while문, do-while문)
	 * 3. 그 외의 흐름을 제어하는 구문 : 분기문 (break문, continue문)
	 * 
	 * * 조건문
	 * > "조건식" 을 통해 참이냐 거짓이냐 판단해서 해당 조건식의 결과가 참인 경우 (True)
	 * 	 그에 해당하는 구문을 "선택적" 으로 실행 가능한 구문
	 * > 항상 조건식의 결과는 true / false (논리값) 로 나오게끔 제시해야한다!!
	 * > 보통 조건식 안에서는 주로 비교 연산자 (대소, 동등), 논리연산자 (&&, ||) 처럼
	 * 	 연산의 결과가 항상 boolean 타입으로 나오는 연산자들을 주로 사용한다!!
	 * > 조건문은 크게 if문 계열과  switch문 으로 나뉘게 된다!!
	 * 
	 * [ 종류 ]
	 * 1. if문 계열 : 조건식을 내가 직접 코드 상에 기술 가능한 구문들
	 * - 단독 if문
	 * - if-else문
	 * - if-else if문
	 * 2. switch문 : 조건식을 직접 기술하지 않아도 선택적인 흐름들을 만들어 낼 수 있음
	 */
	
	public static void main(String[] args) { // main 영역 시작
		
		A_If a = new A_If();
		
		// a.method1();
		// a.method2();
		// a.method3();
		// a.method4();
		// a.method5();
		// a.method6();
		
		B_Else b = new B_Else();
		
		// b.method1();
		// b.method2();
		// b.method3();
		// b.method4()
		
		C_Switch c = new C_Switch();
		
		// c.method1();
		// c.method2();
		// c.method3();
		c.method4();
		
	} // main 영역 끝

} // 클래스 영역 끝
