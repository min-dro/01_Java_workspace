package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun { // 클래스 영역 시작

	/*
	 * * 명심할 사항 : 항상 프로그램은 사용자가 종료를 원할 경우에만 종료되야 한다!!
	 * 
	 * * 에러 (오류) 의 종류
	 * - 시스템 에러 : 컴퓨터의 오작동으로 인해 발생하는 에러
	 * 				 소스코드로 절대 해결 불가능
	 * 				 즉, 개발자 선에서 해결할 수 없다. (제일 심각한 에러)
	 * - 컴파일 에러 : 소스코드 상의 "문법적인 문제" 로 발생하는 에러
	 * 				애초에 이클립스에서 빨간 밑줄로 알려줌!!
	 * 				소스코드 수정으로 해결 가능 (문법이 틀리면 컴파일 과정에서 에러가 발생)
	 * - 런타임 에러 : 소스코드 상으로는 문제가 없는데 (컴파일까지는 정상적으로 진행됨)
	 * 				 "프로그램 실행 중" 발생하는 에러 (실행중에 에러가 발생해서 런타임 에러라고 부름)
	 * 				 사용자의 잘못이 될 수 있고, 개발자가 예측 가능한 오류 발생의 경우를 제대로 처리 안해놓은 것 일 수도 있음!!
	 * 				 런타입 에러 또한 소스코드를 통해 해결 가능
	 * - 논리 에러 : 소스코드 상의 문법적인 문제도 없고, 실행했을 때도 굳이 문제가 되지 않지만,
	 * 			   프로그램 의도 상 반대로 작동하는 것 (오작동하는 것)
	 * 
	 * > 시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리 에러와 같은 비교적 덜 심각한 것들을 "예외 (Exception) 라고 부른다."
	 * > 이러한 "예외" 들이 "발생" 했을 경우에 대비해서 "처리" 하는 방법을 정의해두는 것 == "예외 처리" 라고 부른다.
	 * > 예외 처리를 해야 하는 이유 : 예외 발생 시 프로그램이 비정상적으로 종료되는 것을 막기 위해서!!
	 * 
	 * * 예외 처리 방법
	 * 1. try ~ catch문 이용
	 * 2. throws 라는 키워드 이용
	 * 
	 * * 예외의 종류
	 * 1. Unchecked Exception : 예외 처리 구문을 굳이 안써도 되는 경우 - 충분히 예측 가능한 상황
	 * 2. Checked Exception : 무조건 예외 처리를 해야하는 경우 - 예측이 전혀 불가능한 상황
	 */
	
	// main 메소드 또한 예외처리를 throws 로 떠넘길 수 있다!!
	// main 메소드는 프로그램 시작 시 JVM 이 호출해주기 때문에
	// JVM 이 알아서 예외 처리를 해줄 것임!
	// > 단, 권장 사항은 절대 아님!!
	public static void main(String[] args) throws IOException { // main 영역 시작

		A_UncheckedException a = new A_UncheckedException();
		
		// a.method1();
		// a.method2();
		// a.method3();
		// a.method4();
		
		B_CheckedException b = new B_CheckedException();
		
		/*
		try {
			
			b.method2();
			// Unhandled exceptiojn type IOException
		
		} catch(IOException e) {
			
			System.out.println("예외 발생됨");
		}
		*/
		
		b.method1();
		
		System.out.println("프로그램 종료");
	} // main 영역 끝 

} // 클래스 영역 끝
