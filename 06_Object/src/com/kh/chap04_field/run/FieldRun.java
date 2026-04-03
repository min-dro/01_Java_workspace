package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		// 1. FieldTest1
		/*
		FieldTest f1 = new FieldTest1()
		// > 객체 생성 시 (new 구문 실행 시) global 맴버변수가 생성됨 (할당된)
		
		// 지금 이 시점 부터는 f1 의 global 상자에 내가 원하는 값을 넣을 수 있게됨!!
		
		f1.test(10);
		// > 메소드 호출 시 그 메소드의 매개변수인 num 이 생성됨
		
		// System.out.println(f1.global);
		// > global 변수는 아직 소멸되지 않음!!
		//	 단, private 이기 때문에 출력을 못하는 것 (is not visible)
		 
		// > global 도 소멸시키고 싶다면?
		f1 = null;
		// > 이 시점 기준으로 global 에 아예 접근해서 쓸 수 없어짐!!
		//	 (참조가 끊기므로)
		// > 이 시점 기준으로 일정 시간이 지나면 알아서 소멸됨
		//
		// Syste.out.println(f1.global);
		// > 접근이 이제는 아예 불가해짐!! (NullPointerException 오류 발생)
		
		// System.out.println(local);
		// System.out.println(num);
		// > test 메소드의 지역변수인 local, num 은
		//	 해당 메소드의 실행이 끝나고 태초마을로 돌아올 때 이미 소멸됨!!
		//	 이 시점부터는 local, num 은 쓸 수가 없음!!
		*/
		
		// ---------------------
		
		// 2. FieldTest2
		/*
		FieldTest2 f2 = new FieldTest2();
		// > 이 시점 기준으로 메모리에 4개의 맴버변수가 생성됨
		
		// public : 어디서든 항상 접근 가능
		System.out.println(f2.pub);
		
		// protected : 같은 패키지에서는 직접 접근 가능,
		//					  다른 패키지에서는 직접 접근 불가
		// System.out.println(f2.pri); // is not visible
		 
		// FieldRun 과 같은 패키지인 Test 의 맴버변수로도 확인해보기
		Test t = new Test();
		// > 우선 같은 패키지의 클래스는 객체 생성 시 import 가 필요 없음!!
		
		// public
		System.out.println(t.pub);
		
		// protected
		System.out.println(t.pro);
		
		// default
		System.out.println(t.df);
		
		// private
		// System.out.println(t.pri); // is not visible
		*/
		
		// ----------------------
		
		// 3. FieldTest3
		
		System.out.println(FieldTest3.sta);
		// > 객체 생성을 안할 뿐 그냥 가져다 쓸 수 있다.
		//	 단, 항상 클래스명.static변수명 으로 접근해서 써야함
		
		// > new 구문을 통해 꼭 생성하지 않더라도 바로 가져다 쓸 수 있음
		//	 왜? 이미 프로그램 시작과 동시에 생성이 되었기 때문!!
		
		System.out.println(FieldTest2.sta);
		// > 클래스명.static변수명 으로 접근하는 이유
		//	 static 변수명이 중복될 수 있기 때문에!!
		//	 sta 라는 변수를 가져다 쓰려고 하면
		//	 FieldTest2 의 것을 가져다 쓸건지
		//	 FieldTest3 의 것을 가져다 쓸건지 햇갈림!!
		
		// static 메소드도 마찬가지로 바로 호출해서 쓸 수 있음
		// 클래스명.static메소드명();
		FieldTest3.test();
		FieldTest2.test();
		
		// > 가져다 쓸 때 객체생성할 필요 X, 항상 클래스명.static변수명 또는 클래스명.static메소드명();호출
		
		//  상수 필드 출력해보기
		System.out.println(FieldTest3.NUM);
		// > 상수 필드 또한 static 예약어가 붙기 때문에
		//	 클래스명.상수필드명으로 가져다 쓰면됨!!
		
		// 상수 필드의 값을 수정해보기
		// FieldTest3.NUM = 11;
		// > 상수 필드의 값은 절대 변경 불가!!
		
		// 그러면 그냥 static 변수는?
		FieldTest3.sta = "FieldTest3";
		
		System.out.println(FieldTest3.sta);
		// > 값 변경이 가능함!!
		
		/*
		 * * static 을 많이 사용하는 예시
		 * > 자바에서 제공하는 Math 클래스
		 * 
		 * Math : 수학 계산에 특화된 클래스 (수학 관련 상수값들, 계산용 메소드들)
		 * 			프로그래밍 중 수학 계산할 일이 빈번하기 때문에 모두 static 으로 만듬!!
		 * 
		 * Math 클래스에서 제공하는 상수 필드나 메소드를 호출할 경우에는
		 * Math 객체를 생성하지 않고 바로 Math.상수필드명 또는 Math.메소드명(); 으로 쓴다!!
		 * 
		 * 그래서 아예 Math 클래스의 객체가 생성되지 않도록 막아놨음!!
		 * 
		 * - 이런식으로 모든 필드, 메소드를 static 으로 만들고
		 * 	 객체 생성 구문 또한 못쓰게 막아둔 코드 패턴을 "싱글톤 패턴" 이라고 부른다.
		 * 	 (Math 클래스가 대표주자임, 주로 공통코드 작업 시 많이 쓰임)
		 */
		
		// Math m = new Math();
		
		System.out.println(Math.random());
		System.out.println(Math.PI);
	} // main 영역 끝

} // 클래스 영역 끝
