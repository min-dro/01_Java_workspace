package com.kh.chap03.branch;

// Continue
public class B_Continue { // 클래스 영역 시작
	
	/*
	 * * continue문
	 * > 반복문 안에서 사용하는 보조문
	 * 	 continue; 를 만나게 되면 그 뒤에 어떤 구문이 있든 간에
	 * 	 실행하지 않고 해당 반복문의 증감식 또는 조건식으로 바로 올라가는 역할을 해줌
	 * 
	 * [ 표현법 ] 
	 * for / while() {
	 * 
	 * 		반복적으로 실행할 코드1;
	 * 
	 * 	 	continue;
	 *		//  밑의 코드들은 무시하고 다음 증강식 또는 조건식으로 올라감
	 * 
	 * 		반복적으로 실행할 코드2
	 * 		...
	 * }
	 * 
	 * - for문의 경우 증감식으로, while문의 경우 조건식으로 올라감
	 * 
	 */
	
	public void method1() { // 메소드 영역 시작

		// 1부터 10 까지의 정수 중 " 홀수" 만을 출력
		
		// 방법2)
		// > i 값을 1 에서부터 2 씩 증가시켜서 홀수만 담기게끔 유도하는 방법
		
		// 방법3)
		// > 반복을 1 ~ 9 까지 매번 돌리면서 조건검사로 "홀수" 일 경우에만 출력되도록 하는 방법
		/*
		for(int i = 1; i <= 9; i++) {
			if((i % 2) == 1) {
				// 홀수일 경우
				
				System.out.print(i + " ");
			}
		}
		*/
		// > continue문 이 없어도 충분히 풀수 있는 문제임!!
		
		// 방법4)
		//  > continue문 을 이용하는 방법도 있음
		for(int i = 1; i <= 9; i++) {
			
			if((i % 2) == 0) {
				// 짝수일 경우
				
				continue;
				// > 짝수일 경우에는 아래의 출력문을 실행하지 않고
				//	 다음 증감식으로 올라가겠다!! (다음 반복 회차로 진행하겠다)
			}
			
			System.out.print(i + " ");
			
		}
		
	} // 메소드 영역 끝

	public void method2() { // 메소드 영역 시작
		
		// 1 부터 100 까지의 정수의 총 합계 구하기
		// 단, 6의 배수값은 빼고 더해보기
		
		// 6의 배수값 : 6, 12, 18, 24, 30, 36, ...
		
		// 총 합계를 담아둘 변수 셋팅
		int sum = 0;
		
		// > 규칙 : 시작수는  1, 끌수는 100 포함, 1씩증가
		
		// 방법1) continue문 없이 풀기
		/*
		for(int i = 1; i <= 100; i++) {
			
			if(i % 6 != 0) {
				// 6의 배수가 아닐 경우
				// > 덧셈 진행
				
				sum = sum + i;
			}
		}
		*/
		
		// 방법2) continue문을 사용해서 풀기
		for(int i = 1; i <= 100; i++) {
			
			if((i % 6) == 0) {
				// 6의 배수일 경우
				
				continue;
			}
			
			sum = sum + i;
		}
		
		System.out.println("sum : " + sum);
		
	} // 메소드 영역 끝
	
	public void method3() { // 메소드 영역 시작
		
		// 2 ~ 9 단 모두 출력하되, 4의 배수단은 제외하고 출력 (4단, 8단은 건너뛰겠다)
		
		// 방법1) continue문 없이 풀기
		/*
		for(int i = 2; i <= 9; i++) {
			
			if(i % 4 != 0) {
				// 4의 배수가 "아닐 경우"
				// > 해당 단들 출력
				
				System.out.printf("--- %d단 --- \n", i);
				
				for(int j = 1; j <= 9; j++) {
					
					System.out.printf("%d X %d = %d\n", i, j, (i * j));
				}
			}
		}
		*/
		
		// 방법2) continue문을 사용해서 풀기
		
		for(int i = 2; i <= 9; i++) {
			
			if((i % 4) == 0) {
				// 4의 "배수일 경우"
				
				continue;
			}
			
			System.out.printf("--- %d단 --- \n", i);
			
			for(int j = 1; j <= 9; j++) {
				
				System.out.printf("%d X %d = %d\n", i, j, (i * j));
			}
		}
		// > continue문은 필수가 아님!!
		//	 상황에 따라 continue문을 반드시 사용할 필요는 겂다!!
		// > continue문이 있을경우와 없을경우는 조건식의 내용이 반대로 뒤집힌다고 보면 됨!!
		
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
