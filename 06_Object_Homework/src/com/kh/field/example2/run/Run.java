package com.kh.field.example2.run;

import com.kh.field.example2.model.vo.Book;
import com.kh.field.example2.model.vo.Circle;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		Circle c = new Circle();
		c.incrementRadius();
		c.getAreaOfCircle();
		c.getSizeOfCircle();
		
		Book b = new Book("제목", "출판사", "저자", 39800, 4.8);
		
		System.out.println(b.information());
	} // main 영역 끝

} // 클래스 영역 끝
