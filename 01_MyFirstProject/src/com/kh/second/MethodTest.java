package com.kh.second;

// 일반 메소드들만 가지고 있는 클래스
// > 한 클래스 내에 여러 개의 메소드 (기능) 를 정의해 둘 수 있음
//	 한 클래스 내에 무조건 메인메소드를 포함하라는 법도 없음
// > 단, main 메소드를 포함하지 않은 클래스는 Run Ad > Java application 으로 실행 불가!!
public class MethodTest {	// MethodTest 클래스 영역 시작

	// 첫번째 일반메소드
	public void testMethodA() { // testMethodA 영역 시작
		
		// 이 메소드가 호출 될 순간 실행할 코드
		System.out.println("method a 실행됨");
		
		// testMethodB 메소드 호출
		// > 이번에는 같은 클래스에 있는 메소드이기 때문에
		testMethodB();
		
		// testMethodC 까지 호출
		// testMethodC();
		
	} // testMethodA 영역 끝
	
	// 두번째 일반메소드
	public void testMethodB() { // testMethodB 영역 시작
		
		// 이 메소드가 호출 될 순간 실행할 코드
		System.out.println("method b 실행됨");
		
		// 이 시점에서 testMethodC 를 호출하면 같은 결과를 받아볼 수 있음!!
		testMethodC();
		
	} // testMethodB 영역 끝
	
	
	// 새번째 일반메소드
	public void testMethodC() { // testMethodC 영역 시작
		
		// 이 메소드가 호출 될 순간 실행할 코드
		System.out.println("method c 실행됨");
		
		// 여기에서 testMethodA 를 호출한다면?
		// testMethodA();
		
		/*
		 * 프로그램 시작! 준비 땅 ~!
		 * method a 실행됨
		 * method b 실행됨
		 * method c 실행됨
		 * method a 실행됨
		 * method b 실행됨
		 * method c 실행됨
		 * ...
		 * 
		 * > 이 경우 무한반복으로 결과가 실행되다가 오류가 발생하면서 프로그램이 종료
		 * 	 (반복적으로 프로그램이 동작하다가 지쳐서 멈춘 것)
		 * 	 StackOverflowError : Stack 은 메모리 공간의 유형 중 하나인데 Stack 의 크기를 벗어나서 발생
		 * 	 (메소드가 호출 될 때마다 Stack 영역을 쓰기 때문에)
		 */
		
	} // testMethodC 영역 끝
	
} // MethodTest 클래스 영역 끝
