package practice1.model.vo;

public abstract class Animal { // 클래스 영역 시작
	
	// 필드부
	private String name;
	private String kinds;
	
	// 생성자부
	protected Animal() {
		super();
	}

	protected Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}

	// 메소드부
	@Override
	public String toString() { // 메소드 영역 시작
		return "저의 이름은" + name + "이고 종류는 " + kinds + "입니다.";
	} // 메소드 영역 끝
	
	public abstract void speak(); 
	
} // 클래스 영역 끝