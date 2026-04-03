package com.kh.operator;

import java.util.Scanner;

// 삼항 연산자
public class G_Triple { // 클래스 영역 시작

	/*
	 * * 삼항 연산자
	 * > 이름 그대로 3 개의 항목을 가지고 연산하는 역할
	 * 	 주로 논리값의 결과에 따라 대응되는 값을 나타낼 떄 쓰임!!
	 * 
	 * [ 표현법 ]
	 * (조건식) ? (조건식결과가true일경우대응되는값) : (조건식결과가false일경우대응되는값)
	 * 
	 * - 조건식 : 연산 결과가 true 아니면 false로 나오는 식
	 */
	
	
	public void method1() { // 메소드 영역 시작
		
		// 사용자로부터 정수 한개를 키보드로 입력받아
		// 그 정수가 양수인지 아닌지를 판별 후
		// 양수일 경우 "양수입니다." / 양수가 아닐 경우 "양수가 아닙니다." 라고 출력
		// > 아까전에는 양수면 true 아니면 false 로만 대답했지만
		//	 이번에는 "양수입니다." 아니면 "양수가 아닙니다." 처럼 문자열로 대답하고 싶음!!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// boolean result = num > 0;
		
		// System.out.println(num + "은(는) 양수입니까 : " + result);

		// String result = (num > 0) ? ("양수입니다.") : ("양수가 아닙니다.");
		
		// System.out.println(num + "은(는) : " + result);
	
		// System.out.println(num + "은(는)" + ((num > 0) ? ("양수입니다.") : ("양수가 아닙니다.")));
		// > 삼항 연산자가 산술 연산자보다 우선순위가 낮기 때문에 오류 발생함!!
		//	 삼항 연산식 부분을 소괄호로 묶어주면 된다!!
		
		String result = (num <= 0) ? ("양수가 아닙니다.") : ("양수입니다.");
		
		System.out.printf("%d는(은) %s\n", num, result);
		// > 결론적으로 같은 결과를 출력해주기는 하지만
		//	 조건식의 결과에 따라 true, false 결괴기 다르게 나오므로
		//	 : 을 기준으로 왼쪽과 오른쪽의 내용이 다를 수도 있다!!
		
	} // 메소드 영역 끝
	
	public void method2() { // 메소드 영역 시작
		
		// 사용자가 키보드로 입력한 정수값이
		// 짝수인지 홀수인지 판별 후 출력
		
		// 짝수일 경우 "짝수입니다.", 홀수일 경우에는 "홀수입니다" 로 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 결과를 담을 변수
		String result = ((num % 2) == 0) ? ("짝수입니다.") : ("홀수입니다.");
		
		System.out.printf("%d은(는) %s\n", num, result);
		
	} // 메소드 영역 끝
	
	
	public void method3() { // 메소드 영역 시작
	
		// 사용자로부터 키보드로 영문자 하나를 입력받아
		// 대문자인지 대문자가 아닌지를 판별 후 출력
		// 대문자일 경우 "대문자입니다.", 대문자가 아닐 경우는 "대문자가 아닙니다." 로 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 한 개 입력 : ");
		char ch = sc.nextLine().charAt(0);
		// > ch 에는 사용자가 입력한 문자가 담겨있음
		//	 'A', 'a', '!', '1', '김', ...
		
		// 결과를 담을 변수
		// String result = (65 <= ch && ch <= 90) ? ("대문자입니다.") : ("대문자가 아닙니다.");
		// > "아스키코드표" 참고 ('A' 는 65, 'Z' 는 90)
		//	 내부적으로 ch 가 int 로 자동형변환이 되면서 연산되는 꼴!!
		
		String result = ('A' <= ch && ch <= 'Z') ? ("대문자입니다.") : ("대문자가 아닙니다");
		// > 아스키코드표가 잘 안외워진다면 사실은 이렇게 문자끼리의 비교도 가능!!
		//	 내부적으로 int 로 변경되서 비교가 일어나게됨!!
		
		System.out.printf("%c은(는) %s\n", ch, result);
	
	} // 메소드 영역 끝
	
	// method1 보완
	public void method4() { // 메소드 영역 시작
		
		// 사용자로부터 정수 한개를 키보드로 입력받아
		// 그 정수가 양수인지 아닌지를 판별 후
		// 양수일 경우 "양수입니다." / 양수가 아닐 경우 "양수가 아닙니다." 라고 출력
		// > 이 세상의 모든 수는 3가지로 나눌 수 있다.
		//	 양수 / 0 / 유수
		
		// 사용자로부터 정수 한 개를 키보드로 입력받아
		// 그 정수가 양수일 경우 "양수입니다." / 0 일 경우 "0입니다." / 음수일 경우 "음수입니다." 로 출력
		// (경우의 수가 3개로 늘어남)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 결과를 담을 변수
		String result = (num > 0) ? ("양수입니다.") : ((num == 0) ? ("0입니다."): ("음수입니다."));
		
		System.out.printf(result);
		
		// > 삼항 연산자는 기본적으로 2가지의 경우의 수를 나타낼 수 있음 (true 일 경우와 false 일 경우)
		//	 단, 삼항 연산자를 "중첩" 해서 사용하면 3개 이상의 경우의 수 또한 나타낼 수 있게 된다!!
		
	} // 메소드 영역 끝
	
	// 연습문제 - method3 보완
	public void method5() { // 메소드 영역 시작
	
		// 사용자로부터 문자 한개를 입력받고
		// 그 문자가 대문자이면 "대문자입니다." / 소문자이면 "소문자입니다." / 그 외의 문자라면 "영문자가 아닙니다."
		// 로 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 한 개 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (('A' <= ch) && (ch <= 'Z')) ? ("대문자입니다.") : (
						(('a' <= ch) && (ch <= 'z')) ? ("소문자입니다.") : ("영문자가 아닙니다."));
		
		System.out.println(result);
		
	} // 메소드 영역 끝
	
} // 클래스 영역 끝


