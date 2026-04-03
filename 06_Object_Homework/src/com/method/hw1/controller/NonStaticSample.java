package com.method.hw1.controller;

import java.util.Arrays;

public class NonStaticSample { // 클래스 영역 시작

	public void printLottoNumbers() { // 메소드 영역 시작
		int num[] = new int[6];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 45 + 1);
			for(int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					i--;
				}
			}
		}
		
		Arrays.sort(num);
		System.out.print("1. 랜덤 값 : ");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	} // 메소드 영역 끝
	
	public void outputChar(int num, char c) { // 메소드 영역 시작
		
		System.out.print("2. " + c + "문자 " + num + "개 출력 : ");
		for(int i = 0; i < num; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	} // 메소드 영역 끝
	
	public char alphabette() { // 메소드 영역 시작
		char c = '0';
		do {
			c = (char)((int)(Math.random()* 57 + 65));
		} while(90 < c && c < 97);
		return c;
	} // 메소드 영역 끝
	
	public String mySubstring(String str, int index1, int index2) { // 메소드 영역 시작
		if(str.equals(null)) {
			return null;
		} else {
			char arr[] = new char[str.length()];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = str.charAt(i);
			}
			String result = "";
			if(index1 < index2) {
				for(int i = index1; i < index2; i++) {
					result += arr[i];
				}
			} else {
				for(int i = index2; i < index1; i++) {
					result += arr[i];
				}
			}
			return str + "의 " + index1 + "번 " + index2 + "번 인덱스 사이의 값 출력 : " + result;
		}
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
