package com.kh.chap02_abstractANDinterface.part02_family.model.vo;

//					(실선화살표)
//					------>
//					확장하겠다.
//								   (점선화살표)
//									------->
//									구현하겠다.
public class Mother extends Person implements Basic {

	// 필드부
	private String babyBirth; // 아기의 탄생 여부 : 출산, 입양 없음
	
	// 생성자부
	public Mother() { }
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	// 메소드부
	@Override
	public String toString() {
		return super.toString() + ", babyBirth=" + babyBirth;
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	// 엄마가 밥을 먹을 때
	@Override
	public void eat() { // 
		// 몸무게가 기존의 몸무게에 10 증가
		// 몸무게 = 몸무게 10;
		
		//super.weight = super.weight + 10;
		super.setWeight(super.getWeight() + 10);
		
		// 건강도는 기존의 건강도에 10 감소
		// 건강도 = 건강도 - 10
		
		// super.health = super.health - 10;
		super.setHealth(super.getHealth() - 10);
	}

	// 엄마가 잠을 잘 때
	@Override
	public void sleep() {
		//  super.health = super.health + 10; 
		super.setHealth(super.getHealth() + 10);
	} // 클래스 영역 시작

} // 클래스 영역 끝
