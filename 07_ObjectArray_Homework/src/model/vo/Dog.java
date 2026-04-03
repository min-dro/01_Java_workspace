package model.vo;

public class Dog { // 클래스 영역 시작

	private String name;
	private double weight;
	private double height;
	
	public Dog() { }

	public Dog(String name, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

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

	public double getHeight() { // 메소드 영역 시작
		return height;
	} // 메소드 영역 끝

	public void setHeight(double height) { // 메소드 영역 시작
		this.height = height;
	} // 메소드 영역 끝
	
	public void information() { // 메소드 영역 시작
		System.out.println(name + "은(는) 몸무게는 " + weight + "kg 이고, 몸의 길이는 " + height +
				"cm 입니다.");
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
