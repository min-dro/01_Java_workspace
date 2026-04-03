package com.kh.chap01_oneVSmany.model.vo;

public class Book { // 클래스 영역 시작

	// 필드부 - 도서명, 저자명, 가격, 출판사명
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	// 생성자부
	// 기본생성자 (매개변수가 없음)
	public Book() { }
	
	// 모든 필드에 대해 매개변수로 가지는 생성자 (매개변수 4개짜리)
	public Book(String title, String author, int price, String publisher) {
		
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	// 메소드부
	// setter 메소드들
	public void setTitle(String title) { // 메소드 영역 시작
		
		this.title = title;
	} // 메소드 영역 끝
	
	public void setAuthor(String author) { // 메소드 영역 시작
		
		this.author = author;
	} // 메소드 영역 끝
	
	public void setPrice(int price) { // 메소드 영역 시작
		
		this.price = price;
	} // 메소드 영역 끝
	
	public void setPublisher(String publisher) { // 메소드 영역 시작
		
		this.publisher = publisher;
	} // 메소드 영역 끝
	
	// getter 메소드들
	public String getTitle() { // 메소드 영역 시작
		
		return title;
	} // 메소드 영역 끝
	
	public String getAuthor() { // 메소드 영역 시작
		
		return author;
	} // 메소드 영역 시작
	
	public int getPrice() { // 메소드 영역 시작
		
		return price;
	} // 메소드 영역 시작
	
	public String getPublisher() { // 메소드 영역 시작
		
		return publisher;
	} // 메소드 영역 시작
	
	// 추가적민 메소드
	// information 메소드
	public String information() { // 메소드 영역 시작
		
		return "title : " + title + ", author : " + author
				+ ", price : " + price + ", publisher : " + publisher;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
