package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Checked Exception 을 다루는 방법
public class B_CheckedException { // 클래스 영역 시작

	/*
	 * * Checked Exception 은 반드시 예외 처리를 해줘야 하는 예외들
	 *   (즉, 예외 처리 구문을 무조건 써야 하는 예외들
	 * > 예측 불가능한 곳에서 언제 발생할지 모르기 때문에 미리 예외 처리 구문을 작성해줘야함!!
	 * > 주호 "외부 매체" 와 어떤 입출력 시 발생
	 */
	
	public void method1() throws IOException { // 메소드 영역 시작
		
		/*
		try {
		
			method2();
		
		} catch(IOException e) {
			
			System.out.println("예외 발생됨");
		}
		*/
		
		method2();
	} // 메소드 영역 끝
	
	public void method2() throws IOException { // 메소드 영역 시작
		
		// Checked Exception 이 발생할 법한 구문
		
		// 사용자로부터 키보드로 문자열을 입력받아, 그 문자열의 길이를 출력하는 프로그램
		// > Scanner 와 같이 키보드로 값을 입력받을 수 있는 객체 (단, 문자열로만 입력 가능)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무 문자열을 입력하세요 : ");
		// String str = br.readLine();
		// > Unhandled exception type IOException 오류 발생
		//	 IOException 타입의 예외 처리 구문을 왜 안썼냐고 물어보는것!!

		// 기존의 Unechecked 계열들은 예외 처리 구문을 쓰지 않더라고 빨간 밑줄로 알려주지 않았음!!
		// > 충분히 예측 가능란 경우이기 때문에 예외 처리 구문을 안쓰더라도 그냥 넘어갈 수 있음!!
		//	 (오히려 조건문 사용을 권장함)
		
		// Checked 계열들은 예외 처리 구문을 안쓰면 애초에 빨간 밑줄 (컴파일 에러) 로 알려줌!!
		// > 예측 불가능한 경우이므로 예외 처리 구문을 무조건 쓰고 넘어가달라 라는 뜻!!
		
		// 1. try ~ catch문 이용
		/*
		try {
			
			String str = br.readLine();
		
			System.out.println("문자열의 길이 : " + str.length());
		
		} catch(IOException e) {
			
			System.out.println("예외 발생됨!");
			// > 언제 예외가 발생할 지 아무도 모름!! 그래서 예외 처리 구문이 필수임!!
		}
		*/
		
		// 2. throws 키워드 이용
		/*
		 * * throws 키워드
		 * > 지금 여기서 당장 예외를 처리하지 않고 (예외 처리 구문을 쓰지 않고)
		 * 	 다른곳에서 대신 예외처리를 하도록 "떠넘기겠다" 라는 뜻 (위임하겠다)
		 * 
		 * > method2 에서 try ~ catch문을 이용해서 예외처리를 하지 않겠다.
		 * 	 나를 호출했던 곳에서 try ~ catch문을 이용해서 예외처리를 하도록 떠넘기겠다.
		 * > 떠넘긴 곳에서도 예외처리를 하지 않으면 마찬가지로 빨간 밑중이 뜨면서 예외처리를 꼭 하고 넘어가도록 유도!!
		 * 
		 * * 예외 처리 시 왠만해서는 해당 구문에서 곧바로 try ~ catch문을 이용해서
		 * 	 그 자리에서 예외처리를 하고 넘어가자!! (권장사함) - 어느 부분이 문제인지 한눈에 파악이 되므로
		 * 
		 * * Unchecked 계열에서도 throws 사용 가능!!
		 * 
		 * * Checked 계열은 메소드 정의부에 throws 로 이미 떠넘기고 있다!!
		 * > 그래서 컴파일 에러로 계속 예외 처리를 하고 넘어가라고 유도했던 것!!
		 */
		String str = br.readLine();
		
		System.out.println("문자열의 길이 : " + str.length());
		
		// System.out.println("프로그램 종료");
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
