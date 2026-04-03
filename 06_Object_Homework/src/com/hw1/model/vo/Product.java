package com.hw1.model.vo;

public class Product { // 클래스 영역 시작

	private String productId; // 상품아이디
	private String productName; // 상품명
	private String productArea; // 생산지
	private int price;			// 가격
	private double tax;			// 부가세비율
	
	public Product() {}
	
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	public void setProductId(String productId) { // 메소드 영역 시작
		
		this.productId = productId;
	} // 메소드 영역 끝
	
	public void setProductName(String productName) { // 메소드 영역 시작
		
		this.productName = productName;
	} // 메소드 영역 끝
	
	public void setProductArea(String productArea) { // 메소드 영역 시작
		
		this.productArea = productArea;
	} // 메소드 영역 끝
	
	public void setPrice(int price) { // 메소드 영역 시작
		
		this.price = price;
	} // 메소드 영역 끝
	
	public void setTax(double tax) { // 메소드 영역 시작
		
		this.tax = tax;
	} // 메소드 영역 끝
	
	public String getProducted() { // 메소드 영역 시작
		
		return productId;
	} // 메소드 영역 끝
	
	public String getProductName() { // 메소드 영역 시작
		
		return productName;
	} // 메소드 영역 끝
	
	public String getProductArea() { // 메소드 영역 시작
		
		return productArea;
	} // 메소드 영역 끝
	
	public int getPrice() { // 메소드 영역 시작
		
		return price;
	} // 메소드 영역 끝
	
	public double getTax() { // 메소드 영역 시작
		
		return tax;
	} // 메소드 영역 끝
	
	public String information() { // 메소드 영역 시작
	
		return productId + " " + productName + " " + productArea
				+ " " + price + " " + tax;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
