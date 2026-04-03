package com.kh.hw4.controller;

import java.util.Scanner;

public class NumberOk { // 클래스 영역 시작

	private int ran;
	
	public NumberOk() {}

	public void numGame() { // 메소드 영역 시작
		Scanner sc = new Scanner(System.in);
		ran = (int)(Math.random() * 100 + 1);
		int count = 1;
		while(true) {
			System.out.print("1부터 100 사이의 정수를 하나 입력하세요 : ");
			try {
				int num = sc.nextInt();
				sc.nextLine();
				if(num > ran) {
					System.out.println(num + "보다 작습니다." + count + "번째 실패!!");
					count++;
				} else if (num < ran) {
					System.out.println(num + "보다 큽니다." + count + "번째 실패!!");
					count++;
				} else {
					System.out.println(count + "번만에 맞췄습니다!");
					return;
				}
			} catch(RuntimeException e) {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
				sc.nextLine();
			}
		}
		
	} // 메소드 영역 끝
	
} // 메소드 영역 끝
