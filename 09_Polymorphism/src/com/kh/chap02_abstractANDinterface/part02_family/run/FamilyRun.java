package com.kh.chap02_abstractANDinterface.part02_family.run;

import com.kh.chap02_abstractANDinterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractANDinterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractANDinterface.part02_family.model.vo.Mother;
import com.kh.chap02_abstractANDinterface.part02_family.model.vo.Person;

public class FamilyRun { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		// 1. 인터페이스 적용 전
		/*
		// Person p = new Person();
		// > 추상클래스로는 절대 생성 불가!!
		
		// 그대신 참조변수로는 쓸 수 있음!! (다형성 적용 가능)
		Person p1 = new Mother("김엄마", 50, 70, "출산");
		Person p2 = new Baby("김응애", 3.5, 70);
		
		System.out.println(p1);
		System.out.println(p2);
		
		// 엄마가 밥을 먹으면
		p1.eat(); // 엄마 : 몸무게 + 10, 건강도 - 10
		
		// 아기가 밥을 먹으면
		p2.eat(); // 아기 : 몸무게 + 3, 건강도 + 1
		
		// 엄마가 잠을 자면
		p1.sleep(); // 엄마 : 건강도 + 10
		
		// 아기 : 건강도 + 3
		p2.sleep(); // 아기 : 건강도 + 3
		
		System.out.println("=== 다음날 ===");
		System.out.println(p1);
		System.out.println(p2);
		*/
		
		// 2. 인터페이스 적용 후
		// Basic b = new Basic();
		// 마찬가지로 객체 생성 불가능
		
		// Basic b;
		// > 마찬가지로 참조 변수로써 활용 가능 (즉, 다향성 적용 가능)
		
		Basic b1 = /* (Basic) */ new Mother("김엄마", 50, 70, "출산");
		Basic b2 = /* (Basic) */ new Baby("김응애", 3.5, 70);
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b2.eat();
		
		b1.sleep();
		b2.sleep();
		
		System.out.println("=== 다음날 ===");
		System.out.println(b2);
		System.out.println(b2);
		
		/*
		 * * 인터페이스 적용 전
		 * - 추상클래스인 Person 에 eat, sleep 추상메소드를 정의해두고
		 *   각각의 자식클래스인 Mother, Baby 에서 상속받아서 그 메소드의 내용을 채워쓴 것 (오버라이딩)
		 *   + 내가 추가적으로 필요한 필드와 메소드까지 덧붙여서 썼었음!! (extends - 확장)
		 * 
		 * * 인터페이스 적용 후
		 * - 추상클래스인 Person 에 공통적으로 필요한 필드, 메소드만 정의 해두고,
		 * 	 Mother 든 Baby 든 무조건 오버라이딩 해야하는 행위를 나타내는 eat, sleep 메소드는 따로
		 *   basic 이라는 인터페이스로 빼서 정의해둔 것
		 *   Person 으로부터는 공통코드를 물려받고 내가 추가적으로 필요한 필드와 메소드까지 덧붙여서 씀 (extends - 확장)
		 *   Basic 으로부터는 껍데기뿐인 추상메소드를 내려받고, 각각 필요한 내용물 (메소드 코드) 를 채워서 쓴 것!! (implements - 구현)
		 * => 장점 : 나중에 코드 확장 (유지보수) 시 훨씬 편할 수 있다!!
		 */
		
	} // main 영역 끝

} // 클래스 영역 끝
