package com.kh.array.run;

import com.kh.array.A_Array;
import com.kh.array.B_ArrayCopy;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		A_Array a = new A_Array();
		
		System.out.println(a);
		// com.kh.array.A_Array@5305068a
		// > 대변할이름 a 도 사실은 참조변수임!!
		//	 a 를 출력해봤더니 외계어 (주소값) 이나옴
		
		// a.method1();
		// a.method2();
		// a.method3();
		// a.method4();
		// a.method5();
		// a.method6();
		// a.method7();
		// a.method8();
		// a.method9();
		// a.method10();
		// a.method11();
		// a.method12();
		a.method13();
		
		B_ArrayCopy b = new B_ArrayCopy();
		
		// b.method1();
		// b.method2();
		// b.method3();
		// b.method4();
		// b.method5();
	} // main 영역 끝

} // 클래스 영역 끝
