package com.kh.field.example2.model.vo;

public class Book { // 클래스 영역 시작

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() { // 생성자 영역 시작
		
	} // 생성자 영역 끝
	
	public Book(String title, String publisher, String author) { // 생성자 영역 시작
		
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		
	} // 생성자 영역 끝
	
	public Book(String title, String publisher, String author, int price, double discountRate) { // 생성자 영역 시작
		
		this(title, publisher, author);
		
		this.price = price;
		this.discountRate = discountRate;
		
	} // 생성자 영역 끝
	
	public String information() { // 메소드 영역 시작
		
		return "title : " + title + ", publisher : " + publisher + ", author : " + author + ", price : " + price
				+ ", discountRate : " + discountRate;
	} // 메소드 영역 끝
	
	public void setTitle(String title) { // 메소드 영역 시작
		
		this.title = title;
	} // 메소드 영역 끝
	
	public void setPublisher(String publisher) { // 메소드 영역 시작
		
		this.publisher = publisher;
	} // 메소드 영역 끝
	
	public void setAuthor(String author) { // 메소드 영역 시작
		
		this.author = author;
	} // 메소드 영역 끝
	
	public void setPrice(int price) { // 메소드 영역 시작
		
		this.price = price;
	} // 메소드 영역 끝
	
	public void setDiscountRate(double discountRate) { // 메소드 영역 시작
		
		this.discountRate = discountRate;
	} // 메소드 영역 끝
	
	public String getTitle() { // 메소드 영역 시작
		
		return title;
	} // 메소드 영역 끝
	
	public String getPublisher() { // 메소드 영역 시작
		
		return publisher;
	} // 메소드 영역 끝
	
	public String getAuthor() { // 메소드 영역 시작
		
		return author;
	} // 메소드 영역 시작
	
	public int getPrice() { // 메소드 영역 시작
		
		return price;
	} // 메소드 영역 끝
	
	public double getDiscountRate() { // 메소드 영역 시작
		
		return discountRate;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
