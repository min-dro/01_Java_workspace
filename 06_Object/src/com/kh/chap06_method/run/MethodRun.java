package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.MethodTest1;
import com.kh.chap06_method.controller.MethodTest2;

public class MethodRun { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		// 1. MethodTest1
		MethodTest1 m1 = new MethodTest1();
		
		m1.method1();
		
		System.out.println("------");
		
		// m1.method2();
		// > 반환값이 있는 메소드는 그냥 호출하면 실행만 되고 끝남!!
		
		// int a = m1.method2();
		// System.out.println("랜덤값 : " + a);
		// > 그냥 호출구문만 작성해도 잘 돌아가기는 하지만,
		//	 호출한 곳에서 그 돌려받은 반환값을 가지고 후처리 같은 것을 하고 싶다면
		//	 항상 변수 선언 및 대입 구문과 함께 써야 한다!!
		
		System.out.println("랜덤값 : " + m1.method2());
		// > 굳이 변수에 담지 않고
		//	 출력문 안에서 반환값이 있는 메소드를 바로 호출함으로써
		//	 돌려받은 반환값을 곧바로 출력 또한 가능!!
		//	 (단, 변수에 담지 않았기 때문에 아래에서 이 리턴값을 사용할 수)
		
		System.out.println("------");
		
		// m1.method3();
		// > 매개변수가 있는 메소드를 호출할 경우에는
		//	 반드시 매개변수의 종류, 갯수, 순서에 맞는 값들을 () 안에
		//	 나열해서 호출해야만 한다!!
		// > 이것을 "매개변수로 값을 넘긴다." 라고 표현하고,
		//	 이 값들을 "인자" 또는 "인자값" 라고 부른다.
		
		// m1.method3(42. 20);
		m1.method3(20, 42);
		// > 반드시 매개변수의 종류, 갯수, 순서 맞추기!!
		
		System.out.println("------");
		
		int b = m1.method4(10, 5);
		
		System.out.println("곱셈결과 : " + b);
		
		/*
		 * * 반환값이 없는 메소드 같은 경우 해당 메소드 처리 결과를
		 * 	 보통 출력까지 아는 역할로 코드를 짠다!!
		 */
		
		System.out.println("============");

		// 2. MethodTest2
		
		MethodTest2.method1();
		// > static 메소드는 객체 생성 후 호출이 아니라,
		//	 그냥 클래스명.메소드명() 으로 호출한다!!
		//	 왜? 프로그램 시작과 동시에 메모리의 static 이라는 영역에
		//	 메소드들이 미리 담겨져 있기 때문에!! (static 변수와 동일)
		
		System.out.println(MethodTest2.method2());
		
		MethodTest2.method3("홍길동", 20);
		MethodTest2.method3("김영희", 33);
		
		System.out.println(MethodTest2.method4(3, 90));
		
	} // main 영역 시작

} // 클래스 영역 끝
