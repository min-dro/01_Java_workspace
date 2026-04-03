package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		// * 모든 클래스는 Object 클래스의 후손이다
		// > 즉, 자바에서의 최상위 클래스는 항상 Object
		
		// 모든 클래스마다
		// Object 클래스메 정의된 메소드들은 다 가져다 쓸 수 있음!!
		// Object 클래스에 정의된 메소드들 중 마음에 안드는게 있다면
		// 오버라이딩을 통해 재정의 (재작성) 가능!!
		
		Book bk = new Book("두잇 자바 프로그래밍", "박은종", 25000);
		
		// 출력
		System.out.println(bk/* .toString() */); // 주소값
		System.out.println(bk.toString()); // 주소값
		// > bk 를 그냥 출력했을 때와 bk.toString() 으로 출력했을 때
		//	 출력 결과가 완전히 동일하게 나오고 있음!!
		
		// * Object 클래스에 정의된 toString() 메소드
		// > 해당타임의 풀클래스명 + "@" + 16진수형태의주소값
		//	 하나의 문자열로 내보내주는 메소드
		
		// * 출력문 안에 참조자료형 변수명을 제시해서 출력하고자 할 때
		//	 항상 해당타입의 풀클래스명 + "@" + 16진수형태의주소값
		//	 형식이 출력됬던 이유가
		// > 내부적으로 JVM 이 자동으로 .toString() 메소드를 호출해줬기 때문
		
		// 고민해볼것!!
		// > 객체 (참조자료형 변수) 명을 출력문 안에 그냥 썼을 때 (toString 메소드가 호출 될때)
		//	 일반변수처럼 주소값이 아닌 필드값들이 출력됬으면 너무 편할거같음!!
		// > 자식클래스인 Book 클래스에서 Object 로부터 물려받은 toString 메소드를 재정의
		//	 (즉, toString 메소드를 오버라이딩 하겠다)
		// > 이왕이면 toString 을 해당 객체의 모든 필드값을
		
		System.out.println("-------");
		// System.out.println(bk.information());
		// System.out.println(bk);
		
		// bk 를 출력했을 때
		// toString 오버라이딩 전 : 주소값
		//			오버라이딩 후 : 필드값
		
	} // main 영역 끝

} // 클래스 영역 끝
