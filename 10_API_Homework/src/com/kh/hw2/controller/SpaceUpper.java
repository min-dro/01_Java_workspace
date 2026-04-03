package com.kh.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper { // 클래스 영역 시작

	public SpaceUpper() {}
	
	public void spaceToUpper() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		System.out.print("영어를 입력하시오(띄어쓰기 포함): ");
		String str = sc.nextLine();
		
		StringTokenizer stn = new StringTokenizer(str, " ");
		
		while(stn.hasMoreTokens()) {
			String value = stn.nextToken();
			System.out.print(value.toUpperCase().charAt(0) + value.substring(1) + " ");
		}
		
	} // 메소드 영역 끝
	
	
} // 클래스 영역 끝
