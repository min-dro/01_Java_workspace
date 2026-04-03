package com.kh.chap01_beforeVSafter.before.after.model.vo;

//						------>
// > 클래스 다이어그램에서는 자식클래스가 부모클래스를 찌르는 방향의 화살표로 표현한다.
public class SmartPhone extends Product { // 클래스 영역 시작

	// 필드부
	private String mobileAgency;

	// 생성자부
	public SmartPhone() { }
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		
		super(brand, pCode, pName, price);
		
		this.mobileAgency = mobileAgency;
	}

	// 메소드부
	public String getMobileAgency() { // 메소드 영역 시작
		return mobileAgency;
	} // 메소드 영역 끝

	public void setMobileAgency(String mobileAgency) { // 메소드 영역 시작
		this.mobileAgency = mobileAgency;
	} // 메소드 영역 끝
	
	// information 메소드 내용 수정
	// > 부모클래스로부터 이미 물려받은 메소드의 코드 내용이 마음에 들지 않아
	//	 자식클래스에서 그 물려받은 메소드를 다시 코드만 재정의한 상황
	//	 코드 내용물만 갈아 엎은 상황 == "오버라이딩 (Overriding)"
	public String information() { // 메소드 영역 시작
		
		return super.information() + ", mobileAgency : " + mobileAgency;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
