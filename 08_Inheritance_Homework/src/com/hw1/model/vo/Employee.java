package com.hw1.model.vo;

public class Employee extends Person{ // 클래스 영역 시작

	private int salary;
	private String dept;
	
	public Employee() {	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}

	public int getSalary() { // 메소드 영역 시작
		return salary;
	} // 메소드 영역 끝

	public void setSalary(int salary) { // 메소드 영역 시작
		this.salary = salary;
	} // 메소드 영역 끝

	public String getDept() { // 메소드 영역 시작
		return dept;
	} // 메소드 영역 끝

	public void setDept(String dept) { // 메소드 영역 시작
		this.dept = dept;
	} // 메소드 영역 끝

	@Override
	public String information() { // 메소드 영역 시작
		return super.information() + ", salary : " + salary + ", dep : " + dept;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
