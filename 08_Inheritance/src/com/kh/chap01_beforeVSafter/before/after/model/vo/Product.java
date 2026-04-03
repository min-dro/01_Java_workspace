package com.kh.chap01_beforeVSafter.before.after.model.vo;

// Desktop, Tv, SmartPhone 세개의 클래스 모두 공통적으로 기술했었던 요소들만 추출해서
// 단 한번 정의해둔 클래스 == 부모클래스 (공통 코드를 가지고 있다가 코드를 물려줘야 하는 입장)
public class Product /* extends Object */ { // 클래스 영역 시작

	// 필드부
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	/*
	protected String brand;
	protected String pCode;
	protected String pName;
	protected int price;
	*/
	// 생성자부
	public Product() { }
	
	public Product(String brand, String pCode, String pName, int price) {
		
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	// 메소드부
	public String getBrand() { // 메소드 영역 시작
		return brand;
	} // 메소드 영역 끝
	
	public void setBrand(String brand) { // 메소드 영역 시작
		this.brand = brand;
	} // 메소드 영역 끝
	
	public String getpCode() { // 메소드 영역 시작
		return pCode;
	} // 메소드 영역 끝
	
	public void setpCode(String pCode) { // 메소드 영역 시작
		this.pCode = pCode;
	} // 메소드 영역 끝
	
	public String getpName() { // 메소드 영역 시작
		return pName;
	} // 메소드 영역 끝
	
	public void setpName(String pName) { // 메소드 영역 시작
		this.pName = pName;
	} // 메소드 영역 끝
	
	public int getPrice() { // 메소드 영역 시작
		return price;
	} // 메소드 영역 끝
	
	public void setPrice(int price) { // 메소드 영역 시작
		this.price = price;
	} // 메소드 영역 끝

	public String information() { // 메소드 영역 시작
		
		return "brand : " + brand + ", pCode : " + pCode + ", pName : " + pName + ", price : " + price; 
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
