package com.kh.operator;

import java.util.Scanner;

// 산술 연산자
public class A_Arithmetic { // 클래스 영역 시작

	/*
	 * * 산술 연산자
	 * > 이항 연산자로써 연산 방법과 우선 순위가 일반 수학과 산술과 완전히 동일
	 * 
	 * [ 종류 ]
	 * + : 덧셈
	 * - : 뻴셈
	 * * : 곱셈
	 * / : 나눗셈 (몫)
	 * % : 모듈러 (Modular), 나눗셈에서 나머지만 구하는 개념
	 */
	
	public void method1() { // 메소드 영역 시작
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		// > (num1 + num2) 를 괄호로 묶어줘야 13 이라는 결과가 나옴
		//	 num1 + num2 를 괄호 없이 그냥 쓰게 되면
		//	 String 처럼 각각 숫자 10과 3을 연이어서 문자열 출력하기 때문에 102 이라는 결과가 나오는 것!!
		
		System.out.println("num1 - num2 = " + (num1 - num2));
		// > 뺄셈의 경우 괄호로 묶어주지 않으면 에초에 오류가 발생!!
		//	 String 으로 앞쪽의 문자열과 정수 10을 연이어줌
		//	 그 이후에 이 엮인 문자열과 3 을 빼는 연산이 일어나려과 할 때
		//	 문자열에서 숫자를 뺄 수 없으므로 오류 발생!!
		//	 (num1 - num2) 처럼 소괄호로 묶어줘야 함!!
		
		System.out.println("num1 * num2 = " + (num1 * num2)); // 30
		System.out.println("num1 / num2 = " + (num1 / num2)); // 3
		System.out.println("num1 % num2 = " + (num1 % num2)); // 1
	 	// > 곱셈, 나눗셈, 모듈러의 경우
		//	 덧셈 (+) 보다 우선순위가 높기 때문에
		//	 괄호로 묶지 않아도 제대로된 결과를 받아볼 수 없음!!
		//	 다만, 가독성을 위해 소괄호로 묶어주는 것을 권장함!!
		
		// * 산술 연산 시 주의할점
		//System.out.println(10 / 0);
		//System.out.println(10 % 0);
		// > ArithmeticException 오류 발생 (/ by zer0)
		//	 수학과 마찬가지로 0으로 나눌 수 없기 때문에 오류가 발생하는 것!!
		
		double a = /* (double) */ 35; // 35.0
		double b = /* (double) */ 10; // 10.0
		// > 자동형변환
		
		System.out.println("a + b = " + (a + b)); // 45.0
		System.out.println("a - b = " + (a - b)); // 25.0
		System.out.println("a * b = " + (a * b)); // 350.0
		System.out.println("a / b = " + (a / b)); // 3.5
		System.out.println("a % b = " + (a % b)); // 5.0
		// > 정수로써 계산하면 몫은 3.0, 나머지는 5.0 이 됨!!
		//	 나머지 없이 몫을 계산하면 3.5 가 맞음!!
		
		// 항상 같은 타입의 값들끼리만 연산 가능하고,
		// 결과 또한 같은 타입으로 나오는 것이 원칙이다!!
		
		
	} // 메소드 영역 끝
	
	// 연습문제
	public void method2() { // 메소드 영역 시작
		
		/*
		 * 사용자로부터 키보드로 인원 수와 사탕의 갯수를 각각 입력 받아
		 * 1인당 동일하게 나눠 가질 수 잇는 사탕의 갯수와 남을 사탕의 갯수를 계산을 해서 출력
		 * 
		 * ---- 실행 예시 ----
		 * 인원 수 : 5
		 * 사탕 갯수 : 164
		 * 
		 * -------------------
		 * 1인당 나눠가질 수 있는 사탕 갯수 : 32
		 * 남을 사탕 갯수 : 4
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사탕 갯수 : ");
		int candy = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		System.out.println("-------------------");

		System.out.printf("1인당 나눠가질 수 있는 사탕 갯수 : %d\n", (candy / people));
		System.out.printf("남을 사탕 갯수 : %d\n", (candy % people));
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
