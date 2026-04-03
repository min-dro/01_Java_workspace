package com.kh.operator;

import java.util.Scanner;

// 비교 연산자
public class E_Comparison { // 클래스 영역 시작

	/*
	 * * 비교 연산자 (관계 연산자)
	 * > 이항 연산자, 두 개의 값을 가지고 비교해주는 역할
	 * 	 (크고 작음을 비교, 일치항을 비교)
	 * > 비교 연산한 결과가 참일 경우는 true/ 거짓일 경우는 false 값을 반환함
	 * 	 (아무리 숫자끼리 연산하더라도 결과가 숫자로 나오는게 아니라 논리값으로 나옴)
	 * > 후에 특정 조건을 제시할 수 있는 "조건문" 같은데서 많이 쓰일 예정!!
	 * 
	 * [ 종류 ]
	 * - 크고 작음을 비교
	 * a < b : a가 b보다 작습니까? (질문)
	 * a > b : a가 b보다 큽니까?
	 * a <= b : a가 b보다 작거나 같습니까?
	 * a >= b: a가 b보다 크거나 같습니까?
	 * 
	 * - 일치함을 비교
	 * a == b : a와 b가 일치합니까?
	 * a != b : a와 b가 일치하지 않습니까?
	 */
	
	public void method1() { // 메소드 영역 시작
		
		int a = 10;
		int b = 25;
		
		System.out.println("a > b : " + (a > b)); // false
		// The operator > is undefined for the argument type(s) String, int
		// > 비교 연산자 보다 산술 연산자인  + 가 우선순위가 더 높기 때문에
		//	 (a > b) 는 괄호로 묶어 우선순위를 높여줘야 함!!
		
		System.out.println("a <= b : " + (a <= b)); // true
		
		boolean result1 = a == b;
		// > 비교 연산자 보다 대입 연산자인 = 이 우선순위가 더 낮기 때문에
		//	 괄호로 묶지 않아도 코드는 제대로 동작함!!
		// > 단, 가독성을 위해 (a == b) 를 괄호로 묶어서 표현하는 것을 권장!!
		
		System.out.println("result1 : " + result1); // false
		
		boolean result2 = (a != b);
		
		System.out.println("result2 : " + result2); // true
		
		// 산술 연산 + 비교 연산
		System.out.println((a - b) < 0); // true
		// > 산술 연산이 우선순위가 더 높기 때문에
		//	 산술 연산을 먼저 하고 그 결과를 가지고 비교 연산이 진행됨!!
		// > 단, 가독성을 위해 (a - b) 부분을 소괄호로 묶는 걸 권장함
		
		// 예시)
		// 어떤 숫자값 n이 있다고 가정할 때 이 n 이 짝수냐 홀수냐를 판별해보고 싶음
		// n : 3 % 2 => 나머지 1 (홀수) 
		// n : 4 % 2 => 나머지 0 (짝수)
		// n : 5 % 2 => 나머지 1 (홀수)
		// n : 6 % 2 => 나머지 0 (짝수)
		// ...
		// > 규칙 : n 을 2 로 나누었을 때 나누어 떨어지면 짝수
		//							 나누어 떨어지지 않으면 홀수
		//		  즉, 어떤 숫자값 n 을 2 로 나눈 나머지가 0 이라면 짝수
		//								   나머지가 1 이라면 홀수
		System.out.println("a가 짝수입니까 : " + ((a % 2) == 0)); // true
		System.out.println("b가 홀수입니까 : " + ((b % 2) == 1)); // true
		// b 를 2 로 나눈 나머지가 1 과 일치합니까?
		
		System.out.println("b가 홀수입니까 : " + ((b % 2) != 0)); // true
		// > b 를 2 론 나눈 나머지가 0 과 일치하지 않습니까?
		//	 즉, 나머지가 1과 같냐라는 뜻임 결국!! (어떤 수를 2로 나누면 나머지는 0 또는 1 만 나옴)
		
		// > 어떻게 비교 연산식을 작성하냐에 따라
		//	 결괴기 같게 또는 다르게 나올 수도 있다!! (말장난 주의) 
		
	} // 메소드 영역 끝
	
	// 응용
	public void method2() { // 메소드 영역 시작
		
		/*
		 * 사용자로부터 정수값 한 개를 키보드로 입력받아서
		 * 그 정수값이 "양수" 인지 판별
		 * 그 정수값이 "짝수" 인지 판별 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한 개 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 1. 우선 num 이 "양수" 인지 먼저 판별
		// > num 이 0 보다 크면 양수
		System.out.println("사용자가 입력한 값은 양수입니까 : " + (num > 0));
		
		// 2. num 이 "짝수" 인지도 판별
		// > num 을 2 로 나눈 나머지가 0과 일치하면 짝수
		System.out.println("사용자가 입력한 값은 짝수입니까 : " + ((num % 2) == 0));
		
		// > 각각 따로 계산해도 되지만 한번에 계산하고 싶다면?
		
	} // 메소드 영역 끝
	
} // 클래스 영역 끝