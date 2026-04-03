package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop { // 클래스 영역 시작
	
	private String brand;	// 브랜드명
	private String pCode;	// 상품코드
	private String pName;	// 상품명
	private int price;		// 상품가격
	private boolean allInOne; // 일체여부
	
	public Desktop() { }
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	public void setBrand(String brand) { // 메소드 영역 시작
		
		this.brand = brand;
	} // 메소드 영역 끝
	
	public void setpCode(String pCode) { // 메소드 영역 시작
		
		this.pCode = pCode;
	} // 메소드 영역 끝
	
	public void setpName(String pName) { // 메소드 영역 시작
		
		this.pName = pName;
	} // 메소드 영역 시작
	
	public void setPrice(int price) { // 메소드 영역 시작
		
		this.price = price;
	} // 메소드 영역 시작
	
	public void setAllInOne(boolean allInOne) { // 메소드 영역 시작
		
		this.allInOne = allInOne;
	} // 메소드 영역 끝
	
	public String getBrand() { // 메소드 영역 시작
		
		return brand;
	} // 메소드 영역 끝
	
	public String getpCode() { // 메소드 영역 시작
		
		return pCode;
	} // 메소드 영역 끝
	
	public String getpName() { // 메소드 영역 시작
		
		return pName;
	} // 메소드 영역 끝
	
	public int getPrice() { // 메소드 영역 시작
		
		return price;
	} // 메소드 영역 끝
	
	// boolean 타입의 필드에 대한 getter 메소드명은
	// getXxx 가 아닌 isXxx 로 짓는다!!
	// > 주로 boolean 타입을 반환하는 메소드명은 isXxx 또는 hasXxx
	public boolean IsAllInOne() { // 메소드 영역 시작
		
		return allInOne;
	} // 메소드 영역 끝
	
	public String information() { // 메소드 영역 시작
		
		return "brand : " + brand + ", pCode : " + "pName : " + pName 
				+ ", price : " + price + ", allInOne : " + allInOne;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
