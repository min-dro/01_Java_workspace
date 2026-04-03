package practice2.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{ // 클래스 영역 시작
	
	// 필드부
	
	// 생성자부
	
	public SmartPhone() {
		super();
	}
	
	// 메소드부
	public abstract void printMaker();
	
} // 클래스 영역 끝
