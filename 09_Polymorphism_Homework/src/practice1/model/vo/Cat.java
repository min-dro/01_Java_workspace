package practice1.model.vo;

public class Cat extends Animal {

	private String location;
	private String color;
	
	public Cat() {
		super();
	}
	
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}

	public String getLocation() { // 메소드 영역 시작
		return location;
	} // 메소드 영역 끝

	public void setLocation(String location) { // 메소드 영역 시작
		this.location = location;
	} // 메소드 영역 끝

	public String getColor() { // 메소드 영역 시작
		return color;
	} // 메소드 영역 끝

	public void setColor(String color) { // 메소드 영역 시작
		this.color = color;
	} // 메소드 영역 끝

	@Override
	public void speak() { // 메소드 영역 시작
		System.out.println(super.toString() + " " + location + "에 서식하며, 색상은 " + color 
				+ "입니다.");
		
	} // 메소드 영역 끝
	
}
