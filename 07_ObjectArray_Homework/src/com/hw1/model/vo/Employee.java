package com.hw1.model.vo;

public class Employee { // 클래스 영역 시작
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public Employee() { }

	public Employee(int empNo, String empName, int age, 
			char gender, String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}

	public Employee(int empNo, String empName, String dept,
			String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address) {
		this(empNo, empName, age, gender, phone, address);
		this.dept = dept;
		this.job = job;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
	}

	public void setEmpNo(int empNo) { // 메소드 영역 시작
		this.empNo = empNo;
	} // 메소드 영역 끝

	public void setEmpName(String empName) { // 메소드 영역 시작
		this.empName = empName;
	} // 메소드 영역 끝

	public void setDept(String dept) { // 메소드 영역 시작
		this.dept = dept;
	} // 메소드 영역 끝

	public void setJob(String job) { // 메소드 영역 시작
		this.job = job;
	} // 메소드 영역 끝

	public void setAge(int age) { // 메소드 영역 시작
		this.age = age;
	} // 메소드 영역 끝

	public void setGender(char gender) { // 메소드 영역 시작
		this.gender = gender;
	} // 메소드 영역 끝

	public void setSalary(int salary) { // 메소드 영역 시작
		this.salary = salary;
	} // 메소드 영역 끝

	public void setBonusPoint(double bonusPoint) { // 메소드 영역 시작
		this.bonusPoint = bonusPoint;
	} // 메소드 영역 끝

	public void setPhone(String phone) { // 메소드 영역 시작
		this.phone = phone;
	} // 메소드 영역 끝

	public void setAddress(String address) { // 메소드 영역 시작
		this.address = address;
	} // 메소드 영역 끝

	public int getEmpNo() { // 메소드 영역 시작
		return empNo;
	} // 메소드 영역 끝

	public String getEmpName() { // 메소드 영역 시작
		return empName;
	} // 메소드 영역 끝

	public String getDept() { // 메소드 영역 시작
		return dept;
	} // 메소드 영역 끝

	public String getJob() { // 메소드 영역 시작
		return job;
	} // 메소드 영역 끝

	public int getAge() { // 메소드 영역 시작
		return age;
	} // 메소드 영역 끝

	public char getGender() { // 메소드 영역 시작
		return gender;
	} // 메소드 영역 끝

	public int getSalary() { // 메소드 영역 시작
		return salary;
	} // 메소드 영역 끝

	public double getBonusPoint() { // 메소드 영역 시작
		return bonusPoint;
	} // 메소드 영역 끝

	public String getPhone() { // 메소드 영역 시작
		return phone;
	} // 메소드 영역 끝

	public String getAddress() { // 메소드 영역 시작
		return address;
	} // 메소드 영역 끝
	
	public String information() { // 메소드 영역 시작
		return empNo + ", " + empName + ", " + dept + ", " + job 
				+ ", " + age + ", " + gender + "," + salary 
				+ ", " + bonusPoint + ", " + phone + ", " + address;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
