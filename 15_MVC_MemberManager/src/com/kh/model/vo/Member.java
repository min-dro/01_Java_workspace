package com.kh.model.vo;

import java.io.Serializable;

public class Member implements Serializable { // 클래스 영역 시작

	private int userNo;
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	private String email;
	private String phone;
	
	public Member() {}

	public Member(int userNo, String userId, String userPwd, String userName, int age, char gender, String email,
			String phone) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	public int getUserNo() { // 메소드 영역 시작
		return userNo;
	} // 메소드 영역 끝

	public void setUserNo(int userNo) { // 메소드 영역 시작
		this.userNo = userNo;
	} // 메소드 영역 끝

	public String getUserId() { // 메소드 영역 시작
		return userId;
	} // 메소드 영역 끝

	public void setUserId(String userId) { // 메소드 영역 시작
		this.userId = userId;
	} // 메소드 영역 끝

	public String getUserPwd() { // 메소드 영역 시작
		return userPwd;
	} // 메소드 영역 끝

	public void setUserPwd(String userPwd) { // 메소드 영역 시작
		this.userPwd = userPwd;
	} // 메소드 영역 끝

	public String getUserName() { // 메소드 영역 시작
		return userName;
	} // 메소드 영역 끝

	public void setUserName(String userName) { // 메소드 영역 시작
		this.userName = userName;
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

	public String getEmail() { // 메소드 영역 시작
		return email;
	} // 메소드 영역 끝

	public void setEmail(String email) { // 메소드 영역 시작
		this.email = email;
	} // 메소드 영역 끝

	public String getPhone() { // 메소드 영역 시작
		return phone;
	} // 메소드 영역 끝

	public void setPhone(String phone) { // 메소드 영역 시작
		this.phone = phone;
	} // 메소드 영역 끝

	@Override
	public String toString() { // 메소드 영역 시작
		return "Member [userNo=" + userNo + ", userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName
				+ ", age=" + age + ", gender=" + gender + ", email=" + email + ", phone=" + phone + "]";
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
