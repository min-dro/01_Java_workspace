package practice2.model.vo;

public class V40 extends SmartPhone { // 클래스 영역 시작

	// 필드부
	
	// 생성자부
	public V40() {
		super();
	}

	// 메소드부
	@Override
	public void makeacall() { // 메소드 영역 시작
		System.out.println("번호를 누르고 통화버튼을 누름");
		
	} // 메소드 영역 끝

	@Override
	public void takeaCall() { // 메소드 영역 시작
		System.out.println("수신 버튼을 누름");
		
	} // 메소드 영역 끝

	@Override
	public void picture() { // 메소드 영역 시작
		System.out.println("1200, 1600만 트리플 카메라");
		
	} // 메소드 영역 끝
	
	@Override
	public void charge() { // 메소드 영역 시작
		System.out.println("고속 충전");
		
	} // 메소드 영역 끝

	@Override
	public void touch() { // 메소드 영역 시작
		System.out.println("정전식");
		
	} // 메소드 영역 끝

	@Override
	public void printMaker() {
		System.out.println("LG");
		
	}
	
} // 클래스 영역 끝
