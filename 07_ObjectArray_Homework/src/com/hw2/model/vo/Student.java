package com.hw2.model.vo;

public class Student { // 클래스 영역 시작

	private int grade;
	private int classroom;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {}

	public Student(int grade, int classroom, String name, int kor, int eng, int math) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} // 메소드 영역 끝

	public void setGrade(int grade) { // 메소드 영역 시작
		this.grade = grade;
	} // 메소드 영역 끝

	public void setClassroom(int classroom) { // 메소드 영역 시작
		this.classroom = classroom;
	} // 메소드 영역 끝

	public void setName(String name) { // 메소드 영역 시작
		this.name = name;
	} // 메소드 영역 끝

	public void setKor(int kor) { // 메소드 영역 시작
		this.kor = kor;
	} // 메소드 영역 끝

	public void setEng(int eng) { // 메소드 영역 시작
		this.eng = eng;
	} // 메소드 영역 끝

	public void setMath(int math) { // 메소드 영역 시작
		this.math = math;
	} // 메소드 영역 끝

	public int getGrade() { // 메소드 영역 시작
		return grade;
	} // 메소드 영역 끝

	public int getClassroom() { // 메소드 영역 시작
		return classroom;
	} // 메소드 영역 끝

	public String getName() { // 메소드 영역 시작
		return name;
	} // 메소드 영역 끝

	public int getKor() { // 메소드 영역 시작
		return kor;
	} // 메소드 영역 끝

	public int getEng() { // 메소드 영역 시작
		return eng;
	} // 메소드 영역 끝

	public int getMath() { // 메소드 영역 시작
		return math;
	} // 메소드 영역 끝

	public String information() { // 메소드 영역 시작
		return grade + ", " + classroom + ", " + name + ", " + kor + ", "
				+ eng + ", " + math;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
