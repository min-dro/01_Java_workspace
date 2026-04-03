package com.kh.chap03_map.part01_hashMap.model.vo;

public class Snack { // 클래스 영역 시작
	
	// 필드부 - 과자라면 응당 가져야 하는 것 (제품명, 맛, 칼로리)
	private String flavor; // 맛
	private int calory; // 칼로리
	// > 제품명은 굳이 필드로 표현하지 않고 이따가 HashMap 에 저장할 때 키값으로 저장해볼 예정!!
	
	// 생성자부
	public Snack() {}
	
	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}

	// 메소드부
	public String getFlavor() { // 메소드 영역 시작
		return flavor;
	} // 메소드 영역 끝

	public void setFlavor(String flavor) { // 메소드 영역 시작
		this.flavor = flavor;
	} // 메소드 영역 끝

	public int getCalory() { // 메소드 영역 시작
		return calory;
	} // 메소드 영역 끝

	public void setCalory(int calory) { // 메소드 영역 시작
		this.calory = calory;
	} // 메소드 영역 끝

	@Override
	public String toString() { // 메소드 영역 시작
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	} // 메소드 영역 끝

} // 클래스 영역 끝
