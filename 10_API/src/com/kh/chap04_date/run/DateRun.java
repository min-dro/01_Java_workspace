package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

// 날짜와 시간 관련된 클래스들
public class DateRun { // 클래스 영역 시작

	/*
	 * * Date 클래스
	 * > 날짜와 시간에 대한 정보를 담을 수 있는 클래스
	 * > java.util 패키지 안에 정의되어있음 (풀클래스명은 java.util.Date)
	 * > 자바 개발 초창기에 급하게 만들어진 다소 완성도가 떨어져보일 수 있는 클래스임!!
	 * 
	 * * SimpleDateFormat 클래스
	 * > Date 객체의 정보를 내 입맛에 맞는 문자열 형식으로 변환하고 싶을 때 사용
	 * > java.text 패키지 안에 정의 되어있음 (풀클래스명은 java.text.SimpleDateFormat)
	 */
	
	public static void main(String[] args) { // main 영역 시작
		
		// 기본생성자를 이용해서 Date 객체 생성하기
		Date today = new Date();
		
		System.out.println("기본생성자 : " + today);
		// Wed Mar 04 09:10:52 KST 2026
		// > 현재 날짜 및 시간이 담겨있는 것을 볼 수 있음!!
		
		// 내가 원하는 특정 날짜 (2020년 6월 19일) 로 셋팅하고 싶다면?
		
		// 방법1)
		// 매개변수 생성자를 이용하는 방법
		// Date date1 = new Date(2020, 6, 19);
		// System.out.println("매개변수생성자 : " + date1);
		// Mon Jul 19 00:00:00 KST 3920
		// > 내부적으로 내가 전달한 년도 (2020) + 1900 => 3920년
		//	 내부적으로 내가 전달한 월수 (6)	 + 1    => 7월
		// > 내부적으로 내가 전달한 년도 + 1900, 내가 전달한 월수 + 1 로 계산이 되서 날짜가 셋팅됨!!
		// > deprecated : 권장하지 않음!!
		
		Date date1 = new Date(2020 -1900, 6 - 1, 19);
		System.out.println("매개변수생성자 : " + date1);
		// Fri Jun 19 00:00:00 KST 2020
		// > 년도 - 1900, 월 - 1 한 값을 넘겨야 제대로 셋팅됨!!
		
		// 매개변수로 년, 월, 일만 넘기면 시, 분, 초는 0시 0분 0초로 셋팅됨!!
		// > 시간까지 모두 다 셋팅하고 싶다면
		Date date2 = new Date(2020 - 1900, 6 - 1, 19, 13, 19, 27);
		System.out.println("매개변수생성자 - 시간설정 : " + date2);
		
		// 방법2)
		// 기본생성자로 객체 생성 후 setter 메소드를 이영해서 셋팅하는 방법
		Date date3 = new Date(); // 현재 날짜 및 시간
		date3.setYear(2020 - 1900);
		date3.setMonth(6 - 1);
		date3.setDate(14);
		date3.setHours(13);
		date3.setMinutes(19);
		date3.setSeconds(27);
		System.out.println("setter메소드 : " + date3);
		// > 마찬가지로 년 + 1900, 월 + 1 이 되므로 주의할 것!!
		
		System.out.println("----------------------");
		
		// 내 입맛대로 날짜 형식을 바꿔서 출력해보고 싶음!!
		// > Date 기본 날짜 형식이 너무 마음에 안듦!!
		
		// SimpleDateFormat 객체 사용하기
		// 1. 내가 출력하고자 하는 형식을 문자열로 지정하면서 SimpleDateFormat 객체를 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss (E)");
		
		/*
		 * * SimpleDateFormat 형식
		 * 년도 : yyyy
		 * 월 : MM
		 * 일 : dd
		 * 시 : hh
		 * 분 : mm
		 * 초 : ss
		 * 요일 : E
		 * 오전/오후/ : a
		 */
		
		// 2. SimpleDateFormat 객체에서 제공하는 format 메소드 호출
		// [ 표현법 ]
		// sdf.format(Date객체) : String
		String formatDate = sdf.format(date3);
		System.out.println(formatDate);
		
	} // main 영역 끝

} // 클래스 영역 끝
