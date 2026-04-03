package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		Book a = new Book();
		Book b = new Book("자바의정석", 20000, 0.2, "윤상섭");
		System.out.println(a.information());
		System.out.println(b.information());
		System.out.println("================================");
		
		a.setTitle("DoIt! 자바프로그래밍입문");
		a.setPrice(25000);
		a.setDiscountRate(0.1);
		a.setAuthor("박은종");
		
		System.out.println("수정된 결과 확인");
		System.out.println(a.information());
		System.out.println("================================");
		System.out.println("도서명 = " + a.getTitle());
		System.out.println("할인된 가격 = " + (a.getPrice() - (a.getPrice() * a.getDiscountRate())));
		System.out.println("도서명 = " + b.getTitle());
		System.out.println("할인된 가격 = " + (b.getPrice() - (b.getPrice() * b.getDiscountRate())));
		
		
	} // main 영역 시작

} // 클래스 영역 끝
