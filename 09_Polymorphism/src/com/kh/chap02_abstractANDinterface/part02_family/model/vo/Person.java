package com.kh.chap02_abstractANDinterface.part02_family.model.vo;

public abstract class Person { // 클래스 영역 시작

	// 필드부
	private String name; // 이름
	private double weight; // 몸무게
	private int health; // 건강도
	
	// 생성자부
	public Person() { }
	
	public Person(String name, double weight, int health) {
		super();
		this.name = name;
		this.weight = weight;
		this.health = health;
	}

	// 메소드부
	public String getName() { // 메소드 영역 시작
		return name;
	} // 메소드 영역 끝

	public void setName(String name) { // 메소드 영역 시작
		this.name = name;
	} // 메소드 영역 끝

	public double getWeight() { // 메소드 영역 시작
		return weight;
	} // 메소드 영역 끝

	public void setWeight(double weight) { // 메소드 영역 시작
		this.weight = weight;
	} // 메소드 영역 끝

	public int getHealth() { // 메소드 영역 시작
		return health;
	} // 메소드 영역 끝

	public void setHealth(int health) { // 메소드 영역 시작
		this.health = health;
	} // 메소드 영역 끝

	@Override
	public String toString() { // 메소드 영역 시작
		return "name :" + name + ", weight : " + weight + ", health : " + health;
	} // 메소드 영역 끝
	
	// 사람이라면 응당 해야하는 행위들 - 밥을 먹는다, 잠을 잔다
	/*
	public abstract void eat();
	
	public abstract void sleep();
	*/
	// > 다른곳으로 코드를 이관 (옮기기)
	
} // 클래스 영역 끝
