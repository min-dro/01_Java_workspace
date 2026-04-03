package com.kh.second.run;
// 패키지 선언부

import com.kh.first.HelloWorld;
// > com.kh.first 패키지 안의 HelloWorld 클래스를 쓸 수 있다.
import com.kh.second.MethodTest;
// > 지금부터 이 클래스 내부에서 com.kh.second 패키지 안에 MethodTest라는 클래스를 가져다 쓰겠다.
// import 선언부

//클래스 선언부
// main 메소드만 갖고있는 클래스
// > 실행용 클래스 라고도 부른다!!
public class Run { // Run 클래스 영역 시작

	// main 메소드
	public static void main(String[] arg) { // main 영역 시작
		System.out.println("프로그램 시작! 준비 땅 ~!");
		
		/*
		 * * 메소드 호출
		 * > 클래스에 메소드를 작성했다고해서 그 메소드의 코드가 무작정 실행되는건 아님!!
		 * > 항상 메소드 내의 코드를 실행하고자 한다면 그 메소드를 "호출 (call)" 해줘야함
		 * 
		 * 질문) main 메소드는 호출한적이 없는데요?
		 * > 알게모르게 어딘가에서 누군가에 의해 호출이 된 것임
		 * > main 메소드는 프로그램 시작과 동시에 JVM 에 의해 호출됨
		 * 
		 * => 반면에 일반 메소드들은 내가 직접 코드를 통해 호출해줘야하!!
		 * 
		 * * 메소드 호출 방법
		 * 1. 같은 클래스 내의 메소드를 호출하는 방법
		 * [ 표현법 ]
		 * 메소드이름();
		 * 
		 * 2. 다른 클래스의 메소드를 호출하는 방법
		 *  
		 */
		
		// testMethodA();
		// > The method testMethodA() is undefined for the type Run
		//	Run 클래스 내에 testMethodA 라는 이름의 메소드가 정의되어있지 않아서 호출 불가
		
		//  - 다른 클래스에 있는 메소드를 호출하고 싶을 경우에는?
		
		// step1. 호출할 메소드가 있는 클래스를 "생성 (new)" 이라는걸 해줘야 함
		// [ 표현법 ]
		// 클래스명 대변할이름 = new 클래스명();
		
		// > 내가 호출하고자 하는 testMetodA 는 Method 클래스에 포함
		// MethodTest mt = new MethodTest();
		// > MethodTest cannot be resolved to a type
		//	 코드 상에 클래스명을 적으면 기본적으로 여기랑 같은 패키지 내의 클래스만 찾음
		//	 지금 코드를 작성 중인 Run 클래스 기준으로 com.kh.second.run 패키지 대여
		//	 MethodTest 클래스가 없기 때문에 없다고 오류 뜨는 것!!
		
		// 해결방법1)
		// 해당 클래스가 정확히 어떤 패키지에 들어있는지 대놓고 명시하는 방법(풀클래스명) 
		// com.kh.second.MethodTest mt = new com.kh.second.MethodTest(); 
		
		// 해결방법2)
		// 그냥 클래스명만 가지고 대변할이름을 만들되,
		// 이 클래스가 어떤 패키지에 속해있는지 선언문이라는걸 추가하는 방법 (import)
		// > 주로 쓰는 방법
		MethodTest mt = new MethodTest();
		
		// step2. 만들어진 대변할이름을 통해 해당 클래스에 있는 메소드를 호출
		// [ 표현법 ]
		// 대변할이름.메소드명();
		mt.testMethodA();
		
		/*
		 * 프로그램 시작! 준비 땅 ~!
		 * method a 실행됨
		 * method b 실행됨
		 * method c 실행됨
		 * 프로그램 종료 ~!
		 * 
		 * 이번에는 위와 같은 결과를 보고 싶음!!
		 */
		
		// 이미 위에서 MethodTest 를 대변할이름인 mt 를 만들어뒀기 때문에
		// 그대로 가져다 쓸 수 있음!!
		// mt.testMethodB();
		// mt.testMethodC();
		
		// > testMethodA 하나 호출 만으로 같은 결과를 보고싶다면?
		//	 코드가 다르더라도 흐름만 잘 잡고 만들어준다면 같은 결과를 뽑아낼 수 있음!!
		//	 (프로그래밍에는 정답이 없음)
		
		// main -> a 호출 -> b 호출 -> c 호출
		
		// 질문) main 메소드는 내가 직접 호출 못하나요?
		// > 가능함!! 메소드니까!! (하지만 이렇게는 잘 쓰지 않음..)
		
		// " main 메소드 호출해보기
		// 어제 만든 HelloWorld 클래스의 main 호출해보기
		HelloWorld.main(null);
		// > main 메소드는 static 이 앞에 붙기 떄문에 대변할이름을 만들지 않고
		//	 클래스명.main 으로 호출함!! => 추후 객체 시간에 다를 것!!
		// > 호출 당한 main 메소드는 다 실행된 후에 나를 호출했었던 나를 호출했었던 태초마을로 돌아옴!!
		// > 프로그램 시작과 동시에 호출당한 main 메소드는 JVM 이 호출했기 때문에
		// 	 다 실행된 후에JVM 으로 올라가게 됨(즉, 프로그램 종료를 의미함)
		
		System.out.println("프로그램 종료 ~!");
	
	} // main 영역 끝
	
} // Run 클래스 영역 끝
