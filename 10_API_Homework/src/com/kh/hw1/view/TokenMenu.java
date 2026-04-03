package com.kh.hw1.view;

import java.util.Scanner;

import com.kh.hw1.controller.TokenController;

public class TokenMenu { // 클래스 영역 시작

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() { // 메소드 영역 시작
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
				case 1:
					tokenMenu();
					break;
				case 2:
					inputMenu();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력했습니다. 다시 입력하세요.");
			}
		}
	} // 메소드 영역 끝
	
	public void tokenMenu() { // 메소드 영역 시작
		String str = "J a v a P r o g r a m";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		System.out.println("토큰 처리 후 글자 : " + tc.afterToken(str));
		System.out.println("토큰 처리 후 개수 : " + tc.afterToken(str).length());
		System.out.println("모두 대문자로 변환 : " + tc.afterToken(str).toUpperCase());
	} // 메소드 영역 끝
	
	public void inputMenu() { // 메소드 영역 시작
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println("첫 글자 대문자 : " + tc.firstCap(str));
		
		System.out.print("찾을 문자 입력 : ");
		char ch = sc.next().charAt(0);
		sc.nextLine();
		System.out.println(ch + " 문자가 들어간 개수 : " + tc.findChar(str, ch));
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
