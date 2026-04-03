package model.vo;

public class Cat { // 클래스 영역 시작
	
	public static final String STORE = "가현가게";
	private String name;
	
	public Cat() { }
	
	public Cat(String name) {
		this.name = name;
	}

	public String getName() { // 메소드 영역 시작 
		return name;
	} // 메소드 영역 끝

	public void setName(String name) { // 메소드 영역 시작
		this.name = name;
	} // 메소드 영역 끝
	
	public void information() { // 메소드 영역 시작
		System.out.println(STORE + "에 살고있는 " + name + "이(가) 있습니다.");
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
