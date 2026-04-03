package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

// 직렬화 선언 : 한줄로 길게 늘어뜨리겠다.
public class Phone implements Serializable{ // 클래스 영역 시작

	private String name;
	private int price;
	
	public Phone() {}

	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

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
		return "Phone [name=" + name + ", price=" + price + "]";
	} // 메소드 영역 끝
	
	
} // 클래스 영역 끝
