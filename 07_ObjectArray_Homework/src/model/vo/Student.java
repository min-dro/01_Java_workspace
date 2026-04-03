package model.vo;

public class Student { // 클래스 영역 시작

	private int grade;
	private int classroom;
	private int num;
	private String name;
	
	public Student() { }

	public Student(int grade, int classroom, int num, String name) {
		this.grade = grade;
		this.classroom = classroom;
		this.num = num;
		this.name = name;
	}

	public int getGrade() { // 메소드 영역 시작
		return grade;
	} // 메소드 영역 끝

	public void setGrade(int grade) { // 메소드 영역 시작
		this.grade = grade;
	} // 메소드 영역 끝

	public int getClassroom() { // 메소드 영역 시작
		return classroom;
	} // 메소드 영역 끝

	public void setClassroom(int classroom) { // 메소드 영역 시작
		this.classroom = classroom;
	} // 메소드 영역 끝

	public int getNum() { // 메소드 영역 시작
		return num;
	} // 메소드 영역 끝

	public void setNum(int num) { // 메소드 영역 시작
		this.num = num;
	} // 메소드 영역 끝

	public String getName() { // 메소드 영역 시작
		return name;
	} // 메소드 영역 끝

	public void setName(String name) { // 메소드 영역 시작
		this.name = name;
	} // 메소드 영역 끝

	public String information() { // 메소드 영역 시작
		return grade + "학년 " + classroom + "반 " + num + "번 " + name;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
