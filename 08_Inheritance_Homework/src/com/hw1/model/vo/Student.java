package com.hw1.model.vo;

public class Student extends Person{ // 클래스 영역 시작

	private int grade;
	private String major;
	
	public Student() { }

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}

	public int getGrade() { // 메소드 영역 시작
		return grade;
	} // 메소드 영역 끝

	public void setGrade(int grade) { // 메소드 영역 시작
		this.grade = grade;
	} // 메소드 영역 끝

	public String getMajor() { // 메소드 영역 시작
		return major;
	} // 메소드 영역 끝

	public void setMajor(String major) { // 메소드 영역 시작
		this.major = major;
	} // 메소드 영역 끝

	@Override
	public String information() { // 메소드 영역 시작
		
		return super.information() + ", grade : " + grade + ", major : " + major;
	} // 메소드 영역 끝

	
	
	
	
} // 클래스 영역 끝
