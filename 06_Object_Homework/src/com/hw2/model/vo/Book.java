package com.hw2.model.vo;

public class Book { // 클래스 영역 시작

	private String title;	// 도서명
	private int price; 		// 가격
	private double discountRate; // 할인율
	private String author;		// 저자명
	
	public Book() {}
	
	public Book(String title, int price, double discountRate, String author) {
	
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
		
	}
	
	public String information() { // 메소드 영역 시작
		return title + " " + price + " " + discountRate + " " + author;
	} // 메소드 영역 끝
	
	public void setTitle(String title) { // 메소드 영역 시작
		
		this.title = title;
	} // 메소드 영역 끝
	
	public void setPrice(int price) { // 메소드 영역 시작
		
		this.price = price;
	} // 메소드 영역 끝
	
	public void setDiscountRate(double discountRate) { // 메소드 영역 시작
		
		this.discountRate = discountRate;
	} // 메소드 영역 끝
	
	public void setAuthor(String author) { // 메소드 영역 시작
		
		this.author = author;
	} // 메소드 영역 끝
	
	public String getTitle() { // 메소드 영역 시작
		
		return title;
	} // 메소드 영역 끝
	
	public int getPrice() { // 메소드 영역 시작
		
		return price;
	} // 메소드 영역 끝
	
	public double getDiscountRate() { // 메소드 영역 시작
		
		return discountRate; 
	} // 메소드 영역 시작
	
	public String getAuthor() { // 메소드 영역 시작
		
		return author;
	}
} //  클래스 영역 끝
