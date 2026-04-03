package com.kh.chap02_abstractANDinterface.part02_family.model.vo;
//				  확장하겠다
//								 구현하겠다
public class Baby extends Person implements Basic{

	// 필드부
	
	// 생성자부
	public Baby() { }
	
	public Baby(String name, double weight, int health) {
		
		super(name, weight, health);
	}
	
	// 메소드부
	
	// 딱히 부모로부터 물려받은 필드에 추가된 필드가 없어서 사실 안써도 됨 (오버라이딩 안해도됨)
	@Override
	public String toString() { // 메소드 영역 시작
		return super.toString();
	} // 메소드 영역 끝
	
	// 아기가 밥을 먹을 때
	@Override
	public void eat() { // 메소드 영역 시작
		
		// 몸무게 3 증가
		super.setWeight(super.getWeight() + /* (double) */3);
		
		// 건강도 1 증가
		super.setHealth(super.getHealth() + 1);
	} // 메소드 영역 끝

	// 아기가 잠을 잘 때
	@Override
	public void sleep() { // 메소드 영역 시작
		// 건강도 3 증가
		super.setHealth(super.getHealth() + 3);
		
	} // 메소드 영역 끝

} // 클래스 영역 끝
