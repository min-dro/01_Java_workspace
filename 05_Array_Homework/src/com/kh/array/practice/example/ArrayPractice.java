package com.kh.array.practice.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice { // 클래스 영역 시작
	
	public void practice6() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(0 <= num && num <= 6) {
			
			String date[] = {"월", "화", "수", "목", "금", "토", "일"}; 
			
			System.out.println(date[num] + "요일");
		
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
	} // 메소드 영역 시작

	public void practice7() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(0 < num) {
	
			int arr[] = new int[num]; 
			for(int i = 0; i < arr.length; i++) {
				System.out.print("배열"+ i + "번째 인덱스에 넣을 값 : ");
				arr[i] = sc.nextInt();
				sc.nextLine();
			}
		
			int total = 0;
			
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
				
				total += arr[i];
			}
			
			System.out.println("총 합 : " + total);
		
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
	} // 메소드 영역 시작

	public void practice8() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			sc.nextLine();
		
			if(3 <= num && ((num % 2) == 1)) {
	
			int arr[] = new int[num]; 
			for(int i = 0; i < arr.length; i++) {
				if((arr.length / 2) < i) {
					arr[i] = arr.length - i;
				} else {
					arr[i] = i+1;
				}
			}
			
			for(int i = 0; i < arr.length; i++) {
				if (i == (arr.length - 1)) {
					System.out.print(arr[i]);
				} else {
					System.out.print(arr[i] + ", ");
				}
			}
			
			break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
	} // 메소드 영역 시작
	
	public void practice9() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		String chicken[] = {"후라이드", "양념", "간장"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();
	
		if(str.equals(chicken[0]) || str.equals(chicken[1]) || str.equals(chicken[2])) {
			System.out.println(str + "치킨 배달 가능");
		} else {
			System.out.println(str + "치킨은 없는 메뉴입니다.");
		}

	} // 메소드 영역 시작
	
	public void practice10() { // 메소드 영역 시작
		
		int arr[] = new int[10]; 
			
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
			
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	} // 메소드 영역 시작
	
	public void practic11() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
	
		char arr[] = new char[14];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		char region[] = new char[14];
		
		System.arraycopy(arr, 0, region, 0, 8);
		for(int i = 0; i < region.length; i++) {
			if(i > 7) {
				region[i] = '*';
			} else {
				region[i] = arr[i];
			}
		}
		
		for(int i = 0; i < region.length; i++) {
			System.out.print(region[i]);
		}
	} // 메소드 영역 시작
	
} // 클래스 영역 끝
