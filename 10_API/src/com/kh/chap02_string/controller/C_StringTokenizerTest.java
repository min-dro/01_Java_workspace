package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

// 문자열을 분리하는 방법
public class C_StringTokenizerTest { // 클래스 영역 시작

	public void method1() { // 메소드 영역 시작
		
		String str = "Java,Oracle,JDBC,HTML,ServermSpring";
		
		// 방법1)
		// 문자열.split(String 구분자) : String[]
		String[] arr = str.split(",");
		
		/*
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		*/
		
		// 배열의 경우 for문을 돌릴 때
		// for(int i = 0; i < 배열명.length; i++)
		
		// 배열의 경우 for문을 다음과 같이 쓸 수도 있다.
		// > 향상된 for문, foreach문
		// [ 표현법 ] 
		// for(변수선언문 : 배열명)
		for(String s : arr) {
			
			System.out.println(s);
		}
		
		System.out.println("-------------------------");
		
		// 방법2)
		// java.util 패키지의 StringTokenizer 클래스를 이용하는 방법
		
		// 참고) Token : "단어" 단위를 나타내는 용어
		
		// [ 표현법 ]
		// StringTokenizer stn = new StringTokenizer("분리할문자열", "구분자");
		
		StringTokenizer stn = new StringTokenizer(str, ","); // 6
		// > 끊겨진 단어들이 stn 이라는 StringTokenizer 객체에 차곡차곡 담겨있음!!
		//	 (마치 배열처럼, 그렇다고 해서 배열은 아님!!)
		
		System.out.println("현재 분리된 문자열의 갯수 : " + stn.countTokens()); // 6
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		// > 저장되어있는 단어를 꺼내올 때에는 nextToken() 메소드 활용
		
		System.out.println("현재 저장된 문자열의 갯수 : " + stn.countTokens()); // 0
		*/
		
		// System.out.println(stn.nextToken());
		// > NoSuchElementException 오류 발생
		//   현재 남아잇는 stn 토큰의 갯수의 범위를 벗어나서 계속 꺼내오려고 할 때 발생
		
		// 반복문을 활용해보기
		/*
		for(int i = 0; i < stn.countTokens(); i++) {
			
			System.out.println(stn.nextToken());
		}
		*/
		// > 반복이 6번이 아닌 3번만 돌고 있음!!
		//   왜? stn.countTokens() 메소드 호출 결과는 "유동적인 값" 임!!
		//   (실제로 남아있는 토큰의 갯수만 세 줌)
		
		// 해결방법1)
		// > 보조해주는 변수 이용하기
		/*
		int count = stn.countTokens(); // 6
		
		for(int i = 0; i < count; i++) {
			
			System.out.println(stn.nextToken());
		}
		*/
		
		// 해결방법2)
		// > 반복문을 통해 stn 객체에 남아있는 토큰이 있는지 검사하고 있으면 뽑아서 출력
		//	 즉, 반복을 토큰이 남아있는 동안에만 돌리는 방법 (즉, 토큰의 갯수만큼만 반복문 돌리기)
		while(stn.hasMoreTokens()) {
			// > StringTokenizer 에서 제공하는 토큰이 남아있는지 검사해주는 메소드
			//	 stn.hasMoreToken() : boolean
			//   토큰이 남아있으면 true, 아니면 false 반환
			
			System.out.println(stn.nextToken());
		}
		
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
