package com.kh.chap01.condition;

import java.util.Scanner;

// switch 문
public class C_Switch { // 클래스 영역 시작

	/*
	 * * switch문
	 * > 기존의 if문 계열은 대놓고 "조건식" 을 직접 기술하여 선택적인 흐름을 만들어 내는 조건문이였다면,
	 * 	 switch문 같은 경우는 직접 "조건식" 을 기술하지 않고도 선택적인 흐름을 만들어 낼 수 있는 조건문임
	 * > "조건식" 을 쓰지 않고도 어떻게 선택적인 흐름을 만들어 내냐면
	 * 	 내부적으로 내자 어떤 값을 제시했을 때 그 값과의 "동등비교" 를 수행하게됨 (x == x)
	 * 
	 * * switch문과 if문 계열의 차이점
	 * if(조건식) : 조건식을 내가 직접 기술, 복잡한 조건식을 내맘대로 기술 사능, 범위 제시 가능
	 * switch(조건식X) : 조건식을 제시할 수 없음, 하지만 내부적으로 조건검가사 일어남
	 * 					 (확실한 값에 대한 조건, 즉 "동등비교" 가 일어나는 원리)
	 * 
	 * [ 표현법 ]
	 * switch(동등비교를할대상자) {
	 * 
	 * case 값1 : // 내부적으로 동등비교를할대상자 == 값1
	 * 			  실행할코드1; // 해당 동등비교 결과가 true 라면 실행됨
	 * 			  break; // 이 switch 중괄호 영역 ({여기}) 자체를 빠져나가겠다.
	 * 
	 * case 값2 : // 내부적으로 동등비교를할대상자 == 값2
	 * 			 실행할코드2; // 해당 동등비교 결과가 true 라면 실행됨
	 * 			 break; // 이 switch문 자체를 빠져나가게됨
	 * 
	 * ...
	 * 
	 * case 값n : 
	 * 			실행할코드n;
	 * 			break;
	 * 
	 * default :
	 * 			실행할코드;
	 * 			// 위의 값1 ~ 값n 까지 일치하는 값이 하나도 없다면 (일치하는 값을 찾지 못했다면)
	 * 			// default 구문이 실행됨!! (기존의 else 블록이랑 같은 역할임)
	 *			// break;
	 *			//  > default 는 어차피 switch 블록의 가장 마지막 부분이기 때문에
	 *			// 자연스럽게 구문 실행 후 switch 를 빠져나가기 때문에 굳이 break;를 적지 않는다!!
	 *}
	 */
	
	public void method1() { // 메소드 영역 시작
		
		// 1 ~ 3 사이의 정수값을 입력받아
		// 1 인 경우 "빨간불입니다" 출력
		// 2 인 경우 "파란불입니다" 출력
		// 3 인 경우 "초록불입니다" 출력
		// 그 외의 숫자를 입력한 경우 "잘못 입력했습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 3 사이의 정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// if문의 계열 버전
		/*
		if(num == 1) {
			// 첫번째 경우 : 1 을 입력한 경우
			
			System.out.println("빨간불입니다");
		} else if(num == 2) {
			// 두번째 경우 : 2 를 입력한 경우
			 
			System.out.println("파란불입니다");
			
		} else if(num == 3) {
			// 세번째 경우 : 3 을 입력한 경우
		 	
			System.out.println("초록불입니다");
			
		} else {
			// 네번째 경우 : 그 외의 숫자를 입력한 경우
			
			System.out.println("잘못 입력했습니다");
		 */
		
		// switch문 버전
		/*
		switch(num) {
		case 1 : // 내부적으로 num == 1 동등비교를 수행
			System.out.println("빨간불입니다"); // true 라면 실행할 코드
			break; // switch문을 빠져나가겠다
		case 2 : // num == 2
			System.out.println("파란불입니다");
			break;
		case 3 : // num == 3
			System.out.println("초록불입니다");
			break;
		default : // num 이 1 도 아니고, 2 도 아니고, 3 도 아닐 경우
			System.out.println("잘못 입력했습니다");
			// break; // 써도 그만 안써도 그만
		}
		 */
		
		// 판별 결과를 담아 둘 변수 먼저 셋팅
		String result = ""; // 빈 문자열로 셋팅함
		
		switch(num) {
		case 1 : // num == 1
			result = "빨간불";
			break;
		case 2 : // num == 2
			result = "파란불";
			break;
		case 3 : // num == 3
			result = "초록불";
			break;
		default :
			System.out.println("잘못 입력했습니다");
			// > 1, 2, 3 을 입력한 경우 정상 동작!!
			//	 그 외의 숫자를 입력한 경우 default 에서 "잘못 입력했습니다"출력 후 "입니다" 도 같이 출력됨!!
			//	 이 경우 "입니다" 는 출력되지 않도록 막아줘야함!!
			return;
			// > return문은 현재 실행중인 이 메소드 자체를 빠져나가는 역할
			// 	 이 메소드를 호출했던 태초마을로 흐름이 돌아가는 구문임!!
		}
		
		// 이 시점 기준으로 판별 결과를 가지고 단 한번 출력문을 작성
		System.out.println(result + "입니다");
		
	} // 메소드 영역 끝
	
	public void method2() { // 메소드 영역 시작
		
		// 사용자에게 구매할 과일명을 입력받아
		// 각 과일마다의 가격을 출력
		// > 사과 (1000원), 바나나 (2000원), 복숭아 (5000원)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- Welcome 과일가게 -----");
		
		System.out.print("구매할 과일 (사과, 바나나, 복숭아) 입력 : ");
		String fruit = sc.nextLine();
		
		// if문 계열 버전
		/*
		if(fruit == "사과") {
			// 첫번째 경우 " : "사과"를 입력한 경우
			 
			System.out.println("1000원입니다");
			
		} else if(fruit == "바나나") {
			// 두번째 경우 : "바나나" 를 입력한 경우
			
			System.out.println("2000원입니다");
			
		} else if(fruit == "복숭아") {
			// 세번째 경우 : "복숭아" 를 입력한 경우
			
			System.out.println("5000원입니다");
			
		} else {
			// 네번째 경우 : 그 외의 과일명을 입력한 경우
			
			System.out.println("저희 가게에서 판매하는 과일이 아닙니다.");
		}
		*/
		
		// > 과일명을 제대로 입력했음에도 불구하고 == 으로 과일명 동등비교가 제대로 안되고 있음!!
		//	 (계속 else 로만 빠지고 있음)
		// 왜? String (문자열) 의 경우 "참조자료형" 이기 때문에
		// == 으로 동등비교를 할 때 문자열의 내용이 아니라 "주소값" 기준으로 동등비교가 일어나게 된다!!
		
		// 참고) 기본자료형은 메모리의 stack 영역에 값에 곧바로 담김
		// boolean, byte, short, int, lone, float, double, char
		//		참조자료형은 메모리의 heap 영역에 값이 담겨있고,
		//		메모리의 stack 영역에는 그 값이 담겨있는 heap 영역의 주소자룰 담아두는 개념
		// > String
		
		// 해결방법)
		// 문자열의 "내용물" 을 기준으로 동등비교를 하고싶다면?
		// .equals 라는 메소드를 이용하면 가능!!
		// [ 표현법 ]
		// 문자열.equals("동등비교문자열");
		// > 문자열의 내용물이 일치하면 true, 일치하지 않으면 false 를 돌려줌
		
		// if문 계열 버전 다시
		/*
		if(fruit.equals("사과")) {
			// "사과" 를 입력한 경우
			
			System.out.println("1000원입니다");
			
		} else if(fruit.equals("바나나")) {
			// "바나나" 를 입력한 경우
			
			System.out.println("2000원입니다");
			
		} else if(fruit.equals("복숭아")) {
			// "복숭이" 를 입력한 경우
			 
			System.out.println("5000원입니다");
			
		} else {
			// 그 외의 과일명을 입력한 경우
			 
			System.out.println("저희 가게에서 판매하는 과일이 아닙니다.");
		}
		*/
		
		// switch문 버전
		switch(fruit) {
		case "사과" : // fruit.equals("사과")
			System.out.println("1000원입니다");
			break;
		case "바나나" : // fruit.equals("바나나")
			System.out.println("2000원입니다");
			break;
		case "복숭아" : // fruit.equals("복숭아")
			System.out.println("5000원입니다");
			break;
		default :
			System.out.println("저희 가게에서 판매하는 과일이 아닙니다.");
		}
		// > switch문에서 문자열을 제시하면
		//	 내부적으로 equals 메소드를 통해 내용물을 기준으로 알아서 동등비교를 해줌!! 
		
	} // 메소드 영역 끝
	
	// 특이케이스 - break 를 생략하는 경우
	public void method3() { // 메소드 영역 시작
	
		// 사용자로부터 키보드로 등급을 입력받아
		// 해당 등급별로 권한 출력하기
		// 1등급 : 관리권한, 쓰기권한, 읽기권한
		// 2등급 : 쓰기권한, 읽기권한
		// 3등급 : 읽기권한
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급을 입력하세요 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		// switch문 버전
		switch(grade) {
		case 1 : // grade == 1
			System.out.println("관리권한 부여");
			// System.out.println("쓰기권한 부여");
			// System.out.println("읽기권한 부여");
			// break;
		case 2 : // grade == 2
			System.out.println("쓰기권한 부여");
			// System.out.println("읽기권한 부여");
			// break;
		case 3 : // grade == 3
			System.out.println("읽기권한 부여");
		}
		// > switch문은 case 마다 동등비교하며 일치하는 경우를 (값을) 찾고,
		// 	 일치하면 그 case 문 아래의 코드를 위레서부터 한줄씩 실행하면서 내려감!!
		//	 break; 를 만날때까지!!
		
	} // 메소드 영역 끝
	
	public void method4() { // 메소드 영역 시작
		
		System.out.println("1. 입력메뉴");
		System.out.println("2. 수정메뉴");
		System.out.println("3. 조회메뉴");
		System.out.println("4. 삭제메뉴");
		System.out.println("9. 종료메뉴");
		
		// 사용자로부터 키보드로 메뉴 번호를 입력받고, 각 메뉴 번호에 맞게 "xx메뉴입니다" 출력
		// 9 를 입력하는 경우 "프로그램이 종료됩니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		/*
		switch(menu) {
		case 1 : // menu == 1
			System.out.println("입력메뉴입니다");
			break;
		case 2 : // menu == 2
			System.out.println("수정메뉴입니다");
			break;
		case 3 : // menu == 3
			System.out.println("조회메뉴입니다");
			break;
		case 4 : // menu == 4
			System.out.println("삭제메뉴입니다");
			break;
		case 9 : // menu == 9
			System.out.println("프로그램이 종료됩니다");
			break;
		default:
			System.out.ptintln("잘못 입력했습니다");
		}
		*/
		
		// 반복되는 출력문을 줄이고 싶다!!
		
		// 결과를 담을 변수 먼저 셋팅
		String result = "";
		
		switch(menu) {
		case 1 :
			result = "입력";
			break;
		case 2 :
			result = "수정";
			break;
		case 3 :
			result = "조회";
			break;
		case 4 :
			result = "삭제";
			break;
		case 9 :
			System.out.println("프로그램이 종료됩니다");
			return;
		default : 
			System.out.println("잘못 입력했습니다");
			return;
		}
		
		// 이 시점 기준으로 result 에 결과 문자열이 잘 담겨있음!!
		System.out.println(result + "메뉴입니다");
		
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
