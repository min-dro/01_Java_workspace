package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

// Unchecked Exception 을 다루는 방법
public class A_UncheckedException { // 클래스 영역 시작

	/*
	 * * 예외의 두가지 분류
	 * - Unchecked Exception
	 * 충분히 예측이 불가능한 상황" 에 대한 오류들을 의미함ㅁ
	 * (RuntimeException 의 자식클래스들 -- 자바에서 예외들은 모두 클래스로 정의되어있음)
	 * 
	 * - Checked Exception
	 * "예측 불가능한 상황" 에 대한 오류들을 의미람
	 * 
	 * * Unchecked Exception 종류들 (RuntimeException 클래스의 자식클래스들)
	 * 1. ArrayIndexOutOfBoundsException
	 * : 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
	 * 2. NegativeArraySizeException
	 * : 배열의 크기를 음수로 지정할 경우 발생하는 예외
	 * 3. ClassCastException
	 * : 허용할 수 없는 형변환이 진행될 경우 발생하는 예외
	 * 4. NullPointerException
	 * : 참조변수가 아직 null 임에도 불구하고 접근하려고 할 때 발생하는 예외
	 * 5. AruthmeticException
	 * : 나누기 (또는 모듈러) 연산 시 0으로 나눌 때 발생하는 예외
	 * ...
	 * 
	 * > 이러한 RuntimeException 과 관련된 예외들은 개발자 입장에서 충분히 "예측 가능" 한 상황이기 때문에
	 *   굳이 예외처리 구문을 쓰지 않고 조건문을 이용해서 충분히 방지할 수 있다!!
	 * - 조건문 사용 : 애초에 예외가 발생하지 않도록 "예방" 의 의미 (권장)
	 * - 예외 처리 구문 사용 : 일단 예외를 발생시켜보고 "수습" 의 의미
	 */
	
	// Scanner 객체를 전역변수로 빼기
	private Scanner sc = new Scanner(System.in);
	
	public void method1() { // 메소드 영역 시작
		
		// ArithmeticException
		// > 나누기 연산 시 0 으로 나누려고 할 때 발생
		
		// 사용자에게 두 개의 정우슬 입력받아 나눗셈한 결과를 출력
		
		// Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번째 정수 (0 제외) : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		// System.out.println("나눗셈 연산 결과 : " + (num1 / num2));
		// > 평소에는 오류가 안나다가 사용자가 num2 에 0 을 입력한 경우에는 오류가 발생!!	
		
		// 해결방법1)
		// 조건문을 이용해서 처리 가능 ("선택적" 으로 처리하게끔 유도)
		// > 에초에 예외 자체가 발생하지 않게끔 if문으로 조건검사 후에 나눗셈 연산을 진행
		// > 예외처리 구문인 try ~ catch문 또는 throws 키워드를 이용하지 않는 방법임!!
		/*
		if(num2 != 0) {
			// > 0 과 일치하지 않는 경우 - 나눗셈 가능한 경우
			
			System.out.println("나눗셈 연산 결과 : " + (num1 / num2));
			
		} else {
			// 0과 일치할 경우 - 나눗셈이 불가능한 경우
			
			System.out.println("0 으로 나눌 수 없습니다.");
		}
		*/
		
		// 해결방법2)
		// 대놓고 예외 처리 구문을 쓰는 방법
		// > 즉, 대놓고 try ~ catch문 또는 throws 키워드를 이용하겠다.
		/*
		 * * try ~ catch문
		 * [ 표현법 ]
		 * 
		 * try {
		 * 
		 * 		예외가 발생될법한 구문; // 즉, 예외가 발생하든 안발생하든 일단 찝찝한 구문 적기
		 * 
		 * } catch(발생할예외클래스명 변수명) {
		 * 
		 * 		해당 예외가 발생했을 때 실행할 구문;
		 * }
		 * 
		 * - 우선 try (시도하다) 블록 안의 코드를 실행한다.
		 * - 그 실행되는 와중에 catch 블럭 매개변수에 해당하는 예외가 발생 할 경우
		 *   catch 블록 안의 코드를 실행한다!!
		 *   (해당 예외가 발생했을 경우에만 선택적으로 실행 - "예외 흐름")
		 */
		
		try {
			
			System.out.println("나눗셈 연산 결과 : " + (num1 / num2));
			
		} catch(ArithmeticException e) {
			
			System.out.println("0 으로 나눌 수 없습니다.");
			
			// 일종의 매개변수 역할을 해주는 e 는 지역변수로써 이 catch 블록 안쪽에서만 사용 가능!!
			// e.printStackTrace();
			// > 오류가 어디서 어떻게 났는지 추적해주는 구문
			//	 catch 블록 안쪽에서 호출하면 현재 예외가 발생한 정보를 알아낼 수 있다!!
			
		}
		
		System.out.println("프로그램 종료"); // 정상 종료 확인용
		
	} // 메소드 영역 끝
	
	public void method2() { // 메소드 영역 시작
		
		// method1 보완
		
		System.out.print("정수 입력 (0은 제외) : ");
		
		try { 
			
			int num = sc.nextInt();
			// > 정수 이외의 값을 입력하면 InputMismatchException 발생
			sc.nextLine();
			
			System.out.println("나눗셈 연산 결과 : " + (10 / num));
			// > num 을 0 으로 입력하는 순간 Arithmetic Exception 발생 
			
		} catch(ArithmeticException e) {
			
			System.out.println("0 으로 나눌 수 없습니다.");
			
		} catch(InputMismatchException e) {
			
			System.out.println("정수로 제대로 입력해야 합니다.");	
		}
		// > 예외가 여러개 발생할 가능성이 있는 경우에는
		//	 catch 블록을 예외의 종류만큼 여러개 작성 가능하다!!
		//	 (다중 catch 블록)
		
		System.out.println("프로그램 종료");
		
	} // 메소드 영역 끝
	
	public void method3() { // 메소드 영역 시작
		
		// ArrayIndexOutOfBoundsException
		// > 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
		
		// NegativeArraySizeException
		// > 배열의 크기를 음수로 지정할 경우 발생하는 예외
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		// > 엄밀히 
		sc.nextLine();
		/*
		int[] arr = new int[size];
		
		System.out.println("100번 인덱스의 값 : " + arr[100]);
		// > ArrayIndexOutOfBoundsException 발생할법한 구간
		*/
		
		/*
		if(size > 0) {
			// 입력받은 배열의 크기가 양수일 경우 - 배열 생성해도 되는 경우
			
			int[] arr = new int[size];
			
			if(size >= 101) {
				// 배열의 크기가 101 이상일 경우 (마지막 인덱스로 100 이 있을 경우
				
				System.out.println("100번 인덱스의 값 : " + arr[100]);
			} else {
				// 배열의 크기가 101 미만일 경우 (100 번 인덱스가 존재하지 않을 경우)
			
				System.out.println("부적절한 인덱스로 접근할 수 없습니다.");
			}
			
		} else {
			// 입력받은 배열의 크기가 양수가 아닐 경우 - 배열 생성이 불가능한 경우
			
			System.out.println("배열의 크기로는 양수만 제시해야합니다.");
		}
		*/
		
		// try ~ catch 문으로 변경해보기
		/*
		try {
			
			int[] arr = new int[size];
			
			System.out.println("100번 인덱스의 값 : " + arr[100]);
		
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("부적절한 인덱스로 접근할 수 없습니다.");
			
		} catch(NegativeArraySizeException e) {
			
			System.out.println("배열의 크기로는 양수만 제시해야합니다.");
		}
		*/
		// > 처리해야하는 예외의 갯수가 늘어난다면? catch 블록 또한 늘어나게 된다!!
		//	 일일이 써줘야 하는게 원칙상 맞지만 너무 귀찮아짐..
		
		/*
		try {
			
			int[] arr = new int[size]; 
			
			System.out.println("100번 인덱스 값 : " + arr[100]);
			
		} catch(RuntimeException e) {
			
			//System.out.println("예외가 발생하긴 했음.. 정확한 원인은 ㅁ?ㄹ");
			System.out.println("오류가 발생했습니다. 관리자한테 연락해보세요.");
		}
		*/
		// > 다중 catch 블록의 경우 부모 타입의 예외 클래스 catch 블록 하나로
		//	 다양한 자식 타입의 예외를 모두 다 받아 쳐줄 수 있다!! (다형성 적용)
		// > catch 블록의 갯수를 줄일 수 있으나, 정확하게 어떤 예외가 발생했는지는 알 수 없다!!
		
		try {
			
			int[] arr = new int[size];
			
			System.out.println("100번 인덱스 값 : " + arr[100]);
		
		} catch(NegativeArraySizeException e) {
			
			System.out.println("배열의 크기로는 양수만 제시할 수 있습니다.");
			
		} catch(RuntimeException e) {
			
			System.out.println("예외가 발생하긴 했음.. 정확한 원인은 ㅁ?ㄹ");
		}
		// > 일부 자식 예외 클래스에 대해서만 catch 블록을 작성하고,
		//	 나머지 예외들은 묶어서 표현하고 싶다면
		//   자식타입 예외 catch 외 부모타입 예외 catch 블록을 혼용해서 쓸 수 있음
		// > 단, catch 블록의 작성 순서가 매우 중요함!!
		//	 범위가 작은 자식타입의 예외 클래스에 대한 catch 블록 먼저 위에 작성해야한다!!
		//	 (안그러면 Unreachable Catch Block 오류가 발생하게 됨)
		
		System.out.println("프로그램 종료");
		
	} // 메소드 영역 끝
	
	/*
	 * * RuntimeException 관련된 예외들은
	 * - 충분히 조건문으로 해결 가능!!
	 * : 예외 자체가 발생 안되게끔 "예방" 하는 개념임!!
	 * 	 개발자가 직접 조건문 구문을 통해서 핸들링 가능해진다. (예외처리 구문 X)
	 * - 예외 처리 구문으로도 해결 가능!!
	 * : 예외가 발생했을 때를 대비해서 그 때 실행할 내용을 정의해 두는 "수습" 하는 개념
	 * 
	 * * 예측이 가능한 상황 : Unchecked Exception
	 * > 조건문으로 해결하는 걸 더 권장한다!!
	 * 
	 * * 예측이 불가능한 상황 : Checked Exception
	 * > 예뢰 처리 구문을 쓸 수 밖에 없음!!
	 * 
	 * * RuntimeException 계열은 충분히 예측 가능한 상황이기 때문에
	 * 	 조건문으로 해결하는 것을 더 권장함. 필수는 아님!!
	 */
	
	// 연습문제
	public void method4() { // 메소드 영역 시작
		
		System.out.print("숫자로 변환할 문자열 (정수 형식) : ");
		String str = sc.nextLine();
		
		// 실행 결과)
		// 숫자로 변환할 문자열 (정수 형식) : 123
		// 변환할 수 있습니다.
		// 결과 : 123
		
		// 숫자로 변환할 문자열 (정수 형식) : 1abc.1
		// 변환할 수 없습니다.
		
		// 힌트)
		// 문자열 ---> 정수 Integer.parseInt("문자열") : int
		// 문자열 ---> 실수 Double.parseDouble("문자열") : double
		// > 파싱 시 제대로된 형식의 문자열이 아닌 경우 NumberFormatException 이 발생!!
		
		// 이 점을 참고해서 해당 문자열을 정수로 변환할 수 있는지 검사하는 프로그램 작성
		// (try ~ catch)

		try {
			
			int num = Integer.parseInt(str);
			
			// 예외가 발생하지 않으면 try 영역이 끝날때까지 쭉 실행됨
			System.out.println("변환할 수 있습니다");
			System.out.println("결과 : " + num);
		} catch(NumberFormatException e) {
			// NumberFormatException 이 발생했다 == 변환이 불가능하다
			
			System.out.println("변환할 수 없습니다.");
		}
		
		System.out.println("프로그램 종료");
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
