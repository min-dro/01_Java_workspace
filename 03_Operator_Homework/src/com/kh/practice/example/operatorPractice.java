package com.kh.practice.example;

import java.util.Scanner;

public class operatorPractice { // 클래스 영역 시작

	public void practice1() { // 메소드 영역 시작
 		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		String result = (num > 0) ? ("양수다") : ("양수가 아니다");
		System.out.println(result);
		
	} // 메소드 영역 끝
	
	public void practice2() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		String result = (num > 0) ? ("양수다") : ((num == 0) ? "0이다" : "음수다");
		System.out.println(result);
		
	} // 메소드 영역 끝
	
	public void practice3() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		String result = ((num % 2) == 0) ? ("짝수다") : ("홀수다");
		System.out.println(result);
		
	} // 메소드 영역 끝
	
	public void practice4() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		System.out.println("1인당 사탕 개수 : " + (candy / person));
		System.out.println("남믄 사탕 개수 : " + (candy % person));
		
	} // 메소드 영역 끝
	
	public void practice5() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("반(숫자만) : ");
		int group = sc.nextInt();
		sc.nextLine();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		sc.nextLine();
		
		String result = (gender == 'M') ? ("남학생") : ("여학생") ; 
		
		System.out.println();
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade, group, num, name, result, score);
		
	} // 메소드 영역 끝
	
	public void practice6() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		String result = (age <= 13) ? "어린이" : (age > 13 && age <= 19 ? "청소년" : "성인"); 
		
		System.out.println();
		System.out.println(result);
		
	} // 메소드 영역 끝
	
	public void practice7() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		sc.nextLine();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		sc.nextLine();
		
		int total = (kor + eng + math) ; 
		double avg = (total/3.0);
		
		String pass = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격";
		
		System.out.println();
		System.out.println(pass);
		
	} // 메소드 영역 끝
	
	public void practice8() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String personId = sc.nextLine();
		
		char gender = personId.charAt(7);
		
		String result = ((gender == '1') || (gender == '3')) ? "남자" : ((gender == '2') || (gender == '4') ? "여자" : "잘못 입력했습니다."); 
		
		System.out.println();
		System.out.println(result);
		
	} // 메소드 영역 끝
	
	public void practice9() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
									
		boolean result = (num <= num1) || (num > num2);
		
		System.out.println();
		System.out.println(num1 < num2 ? result : "정수1은 정수2보다 작아야합니다.");
		
	} // 메소드 영역 끝
	
	public void practice10() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		sc.nextLine();

		boolean result = (num1 == num2) && (num2 == num3); 
		
		System.out.println();
		System.out.println(result);
		
	} // 메소드 영역 끝
	
	public void practice11() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		sc.nextLine();
		
		double aIncentive = 0.4;
		double cIncentive = 0.15;
		
		double aSalary = (aIncentive * a) + a;
		double bSalary = b;
		double cSalary = (cIncentive * c) + c; 
		
		String aResult = aSalary >= 3000  ? "3000 이상" : "3000 미만" ;
		String bResult = aSalary >= 3000  ? "3000 이상" : "3000 미만" ;
		String cResult = aSalary >= 3000  ? "3000 이상" : "3000 미만" ;
		
		System.out.println();
		System.out.println("A사원의 인센티브포함 연봉 : " + aSalary);
		System.out.println(aResult);
		System.out.println("B사원 인센티브포함 연봉 : " + bSalary);
		System.out.println(bResult);
		System.out.println("C사원 인센티브포함 연봉 : " + cSalary);
		System.out.println(cResult);
		
	} // 메소드 영역 끝
} // 클래스 영역 끝
