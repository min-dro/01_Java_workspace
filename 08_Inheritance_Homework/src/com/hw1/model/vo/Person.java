package com.hw1.model.vo;

public class Person { // 클래스 영역 시작

	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() { }

	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

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

	public double getHeight() { // 메소드 영역 시작
		return height;
	} // 메소드 영역 끝

	public void setHeight(double height) { // 메소드 영역 시작
		this.height = height;
	} // 메소드 영역 끝

	public double getWeight() { // 메소드 영역 시작
		return weight;
	} // 메소드 영역 끝

	public void setWeight(double weight) { // 메소드 영역 시작
		this.weight = weight;
	} // 메소드 영역 끝

	public String information() { // 메소드 영역 시작
		return "name : " + name + ", age : " + age + ", height : " + height + ", weight : " + weight;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
