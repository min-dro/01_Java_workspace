package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice { // 클래스 영역 시작

	public void practice1() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 9:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default :
			System.out.println("잘못 입력했습니다.");
		}
		
	} // 메소드 영역 끝
	
	public void practice2() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한개 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
			if((num % 2) == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
	} // 메소드 영역 끝
	
	public void practice3() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		sc.nextLine();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		sc.nextLine();
		
		int total = (kor + math + eng);
		double avg = (total / 3);
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg > 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("불합격입니다.");
		}
		
	} // 메소드 영역 끝
	
	public void practice4() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1, 2, 12:
			System.out.println(num + "월은 겨울입니다.");
			break;
		case 3, 4, 5:
			System.out.println(num + "월은 봄입니다.");
			break;
		case 6, 7, 8:
			System.out.println(num + "월은 여름입니다.");
			break;
		case 9, 10, 11:
			System.out.println(num + "월은 가을입니다.");
			break;
		default :
			System.out.println(num + "월은 잘못 입력된 달입니다.");
		}
		
	} // 메소드 영역 끝
	
	public void practice5() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		String idanswer = "gahyun";
		String pwanswer = "1234";
		
		if(id.equals(idanswer)) {
			if(pw.equals(pwanswer)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
	} // 메소드 영역 끝
	
	public void practice6() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String rank = sc.nextLine();
		
		switch(rank) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리");
		case "회원":
			System.out.println("게시글 작성, 댓글 작성");
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default :
			System.out.println("잘못 입력했습니다.");
		}
		
	} // 메소드 영역 끝
	
	public void practice7() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해주세요 : ");
		double m = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double kg = sc.nextDouble();
		sc.nextLine();
		
		double bmi = kg / (m * m);
		
		System.out.println("BMI 지수 : "+  bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		} else if (bmi >= 30) {
			System.out.println("고도 비만");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
	} // 메소드 영역 끝
	
	public void practice8() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("피연산자 1 입력 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("피연산자 2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+, -, *, /, %) : ");
		char op = sc.nextLine().charAt(0);
		if (num1 > 0 && num2 > 0) {
			switch(op) {
			case '+':
				System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 + num2));
				break;
			case '-':
				System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 - num2));
				break;
			case '*':
				System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 * num2));
				break;
			case '/':
				System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 / num2));
				break;
			case '%':
				System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 % num2));
				break;
			default :
				System.out.println("잘못 입력했습니다. 프로그램이 종료됩니다.");
			}
		} else {
			System.out.println("잘못 입력했습니다. 프로그램이 종료됩니다.");
		}
	} // 메소드 영역 끝
	
	public void practice9() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		
		System.out.print("선택 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		default :
			System.out.println("잘못 입력했습니다.");
		}
		
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
