package com.kh.variable;

public class D_Printf { // 클래그 영역 시작

	/*
	 * * 출력 메소드
	 * System.out.print(출력할값);
	 * - 단순히 값을 출력만 해줌
	 * 
	 * System.out.println(출력할값);
	 * - 해당 값을 출력 후 "줄바꿈 (개행)" 까지 해줌
	 * 	 (ln : line 의 약자)
	 * 
	 * System.out.printf("출력할형식", 출력할값);
	 * - 내가 지정한 형식에 맞춰서 값들을 출력해줌, 이 때 출력 후 줄바꿈 X
	 * 	 (f : format 의 약자)
	 * 
	 * [ 형식 ]
	 * %d : 정수
	 * %f : 실수
	 * %c : 문자
	 * %s : 문자열
	 * 
	 * - "출력할형식" 부분에 위의 형식을 토대로 자리를 만들어 두고, 
	 * 	 그 자리에 들어갈 값들을 , 출력할값 으로 나열하는 구조임!!
	 */
	
	// 1. printf 구문 사용
	public void printfTest() { // 메소드 영역 시작

		// 정수 테스트
		int iNum1 = 10;
		int iNum2 = 20;
		
		// "iNum1 : xx, iNum2 : xx" 형식으로 출력해보기
		// 1. println 사용
		System.out.println("iNum1 : " + iNum1 + ", iNum2 : " + iNum2);
		
		// 2.printf 사용
		System.out.printf("iNum1 : %d, iNum2 : %d\n", iNum1, iNum2);
		// > 점수가 들어갈 수 있는 형식을 %d 로 구멍 뚫어놓은 것!!
		//	 구멍의 종류, 갯수, 순서에 맞게 뒤에 그 구멍을 메꿔줄 값들을 나열함!!
		// > 출력 후 줄바꿈 기능은 없으므로 \n을 추가해준다.
		
		// "10 + 20 = 30" 문자열을 출력
		// 1. println 사용
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		
		// 2. printf 사용
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, (iNum1 + iNum2));

		// %d 에 대한 옵션
		System.out.printf("%d\n", iNum1);
		System.out.printf("%5d\n", iNum1);
		// > %5d : 5칸의 공간 중 오른쪽 정렬
		System.out.printf("%-5d\n", iNum1);
		// > %-5d : 5칸 공간 중 왼쪽 정렬
		
		// 실수 테스트
		double dNum = 4.27546789;
		
		// "dNum : xx.xxxx" 를 출력해보기
		// 1. println 사용
		System.out.println("dNum : " + dNum); // 4.27546789
		
		// 2. printf 사용
		System.out.printf("dNum : %f\n", dNum); //2.37548
		// > %f : 소숫점 아래 7번쨰 자리를 반올림해서
		//		  소숫점 아래 6번째 자리까지만 출력해준다. f : (float 의미)
		
		// %f 에 대한 옵션
		System.out.printf("dNum : %.2f\n", dNum); // 4.3
		// > %1.f : 소숫점 아래 2번째 자리에서 반올림해서
		//			소숫점 아래 1번째 자리까지만 출력해준다
		//    .자릿수 로 제어 가능
		
		// 문자와 문자열 테스트
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%C %S\n", ch, str);
		// > C%, %S : 채워넣어야할 출력할 데이터가 영어 알파벳일 경우 모두 대문자로 변경해서 출력
		
		/*
		 * * printf
		 * > 포맷 (형식) 단 한번 제시로 간편하게 여러 값들을 한번에 출력 가능하다.
		 * > 단, 출력 후 줄바꿈이 일어나지 않는다.
		 * > 또한, 지정한 포맷 (구멍) 의 갯수와 종류
		 */
		
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
