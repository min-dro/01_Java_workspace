package com.method.hw1.run;

import com.method.hw1.controller.NonStaticSample;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		NonStaticSample n = new NonStaticSample();
		
		n.printLottoNumbers();
		n.outputChar(5, 'a');
		System.out.println("3. 랜덤 영문자 출력 : " + n.alphabette());
		System.out.println(n.mySubstring("apple", 2, 5));
		
	} // main 영역 끝

} // 클래스 영역 끝
