package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest { // 클래스 영역 시작

	public static void main(String[] args) {
		
		Product a = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product b = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product c = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		System.out.println(a.information());
		System.out.println(b.information());
		System.out.println(c.information());
		System.out.println("===========================================================");
		a.setPrice(1200000);
		a.setTax(0.05);
		
		b.setPrice(1200000);
		b.setTax(0.05);
		
		c.setPrice(1200000);
		c.setTax(0.05);
		
		System.out.println(a.information());
		System.out.println(b.information());
		System.out.println(c.information());
		
		System.out.println("===========================================================");
		System.out.println("상품명 = " + a.getProductName());
		System.out.println("부가세 포함 가격 = " + (int)(a.getPrice() + (a.getPrice() * a.getTax())) + "원");
		System.out.println("상품명 = " + b.getProductName());
		System.out.println("부가세 포함 가격 = " + (int)(b.getPrice() + (b.getPrice() * b.getTax())) + "원");
		System.out.println("상품명 = " + c.getProductName());
		System.out.println("부가세 포함 가격 = " + (int)(c.getPrice() + (c.getPrice() * c.getTax())) + "원");
	}

} // 클래스 영역 끝
