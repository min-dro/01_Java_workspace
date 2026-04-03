package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice { // 클래스 영역 시작
	
	public void practice1() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 1) {
			
			for(int i = 1; i <= num; i++) {
				
				System.out.print(i + " ");
				
			}
			
		} else {
			
			System.out.println("잘못 입력하셨습니다.");
		
		}
		
	} // 메소드 영역 끝

	public void practice3() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 1) {
			
			for(int i = num; i >= 1; i--) {
				
				System.out.print(i + " ");
				
			}
			
		} else {
			
			System.out.println("잘못 입력하셨습니다.");
		
		}
		
	} // 메소드 영역 끝
	
	public void practice5() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int total = 0;
		if(num >= 1) {
			
			for(int i = 1; i <= num; i++) {
				
				System.out.print(i);
				
				if(i < num) {
					
					System.out.print(" + ");
				}
				
				total += i;
			}
			
			System.out.print(" = " + total);
		} else {
			
			System.out.println("잘못 입력하셨습니다.");
		}
		
	} // 메소드 영역 끝
	
	public void practice6() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(num1 < 1 || num2 < 1) {
			
			System.out.println("1이상의 숫자만을 입력해주세요.");
			
		} else {
			if(num1 < num2) {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else {
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}
		}
		
	} // 메소드 영역 끝
	
	public void practice8() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num < 1) {
			
			System.out.println("1이상의 숫자만을 입력해주세요.");
			
		} else {
			System.out.println("===== "+ num + "단 =====");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", num, i ,(num * i));
			}
		}
		
	} // 메소드 영역 끝
	
	public void practice9() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num < 2 || num > 9) {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		} else {
			for(int i = num; i <= 9; i++) {
				System.out.println("===== "+ i + "단 =====");
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
			}
		}
		
	} // 메소드 영역 끝
	
	public void practice11() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int startnum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("공차 : ");
		int tolerance = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0 ; i < 10; i++) {
			
			System.out.print(startnum + " ");
			startnum += tolerance;
			 
		}
		
	} // 메소드 영역 끝

} // 클래스 영역 끝
