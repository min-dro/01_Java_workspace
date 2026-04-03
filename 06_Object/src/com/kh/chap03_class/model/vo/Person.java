package com.kh.chap03_class.model.vo;

public class Person { // 클래스 영역 시작
	
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public String getId() { // 메소드 영역 시작
		return id;
	} // 메소드 영역 끝
	
	public void setId(String id) { // 메소드 영역 시작
		this.id = id;
	} // 메소드 영역 끝

	public String getPwd() { // 메소드 영역 시작
		return pwd;
	} // 메소드 영역 끝
	
	public void setPwd(String pwd) { // 메소드 영역 시작
		this.pwd = pwd;
	} // 메소드 영역 끝
	
	public String getName() { // 메소드 영역 시작
		return name;
	} // 메소드 영역 끝
	
	public void setName(String name) { // 메소드 영역 시작
		this.name = name;
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
	
	public String getPhone() { // 메소드 영역 시작
		return phone;
	} // 메소드 영역 끝
	
	public void setPhone(String phone) { // 메소드 영역 시작
		this.phone = phone;
	} // 메소드 영역 끝
	
	public String getEmail() { // 메소드 영역 시작
		return email;
	} // 메소드 영역 끝
	
	public void setEmail(String email) { // 메소드 영역 시작
		this.email = email;
	} // 메소드 영역 끝
	
	public String information() { // 메소드 영역 시작
		return name + "님의 아이디는" + id + "이고, 비밀번호는 " + pwd + "이고, 나이는 " + age + "살이고, "
				+ "성별은 " + gender + "이고, 전화번호는 " + phone + "이고, 이메일은 " + email + "입니다.";
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
