package com.kh.chap02_string.controller;

public class A_StringPoolTest { // 클래스 영역 시작

	/*
	 * * String 클래스
	 * > 자바에서 문자열을 다루는 용도의 클래스 (자료형)
	 * 	 (클래스는 사용자 정의 참조자료형 - 애초에 문자열을 다루기 위한 자료형으로 만들어진 클래스)
	 * > 문자열 리터럴 (값) 을 곧바로 대입하거나, new 구문을 통해 객체 생성이 가능하다.
	 * > java.lang 패키지 안에 정의되어있음 (풀클래스명은 java.lang.String)
	 * 
	 * > String "불변클래스" (변하지 않는 클래스) 다.
	 * 	 값을 수정하는 순간 기존의 값이 담겨있던 공간에서 수정되지 않겠다!!
	 */
	
	// 1. 생성자를 통해 문자열 담기
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello"); // String str2 = "hello";
		
		System.out.println(str1 == str2); // false (주소값 비교)
		
		System.out.println(str1);
		System.out.println(str2/* .toString() */);
		// > String 객체 (변수) 도 마찬가지로 사실 출력문 안에서 변수명만 쓰면
		//	 내부적으로 toString 메소드가 호출되서 출력되는 꼴임!!
		
		// Object 클래스의 toString 메소드는 주소값을 반환해주는 메소드인데
		// String 클래스가 그 toString 메소드를 물려받아 "오버라이딩" 해서
		// 호출 시 주소값이 아닌 "문자열 내용물" 이 나오는 것임!!
		
		System.out.println(str1.equals(str2)); // true (내용물 비교)
		
		// Object 클래스의 equals 메소드는 주소값을 동등비교해주는 메소드인데
		// String 클래스가 그 equals 메소드를 물려받아 "오버라이딩" 해서
		// 호출 시 주소값이 아닌 "문자열 내용물" 로 동등비교가 되는 것임!!
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// Object 클래스의 hashCode 메소드는 주소값을 기반으로 십진수로 뽑아주는 메소드인데
		// String 클래스가 그 hashCode 메소드를 물려받아 "오버라이딩" 해서
		// 호출 시 주소값이 아닌 "문자열 내용물" 을 기반으로 십진수로 변경해서 뽑아주는 것임!!
		
		// * String 클래스는 참조자료형이고, String 변수 또한 참조자료형 변수임!!
		// > 일부러 일반자료형처럼 주소값이 아닌 값 위주로 편하게 쓰라고 개조된 클래스!!
		
		// 정말 주소값에 대한 해시코드를 보고 싶다면?
		// > System.identityHashCode(참조변수명);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// > 실제 주소값의 해시코드를 알려줌
		
	}
	
	// 2. 문자열을 리터럴 (값) 로 생성 - 우리가 늘 하던 방식
	public void method2() {
		
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1 == str2); // true (주소값 동등비교)
		
		// > 문자열 객체 생성 시 (문자열 참조변수 생성 시) "리터럴 (값)" 을 이용해서 생성한다면
		//	 메모리의 Heap 영역의 "String pool (상수풀)" 이라는 공간에 문자열 내용물이 올라가게 됨!!
		// > String pool (상수풀) 의 특징 : 동일한 내용의 문자열이 존재 불가하다.
		
		System.out.println(str1);
		System.out.println(str2 /* .toString() */);
		
		System.out.println(str1.equals(str2)); // true (내용물 동등비교)
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
	
	// 3. 불변클래스 특징
	public void method3() {
		
		String str = "hello";
		System.out.println(System.identityHashCode(str)); // 1392838282 (주소값)
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str)); // 523429237 (주소값)
		
		str += "abc";
		// str = str + "abc";
		System.out.println(System.identityHashCode(str)); // 468121027 (주소값)
		
		// > 불변이라고해서 수정이 아예 안되는게 아니라 (수정이 아예 안되는건 상수개념임)
		//	 그 값이 담겨있는 기존의 자리에서 수정만 안되는 개념일 뿐임!!
		// > 매번 새로운 주소값을 참조하며 값을 변경할수 있는 구조임!!
		// > 기존의 상수풀의 연결이 끊긴 문자열들은 일정 시간이 지나면 가비지 컬렉터가 알아서 정리해줌!! (자동 메모리 관리)
		
	}
	
	// 4. 불변클래스 성질을 보완하는 클래스
	public void method4() {
		
		// * 기존의 String 객체
		// > 내용이 수정될 때 마다 메모리 공간의 할당이 계속 일어나게 됨!! 메모리 공간의 소멸도 계속 일어남!!
		//	 성능 저하 이슈가 발생 할 수 있음!!
		
		// * StringBuilder, StringBuffer 객체
		
		// 1. StringBuilder 사용법
		/*
		StringBuilder sb = new StringBuilder(); // ""
		System.out.println("sb : " + sb);
		System.out.println(sb.hashCode());
		System.out.println(System.identityHashCode(sb)); //1670782018 (주소값)
		
		// 문자열을 연이어주는 메소드
		// [ 표현법 ]
		// sb.append("이어붙일문자열");
		sb.append("Hello"); // "" + "Hello"
		System.out.println("sb : " + sb);
		System.out.println(sb.hashCode()); // 1670782018 (주소값)
		// > 문자열 내용물이 변경됬음에도 불구하고 주소값은 계속 고정!!
		//	 실제 내용물이 할당된 공간에서 담긴 값만 바꼈다!!
		*/
		
		// 2. StringBuffer 사용법
		StringBuffer sb = new StringBuffer("Hello"); // "Hello"
		System.out.println("sb : " + sb);
		System.out.println(sb.hashCode()); // 1670782018 (주소값)
		
		// 문자열을 연잇는 메소드 (마찬가지로 append 사용)
		sb.append(" World!");
		System.out.println("sb : " + sb);
		System.out.println(sb.hashCode()); // 1670782018 (주소값)
		// > 마찬가지로 문자열 내용물이 변경됬음에도 불구하고 주소값은 계속 고정!!
		//	 실제 내용물이 할당된 공간에서 담긴 값만 바꼈다!!
		
		// > String : 기존의 공간에서 값 변경이 안일어남!!
		//			  그대신 새로운 공간을 할당해서 값 변경이 일어나는 효과를 줌
		
		// > StringBuilder, StringBuffer : 기존의 공간에서 값 변경이 일어남!!
		//								   불변클래스라는 String 의 단점을 보완해줌
		//								   (매번 새로운 곳을 할당하지 않음)
		
		// StringBuilder 또는 StringBuilder 를 쓰면 좋은 경우
		
		/*
		String str = ""
		
		while(true) {
		
			str += "a";
			
		}
		*/
		
		/*
		StringBuilder str = new StringBuilder();
		
		while(true) {
		
			str.append("a");
		}
		*/
		
		// > StringBuilder 와 StringBuffer 의 차이점
		// StringBuilder : 속도가 조금 더 빠름, 한번에 한개씩만 append 처리 가능
		// StringBuffer : 속도가 상대적으로 조금 느림, 한번에 여러개의 append 처리 가능
		//				  (한번에 여러 일 가능 : 멀티쓰레드)
		
	}
	
} // 클래스 영역 끝
