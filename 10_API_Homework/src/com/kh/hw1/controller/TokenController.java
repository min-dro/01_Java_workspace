package com.kh.hw1.controller;

public class TokenController { // 클래스 영역 시작

	public String afterToken(String str) { // 메소드 영역 시작
		str = str.replace(" ", "");
		return str;
	} // 메소드 영역 끝
	
	public String firstCap(String input) { // 메소드 영역 시작
		char[] arr = input.toCharArray();
		arr[0] = input.toUpperCase().charAt(0);
		String result = String.valueOf(arr);
		return result;
	} // 메소드 영역 끝
	
	public int findChar(String input, char one) { // 메소드 영역 시작
		input = input.toLowerCase();
		int num = 0;
		char[] arr = input.toCharArray();
		for(char c : arr) {
			if(c == one) {
				num++;
			}
		}
		return num;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
