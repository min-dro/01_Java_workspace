package com.kh.chap02_objectArray.model.vo;

public class Phone { // 클래스 영역 시작

	// 필드부 - 이름, 시리즈, 프랜드명, 가격
	private String name;
	private String series;
	private String brand;
	private int price;
	
	// 생성자부
	// 기본생성자
	public Phone() { }
	
	// 모든 필드에 대해 매개변수로 갖는 생성자
	public Phone(String name, String series, String brand, int price) {
		
		this.name = name;
		this.series = series;
		this.brand = brand;
		this.price = price;
	}
	
	// 메소드부
	// setter
	public void setName(String name) { // 메소두 영역 시작
		
		this.name = name;
	} // 메소드 영역 끝
	
	public void setSeries(String series) { // 메소드 영역 시작
		
		this.series = series;
	} // 메소드 영역 끝
	
	public void setBrand(String brand) { // 메소드 영역 시작
		
		this.brand = brand;
	} // 메소드 영역 끝
	
	public void setPrice(int price) { // 메소드 영역 시작
		
		this.price = price;
	} // 메소드 영역 끝
	
	// getter
	public String getName() { // 메소드 영역 시작
		
		return name;
	} // 메소드 영역 끝
	
	public String getSeries() { // 메소드 영역 시작
		
		return series;
	} // 메소드 영역 끝
	
	public String getBrand() { // 메소드 영역 시작
		
		return brand;
	} // 메소드 영역 끝
	
	public int getPrice() { // 메소드 영역 시작
		
		return price;
	} // 메소드 영역 끝
	
	// 추가적인 메소드
	// information()
	public String information() { // 메소드 영역 시작
		
		return "name : " + name + ", series : " + series + ", brand : " + brand + ", price : " + price;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
