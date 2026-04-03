package com.method.hw3.controller;

public class StaticSample { // 클래스 영역 시작

	private static String value;
	
	public static void setValue(String value) { // 메소드 시작
		StaticSample.value = value;
	} // 메소드 영역 끝
	
	public static String getValue() { // 메소드 영역 시작
		return value;
	} // 메소드 영역 끝

	public static void toUpper() { // 메소드 영역 시작
		
		char arr[] = new char[getValue().length()];
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			arr[i] = getValue().charAt(i);
		}
		
		for(int i = 0; i < arr.length; i++) {
			if('a' <= arr[i] && arr[i] <= 'z') {
				arr[i] -= 32;
			}
			result += arr[i];
		}
		
		setValue(result);
		
	} // 메소드 영역 끝
	
	public static void setChar(int index, char c) { // 메소드 영역 시작
		char arr[] = new char[getValue().length()];
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(i == index) {
				arr[i] = c;
			} else {
				arr[i] = getValue().charAt(i);
			}
			result += arr[i];
		}
		
		setValue(result);
	} // 메소드 영역 끝
	
	public static int valueLength() { // 메소드 영역 시작
		
		return getValue().length();
	} // 메소드 영역 끝
	
	public static String valueConcat(String str) { // 메소드 영역 시작

		return getValue() + str;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
