package com.kh.chap03.branch;

import java.util.Scanner;

// break문
public class A_Break { // 클래스 영역 시작
	
	/*
	 * * break문
	 * > break문을 만나는 순간 "가장 가까운 반복문" 을 단 한겹 빠져나가는 역할
	 * 	 즉, 해당 break문이 속해있는 반복문 한 겹만 빠져나감
	 * 
	 * [ 표현법 ]
	 * for / while() { // 반복문
	 * 
	 * 			반복적으로 실행할 구문;
	 * 
	 * 			break; // 해당 반복문을 바로 빠져나감
	 * 				   // 반복 횟수가 몇번이 남아있든 간에
	 * } 
	 * 
	 * * 주의할 점
	 * > switch문의 break 와는 다른 개념임!!
	 * 	 switch문 안의 break; 는 해당 switch문을 빠져나가는 역할
	 * 	 오늘 배우는 분기문으로써의 break; 는 해당 반복문을 빠져나가는 역할
	 * > 구문은 똑같이 생겼지만, 결국 근본적인 역할 자체가 다르기 때문에
	 * 	 에초에 개념 자체가 다른 구문이다.
	 */
	
	public void method1() { // 메소드 영역 시작
		
		// 매번 반복적으로 새로이 발생되는 랜덤값 (1 ~ 100) 을 출력
		// 단, 그 발생된 랜덤값이 "홀수" 일 경우 반복문을 멈추기
		
		// > 매번 반복적으로 랜덤수가 발생 : 횟수가 정확하지 않음을 의미
		//	 언제 어떤 수가 나올지 예측이 불가능한 상황
		
		// > "매번" : 계속 진행하겠다 (무한반복을 돌리겠다)
		// 1. for(;;)
		// 2. while(true)
		
		while(true) {
			
			int random = (int)(Math.random() * 100 + 1);
			
			System.out.println("random : " +random);
			
			// 발생된 random 값이 홀수일 경우
			// > "프로그램이 종료됩니다" 라는 문자열을 출력 후 멈추기
			
			if((random % 2) == 1) {
				// 홀수일 경우
				
				System.out.println("프로그램이 종료합니다.");
				
				break; // while(true)를 빠져나감
			}	
		}
			
	} // 메소드 영역 끝
	
	public void method2() { // 메소드 영역 시작
		
		// 매번 반복적으로 사용자에게 문자열을 입력받은 후 해당 문자열의 길이를 출력
		// 단, 사용자가 입력한 문자열이 "exit" 와 일치하는 경우 반복을 종료 (글자수도 출력 X)
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			// "exit" 와 일치하지 않은 경우에는 글자수를 출력하고, 반복을 마저 진행
			// "exit" 와 일치하는 경우에는 글자수를 출력하지 않고, 반복을 종료
			// > "exit" 와 일치하는지 우선 판별
			if(str.equals("exit")) {
				// "exit" 와 일치한 경우
				
				System.out.println("프로그램이 종료됩니다");
				
				break;
				
			} 	
			
			System.out.println(str + " 의 글자수(길이) : " + str.length() + "자");	
			
		}
		
	} // 메소드 영역 끝
	
	public void method3() { // 메소드 영역 시작
		
		// 매번 반복적으로 사용자에게 양수를 입력받아 1 ~ 사용자가입력한수 까지 출력
		// 단, 30 이상의 숫자를 입력하면
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("양수 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			// 입력 받자마자 양수로 제대로 입력했는지부터 검사할 것!!
			if(0 < num) {
				// 양수일 경우
				// > 아까 미리 작성한 코드로 흐름 마저 진행
				
				// 입력받은 양수가 30 이상인지 먼저 검사
				if(30 <= num) {
					// 30 이상일 경우
					
					System.out.println("프로그램이 종료합니다.");
					
					break;
				} else {
					//30 미만일 경우
					
					// 1 ~ num 까지 출력
					for(int i = 1; i <= num; i++) {
					
						System.out.print(i + " ");
					}
					
					System.out.println();
				}
				
			} else {
				// 양수가 아닐 경우
				// > "다시 입력해 주세요" 를 출력
				
				System.out.println("잘못 입력했습니다. 다시 양수로 입력해 주세요.");
			}
		
		}
		
	} // 메소드 영역 끝
	
	// 반복문 실습문제 10
	public void method4() { // 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		while(true) {	
		
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			sc.nextLine();
		
			// 규칙 : 시작수는 num 끝수는 9 포함
			// 우선 2 ~ 9 사이의 숫자를 제대로 입력했는지부터 검사	
			if((2 <= num) && (num <= 9)) {
				// 2 ~ 9 사이의 숫자를 입력한 경우
				// > 구구단 출력 후 프로그램 종료
				
				// 규칙 : 시작수는 num, 끝수는 9 포함, 1씩 증가
				for(int i = num; i <= 9; i++) {
					
					// 해당 단의 제목 출력
					System.out.printf("===== %d단 =====\n", 1);
					
					// i 가 단수, i * 1, i * 2, i * 3, ..., i * 9
					for(int j = 1; j <= 9; j++) {
						System.out.printf("%d * %d = %d\n", i, j, (i * j));
					}
				}
				
				// 반복문 멈추기
				break;
			} else {
				// > 다시 입력을 유도
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}
		
		// > break문은 무한 반복문 안에서 특정 조건과 결합하여
		//	 해당 무한 반복문의 종료시점을 나타낼 때 주로 쓰인다!!
		
	} // 메소드 영역 끝
	
	
	// break문 사용 시 주의사함
	public void method5() { // 메소드 영역 시작
		
		int num = 1;
		
		while(true) {
			
			System.out.println("안녕하세요?");
			
			if(num == 1) {
				
				// System.out.println("프로그램이 종료됩니다");
				
				
				// break; // 반복문만 한 겹 빠져나감
				return; // 이 method5 자체를 빠져나감 (태초마을로 돌아감)
				
				// System.out.println("프로그램이 종료됩니다");
			}
		}
		
		// System.out.println("프로그램이 종료됩니다");
		// > Unreachable code
		//	 "도달할 수 없는" 코드
		// > 무한 반복 코드를 작성할 때 break; 문에 없을 경우 해당 반복문 아래의 코드로는 
		//	 흐름이 절대로 도달할 수 없음!!
		// > break; 또는 return; 구문을 이용할 때에도 흐름이 절대 도달할 수 없는 곳에
		//	 코드를 작성해도 Unreachable code 에러 발생
		
	} // 메소드 영역 끝
	
} // 클래스 영역 끝





