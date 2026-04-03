package com.kh.chap03_class.model.vo;

// 클래스에서 사용 가능한 접근제한자 종류 : public, default (기술하지 않을 때)
// > default 로 설정하면 import 할 때 is not visible 오류 발생!!
//	 (default 는 기본적으로 같은 패키지 내의 클래스만 접근해서 가져다 쓸 수 있다)

// 카페에서 커피 (음료) 의 정보를 담을 수 있는 VO 클래스
public class Coffee { // 클래스 영역 시작
	
	// 필드부
	// > 추상화 과정 : 음료명(String), 가격(int), 핫/아이스(char), 사이즈(char)
	private String coffeeName;
	private int price;
	private char option;
	private char size;
	
	// 생성자부
	
	// 메소드 부
	// setter 4개
	public void setCoffeeName(String coffeeName) { // 메소드 영역 시작
		
		this.coffeeName = coffeeName;
	} // 메소드 영역 끝
	
	public void setPrice(int price) { // 메소드 영역 시작
		
		this.price = price;
	} // 메소드 영역 끝
	
	public void setOption(char option) { // 메소드 영역 시작
		
		this.option = option;
	} // 메소드 영역 끝
	
	public void setSize(char size) { // 메소드 영역 시작
		
		this.size = size;
	} // 메소드 영역 끝
	
	// getter 4개
	public String getCoffeeName() { // 메소드 영역 시작
		
		return coffeeName;
	} // 메소드 영역 끝
	
	public int getPrice() { // 메소드 영역 시작
		
		return price;
	} // 메소드 영역 끝
	
	public char getOption() { // 메소드 영역 시작
		
		return option;
	} // 메소드 영역 끝
	
	public char getSize() { // 메소드 영역 시작
		
		return size;
	} // 메소드 영역 끝
	
	// 여기까지가 캡슐화 관련 메소드
	
	// information
	public String information() { // 메소드 영역 시작
		
		return "coffeeName : " + coffeeName + ", price : " + price + ", option : " + option + ", size : " + size;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
