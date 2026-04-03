package com.kh.chap02_abstractANDinterface.part01_basic.model.vo;

// 접근제한자 abstrac(예약어)t class 클래스명
public abstract class Sports { // 클래스 영역 시작
	// > The type Sports must be an abstract class to define abstract methods
	//	 Sports 는 반드시 추상클래스여야만 한다 (추상메소드가 존재하기 때문) 라고 오류로 알려줌!!
	
	// 필드부
	private int people; // 스포츠에 참여하는 인원수
	
	// 생성자부
	public Sports() { }
	
	public Sports(int people) {
		
		this.people = people;
	}

	// 메소드부
	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}
	
	@Override
	public String toString() {
		
		return "people : " + people;
	}
	
	// 스포츠 경기라면 응당 경기 규칙도 있어야 하므로 이 규칟을 "메소드" (행위) 로 표현해보자!!
	/*
	public void rule() {
		
		System.out.println("규칙을 잘 지켜서 경기에 임해야 한다.");
	}
	*/
	
	// 접근제한자 (예약어) 반환형 메소드명(매개변수 => 생략가능)
	public abstract void rule();
	// > This method requires a body instead of a semicolon
	//	 메소드는 무조건 몸통부가 필요함!! 세미콜론 대신에 메소드 몸통부를 써라 라고 오류로 알려줌!!
	
	// 해결방법)
	// > abstract 라는 예약어를 붙인다.
	
	// > The abstract method rule in type Sports can only be by an abstract class
	//	 추상메소드는 반드시 추상클래스 안에 존재해야한다 라고 오류로 알려줌!!
	
	/*
	 * * 부모클래스 입장에서 자식클래스들이 모두 물려받은 메소드를 오버라이딩 해서 쓴다면
	 * 	 굳이 힘들게 코드를 일일이 채워서 쿨려줄 필요가 없을 것 같음!!
	 * > 메소드는 물려주되, 메소드 안의 코드는 지우고 물려주면 안되나..?
	 * > 메소드의 몸통부를 지워보자!!
	 * 
	 * * 추상메소드
	 * > 몸통부가 존재하지 않는 "미완성된" 메소드 (호출해서 실행 불가)
	 * > 추상메소드를 정의하려면 몸통부를 없애고, "abstract" 라는 예약어 또한 써야한다!!
	 * > 미완성된 메소드 (추상메소드) 가 하나라도 포함되는 순간, 해당 클래스 또한 추상클래스가 되어버린다!! (미완성된 클래스)
	 * 마찬가지로 포함하고 있는 추상클래스도 추상클래스가 되어버린다!! 
	 */
	
} // 클래스 영역 끝
