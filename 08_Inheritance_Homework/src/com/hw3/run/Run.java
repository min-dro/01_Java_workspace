package com.hw3.run;

import com.hw3.model.vo.Product;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작

		Product p[] = new Product[3];
		
		p[0] = new Product("Samsung", "Galaxy S9", "Blue", 960000);
		p[1] = new Product("LG", "G6", "Red", 820000);
		
		System.out.println("생성한 첫 번째 객체의 값 : " + p[0].toString());
		System.out.println("생성한 두 번째 객체의 값 : " + p[1].toString());
		System.out.println("=======================================");
		System.out.println("생성한 두 객체의 값이 같은가 : " + p[0].equals(p[1]));
		System.out.println("=======================================");
		System.out.println("첫 번째 객체의 해쉬코드값 : " + p[0].hashCode());
		System.out.println("두 번째 객체의 해쉬코드값 : " + p[1].hashCode());
		System.out.println("=======================================");
		p[2] = p[0];
		System.out.println("생성한 세 번째 객체의 값 : " + p[2].toString());
		System.out.println("=======================================");
		System.out.println("첫 번째 객체와 세 번째 객체의 필드값들이 일치하는가 : " + (p[0].hashCode() == p[2].hashCode()));
		System.out.println("첫 번째 객체와 세 번째 객체의 해쉬코드값이 일치하는가 : " + (p[0].equals(p[2])));
		
		
	} // main 영역 끝

} // 클래스 영역 끝
