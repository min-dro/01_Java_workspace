package com.kh.chap02_encapsulation.model.vo;

// 캡슐화 과정까지 완료한 클래스
public class Student { // 클래스 영역 시작

	// [ 필드부 ]
	// > "필드"들 이 모여있는 "부"분
	// 필드 : 클래스 영역에 바로 정의된 변수 (메소드 밖에 정의된 변수)
	//	      "전역변수" 라고도 부름!!
	// 접근제한자 (예약어) 자료형 필드명;
	private String name;
	private int age;
	private double height;
	// > 필드의 접근제한자를 private 으로 바꿔주는게 캡슐화의 1단계임!!
	
	// [ 생성자부 ]
	// > "생성자" 들이 모여있는 "부"분
	
	// [ 메소드부 ]
	// > "메소드" 들이 모여있는 "부"분
	/*
	 * * 메소드 : 각각의 기능을 담당하는 개념
	 * 
	 * [ 표현법 ]
	 * public void 메소드명() {
	 * 
	 * 		실행할 코드;
	 * }
	 *
	 * - 원래 메소드는 이렇게 표현함
	 * 접근제한자 반환형 메소드명(매개변수 => 생략가능) {
	 * 
	 * 		실행할 코드;
	 * }
	 * 
	 * > 메소드 호출 시 필요로 하는 값을 넘길수도있고, (매개변수)
	 * 	 메소드 길행이 끝난 뒤 필요하다면 값을 태초마을로 갖고 갈 수도 있음!! (반환형)
	 */
	
	// 간접적으로나마 데이터를 기록 및 수정하는 용도의 메소드
	// > setter 메소드
	
	/* * setter 메소드 : 외부로부터 값을 전달받아 (매개변수) 해당필드에 대입해주는 메소드
	 * 
	 * * setter 메소드 작성 공식
	 * 
	 * [ 표현법 ]
	 * public void set필드명(해당필드와같은자료형 필드명) {
	 * 
	 * 		this.필드명 = 매개변수명;
	 * }
	 * 
	 * > 매개변수의 이름은 해당필드명과 "동일" 하게 맞춰준다 (Naming Convention)
	 * > 매개변수명과 필드명이 일치하면 매개변수명이 필드명에 비해 우선순위가 더 높기 때문에
	 * 	 "필드로써의" 의미를 부여하려면 앞에 this. 을 작성한다!!
	 * 	 (매개변수도 일종의 지역변수이기 때문)
	 * > "set필드명" 메소드명은 낙타표기법을 지켜야함!!
	 * > 접근제한자는 무조건 public (외부에서 호출이 가능해야하니까)
	 */
	
	// name 필드에 대한 setter 메소드
	public void setName(String name) { // 메소드 영역 시작
	
		this.name = name;
	} // 메소드 영역 끝
	
	// age 필드에 대한 setter 메소드
	public void setAge(int age) { // 메소드 영역 시작
		
		this.age = age;
	} // 메소드 영역 끝
	
	// height 필드에 대한 setter 메소드
	public void setHeight(double height) { // 메소드 영역 시작
		
		this.height = height;
	} // 메소드 영역 끝
	
	// 간접적으로나마 데이터를 꺼내다주는 용도의 메소드
	// > getter 메소드
	
	/*
	 * * getter 메소드 : 이 필드에 들은 값을 호출해주는 메소드
	 * 
	 * * getter 메소드 작성 공식
	 * 
	 * [ 표현법 ] 
	 * public 해당필드의자료형 get필드명() {
	 * 
	 * 		return 필드명;
	 * }
	 * 
	 * > 반환형은 해당 필드값의 자료형, 반환값은 해당 필드에 들어있는 값이 된다!!
	 * > 마찬가지로 외부에서 호출이 가능해야하기 때문에 접근제한자는 public
	 * > 단순히 역할이 필드값을 뽑아서 태초마을로 돌려주는거라 매개변수는 필요 없음
	 * > "get필드명" 메소드명은 낙타표기법을 지켜야함!! (Naming Convetion)
	 */
	
	// name 필드에 대한 getter 메소드
	public String getName() { // 메소드 영역 시작

		return name;
	} // 메소드 영역 끝

	// age 필드에 대한 getter 메소드
	public int getAge() { // 메소드 영역 시작
		
		return age;
	} // 메소드 영역 끝

	// height 필드에 대한 getter 메소드
	public double getHeight() { // 메소드 영역 시작
		
		return height;
	} // 메소드 영역 끝

	// > 여기까지 총 6개의 메소드를 만들었슴!! (setter 3개, getter 3개)
	//	 캡슐화 관련 메소드 6개 정의 끝!!
	
	// > setter 든 getter 든 간에 모두 "필드마다 하나씩" 다 만들어줘야함!!
	//	 즉, 필드가 10개다 하면 setter 10개, getter 10개
	
	// > 메소드부에는 꼭 setter / getter 메소드만 정의하라는 법이 없음!!
	//	 필요하다면 밑에 메소드를 더 만들어서 써도 됨!!
	
	// 모든 필드값을 하나의 문자열로 연이어서 돌려주는 용도의 일반 메소드
	public String information() { // 메소드 영역 시작

		// return name, age, height;
		// > 반환되는 결과값은항상 반드시 한개 분이여야만 한다!!
		
		// > 그래서 이 세개의 값을 하나의 문자열로 연이어준 다음 하나로 내보내겠다.
		// return name + age + height; // "홍길동20168.7"
		return name + "님의 나이는 " + age + "살이고, 키는 " + height + "cm 입니다.";
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
