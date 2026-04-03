package com.kh.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SetDate { // 클래스 영역 시작

	public SetDate() {}
	
	public String todayPrint() { // 메소드 영역 시작
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 h시 mm분 ss초");
		return sdf.format(today);
	} // 메소드 영역 끝
	
	public String setDay() { // 메소드 영역 시작
		Date date = new Date();
		date.setYear(2011 - 1900);
		date.setMonth(3 - 1);
		date.setDate(21);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		return sdf.format(date);
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
