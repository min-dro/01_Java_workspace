package com.kh.chap06_method.controller;

// 일반메소드 사용법
public class MethodTest1 { // 클래스 영역 시작

	/*
	 * * 메소드 (Method)
	 * 
	 * > 하나의 기능 단위를 나타내는 코드 블록({ })
	 * > 기능 별 메소드를 정의 후 항상 헌제든지 호출해서 쓸 수 있다!!
	 * 	 (메소드를 "정의" 만 한다고 해서 그 안쪽 코드가 실행되지 않음!! 반드시 "호출" 을 해야 실행됨!!)
	 * > 메소드 위주의 (기능 위주의) 클래스를 Controller 클래스 라고 부른다.
	 * 
	 * [ 종류 ]
	 * 1. main 메소드 : 프로그램의 시작점을 나타내는 메소드, 프로그램이 시작과 동시에 JVM 에 의해 호출됨
	 * 2. main 메소드가 아닌 메소드 (일반 메소드) : main 메소드가 아닌 모든 메소드들, 일반적인 기능 담당 코드를 작성함
	 * 
	 * [ 표현법 ]
	 * 접근제한자 (예약어) 반환할값의자료형 메소드명(매개변수 => 생략가능) {
	 * 
	 * 		실행할 코드;
	 * 
	 * 		return 반환값; // 반환할값의자료형이 void 라면 생략
	 * }
	 * 
	 * - 필요에 따라 반환값이 있을수도 없을수도 있음!!
	 * - 필요에 따라 매개변수가 있을 수도 없을 수도 있음!!
	 */
	
	// 1. 매개변수가 없도 반환값도 없는 메소드
	// > 그동안 우리가 맨날 써오던 가장 기본적인 형태
	public void method1() { // 메소드 영역 시작
		
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드입니다.");
		
		// 1 ~ 10 까지의 총 합계를 구하여 출력하는 메소드
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			
			sum = sum + i; // sum += 1;
		}
		
		System.out.println("총 합계 : " + sum);
		
		// return;
		// void 메소드의 경우 return; 구문이 아래에 생략된 꼴임!!
		// JVM 이 return; 구문을 자동으로 완성시켜주는 꼴
	} // 메소드 영역 끝
	
	// 2. 매개변수가 없고 반환값은 있는 메소드
	// 예) getter 메소드
	public int method2() { // 메소드 영역 시작
		
		System.out.println("매개변수는 없고 반환값은 있는 메소드입니다.");
		
		// 1 ~ 100 까지의 랜덤한 정수값을 발생기켜서 돌려주는 메소드
		int random = (int)(Math.random() * 100 + 1);
		
		return random;
	} // 메소드 영역 끝
	
	// 3. 매개변수가 있고 반환값은 없는 메소드
	// 예) setter 메소드
	public void method3(int num1, int num2) {
		// > 매게변수의 갯수는 내 마음대로!!
		//	 여러 개의 매개변수를 작성할 경우에는 , 로 연이어 적는다.
		
		System.out.println("매개변수가 있고 반환값이 없는 메소드입니다.");
		
		// num1 과 num2 의 값을 비교해서 결과를 출력해주는 메소드
		// 최소값 : xx, 최대값 : xx
		int min = 0; // 두 수 중 작은 값을 보관할 변수
		int max = 0; // 두 수 중 큰값을 보관할 변수
		
		// if문으로 비교
		if(num1 > num2) {
			// > num1 이 더 큰 경우
			
			max = num1;
			min = num2;
			
		} else {
			// > num1 이 더 크지 않은 경우
			
			max = num2;
			min = num1;
		}
		
		System.out.println("최솟값 : " + min + ", 최대값 : " + max);
	}
	
	// 4. 매개변수도 있고 반환값도 있는 메소드
	public int method4(int a, int b) {
		
		System.out.println("매개변수도 있고 반환값도 있는 메소드입니다.");
		
		// 두 매개변수 정수값을 곱한 결과값을 돌려주는 메소드
		// int result = a * b;
		// return result;
		
		return a * b;
	}
} // 클래스 영역 끝
