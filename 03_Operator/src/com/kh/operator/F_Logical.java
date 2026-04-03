package com.kh.operator;

import java.util.Scanner;

// 논리 연산자
public class F_Logical { // 클래스 영역 시작
	
	/*
	 * * 논리 연산자
	 * > 이항 연산자로써, 두 개의 "논리값"을 연산하는 역할
	 * 	 결과값 또한 "논리값"으로 나옴!!
	 * 
	 * [ 표현법 ]
	 * 논리값 (논리연산자) 논리값
	 * 
	 * [ 종류 ]
	 * AND 연산자 : 논리값 && 논리값
	 * 			  왼쪽, 오른쪽 논리값 모두 true 여야지만 결과도 true 로 나옴
	 * 			  그리고, ~ 이고, ~ 이면서
	 * OR 연산자 : 논리값 || 논리값
	 * 			  왼쪽, 오른쪽 논리값 중 하나라도 true 면 결과도 true 로 나옴
	 * 			  또는, ~ 이거나
	 */
	
	public void method1() { // 메소드 영역 시작
		
		// 사용자로부터 정수값 한 개를 키보드로 입력받아
		// 그 정수값이 양수 "이면서" 짝수인지 확인하기
		// > ~ 이면서, ~ 이고, 그리고 (AND)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한 개를 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 판별한 결과를 잠아 둘 변수
		boolean result = (num > 0) && (num % 2 == 0);
		// 가독석 측면에서 소괄호를 묶는 것을 더 권장함!!
		
		System.out.println("사용자가 입력한 값이 양수이면서 짝수입니까 : " + result);
		
	} // 메소드 영역 끝

	public void method2() { // 메소드 영역 시작
		
		// 사용자가 키보드로 입력한 정수값이
		// 1 이상 100 이하의 숫자인지를 판별하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한 개를 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// num이 1 이상 100 이하인 경우
		// true <= 100
		// > 프로그래밍에서는 위와 같이 수학시간 처럼 묶어서 표현이 불가능하다!!
		//	 왜? <= 끼리의 우선순위가 동일해서 왼쪽에서부터 차례대로 실행됨
		//	 첫번째 비교 연산에 의해 결과는 논리값이 나오고, 이 논리값과 두번째 비교 연산이 수행되면
		//	 논리값과 숫자값이 비교되는 꼭이라 오류가 발생하면서 연산 자체도 불가해짐!!
		
		// 해결방법)
		// (1 <= num) && (num <= 100)
		// > num 이 1 보다 크거나 같고 그리고 (AND)
		//	 num 이 100 보다 작거나 같습니까?
		
		// 결과를 담을 변수
		boolean result = (1 <= num) && (num <= 100);
		
		System.out.println("사용자가 입력한 값이 1 이상 100 이하입니까 : " + result);
		
	} // 메소드 영역 끝

	public void method3() { // 메소드 영역 시작
	
		// 사용자가 키보드로 입력한 값이 'y' 이거나 'Y' 인지 확인하기
		// > 또는, ~ 이거나 (OR)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계속하시려면 y 또는 Y 를 입력하세요 : ");
		char answer = sc.next().charAt(0);
		// > 'y' 또는 'Y' 또는 그 이외의 문자가 하나 들어있을 것!!
		
		// System.out.println(answer);
		
		// 결과를 담을 변수 셋팅
		boolean result = (answer == 'y') || (answer == 'Y');
		
		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까 : " + result);
		
	} // 메소드 영역 끝
	
	// 논리 연산자의 특징과 주의사항
	public void method4() { // 메소드 영역 시작
		
		/*
		 * * 논리 연산자의 특징 ***
		 * 1. && : 둘 다 true 여야지만 결과도 true
		 * true && true == true
		 * true && false == false
		 * false && true == false
		 * false && false == false
		 * 
		 * 2. || : 둘 중에 하나라도 true 면 결과도 true
		 * true || true == false
		 * true || false == true
		 * false || true == true
		 * false || false == true
		 */
		
		// * 논리 연산자 사용 시 주의사항
		int num1 = 10;

		boolean result1 = false && (num1 > 0);
		// > 뒤의 비교 연산 부분에 Dead Code 라는 경고가 뜸 (실행은 됨)
		// 	 굳이 결과값은 false && 까지만 봐도 무조건 false 로 나오는 상황!!
		//	 그런데 왜 굳이 뒤의 (num1 > 0) 코드를 마저 이어 쓰는지 물어보는 것
		
		// OR 연산도 마찬가지
		boolean result2 = true || (num1 > 0);
		// > 마찬가지로 Dead Code 라는 경고가 뜸 (실행은 됨)
		
		// > 빨간 밑줄 : 오류 (에초에 문법 자체가 잘못되서 실행보차 안되는 경우)
		// > 노란 밑줄 : 경고 (실행은 되나, 추후 문제가 생길 여지가 있는 경우)
		
		System.out.println(result1); // false
		System.out.println(result2); // true
		
		/*
		 * * Dead code
		 * > 불필요한 코드, 실행되지 않아도 되는 코드
		 * > 불필요한 코드의 실행은 컴퓨터의 입장에서 시간과 메모리의 낭비!!
		 */

	} // 메소드 영역 끝
	
	
	
} // 클래스 영역 끝
