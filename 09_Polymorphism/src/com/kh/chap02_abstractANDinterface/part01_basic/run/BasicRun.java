package com.kh.chap02_abstractANDinterface.part01_basic.run;

import com.kh.chap02_abstractANDinterface.part01_basic.model.vo.Basketball;
import com.kh.chap02_abstractANDinterface.part01_basic.model.vo.Football;
import com.kh.chap02_abstractANDinterface.part01_basic.model.vo.Sports;

public class BasicRun { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작

		// Sports 객체 생성 (== 인스턴스화)
		// Sports s = new Sports();
		// > Cannot instantiate the type Sports
		//	 지금 Sports 클래스로 객체 생성이 불가능하다 라고 오류로 알려줌!!
		
		// 왜? 추상클래스는 미완성된 클래스이기 때문
		//	  (추상클래스 안에 미완성된 추상메소드가 포함되어있기 때문)
		// > 추상클래스로는 절대 객체 생성이 불가능!!
		
		// Sports s;
		// > 단, 객체 생성만 안될 뿐, 참조변수로는 사용 가능!!
		
		// s = /* (Sports) */ new Basketball();
		// > 즉, 다형성을 덕용해서 자식객체를 받아주는 용도로는 사용 가능!!
		
		// 객체 배열 또한 이용 가능
		Sports arr[] = new Sports[2];
		arr[0] = new Basketball();
		arr[1] = new Football();
		
		// 반복문 활용
		for(int i = 0; i < arr.length; i++) {
		
			arr[i].rule();
		}
		
		/*
		 * * 추상클래스
		 * > 추상메소드가 "하나라도" 존재하는 순간 반드시 추상클래스로 정의
		 * 	 단, 추상메소드가 굳이 없더라도 해당 클래스를 추상클래스로 둘 수 있긴 함!! (abstract 예약어만 붙여도)
		 * 	 (일반필드 + 일반메소드 + 추상메소드)
		 * > 추상클래스 또한 미완성된 클래스이기 때문에 마찬가지로 객체 생성이 불가능하다!!
		 * 	 단, "참조변수" 로는 사용 가능함 (다형성 적용 가능)
		 * 
		 * * 추상메소드
		 * > 미완성된 메소드를 몸통부 ({ 여기 }) 가 구현되어있지 않은 메소드
		 * > 자식클래스에서 오버라이딩을 통해 완성됨 (강제로 오버라이딩 해야함)
		 * > 오버라이딩을 안할 경우 에러 발생 (오버라이딩을 안하면 자식클래스 또한 추상클래스가 되어야 함)
		 * > 메소드 사용의 "통일성" 을 확보하기 위해 주로 씀!!
		 * 	 (추상메소드를 물려받은 자식클래스들끼리는 동일한 메소드 틀을 가진 것이나 마찬가지)
		 * > 코드 상의 표준화된 틀을 제공할 목적으로 주로 사용한다.
		 * 
		 * 참고)
		 * 추상메소드가 없더라도 abstract 예약어만 붙이면 해당 클래스를 추상클래스로 작성 가능!!
		 * - 코드 작업 시 클래스가 아직 덜 구체적으로 구현된 상태인 것 같을 때 (개념직)
		 * - 현재 이 클래스로 객체 생성이 안되게 당장 막아버리거 싶을 때 (기술적)
		 */
	} // main 영역 끝
	
} // 클래스 영역 끝
