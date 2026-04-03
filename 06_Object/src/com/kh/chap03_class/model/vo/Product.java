package com.kh.chap03_class.model.vo;

// 클래스 실습예제 2
public class Product { // 클래스 영역 시작

	// 필드부 - pName, price, brand
	private String pName; // 상품명
	// > 필드명의 앞글자가 외자인 경우 setter, getter 메소드명 작성 시
	// 해당 외자의 소문자를 살려서 그냥 작성해야 한다!! (Nameing Convention)
	// setPName, getPName (X) --> setpName, getpName (O)
	
	private int price; // 가격
	private String brand = "APPLE"; // 브랜드명
	// > 필드를 "선언" 만 할 경우에는 항상 해당 타입에 대한 "기본값" 이 자동으로 들어감
	//	 (Heap 영역은 비어있을 수 없기 때문에 JYM 이 자동으로 채워주기 때문)
	// > 하지만 내가 원하는 기본값이 따로 있다면
	//	 그 값으로 해당 필드의 선언 및 "초기화" 구문까지 한번에 적어줄 수 있다!!
	
	// 생성자부
	
	// 메소드부
	// setter - 3개
	public void setpName(String pName) { // 메소드 영역 시작

		this.pName = pName;
	} // 메소드 영역 끝

	public void setPrice(int price) { // 메소드 영역 시작
		
		this.price = price;
	} // 메소드 영역 끝
	
	public void setBrand(String brand) { // 메소드 영역 시작
	
		this.brand = brand;
	} // 메소드 영역 끝
	
	// getter - 3개
	public String getPName() { // 메소드 영역 시작

		return pName;
	} // 메소드 영역 끝
	
	public int getPrice() { // 메소드 영역 시작
	
		return price;
	} // 메소드 영역 끝
	
	public String getBrand() { // 메소드 영역 시작
	
		return brand;
	} // 메소드 영역 끝
	
	// 여기까지 캡슐화 관련 메소드들

	// information 메소드
	public String information() { // 메소드 영역 시작
	
		return "pName = " + pName + ", price = " + price + ", brand = " + brand;
	} // 메소드 영역 끝
} // 클래스 영역 끝
