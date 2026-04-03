package com.kh.chap01_poly.part02_electronic.model.vo;

// 부모클래스
public class Electronic { // 클래스 영역 시작

	// 필드부
	private String brand;
	private String name;
	private int price;
		
	// 생성자부
	public Electronic() {}

	public Electronic(String brand, String name, int price) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	// 메소드부
	public String getBrand() { // 메소드 영역 시작
		return brand;
	} // 메소드 영역 끝

	public void setBrand(String brand) { // 메소드 영역 시작
		this.brand = brand;
	} // 메소드 영역 끝

	public String getName() { // 메소드 영역 시작
		return name;
	} // 메소드 영역 끝

	public void setName(String name) { // 메소드 영역 시작
		this.name = name;
	} // 메소드 영역 끝

	public int getPrice() { // 메소드 영역 시작
		return price;
	} // 메소드 영역 끝

	public void setPrice(int price) { // 메소드 영역 시작
		this.price = price;
	} // 메소드 영역 끝

	@Override
	public String toString() { // 메소드 영역 시작
		return "Electronic [brand=" + brand + ", name=" + name + ", price=" + price + "]";
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
