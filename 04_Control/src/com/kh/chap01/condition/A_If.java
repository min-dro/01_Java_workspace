package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If { // 클래스 영역 시작

	/*
	 * * 단독 if문
	 * > 단 하나의 선택적인 경우를 나타낼 때 사용하는 구문
	 * 
	 * [ 표현법 ]
	 * if(조건식) {
	 * 
	 * 		조건식이 true 일 경우 실행할 코드
	 * }
	 * 
	 * - 조건식의 결과가 true 일 경우 중괄호 블록 ({여기}) 안의 코드가 실행
	 * - 조건식의 결과가 false 일 경우 중괄호 블록 안의 코드를 무시하고 다음 코드로 건너뜀
	 */
	
	// 기존의 삼항 연산자 문제 --> 단독 if문 버전
	public void method1() { // 메소드 영역 시작
		
		// 사용자에게 정수값을 입력받은 후
		// 양수인지, 0인지, 음수인지 판별 후 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 삼항 연산자를 이용한 경우
		// String result = (num > 0) ? ("양수입니다.") : ((num == 0) ? ("0입니다.") : ("음수입니다."));
				
		// System.out.println(result);
		
		// 단독 if문을 이용한 경우
		// > 표현해야하는 경우의 수가 3개이므로 단독 if문 또한 3개가 필요하다!!
		
		// 첫번째 경우의 수 : 양수일경우 (num > 0)
		if(num > 0) {
			
			System.out.println("양수입니다.");
		}
		
		// 두번째 경우의 수 : 0일경우 (num == 0)
		if(num == 0) {
			
			System.out.println("0입니다.");
		}
		
		//세번째 경우의 수 : 음수일경우 (num < 0)
		if(num < 0) {
			System.out.println("음수입니다.");
		}
		
	} // 메소드 영역 끝
	
	public void method2() { // 메소드 영역 시작
	
		// 사용자가 입력한 정수값이 짝수인지 홀수인지 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 삼항 연산자 버전
		// String result = (num % 2  == 0) ? ("짝수입니다") : ("홀수입니다.");
		
		// System.out.println(result);
		
		// 단독 if문 버전
		// > 경우의 수가 2개이므로 단독 if문 또한 2개가 필요함!!
		
		// 첫번째 경우의  수 : 짝수일 경우 ((num % 2) == 0)
		if((num % 2) == 0) {
			
			System.out.println("짝수입니다.");
		}
		
		// 두번째 경우의 수 : 홀수의 경우 ((num % 2) == 1 또는 (num % 2) != 0)
		if((num % 2) != 0) {
			
			System.out.println("홀수입니다.");
		}
		
	} // 메소드 영역 끝
	
	public void method3() { // 메소드 영역 시작
	
		// 사용자로부터 나이값을 입력받아
		// 어린이, 청소년, 성인인지 판별 후에 출력
		// 어린이 (13세 이하) / 청소년 (13세 초과 ~ 19세 이하) / 성인 (19세 초과)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		// 삼항 연산자 버튼
		String result = (age <= 13) ? ("어린이입니다.") : (((13 < age) && (age <= 19)) ?  ("청소년입니다.") : ("성인입니다"));
		
		// System.out.println(result);
		
		// 단독 if문 버전
		// > 경우의 수 갯수 만큼 단독 if문 작성
		
		// 첫번째 경우 : 어린이일 경우 (age <= 13)
		if(age <= 13) {
			
			System.out.println("어린이입니다.");
		}
		
		// 두번째 경우 : 청소년일 경우 ((13 < age) && (age <= 19))
		if((13 < age) && (age <= 19)) {
			
			System.out.println("청소년입니다.");
		}
		
		// 세번째 경우 : 성인일 경우 (19 < age)
		if(19 < age) {
			
			System.out.println("성인입니다.");
		}
		
	} // 메소드 영역 끝
	
	public void method4() { // 메소드 영역 시작
		
		// 사용자에게 주민등록번호를 입력받아서
		// 남자인지 여자인지 판별 후 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자로부터 주민번호 입력받기
		// 주민번호 : "741231-1234567"
		// > 아무리 숫자로만 이루어져 있어도 평소에 주민등록번호를 가지고 산술연산 같은 것을 할 일이 없음!!
		//	 01년생, 02년생, ... 앞자리가 0으로 시작하는 정수는 존재할 수 없음!!
		// > 그래서 주민번호는 문자열로 취급하는 것이 바람직함!! (전화번호도 마찬가지)
		
		System.out.print("주민번호 입력 (-포함) : ");
		String personId = sc.nextLine();
		
		// 주민번호 체계
		// yymmdd-gxxxxxx
		// g 자리가 1 인 경우 남자, 2 인 경우 여자, 3 인 경우 남자, 4 인 경우 여자
		
		// 2. 입력받은 주민번호로부터 성별에 해당하는 문자 (7번 인덱스 자리) 를 추출해서 변수에 따로 담기
		char gender = personId.charAt(7);
		// > gender에는 1, 2, 3, 4 가 담겨있음!!
		
		// 3. 성별에 해당하는 문자에 따라 남자인지, 여자인지 판별
		// 이 때, 반드시 문자로서의 '1', '2', '3', '4' 와 동등비교!!
		// 단독 if문 버전
		
		// 첫번째 경우의 수 : 남자일 경우 (성별 자리가 '1' 또는 '3')
		if((gender == '1') || (gender == '3')) {
			
			System.out.println("남자입니다.");
		}
		
		// 두번째 경우의 수 : 여자일 경우 (성별 자리가 '2' 또는 '4')
		if((gender == '2') || (gender == '4')) {
			
			System.out.println("여자입니다.");
		}
		
		// 세번째 경우의 수 : 잘못된 주민번호 뒷자리를 입력한 경우
		// > gender 가 '1' 도 아니고 '2' 도 아니고 '3' 도 아니고 '4' 도 아닌 경우
		if(gender != '1' && gender != '2' && gender != '3' && gender != '4' ) {
			
			System.out.println("잘못된 주민번호를 입력했습니다.");
		}
		
	} // 메소드 영역 끝
		
	// method2 를 보완
	public void method5() { // 메소드 영역 시작
		
		// 사용자가 입력한 정수값이 "양수이면서" 짝수인지 또는 "양숭;면서" 홀수인지 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 단독 if문 버전
		/*
		// 첫번째 경우의 수 : 양수이면서 짝수인 경우 ((양수) && (짝수))
		if((num > 0) && ((num % 2) == 0)) {
			
			System.out.println("양수이면서 짝수입니다.");
		}	
			
		// 두번째 경우의 수 : 양수이면서 홀수인 경우 ((양수) && (홀수))
		if((num > 0) && ((num % 2) == 1)) {
			
			System.out.println("양수이면서 홀수입니다.");
		}
		*/
		
		// 첫번째, 두번째 경우의 수 모두 짝수인지 홀수인지 검사기 전에 우선적으로 양수인지를 체크하고있음
		// 실행 결과를 보니까 에초에 음수이거나 0 인 경우에는 에초에 if 문 안으로 들어가지도 않음!!
		// >  중첩 if문을 사용할 수도 있다!! (if문 안에 if문을 쓰겠다)
		
		// 우선 양수인지를 먼저 체크
		if(num > 0) {
			
			// 코드의 흐름이 이 시점까지 도달했다라는 것은 곧 num 이 양수라는 뜻!!
			
			// 짝수일 경우
			if((num % 2) == 0) {
				
				System.out.println("양수이면서 짝수입니다.");
			}
			
			// 홀수일 경우
			if((num % 2) == 1) {
				
				System.out.println("양수이면서 홀수입니다.");
			}
		}
		
		if(num == 0) {
			
			System.out.println("0입니다.");
		}
		
		if(num > 0) {
			
			if((num % 2) == 0) {
				
			}
			
			if((num % 2) == 1) {
				
			}
		}
			
		// method1 내용을 덧붙이면
		// 이 자리에서 0 인 경우, 음수인 경우 까지 표현 가능!!
		
		
	} // 메소드 영역 끝
	
	// 연습 문제
	public void method6() { // 메소드 영역 시작
		
		// 사용자로부터 나이값을 입력받아
		// 어린이, 청소년, 성인인지 판별 후에 출력
		// 어린이 (13세 이하) / 청소년 (13세 초과 ~ 19세 이하) / 성인 (19세 초과)
		// > 나이가 음수인 경우는 "잘못 입력했습니다" 로 출력하기!!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		// 입력받은 age 값이 어린이인지, 청소년인지, 성인인지 판별 전에
		// 우선적으로 음수인지 음수가 아닌지부터 판별할 예정!!
		
		// 음수일 경우
		if(age < 0) {
			
			System.out.println("잘못 입력했습니다.");
		
		}
		
		// 음수가 아닌 경우
		if(age >= 0) {
				
			// 어린이인지, 청소년인지, 성인인지 판별
			
			//어린이일 경우
			if(age <= 13) {
			
				System.out.println("어린이입니다.");
			}
			
			// 청소년일 경우
			if((age > 13) && (age <= 19)) {
				
				System.out.println("청소년입니다.");
			}
			
			// 성인일 경우
			if(age > 19) {
				System.out.println("성인입니다.");
			}
			
		}
		
		
	} // 메소드 영역 끝
	
} // 클래스 영역 끝

