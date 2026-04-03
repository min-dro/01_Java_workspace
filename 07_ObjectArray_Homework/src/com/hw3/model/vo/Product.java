package com.hw3.model.vo;

public class Product { // 클래스 영역 시작

	private int pId;
	private String pName;
	private int price;
	private double tax;
	
	public Product() { }

	public Product(int pId, String pName, int price, double tax) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
	}

	public void setpId(int pId) { // 메소드 영역 시작
		this.pId = pId;
	} // 메소드 영역 끝

	public void setpName(String pName) { // 메소드 영역 시작
		this.pName = pName;
	} // 메소드 영역 끝

	public void setPrice(int price) { // 메소드 영역 시작
		this.price = price;
	} // 메소드 영역 끝

	public void setTax(double tax) { // 메소드 영역 시작
		this.tax = tax;
	} // 메소드 영역 끝

	public int getpId() { // 메소드 영역 시작
		return pId;
	} // 메소드 영역 끝

	public String getpName() { // 메소드 영역 시작
		return pName;
	} // 메소드 영역 끝

	public int getPrice() { // 메소드 영역 시작
		return price;
	} // 메소드 영역 끝

	public double getTax() { // 메소드 영역 시작
		return tax;
	} // 메소드 영역 끝

	public String information() { // 메소드 영역 시작
		return "pId : " + pId + ", pName : " + pName + ", price : " + price + ", tax : " + tax;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
