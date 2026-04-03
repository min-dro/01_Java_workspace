package com.kh.chap01_beforeVSafter.before.model.vo;

public class TV { // 클래스 영역 시작

	private String brand;	// 브랜드명
	private String pCode;	// 상품코드
	private String pName;	// 상품명
	private int price;		// 상품가격
	private int inch;		// 인치
	
	public TV() { }
	
	public TV(String brand, String pCode, String pName, int price, int inch) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.inch = inch;
	}
	
	public void setBrand(String brand) { // 메소드 영역 시작
		
		this.brand = brand;
	} // 메소드 영역 끝
	
	public void setpCode(String pCode) { // 메소드 영역 시작
		
		this.pCode = pCode;
	} // 메소드 영역 끝
	
	public void setpName(String pName) { // 메소드 영역 시작
		
		this.pName = pName;
	} // 메소드 영역 끝
	
	public void setPrice(int price) { // 메소드 영역 시작
		
		this.price = price;
	} // 메소드 영역 끝
	
	public void setInch(int inch) { // 메소드 영역 시작
		
		this.inch = inch;
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
	
	public int getInch() { // 메소드 영역 시작
		
		return inch;
	} // 메소드 영역 시작
	
	public String information() { // 메소드 영역 시작
		
		return "brand : " + brand + ", pCode : " + pCode + ", pName : " 
				+ pName + ", price : " + price + ", inch : " + inch;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
