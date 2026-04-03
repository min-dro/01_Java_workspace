package com.kh.chap02_abstractANDinterface.part01_basic.model.vo;

public class Basketball extends Sports { // 클래스 영역 시작
	// > 추상클래스인 Sports 클래스의 코드를 물려받았음!!
	//	 Baskerball 자식클래스는 추상클래스인 Sports 부모클래스로 부터
	//	 people 필드, people 필드에 대한 setter/ getter, 오버라이딩된 toString,
	//	 추상메소드인 rule 까지 모두 물려받은 상황 (extends Sports)
	
	// > 본의 아니게 추상메소드인 rule 을 물려아서 내코드가 된 상황이라 Basketball 또한 추상클래스가 되어버려야 함!!
	//	 하지만 우리는 이 Basketball 클래스를 추상클래스가 아닌 일반클래스로 두고 싶음!!
	
	// 해결방법)
	// > 미완성된 물려받은 추상메소드를 오버라이딩해주면 됨!!
	//	 (오버라이딩 == 메소드 내용 재정의 == 메소드 코드 재작성:== 즉, 추상 메소드의 코드를 채워넣겠다)
	@Override
	public void rule() { // 메소드 영역 시작
		
		System.out.println("손으로 공을 던져 링에 넣어야 한다.");
	} // 메소드 영역 끝
	// > 오버라이딩을 통해 미완성된 추상메소드를 완성시켰고, 이제 일반메소드가 된 상황임!!
	//	 (일반메소드는 완성된 메소드이기 때문에 앞으로 호출해서 쓸 수 있게 됨)
} // 클래스 영역 끝
