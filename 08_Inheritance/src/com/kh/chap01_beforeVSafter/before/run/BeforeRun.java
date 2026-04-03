package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.TV;

public class BeforeRun {

	public static void main(String[] args) {
		// Desktop 객체
		Desktop d = new Desktop("삼성", "d-01", "게이밍데스크탑", 2300000, true);

		// Tv 객체
		TV t = new TV("엘지", "t-01", "고오급벽걸이티비", 3500000, 100);
		
		// SmartPhone 객체
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1230000, "SKT");
		
		System.out.println(d);
		System.out.println(t);
		System.out.println(s);
		// > 주소값 그대로 출력 (객체는 참조자료형 변수이기 때문)
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		/*
		 * * 전자제품을 판매하는 쇼핑몰 같은 것을 구현한다고 했을 때
		 * Desktop, Tv, SmartPhone 제품을 나타내는 각각의 클래스를 만들어서 표현 가능!!
		 * > 그 외에 냉장고, 선풍기, 태블릿, 스마트워치, 등 더 많은 종류의 상품을 표현하기 위해
		 * > 그런데 잘 살펴보니, Desktop 이든 Tv 든 SmartPhone 이든 그 외의 클래스든 간에
		 * 모두 공통적으로 brand, pCode, pName, price 필드와 그에 따른 setter / getter 를 가져야함
		 * 
		 * * 매 클래스마다 중복된 코드들이 너무 많아짐!!
		 * > 코드를 작성하는 과정에서 실수할 가능성도 있을 뿐만 아니라 귀찮기도 함!!
		 * 	 코드 수정과 같은 유지보수 작업에서 중복된 코드 부분이 변경되어야 할 경우
		 * 	 해당 코드 부분을 일일이 찾아서 전부 다 수정해야하는 번거로움이 생김!!
		 * 
		 * * "상속" 이라는 개념을 적용시켜서 매 클래스마다 중복된 필드, 메소드들을 단 한번만 어딘가에 정의해둔 후
		 * 	 그 코드를 가져다 쓰는 형식으로 진행해보자!!
		 */
	}

}
