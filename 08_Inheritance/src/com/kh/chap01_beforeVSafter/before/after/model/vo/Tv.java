package com.kh.chap01_beforeVSafter.before.after.model.vo;

// [ 표현법 ]
// public class 클래스명 extends 부모클래스명

// extends : 확장하겠다.
// > 부모클래스의 코드를 갖고 오고 + 내가 코드를 추가해서 쓸 것이기 때문
//	 (코드를 갖고와서 내가 더 덧붙여서 "확장" 시켜서 쓰겠다)
public class Tv extends Product { // 클래스 영역 시작
	
	// 필드부
	private int inch;

	// 생성자부
	public Tv() { }
	
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		
		super(brand, pCode, pName, price);
		
		this.inch = inch;
	}
	
	// 메소드부
	public int getInch() { // 메소드 영역 시작
		return inch;
	} // 메소드 영역 끝

	public void setInch(int inch) { // 메소드 영역 시작
		this.inch = inch;
	} // 메소드 영역 끝
	
	// information 메소드의 내용만 재정의해보기
	public String information() { // 메소드 영역 시작
		/*
		return "brand : " + super.getBrand() + ", pCode : " + super.getpCode()
				+ ", pName : " + super.getpName() + ", price : " + super.getPrice()
				+ ", inch : " + inch;
		*/
		
		return super.information() + ", inch : " + inch;
		// > 원래의 information
	} // 메소드 영역 끝
} // 클래스 영역 시작
