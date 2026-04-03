package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Coffee;
import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		// Product 객체 생성
		Product p1 = new Product();
		// > null, 0, null (기본값으로 셋팅)
		
		p1.setpName("아이폰 13");
		p1.setPrice(1230000);
		p1.setBrand("애플");
		
		System.out.println(p1.information());
		
		Product p2 = new Product();
		// > null, 0, null (기본값으로 셋팅)
		
		p2.setpName("애플워치5");
		p2.setPrice(500000);
		// p2.Brand("APPLE");
		
		System.out.println(p2.information());
		
		// p3, p4, p5, ... 제품 객체를 계속 만들어서 현실 세계의 제품 정보를 담을 수 있다!!
		
		// * getter 메소드룰 굳이 만들 필요가 있너? information 이 이미 있는데
		// > 당장 쓰지 않더라도 무조건 만들어 두는게 원칙(캡슐화 과정 중 하나이므로)
		// > 언젠가는 getter 메소드를 쓸 일이 생길 수도 있음!!
		
		// 예)
		// 고객 : 애플워치5의 가격을 알고싶어요!
		// ??? : (p2.getPrice());
		
		// * 만약 내가 제품정보를 계속 등록할 때 전부 애플 제품으로만 등록하고 싶다면?
		Product p3 = new Product();
		
		p3.setpName("아이패드 에어");
		p3.setPrice(900000);
		// p3.setBrand("APPLE")
		
		System.out.println(p3.information());
		
		// ...
		
		// p4.setBrand("애플");
		
		// ...
		
		// p5.setBrand("애플");
		
		// > 어차피 등록하는 제품마다 다 브랜드명은 "애플"로 통일할건데
		//	 매번 setter 메소드로 호출해서 일일이 셋팅하기가 너무 귀찮음!!
		// > brand 필드값을 내가 원하는 "애플" 로 셋팅해준다!!
		//	 (setBrand 메소드를 매번 호출할 필요가 없어진다)
		
		// * 그러면 setBrand 메소드는 안만들어도 되지 않나?
		// > setter 메소드도 당장 필요하지 않더라도 반드시 무조건 만들고 넘어가는 것이 원칙임!!
		//	 (캡슐화 과정의 일부이므로)
		// > 언젠가는 setter 메소드 하나로 하나의 필드값만 수정해야 할 일이 생길수도 있기 대문에
		//	 반드시 만들고 넘어가야한다.
		
		p3.setBrand("애플");
		// > 필드에 초기화를 하더라도 고정값 (상수) 개념은 아니다!!
		//	 초기화를 하더라도 추후에 setter 메소드를 호출하면
		//	 해당 필드값을 언제든지 변경할 수 있다!!
		
		System.out.println(p3.information());
		
		System.out.println("------------------");
		
		// 추상화, 캡슐화 과정을 통해 Coffee 라는 클래스를 만들었음!!
		// == 내가만든 클래스 (커피 정보를 담을 용도)
		// == 음료명(String), 가격(int) 옵션(char), 사이즈(char)
		//	 한번에 String, int, char, char 를 다 담을 수 있는
		//	 "배열같은" 나만의 자료형
		// > 클래스 == 사용자 정의 자료형 == 참조 자료형
		
		// 이걸 가지고 이제 Coffee 객체를 생성할 수 있음!!
		// 클래스명 객체명 = new 클래스명();
		// 자료형 변수명 = 값;
		// > 클래스명 == 참조자료형, 객체묭 == 참조변수명
		
		Coffee c1 = new Coffee();
		// > null, 0, '', ''
		//	 메모리의 heap 영역은 비어있을 수 없기 때문에 JVM 이 기본값으로 초기화
		
		System.out.println(c1.information());
		
		// 값 넣기
		// c1.coffeeName = "아메리카노";
		// > 캡슐화를 했기 때문에 필드에 직접 접근이 불가능 (is not visible)
		// > setter 메소드를 통해 간접적으로 대입해야함
		
		c1.setCoffeeName("아메리카노");
		c1.setPrice(2500);
		c1.setOption('H');
		c1.setSize('S');
		
		System.out.println(c1.information());
		
		// 객체 == 인스턴스
		// 객체 생성 == 인스턴스화
		Coffee c2 = new Coffee();
		
		// 값 넣기
		c2.setCoffeeName("카페라떼");
		c2.setPrice(3000);
		c2.setOption('I');
		c2.setSize('M');
		
		System.out.println(c2.information());
		
		System.out.println("--------");
		
		System.out.println(c1);
		System.out.println(c2);
		// > 주소값 출력
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		// 해시코드 출력
		
		Coffee c3 = c1;
		
		System.out.println(c3.information());
		// > 원본 c1 의 내용이 c3 로 잘 복사되어 보임!!
		
		// 따뜻한 아메리카노였던 내용을 아이스 아메리카노로 변경해보기
		c3.setOption('I');
		
		System.out.println(c3.information());
		
		System.out.println(c1.information());
		// > c1 의 데이터를 복사 --> c3 에 붙여넣기 --> c3 만 수정 --> c1 또한 변경됨
		
		// 배열이든 객체든 간에 똑같은 "참조자료형 변수" 이기 때문에
		// 복사 개념을 똑같이 적용할 수 있고, 이 때 얕은복사를 주의해야함!!
		
		// 주소값 비교
		System.out.println(c1);
		System.out.println(c3);
		// > c1 의 주소값과 c3 의 주소값이 일치함 (즉, 얕은복사가 되었다)
		
		// 그러면 깊은복사를 하고싶다면? 무조건 new 구문을 실행하자!!
		Coffee c4 = new Coffee();
		
		c4.setCoffeeName(c1.getCoffeeName());
		c4.setPrice(c1.getPrice());
		c4.setOption(c1.getOption());
		c4.setSize(c1.getSize());
		// > 원본으로부터 getter 를 호출해서 값을 가져온 다음
		//	 그 값을 곧바로 getter 를 호출해서 바로 담아주는것!!
		//	 (변수명 때와 마찬가지로 메소드명도 for문 적용 불가)
		
		System.out.println(c4.information());
		
		System.out.println(c1);
		System.out.println(c4);
		// > 주소값이 다름!! (깊은복사가 잘 되었다)
		
		Person kim = new Person();
		
		kim.setId("user01");
		kim.setPwd("pass01");
		kim.setName("김가현");
		kim.setAge(20);
		kim.setGender('F');
		kim.setPhone("010-1111-2222");
		kim.setEmail("gahyun@kh.com");
		
		System.out.println(kim.information());
		
	} // main 영역 끝
	
} // 클래스 영역 끝
