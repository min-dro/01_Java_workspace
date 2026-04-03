package com.kh.chap01_beforeVSafter.before.after.run;

import com.kh.chap01_beforeVSafter.before.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.after.model.vo.Tv;

public class AfterRun /* extends Object */ { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		// Desktop 객체 생성
		Desktop d = new Desktop();
		d.setBrand("삼성");
		d.setpCode("d-01");
		d.setpName("게이밍 데스크탑");
		d.setPrice(20000000);
		// > 부모로부터 물려받았기 때문에 호출 가능
		
		d.setAllInOne(true);
		// > 내꺼이기 때문에 바로 호출 가능
		
		// Tv 객체 생성
		Tv t = new Tv("엘지", "t-01", "고오급벽걸이티비", 3500000, 100);
		
		// SmartPhone 객체 생성
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1230000, "SKT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		// > 부모로부터 물려받았기 때문에 호출 가능!!
		//	 Product 입장에서 미리 작성했었던 information 메소드를 물려받아서 호출함!!
		//	 brand, pCode, pName, price 필드 까지만 문자열로 내보내주고 있다.
		// > 각각 Desktop, Tv, SmartPhone 에서 출력되지 않고 있음
		
		// > "오버라이딩" 을 통해 해결 가능함!!
		//	 오버라이딩 된 메소드가 없다면 부모클래스로부터 물려받은 원본메소드가 그대로 호출됨
		//	 오버라이딩 된 메소드가 있다면 그 오버라이딩된 메소드가 호출됨 (우선순위가 더 높음 - 동적 바인딩)
		
		/*
		 * * 상속 (Inherit)
		 * 
		 * > 매 클래스마다 중복된 코드 (필드, 메소드) 둘울 "부모클래스" 에 공통 코드로 묶어두고 (단 한번만 정의해두고)
		 * 	 해당 클래스의 코드를 가져다 쓰는 개념
		 * > 죽, 코드를 물려받겠다.
		 * 
		 * 상속의 장점
		 * 1. 중복된 코드를 공통적으로 관리하기 때문에 새로운 코드를 추가하거나 수정할 때 용이함
		 * 2. 보다 적은 양의 코드로 새로운 클래스들을 매번 작성 가능
		 * => 프로그램의 "생산성" 과 "유지보수" 에 크게 기여
		 * 
		 * * 상속의 특징
		 * 1. 클래스 간의 상속은 "다중 상속" 이 불가능하다.
		 * 	  즉, "단일 상속" 만 가눙하다.
		 * 	  (부모클래스는 최대 한개만 둘 수 있다)
		 * 왜? 부모클래스가 여러개일 경우, 필드명 또는 메소드명이 중복되면
		 * 	  자식클래스 입장에서 어느 부모의 것을 가져다 써야하는지 햇갈리기 때문!!
		 * 2. 명시되어있지는 않지만, 모든 클래스는 Object 클래스의 후손이다.
		 * 	  내가만든 클래스든, 남이 만들어준 클래스든 간에 자바의 모든 클래스에 해당되는 특징임!!
		 * > Object 클래스에 있는 메소드 및 필드들을 내가 언제든지 가져다 쓸 수 있게됨
		 * > 만약 Object 클래스에 있는 메소드가 마음에 안든다면 오버라이딩을 통해 내 입맛대로 재정의가 가능해짐
		 * 
		 * * Object 클래스
		 * > 자바 프로그래밍에서 모든 객체에 대해 공통적으로 필요한 유용한 메소드들이 정의되어있는
		 * 	 "최상위 클래스"
		 */
		
		System.out.println(d);
		System.out.println(t);
		System.out.println(s);
		// 주소값
		
		System.out.println(d.hashCode());
		System.out.println(t.hashCode()); 
		System.out.println(s.hashCode());
		// > 해시코드값 (주소값의 십진수화)
		//	 객체명.hashCode();
		// > 우리가 직접 만든 Product, Desktop, Tv, SmartPhone 클래스 어디에도
		//	 hashCode 메소드를 직접 정의한 적이 없음!! 그런데도 호출이 잘됨!!
		// > 사실 hashCode 메소드는 Object 클래스에 정의돈 메소드임!!
		//	 그동안 그냥 호출이 가능했던 이유는 Object 가 모든 클래스의 부모 (조상) 클래스이기 때문
		//	 (알게모르게 다들 메소드를 물려받았던것)
	} // main 영역 끝

} // 클래스 영역 끝