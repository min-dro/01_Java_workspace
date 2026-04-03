package com.hw3.model.vo;

public class Employee { // 클래스 영역 시작

	private String empName;	// 사원명
	private String dept;	// 부서명
	private String job;		// 직급
	private int age;		// 나이
	private char gender;	// 성별
	private int salary;		// 급여
	private double bonusPoint; // 보너스포인트
	private String phone;	// 전화번호
	private String address;	// 주소
	
	public Employee() {}
	public Employee(String empName, String dept, String job, int age, char gender, int salary, double bonusPoint
			, String phone, String address) {
		
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}
	
	public String getEmpName() { // 메소드 영역 시작
		
		return empName;
	} // 메소드 영역 끝
	
	public void setEmpName(String empName) { // 메소드 영역 시작
		
		this.empName = empName;
	} // 메소드 영역 끝
	
	public String getDept() { // 메소드 영역 시작
		
		return dept;
	} // 메소드 영역 끝
	
	public void setDept(String dept) { // 메소드 영역 시작
		
		this.dept = dept;
	} // 메소드 영역 끝
	
	public String getJob() { // 메소드 영역 시작
		
		return job;
	} // 메소드 영역 끝
	
	public void setJob(String job) { // 메소드 영역 시작
		
		this.job = job;
	} // 메소드 영역 끝
	
	public int getAge() { // 메소드 영역 시작
		
		return age;
	} // 메소드 영역 끝
	
	public void setAge(int age) { // 메소드 영역 시작
		
		this.age = age;
	} // 메소드 영역 끝
	
	public char getGender() { // 메소드 영역 시작
		
		return gender;
	} // 메소드 영역 끝
	
	public void setGender(char gender) { // 메소드 영역 시작
		
		this.gender = gender;
	} // 메소드 영역 끝
	
	public int getSalary() { // 메소드 영역 시작
		
		return salary;
	} // 메소드 영역 끝
	
	public void setSalary(int salary) { // 메소드 영역 시작
		
		this.salary = salary;
	} // 메소드 영역 끝
	
	public double getBonusPoint() { // 메소드 영역 시작
		
		return bonusPoint;
	} // 메소드 영역 끝
	
	public void setBonusPoint(double bonusPoint) { // 메소드 영역 시작
		
		this.bonusPoint = bonusPoint;
	} // 메소드 영역 끝
	
	public String getPhone() { // 메소드 영역 시작
		
		return phone;
	} // 메소드 영역 끝
	
	public void setPhone(String phone) { // 메소드 영역 시작
		
		this.phone = phone;
	} // 메소드 영역 끝
	
	public String getAddress() { // 메소드 영역 시작
		
		return address;
	} // 메소드 영역 끝
	
	public void setAddress(String address) { // 메소드 영역 시작
		
		this.address = address;
	} // 메소드 영역 끝
	
	
	public String information() {
		return "empName=" + empName + ", dept=" + dept + ", job=" + job + ", age=" + age + ", gender="
				+ gender + ", salary=" + salary + ", bonusPoint=" + bonusPoint + ", phone=" + phone + ", address="
				+ address;
	}
	
	
}
