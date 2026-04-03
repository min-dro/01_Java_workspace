package practice2.model.vo;

public class GalaxyNote9 extends SmartPhone { // 클래스 영역 시작

	// 필드부
	
	// 생성자부

	public GalaxyNote9() {
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
		System.out.println("1200만 듀얼 카메라");
		
	} // 메소드 영역 끝
	
	@Override
	public void charge() { // 메소드 영역 시작
		System.out.println("고속 충전, 고속 무선 충전");
		
	} // 메소드 영역 끝

	@Override
	public void touch() { // 메소드 영역 시작
		System.out.println("정전식, 와콤펜 지원");
		
	} // 메소드 영역 끝

	@Override
	public void printMaker() { // 메소드 영역 시작
		System.out.println("삼성");
		
	} // 메소드 영역 끝
} // 클래스 영역 끝
