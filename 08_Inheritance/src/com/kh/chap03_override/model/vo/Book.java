package com.kh.chap03_override.model.vo;

public class Book { // 클래스 영역 시작
	
	// 필드부
	private String title; // 제목
	private String author; // 저자명
	private int price; // 가격
	
	// 생성자부
	public Book() {}
	
	public Book(String title, String author, int price) {
		
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// 메소드부
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// information
	/*
	public String information() {
		
		return "title : " + title + ", author : " + author + ", price : " + price;
	}
	*/
	
	// toString 메소드 오버라이딩
	/*
	@Override // 이거 오버라이딩 된 메소드임 ㅇㅇ
	public String toString() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}
	*/
	// > 원래 toString 의 역할은 주소값을 문자열로 리턴해주는 메소드임!! (Object 클래스에 정의된 원본 내용)
	//	 출력문 안에 객체명단 써서 출력할 때 내부적으로 .toString() 이 호출되는 구조여서
	//	 이왕이면 객체명단 써서 출력할 때 주소값이 아닌 필드값들이 한번에 보여졌으면 함!!
	// > toString 메소드를 "오버라이딩 (필드값들을 하나의 문자열로 연이어서 리턴해주는 식으로)
	// > 앞으로는 information 메소드를 만들 필요 없이 toString 메소드를 오버라이딩 해서 쓰자!!
	
	// 사실 toString 도 자동완성 가능함!!
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	/*
	 * * 오버라이딩 (Overriding)
	 * 
	 * > 상속받고있는 부모클래스의 메소드를 자식클래스에서 코드를 내 입맛대로 재정의 (재작성) 하는 것
	 * > 부모가 제공하고 있는 메소드를 자식이 일부 고쳐서 사용하겠다 라는 의미
	 * > 호출 시 재정의된 (오버라이딩된) 자식메소드가 우선권을 가짐 (동적 바인딩)
	 * 
	 * * 오버라이딩 성립 조건
	 * 1. 부모메소드 메소드명과 동일
	 * 2. 매개변수의 자료형, 갯수, 순서가 모두 동일
	 * 3. 반환형과 동일
	 * 4. 매개변수명과는 무관
	 * 5. 부모메소드의 접근제한자보다 같거나 공유 범위가 더 커야 함
	 * > 즉, 메소드의 정의부 (껍데기) 는 그대로 쓰고, 중괄호 영역 안쪽의 코드만 재정의 해서 쓴다라고 보자!!
	 * > "규약" 의 개념이 들어가있음
	 * 	 재정의를 해서 쓰려면 적어도 이정도의 규칙은 지켜야 한다.
	 * 
	 * * 오버로딩 VS 오버라이딩
	 * - 오버로딩
	 * 같은 클래스 내 동일한 이름으로 여러개의 메소드를 만들 수 있는 규칙
	 * 상속이랑 전혀 관련 없는 개념
	 * 
	 * - 오버라이딩
	 * 상속 구조의 클래스간에 매소드를 재정의 할 수 있는 규칙
	 * 상속이랑 관련 있는 개념!! (오버라이딩은 대전제가 상속)
	 * 
	 * * @Override 어노테이션 (Annotation)
	 * > 생략 가능 (안써도 그만 써도 그만)
	 * > 이 메소드가 오버라이딩된 메소드임을 알려주는 일종의 "주석" 역할을 해주는 놈
	 * > 어노테이션을 쓰면 좋은 이유?
	 * 1. 주석 역할을 해줌으로써 코드가 명시적으로 바뀜 (가독성이 좋아짐)
	 * 2. 오버라이딩 할 메소드를 잘못 정의한 경우 (실수한 경우)
	 * 	  오류로써 (빨간 밑줄로) 알려주기 때문에 개발자인 내가 코드를 한번 더 검토헐 수 있게 해준다.
	 * - 여러 이유로 쓰는 것을 권장함!!
	 * 
	 * * VO 코드 작성 팁 (최종본)
	 * 1. 필드는 무조건 private 으로 우선 지정
	 * 2. 기본생성자
	 * 3. 모든필드에대한 매개변수생성자 - [Source] - [Generate Constructor using Field..]
	 * 4. setter / getter 메소드 - [Source] - [Generate Getters and Setters..]
	 * 5. toString 메소드 오버라이딩 - [Source] - [Generate toString()..]
	 * > 작업 시작!!
	 */
	
} // 클래스 영역 끝
