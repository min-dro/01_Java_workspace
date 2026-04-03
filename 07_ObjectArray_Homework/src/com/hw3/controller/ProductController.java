package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController { // 클래스 영역 시작

	private Product pro[] = new Product[10];
	
	public static int count = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() { // 메소드 영역 시작
		
		do {
			
			System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 저품 전체 조회");
			System.out.println("9. 프로그램 종료");
			System.out.print("번호 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
				case 1:
					productInput();
					break;
				case 2:
					productPrint();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
			
		} while(true);
		
	} // 메소드 영역 끝
	
	public void productInput() { // 메소드 영역 시작
		
		System.out.print("제품명 입력 : ");
		String pName = sc.nextLine();
		
		System.out.print("제품 가격 입력 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		sc.nextLine();
		
		pro[count] = new Product(count, pName, price, tax);
		System.out.println("입력 완료!");
		count++;
	} // 메소드 영역 끝
	
	public void productPrint() { // 메소드 영역 시작
		for(int i = 0; i < count; i++) {
			System.out.println(pro[i].information());
		}
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
