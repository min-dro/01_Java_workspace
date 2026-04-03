package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

// 배열
public class A_Array { // 클래스 영역 시작

	/*
	 * * 변수
	 * > "해당 자료형의 값 단 하나만" 을 담을 수 있는 개념
	 * 예)
	 * int a = 10;
	 * a = 20;
	 * // a 라는 상자에 10 과 20 이 다 들어있는 개념이 아님
	 * // a 라는 상자에 원래 10이 담겨있었는데 20으로 바꿔주겠다.
	 * 
	 * * 배열
	 * > "해당 자료형의 값 여러개" 를 담을 수 있는 개념
	 * 	 (즉, 같은 자료형의 변수 상자가 여러개 한 묶음으로 묶여있는 느낌)
	 * 예)
	 * int[] arr = new int[3]; // [0] [1] [2]
	 * // int 자료형의 값 3개가 들어갈 수 있는 배열을 만들겠다. (int 변수 상자 3개를 묶겠다)
	 * 	  [0], [1], [2] 빈 방을 만든 것
	 * 	  (우리는 이 방 번호를 "인덱스" 라고 부름, 0부터 시작)
	 * arr[0] = 1;
	 * arr[1] = 5;
	 * arr[2] = 10;
	 * 
	 * * 자바의 인덱스 개념
	 * > 문자열, 배열에도 존재 (순번)
	 * 문자열의 길이 == 5, 마지막 인덱스 == 4 (01234)
	 * 배열의 크기 == 3, 마지막 인덱스 == 2 (012)
	 * 
	 * 인덱스 개념은
	 * 항상 크기 == n, 마지막 인덱스 == n - 1
	 * 
	 * 그래서
	 * 보통 for문을 n 번 반복 돌리고 싶을 때
	 * for(int i = 0; i < n; 1++) 이 공식이 생겨난것!!
	 * 결국 i 는 i < n 까지만 반복이 돌기 때문에 i 가 n - 1 일 때 까지만 반복이 돌 것!!
	 * (0 ~ 
	 */
	
	// 배열을 왜 써야 할까?
	public void method1() { // 메소드 영역 시작
		
		// 변수만을 가지고 프로그래밍을 한다면..
		// 0, 1, 2, 3, 4 이 다섯개의 정수를 기록해야함
		/*
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		// > 내가 기록하고 싶은 데이터의 갯수 만큼 변수를 만들어야함
		
		// 출력할 때는? 반복문 사용이 절대 불가!!
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
//		System.out.println(num5);
		// > 반복문을 왠지 써보고 싶음!!
		
		for(int i = 1; i <= 5; i++) {
			
			// System.out.println(numi);
			// > i 자리에 값이 들어가면서 변수명이 자동으로 완성되지 않음!!
			//	 오히려 numi 를 통짜로 변수명으로 보고 있음!! (numi 라는 변수가 없다고 오류)
			
			System.out.println("num" + i);
			// > "num" 문자열에 i 가 붙으면서 변수명을 지칭하는게 아니라
			//	 오히려 num1, num2, .. 처럼 문자열이 이어지면서 출력되고 있음!! (원하는대로 동작하지 않음)
		}
		// 5개의 변수값의 총합을 구할 때에는?
		// int sum = num1 + num2 + num3 + num4 + num5;
		// > 반복문을 써보고 싶음
		
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			
			// sum = sum + numi;
			// sum = sum + "num" + i
			// > 위와 마찬가지의 이유로 반복 사용 불가
		}
		*/
		// > 만약 필요한 변수의 갯수가 더 늘어난다면? 개발자인 나만 힘들어짐!!
		
		// 그래서 나온거 "배열" 임
		// 배열을 가지고 프로그래밍 하기
		
		// 정수 0, 1, 2, 3, 4, 다섯개의 값을 기록해야됨
		
		/*
		 * * 배열 사용법
		 * 
		 * 1. 배열 선언
		 * 
		 * [ 표현법 ] => 두 가지 표현법이 있다!!
		 * 자료형[] 배열형; // 이 표현법을 많이들 쓰긴 함!!
		 * 자료형 배열형[];
		 */
		
		// 변수 선언
		// int a;
		
		// 배열 선언
		int[] arr;
		// int arr2[];
		// > 배열 선언 시 같은 영역 내에서는 이름이 중복될 수 없음!!
		
		/*
		 * 2. 배열 할당 ***
		 * > 이 배열 한 묶음에 몇개의 값들을 보관할 건지
		 * 	 이 배열의 "크기 (사이즈)" 를 지정해주는 과정
		 * > 즉, 몇칸짜리 배열오 만들거냐 를 지정하는 부분
		 * > 내가 지정한 갯수만큼 값아 들어갈 방이 만들어짐!!
		 * 
		 * [ 표현법 ]
		 * 배열병 = new 자료형[배열크기];
		 */
		
		arr = new int[5];
		
		// 여기까지 배열의 "선언" 후 "할당" 과정까지 거쳐짐!!
		// > 이제서야 비로소 배열을 쓸 준비가 완료된것!!
		
		// 변수때도 선언과 동시에 초기화를 한번에 할 수 있었듯이,
		// 배열도 마찬가지로 선언과 동시에 할당까지 한번에 가능하다!!
		
		// 변수의 선언과 동시에 초기화
		// int a = 10;
		
		// 배열의 선언과 동시에 할당
		// [ 표현법 ]
		// 자료형[] 배열명 = new 자료형[크기];
		// 자료형 배열명[] = new 자료형[크기];
		
		// int[] arr = new int[5];
		// > 선언때의 자료형과 할당때의 자료형이 일치해야함!! (= 기준으로 양쪽 타입 같아야함)
		
		/*
		 * 3. 배열의 각 인덱스 자리에 값 대입 (보관)
		 * 
		 * [ 표현법 ] 
		 * 배열명[인덱스] = 값;
		 */
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		
		// 배열의 가장 큰 장점: 반복문을 활용할 수 있다!!
		// > 심지어 각 인덱스 자리에 값을 대입할 때도 사용할 수 있음!!
		
		// 규칙 : 시작수가 0, 끝수가 4 포함, 1씩 증가
		for(int i = 0; i <= 4; i++) {
			
			arr[i] = i;
		}
		
		// 배열의 내용들을 출력
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		// 마찬가지로 반복문을 이용해서 출력해보기
		for(int i = 0; i < 5; i++) {
			
			System.out.println(arr[i]);
		}
		// > 결국 반복문의 조건식의 반복 횟수가 배열의 크기가 되는 것임!!
		
		System.out.println(arr); // [I@5fdba6f9
		// > 배열명을 그럼 곧바로 출력하면? 뭔가 외계어 같은게 출력되고 있음!!
		
		// 항상 배열을 쓸 경우에는 배열명[인덱스] 를 붙여서 함께 써야 한다!!
		
	} // 메소드 영역 끝
	
	// 위에서 화인한 외계어같은게 뭐지?
	public void method2() { // 메소드 영역 시작
		
		// int 일반 변수
		int i = 10;
		
		// int 배열 (선언과 동시에 초기화)
		 int[] iArr = new int[5]; // [0] [1] [2] [3] [4]
		 
		 System.out.println("i : " + i); // 10
		 System.out.println("iArr : " + iArr); // 외계어 같은거
		 
		 // double 일반 변수
		 double d = 10.0;
		 
		 // double 배열 (선언과 동시에 초기화)
		 double[] dArr = new double[3]; // [0] [1] [2]
		
		 System.out.println("d : " + d); // 10.0
		 System.out.println("dArr : " + dArr); // 외계어 같은거
		 
		 // > 어느 타입의 배열이든 간데
		 //	  배열명만 출력하면 이상한 외계어 같은게 나오는건 마찬가지임!!
		 // > 이때 그 외계어 같은게	 "주소값" 임!!
		 
		 // 이유 : 사실 배열은 "참조자료형 변수 "이기 때문에
		 // 	   실제 해당 배열명 변수에 담긴 "주소값" 이 나오기 때문
		 
		 // 배열의 주소값 모약
		 // [ : 배열임을 나타냄
		 // D : double 타입 배열임을 나타냄
		 // + @16진수
		 
		 // 주소값과 관련된 유용한 메소드
		 System.out.println(iArr.hashCode()); // 1484531981
		 // [I@587c290d --> 1484531981
		 System.out.println(dArr.hashCode()); // 1514160588
		 // [D@5a4041cc --> 1514160588
		 
		 // > hashCode() : 해당 변수에 담긴 주고값을 "십진수"의 형태로 나타내주는 메소드
		 //	  (주소값을 십진수의 형태로 나타낸 것을 "해시코드" 라고 한다.)
		 
		 /*
		  * * 기본자료형
		  * boolean, byte, short, int, long, float, double, char
		  * > 실제 값을 바로 담을 수 있는 변수 (즉, 일반 변수)
		  * 
		  * * 참조자료형 (갯수를 셀 수 없이 많음)
		  * String, int[], double[] char[], boolean[], ..., A_Array, Scanner, ...
		  * > 실제 값은 메모리 공간 어딘가에 따로 담겨 있고,
		  *   그 실제 값이 담긴 곳의 "주소값" 을 담고 있는 변수 (즉, 참조 변수, 레퍼런스 변수)
		  * > 표면상의 사이즈는 4byte (주소값이 담김)
		  */
		 
	} // 메소드 영역 끝
	
	// 배열과 반복문
	public void method3() { // 메소드 영역 시작
		
		int[] iArr = new int[3]; // [0] [1] [2]
		double[] dArr = new double[3]; // [0] [1] [2]
		
		// iArr 배열의 각 방에 들은 데이터를 출력하고 싶다.
		/*
		System.out.println(iArr[0]);
		System.out.println(iArr[1]);
		System.out.println(iArr[2]);
		*/
		
		// 배열을 출력할 때 반복문을 쓰면 더 편리하다.
		// > 0번 인덱스에서 부터 마지막 인덱스까지 순차적으로 출력할 수 있다.
		//	 마지막 인덱스 == 배열의 크기 - 1
		//	 반복 횟수 : 배열의 크기만큼
		
		// i : 0 1 2 (반복이 돔) / 3 (빠져나옴)
		/*
		for(int i = 0; i < 3; i++) {
			
			System.out.println(iArr[i]);
		}
		*/
		
		// * 배열을 크기를 알아내는 방법
		// [ 표현법 ]
		// 배열명.length;
		// - length 뒤에 () 가 붙지 않음!! (즉, 메소드 호출이 아니라는 뜻)
		
		// 참고) 문자열의 길이를 알고 싶을 때 : 문자열.length();
		
		String str = "Hello World!!";
		System.out.println(str.length()); // 13
		
		System.out.println("iArr의 크기 : " + iArr.length); // 3
		System.out.println("dArr의 크기 : " + dArr.length); // 3
		
		for(int i = 0; i < iArr.length; i++) {
		
			System.out.println(iArr[i]);
		}
		
		// dArr 도 마저 출력
		for(int i = 0; i < dArr.length; i++) {
			
			System.out.println(dArr[i]);
		}
		
		// > 배열에 반복문을 적용할 때에는 주로 조건식에 대놓고 배열의 크기를 숫자로 적지 않고
		//	 배열명.length 로 유연하게 배열의 크기를 갖고 론 다음에 바로 조건식에 적용해서 쓴다!!
	
		/*
		 * * 각 배열의 인덱스에 값을 한번도 직접 대입한 적이 없음에도 불구하고
		 * iArr 배열의 각 인덱스에는 0, dArr 배열의 각 인덱스에는 0.0 이 당겨서 출력되고 있음!!
		 * 
		 * 왜? 메모리의 Stack 영역에 만들어진 공간은 비어있는 상태로 둘 수 있지만,
		 * 메모리의 Heap 영역에 만들어진 공간은 절대로 빈 상태로 존재할 수 없음!!
		 * 
		 * 우리는 위에서 배열 선언과 동시에 할당을 했고
		 * (이 사이에 알게모르게 배열의 각 인덱스에 0, 0.0 이라는 값들이 대입이 된 꼴!!)
		 * 각 인덱스에 담겨있는 값을 출력했음
		 * 
		 * 할당 후 각 인덱스에 대입하는 구문이 없다면
		 * JVM 이 임의의 값 (타입 별 기본값) 으로 초기화를 알아서 해줌!!
		 * 
		 * * 자바 변수 타입에 따른 기본값
		 * byte, short, int, long : 0
		 * float, double : 0.0
		 * char : ' '
		 * boolean : false
		 * String : null (주소값이 없음을 나타내는 값)
		 * 기타 다른 참조자료형들도 마찬가지로 기본값은 null 임!!
		 */

		
	} // 메소드 영역 끝
	
	public void method4() { // 메소드 영역 시작
		
		int[] arr = new int[5]; // [0] [1] [2] [3] [4]
								//  0   0   0   0   0 (기본값으로 셋팅)
		
		// 내가 원하는 값들로 대입
		/*
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		*/
		
		// 반복문을 이용해서 위의 대입 구문들 실행
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = i + 1;
		}
		// > 이 시점 기준으로 내가 원하는 값들로 채워져있음!!
		
		// 값 출력을 위한 for문
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		// * 배열의 잘못된 인덱스 범위에 접근한 경우
		// System.out.println(arr[10]);
		// > ArrayIndexOutOfBoundsException 오류 발생!!
		//	 (Index 10 out of bounds for length 5)
		// 배열의 크기는 5 인데 왜 범위를 벗어난 인덱스인 10 에 접근하고 있어?
		
		// * 문자열의 잘못된 인덱스 범위에 접근한 경우
		// String str = "abc";
		// System.out.println(str.charAt(10));
		// > ArrayIndexOutOfBoundsException 오류 발생!!
		//	 (Index 10 out of bounds for length 5)
		// 배열의 크기는 5 인데 왜 범위를 벗어난 인덱스인 10 에 접근하고 있어?
		
		// 배열이든 문자열이든 간에, 반복문을 돌리든 안돌리든 간에
		// 항상 그 크기를 벗어난 인덱스 범위에 접근할 수 없음!!
		// 항상 그 인덱스 범위에 맞게 접근해야함!!
		
		// arr 배열의 모든 방에 들은 데이터의 총 합을 구하기
		// int sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		
		/*
		 * int sum = 0;
		 * 
		 * sum = sum + arr[0];
		 * sum = sum + arr[1];
		 * sum = sum + arr[2];
		 * sum = sum + arr[3];
		 * sum = sum + arr[4];
		 */

		int sum = 0;
		
		// 값 누적합을 위한 for문
		for(int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i]; // sum += arr[i];
		}
		
		System.out.println("총 합계 : " + sum); // 15
		
		// ---
		System.out.println(arr); // 주소값
		System.out.println(arr.hashCode()); // 주소값 십진수로
		System.out.println(arr.length); // 배열의 크기
		
	} // 메소드 영역 끝
	
	// 연습문제
	public void method5() { // 메소드 영역 시작
		
		// 10 칸짜리 정수형 int 배열을 만들고,
		// 배열의 각 인덱스에 랜덤한 수를 담아 출력해보기 (랜덤수의 범위는 51 ~ 100)
		// 출력 형식 : "arr[x] : xx"
	
		// 10 칸짜리 정수형 배열 만들기
		int arr[] = new int[10]; // [0] ~ [9] (각 방에는 0 이 담겨있음)
		
		// [0] ~ [9] 까지 각 방에 반복을 돌려가며 51 ~ 100 사이의 랜덤값 을 넣어보기
		// > 배열에 반복문을 돌릴 때에는 항상 "인덱스" 를 기준으로 규칙을 찾는다!!
		
		// 규칙 : 시작수는 0, 끝수는 9 포함, 1씩 증가
		for(int i = 0; i < arr.length; i++) { 
			
			arr[i] = (int)(Math.random() * 50 + 51);
			
		}
		
		// 이 시점 기준으로 각 인덱스 방에는 랜덤수가 잘 들어가 있을 것임!!
		
		// 출력 ("arr[x] : xx")
		// > 출력용 for문 작성하기
		for(int i = 0; i < arr.length; i++) {
			
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
		
		
		
	} // 메소드 영역 끝
	
	// 연습 문제
	public void method6() { // 메소드 영역 시작
		
		// 3명의 사용자에게 키의 정보를 입력받아 배열에 담아두고, 3명의 키를 정보를 각각 출력
		// 또한 3명의 키의 총 합계, 평균 까지 출력해보기
		
		// 힌트) 결국 3명의 키의 정보를 담아야함!!
		
		Scanner sc = new Scanner(System.in);
		
		double arr[] = new double[3];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 사용자님의 키(cm)를 입력해주세요 : ");
			arr[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 사용자님의 키는 %.1fcm입니다.\n", (i + 1), arr[i]);
		}
		
	} // 메소드 영역 끝
	
	public void method7() { // 메소드 영역 시작
		
		// 사용자에게 문자열을 한개 입력받은 후
		// 그 문자열의 각각의 문자들을 char 배열로 옮겨담기
		// char 배열에 문자들이 잘 옮겨담아졌는지 출력까지 해보기
		
		// 힌트) 문자열의 각각의 문자들을 char 배열로 옮겨담기
		//		이 때 char 배열의 크기는? 문자의 갯수 (즉, 문자열의 길이)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 한 개 입력 : ");
		String str = sc.nextLine();
		
		// "apple" 이라는 문자열을 입력한 경우
		// 01234
		
		//	[0]	[1]	[2]	[3]	[4]
		//	'a'	'p'	'p'	'l'	'e'
		
		// 글자수의 갯수만큼의 크기인 문자 배열을 하나 만들기
		int length = str.length();
		char arr[] = new char[length];
		
		// 각 글자를 뽑아서 인덱스에 담기
		/*
		arr[0] = str.charAt(0);
		arr[1] = str.charAt(1);
		arr[2] = str.charAt(2);
		 */
		
		// > 이 시점 기준으로 반복이 몇번 돌아야하는지 예측 불가
		//	 사용자가 몇글자짜리 문자열을 입력받을지는 실행하기 전까지 아무도 모름!! (그래서 반복문 사용)
		for(int i = 0; i < length; i++) {
			
			arr[i] = str.charAt(i);
		
		}
		
		// 마지막으로 출력 해보기
		for(int i = 0; i < length; i++) {
		
			System.out.printf("ch[%d] : %c\n", i, arr[i]);
		
		}
		
	} // 메소드 영역 끝
	
	public void method8() { // 메소드 영역 시작
		
		// 사용자로부터 좋아하는 과일의 갯수를 입력받아
		// 그 갯수만큼 과일 명을 입력받아서 String 배열에 담고, 출력해보기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("좋아하는 과일 갯수 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기
		
		// 종아하는 과일 갯수만큼 입력받아서 배열에 담기
		// String 배열 만들기
		String fruits[] = new String[size];
		
		// size 만큼 반복을 돌리면서 입력받아 넣기
		for(int i = 0; i < size; i++) {
			
			System.out.print("좋아하는 과일명 입력 : ");
			// String fruit = sc.nextLine();
			// fruits[i] = fruit;
			fruits[i] = sc.nextLine();	
		}
		
		// 최종 출력
		for(int i = 0; i < fruits.length; i++) {
			
			System.out.printf("%d번째 과일 : %s\n",(i + 1), fruits[i]);
		}
		
	} // 메소드 영역 끝
	
	public void method9() { // 메소드 영역 시작
		
		// 사용자로 부터 정수 10개를 입력받은 후 배열에 담고,
		// 그 10개의 정수 중 짝수의 갯수, 홀수의 갯수를 세서 출력해보기
		
		// 힌트) 짝수의 갯수를 담을 변수, 홀수의 갯수를 담을 변수 각각 셋팅
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
	
		for(int i = 0; i < arr.length; i++) {
			System.out.print("정수를 입력하세요 : ");
			// int num = sc.nextInt();
			// sc.nextLine();
			
			// arr[i] = num;
			
			arr[i] = sc.nextInt();
			sc.nextLine();
			
		}
		
		// 이 시점 기준으로 정수 10개가 저장되어 있으나
		// 다시 한번 반복을 돌려가며 각각의 정수가 짝수인지 홀수인지 판별
		
		// 홀수의 갯수를 담을 변수
		int odd = 0; // 현재 10개의 정수 중 홀수의 갯수가 0개다.
		
		// 짝수의 갯수를 담을 변수
		int even = 0; // 현재 10개의 정수 중 짝수의 갯수가 0개다.
		
		for(int i = 0; i < arr.length; i++) {
			
			 // i번째 인덱스에 좋은 점수가 짝수인지 홀수인지 판별
			if((arr[i] % 2) == 0) {
				// 짝수일 경우
				
				even++; // 짝수의 갯수 카운트를 1 증가시키겠다.
				
			} else {
				// 짝수가 아닌 경우 (홀수일 경우)
				
				odd++; // 홀수의 갯수 카운트를 1 증가시키겠다.
			}
		}
		
		// 모든 숫자를 다 출력하고 짝수, 홀수의 갯수 각각 출력
		for(int i = 0; i < arr.length; i++) {
			
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}

		System.out.println("짝수의 갯수 : " + even);
		System.out.println("홀수의 갯수 : " + odd);
		
	} // 메소드 영역 끝
	
	public void method10() { // 메소드 영역 시작
		
		// 5명 학생의 점수를 정수로 입력받은 후 배열에 담고
		// 60점 이상이면 합격, 미만이면 불합격 출력해보기
		
		Scanner sc = new Scanner(System.in);
		
		int score[] = new int[5];
		
		for(int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번째 학생 점수 입력 : ");
			score[i] = sc.nextInt();
			sc.nextLine();
		}
		
		for(int i = 0; i < score.length; i++) {
			if(score[i] >= 60) {
				System.out.println(i + "번째 학생 : 합격");
			} else {
				System.out.println(i + "번째 학생 : 불합격");
			}
		}
		
	} // 메소드 영역 끝
	
	public void method11() { // 메소드 영역 시작
		
		int[] arr = new int[5]; // [0] [1] [2] [3] [4]
								//  0   0   0   0   0
		
		System.out.println(arr); // 주소값
		System.out.println(arr.hashCode()); // 해시코드 (주소값을 십진수)
		
		/*
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		*/
		
		// 방번호 규칙 : 시작수는 0, 끌수는 4 포함, 1씩 증가
		// 대입되는 값 규칙 : 시작수는 2, 끌수는 10 포함, 2씩 증가
		
		// 대입을 위한 for문
		
		// 보조해주는 변수 활용 - 대입되는 값에 대한 초기식
		int value = 2;
		
		for(int i = 0; i < arr.length; i++) {
			
			// arr[i] = (i + 1) * 2;
			arr[i] = value;
			value += 2; // 대입되는 값에 대한 증감식
		}
		
		// 출력을 위한 for문
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		// arr 배열은 5칸 짜리 배열이였음!!
		// 즉, [0] ~ [4] 번 방 까지 존재함!!
		
		// arr[5] = 12;
		// arr[6] = 14;
		// > 출력할 때와 마찬가지로 값을 대입할 때도
		//	 범위에 맞지 않는 인덱스를 제시하면 ArrayIndexOutOfBoundsException 오류 발생
		//	 (빨간밑줄은 없지만 실행 중에 오류가 발생함)
		
		/*
		 * * 배열의 가장 큰 단점
		 * > 처음 할당 (new 자료형[크기]) 과정에서 지정한 배열의 크기는 절대 변경이 불가능 하다!!
		 * > 배열의 크기를 그럼에도 불구하고 변경하고 싶다면
		 * 	 어쩔 수 없이 새로운 배열을 다시 만들어야함!! (new 구문을 통해 새로운 배열을 할당하는 과정을 다시 거쳐야함)
		 */
		
		// 7칸 짜리 배열로 새로 만들기
		arr = new int[7];
		
		arr[5] = 12;
		arr[6] = 14;
		// > 이제는 가능해짐!!
		
		System.out.println("--- arr 변경 후 ---");
		System.out.println(arr);
		System.out.println(arr.hashCode());
		
		/*
		 * * 이 때, 연결고리가 끊긴 배열은 사용할 수가 없음!!
		 * 결국은 배열명에 해당 배열의 주소값이 들어있고, 배열명[방번호] 로 접근해서 쓰는 개념이기 때문에
		 * 
		 * 
		 * * 메모리공간은 항상 섹션마다 고유한 주소값을 가지고 있음!!
		 * 즉, 주소값은 절대로 중복되지 않는다. (겹치지 않는다)
		 * 
		 * * new 구문의 역할은 메모리의 Heap 영역의 특정 공간을 쓰기 위해 확보하겠다, 할당하겠다 라는 역할이기 때문에
		 * 배열명은 그대로 쓰되, new 구문만 다시 실행해서 그 결과 (주소값) 를 다시 대입하게 되면,
		 * new 구문 재실행 전후로 주소값이 다르게 출력될 수 밖에 없음!!
		 * 
		 * * 기존에 연결되어있었던 연결고리가 끊긴 배열은 (사용할 수 없는 상태)
		 * 메모리에 그대로 남아있을 경우 공간만 차지하게됨!! (공간복잡도에 영향을 미칠 수 밖에 없음)
		 * > 우선 연결이 끊긴 배열은 메모리의 Heap 영역에 동동 떠다니다가,
		 * 	 일정 시간이 지나면 자동으로 삭제된다!! (자바의 특징 중 자동 메모리 관리 : 가비지 컬렉션)
		 * > 이 때, 메모리공간을 정리해주는 놈을 "가비지 컬렉터(GC)" 라고 부른다!!
		 */
		
		// 현재 멀쩡히 연결된 배열을 끊고자 한다면?
		arr = null;
		// > null : 아무것도 존재하지 않음을 의미하는 값
		//			주소값이 존재하지 않음을 나타내는 값
		System.out.println(arr); // null 출력
		
		// System.out.println(arr.hashCode());
		// > 이제는 주소값이 없기 때문에 (null) 주소값을 십진수화 할 수 없게됨!! 오류 발생!!
		
		// arr[0] = 10;
		// > 마찬가지로 찾아갈 방이 없어짐!! (주소가 없는데 어떻게 찾아감)
		
		// System.out.println(arr[0]);
		// > 주소값이 없기 때문에 값을 불러올 수 없어짐!!
		
		// * NullPointerException 오류
		// > 주소값이 없는데 (null 인데) 주소값을 타고 들어가서 어딘가로 접근하고자 할 때 발생!!
		
		// > 항상 주의해야 할 점은
		//	 참조자료형 일 경우 항상 주소값이 제대로 들어있는지 확인해 가면서 코드를 작성하는 겂이 좋다.
		
	} // 메소드 영역 끝
	
	// 배열의 추가적인 표현법
	public void method12() { // 메소드 영역 시작
		
		int[] arr = new int[4]; // [0] [1] [2] [3] (각각 0이 담겨있음)
		
		// 각 인덱스마다 내가 원하는 값으로 채워넣고 싶다면?
		// > 직접 대입하는  수 밖에 없음
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		// 배열 선언 및 할당과 동시에 내가 원하는 값으로 처음부터 초기화 (대입) 까지 한번에 끝내는 구문이 있음!!
		// 방법1)
		int[] arr1 = new int[] {1, 2, 3, 4};
		
		// 방법2)
		int[] arr2 = {1, 2, 3, 4};
		
		// > {1, 2, 3, 4} 를 "초기화 블록" 이라고 부른다!!
		
		// 모든 배열 arr, arr1, arr2 에는 다 같은 값들이 담겨있을 것!!
		for(int i = 0; i < arr.length; i++) {
			
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
		
		System.out.println("-----");
		
		for(int i = 0; i < arr1.length; i++) {
			
			System.out.printf("arr[%d] : %d\n", i, arr1[i]);
		}
		
		System.out.println("-----");
	
		for(int i = 0; i < arr2.length; i++) {
			
			System.out.printf("arr[%d] : %d\n", i, arr2[i]);
		}
		
		System.out.println("-----");
		
		// arr, arr1, arr2 에 들은 배열의 내용물도 다 같고, 배열의 크기가 같음!!
		// 각각의 주소도 다를까?
		
		System.out.println(arr);
		System.out.println(arr1);
		System.out.println(arr2); 
		
		System.out.println("-----");
		
		System.out.println(arr.hashCode());
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		
		System.out.println("-----");
		
		// 주소값 비교!!
		// > 문자열의 경우 == 으로 비교하면 "주소값" 기준으로 동등비교가 일어남!!
		// > 배열도 마찬가지임!!
		System.out.println(arr == arr1); // false
		System.out.println(arr1 == arr2); // false
		System.out.println(arr == arr2); // false
		
		// > 아무리 내용물이 똑같이 들어가있고, 크기도 같은 배열이더라도 같은 배열이라고 볼 수 없다!!
		//	 서로 가리키는 Heap 영역의 주소값이 다른 경우에는!!
		
	} // 메소드 영역 끝
	
	/*
	 * * 배열 숙제
	 * 1. 코딩 문제 - 아래의 method13 번
	 * 2. 보고서 작성 - 05_Array 프로젝트 (배열 단원) 에서 배운 내용 (오후에 배우는 내용까지 포함)
	 * 				   개념 (이론), 샘플코드, 그림 등 활용해서 싹 정리 후 보고서 형태로 제출
	 */
	
	// 로또 번호 자동발생 프로그램 - 숙제
	public void method13() { // 메소드 영역 시작
		
		// 로또의 규칙
		// > 1 ~ 45 사이의 랜덤한 정수 6개를 뽑는 것
		
		// > 단, 이 6개의 정수는 절대 "중복이 되면 안됨"
		// 1. 해당 i 번째 회차의 랜덤한 정수 6개를 뽑는 것
		// 2. i 번째 회차의 랜덤수를 뽑아서 i번째 방에 대입
		// 	  0 ~ i - 1 (직전 반복 회차) 의 값이랑 일일이 동등비교 (대조) 해 가면서
		//	  중복이 있는지를 확인해봐야함
		// 3. 중복이라면 해당 i 번째 반복 회차를 다시 진행헤야함!!
		// 4. 중복이 아니라면 다음 반복 회차로 넘어가기
		// > for문 중첩해서 구현!!
		// 	 (6개의 랜덤수를 뽑아야 하므로 곁에 반복 한번, 0 ~ i - 1 까지 동등비교 하느라고 안쪽에서 반복 한번)
		
		// > 6개의 중복되지 않은 정수를 다 뽑았다면 최종적으로 작은 수 --> 큰 수 순서대로 나열해서 출력해야함
		// * 정렬 (sort) 개념
		// 작은 수에서 큰 숫자 순서대로 줄세우는 것 : 오름차순 정렬 (사전순)
		// 큰 수에서 작은 숫자 순서대로 줄세우는 것 : 내림차순 정렬
		// > 데이터를 정렬을 해주는 방법이 많음!!
		// 예) 버블정렬, 선택정렬 퀵정렬, ...
		
		// > 이 정렬을 직접 코드로 짜서 쿠현하기에는는 너무 복잡하고 어려움 (for문 최소 2번은 써야함)
		// 자바에서는 배열에 담긴 데이터들을 오름차순으로 정렬 시켜주는 메소드가 이미 제공되고 있음
		// [ 표현법 ]
		// Arrays.sort(배열명);
		
		
		// 최종적으로 뽑힌 이 숫자들을
		// "[값, 값, 값, 값, 값, 값]" 형태로 출력해보세요.
		
		
		// 1. 6개의 랜덤수를 담아둘 배열을 셋팅
		int[] lotto = new int[6]; // [0] ~ [5]
								  //  0  ~  0  (기본값 셋팅)
		
		// 2. lotto 라는 배열의 각 인덱스에 접근해서 매번 다른 랜덤값을 담을 수 있게끔 반복문 돌리기
		// > 규칙 : 시작수는 0, 끝수는 마지막 인덱스 (5) - 배열의 크기 (6) 보다 작을 때 까지, 1씩 증가
		
		// > 결국 우리는 랜덤한 수 6개를 뽑아서 담아야 하므로 (결과적으로) - 반복 또한 6번!!
		for(int i = 0; i < lotto.length; i++) {
			
			// 3. lotto 배열의 i 번째 방에 랜덤수 담기
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			// 4. i 번째 랜덤수와 (방금 위 3단계에서 뽑은 값) 0 ~ i - 1 까지의 랜덤수들이 동일한지 중복체크
			// > 규칙 : 시작수는 0, 끝수는 i - 1 포함 (즉, i 보다 작을 때 까지), 1씩 증가
			for(int j = 0; j < i; j++) {
				
				// 5. i 번째 방에 들은 랜덤수와 j 번째 방에 들은 랜덤수가 일치하는지를 비교
				if(lotto[i] == lotto[j]) {
					// 중복이 일어났을 경우 - i 번째 랜덤수를 다시 뽑아야함 (중복이 없을때까지)
					
					// 예)
					// lotto[0] == lotto[4] // false
					// lotto[1] == lotto[4] // true
					// lotto[2] == lotto[4] // false 일텐데..
					// > 어차피 더이상 중복체크를 마저 진행할 필요가 없음 (중복체크용 안뽁 for문을 더 돌릴 필요가 없음)
					// 4번 방의 랜덤수를 다시 뽑아야함!!
					
					i--; // 다음 바깥쪽 for문의 증감식에 의해 i 가 1 증가될거에 대비해서 미리 1을 뺀 것!!
					break; // 더이상 중복체크는 안해도 되니간
				}
			}
		}
		
		// 이 시점 기준으로 lotto 라는 배열에는 6개의 랜덤수들이 중복 없이 잘 담겨있을 것!!
		// 마지막으로 오름차순 정렬까지 하면
		Arrays.sort(lotto);
		
		System.out.println(Arrays.toString(lotto));
	
	} // 메소드 영역 끝
	
} // 클래스 영역 끝



