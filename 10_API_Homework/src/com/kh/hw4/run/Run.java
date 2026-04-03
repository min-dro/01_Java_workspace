package com.kh.hw4.run;

import java.util.Scanner;

import com.kh.hw4.controller.NumberOk;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
	
		NumberOk no = new NumberOk();
		
		Scanner sc = new Scanner(System.in);
		no.numGame();
		while(true) {
			System.out.print("계속 하시겠습니까?(y/n) : ");
			char yn = sc.next().charAt(0);
			sc.nextLine();
		
			if(yn == 'y') {
				System.out.println();
				System.out.println("새로운 게임을 시작합니다!!");
				no.numGame();
			} else if(yn == 'n') {
				System.out.println("게임을 종료합니다.");
				return;
			} else {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}

	} // main 영역 끝

} // 클래스 영역 끝
