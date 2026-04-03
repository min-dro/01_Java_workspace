package com.kh.variable;

// 형변한 개념
public class C_Cast { // 클래스 영역 시작
	
	/*
	 * * 형변환 (Type Casting)
	 * > 값의 자료형을 바꾸는 개념
	 * 	 (byte 를 int 로, int 를 double 로, ...
	 * 
	 * * 컴퓨터 상의서의 값 처리 규칙
	 * 1. 대입연산자 (=) 를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야만 함!! 
	 * > 즉, 변수에는 같은 자료형에 해당하는 값만 대입 가능하다
	 * 	 (다른 자료형의 값을 변수에 대입하고자 한다면 "형변환" 이 필수)
	 * 2. 같은 자료형의 값 끼리만 연산이 가능함!!
	 * > 즉, 다른 자료형들끼리 연산을 하고 싶다면 적어도 한놈은 다른 한쪽의 타입을 맞춰준 다음 연산해야함
	 * 	 (다른 자료형의 값들끼리 연산을 하고 싶다면 "형변환" 이 필수)
	 * 3.같은 자료형끼리만 연산하면 그 결과도 같은 자료형으로 나온다!!
	 * 
	 * [ 표현법 ]
	 * - 다른 타입의 값을 대입을 하고 싶을 경우
	 * 자료형 변수명 = (바꿀자료형)값;
	 * 
	 * - 다른 타입의 값끼리 연산을 하고 싶을 경우
	 * 값 + (바꿀자료형)값;
	 * 
	 * * 형변환의 종류
	 * 1. 자동형변환 
	 * > 자동으로 형변환이 진행되기 때문에 개발자인 내가 직접 형변환 할 필요가 없음
	 * 작은 바이트의 자료형 --> 큰 바이트의 자료형
	 * 
	 * 2. 강제형변환 (명시적형변환)
	 * > 컴퓨터에 의해 자동으로 형변환이 안되기 때문에 개발자인 내가 직접 형변환을 꼭 해줘야 하는 경우
	 * 큰 바이트의 자료형 --> 작은 바이트의 자료형
	 * 
	 * [ 표현법 ]
	 * (바꿀자료형)값
	 * (바꿀자료형) : 형변환 연산자, cast 연산자
	 */
	
	// 1. 자동형변환 개념
	
	public void autoCasting() { // 메소드 영역 시작
		
		// 자동형변환은 대부분 작은 바이트 --> 큰 바이트로 형변환 되는 경우 일어남
		
		// 1. int (4byte) --> double (8byte)
		int i1 = 10;
		double d1 = /* (double) */i1;
		// > 알게모르게 i1 앞에 형변환연산자인 (double) 이 생략된 꼴
		
		System.out.println("i1 : " + i1); // 10
		System.out.println("d1 : " + d1); // 10.0

		// > 자동으로 형변환이 되었다.
		//	 10 --> 10.0
		
		int i2 =12;
		double d2 = 3.3;
		
		double result2 = /* (double) */ i2 + d2;
		System.out.println("i2 : " + i2);
		System.out.println("d2 : " + d2);
		System.out.println("result2 : " + result2);
		
		// > 자동으로 형변환이 되었다.
		//	 12 --> 12.0
		// 12.0 + 3.3 = 15.3
		
		// 2. int (4byte) --> long (8byte)
		int i3 = 1000;
		long l3 = /* (long) */ i3;
		
		long l4 = /* (long) */ 2000;
		// > L 을 붙이지 않아도 문제가 없는 이유
		//	 내부적으로 long 으로 자동형변환 되기 때문
		
		// 특이케이스 3. long (8yte) --> float (4byte)
		long l5 = /* (long) */ 1000000;
		float f5 = /* (float) */ l5;
		
		System.out.println("f5 : " + f5);
		
		// > 자동형변환이 되었다.
		//	 정수가 실수로 담길 경우에는 큰 사이즈의 정수가 작은 사이즈의 실수 변수에 대입 가능해짐!!
		//	 4byte 짜리 float 는 사실 8byte 짜리 long 자료형 보다
		//   담을 수 있는 값의 범위가 더 크기 때문 (부동소숫점이라는 규칙 덕분)
		// 	(32개의 0과 1로 표현할 수 있는 실수 값의 범위 > 64개의 0과 1로 표현할 수 있는 정수 값의 범위)
		
		// ***
		// 특이케이스 4. char (2byte) <--> int (4byte)
		// 양방향 형변환 가능
		char ch = /* (char) */ 65;
		System.out.println("ch : " + ch); // 65 --> 'A'
		
		int num = /* (int) */ 'A';
		System.out.println("num : " + num);
		
		// > 자동형변환이 되었다.
		//   char 의 범위 : 0 ~ 65xxx (음수는 오류남)
		//	 컴퓨터는 모든 데이터를 0 또는 1의 조합으로 표현하는데,
		//	 우리가 쓰는 문자 체계는 이진수로 표현하기에는 약간 애매함!!
		//	 그래서 각 문자마다 고유한 정수값을 1:1로 매칭시켜두고, 그 내용을 표로 만들어뒀음!!
		// 참고) 아스키코드표
		// 0 ~ 127 까지의 정수값으로 (총 128개의 숫자)
		// 영문자 대소문자, 숫자, 특수문자 등을 1:1로 매칭시킨 표
		// > 총 128 개의 숫자 만으로는 전 세계의 모든 문자를 표현하기에 제한적임!!
		//	 그래서 나온 개념이 "유니코드표"
		
		// 참고) 유니코드표
		// 0 ~ 65535 까지의 정수값으로 (총 65536개의 숫자)
		// 영문자 대소문자, 숫자, 특수문자 + a (한글, 중국어 등 다른 문자 포함)
		// > 아그키코드표의 확장판임 (0 ~ 127 까지는 아스키코드표랑 같고 거기서 거 붙은 개념)
		
		System.out.println('김');
		System.out.println((int)'김'); // 44608
		
		int sum = /* (int) */ 'A' + 32;
		System.out.println("sum : " + sum);
		// 'A' --> 65
		// 65 + 32 = 97
		
		System.out.println("sum : " + (char)sum); // 'a'
		// > 문자와 정수 사이의 산술연산이 가능하다.
		//	 영문자 대문자와 소문자는 32 차이가 난다!!
		
		// 예) "APPLE" 를 모두 소문자로 바꿔주세요
		// 'A' : 65
		// 'a' : 97
		
		// 특이케이스 5. byte, short 간의 연산
		byte b1 = 1;
		byte b2 = 10;
		
		byte result = (byte)(b1 + b2);
		// > byte 끼리 산술연산 시 무조건 결과는 int 로 나오게 되어있음
		//	 왜? 오버플로구로 인해 이상한 결과가 나오는 것을 방지하기 위해!!
		//	 (short 끼리의 연산도 마찬가지임)
		
		// (b1 + b2) 구간에서 자동형변환이 일어남!!
		
	} // 메소드 영역 끝
	
	
	// 2. 강제형변환 (명시적형변환) rosua
	public void forceCasting() { // 메소드 영역 시작
	
		// 강제형변환은 대부분 큰 바이트 --> 작은 바이트 로 형변환 될 때 일어남
		
		// 1. double (8byte)--> float (4byte)
		float f1= 4.0f;
		// > 반드시 f 를 붙여줘야함 함!!
		
		double d2 = 8.0;
		// > Type mismatch: cannot convert from double to float
		//	 (자료형 불일치: double 타입을 float 타입으로 변경할 수 없음 )
		
		// 해결방법) 강제형변환 하기
		float f2 = (float)d2; // 8.0 --> 8.0
		
		// 2. double (8byte) --> int (4byte)
		// > ***
		
		double d3 = 10.89;
		int i3 = (int)d3;
		// > Type mismatch: cannot convert from double to int
		
		System.out.println("i3 : " + i3); // 10.89 --> 10
		// > 소숫점이 절사되었다. (짤렸다)
		
		int iNum = 10;
		double dNum = 5.89;
		
		// int iSum = /* (double) */iNum + dNum;
		// > Type mismatch: cannot convert from double to int
		// > iNum 이 double 타입으로 자동형변환이 되고,
		//	 그다음에 덧셈연산이 이루어짐 (여기까진 문제 없음)
		//	 그 덧셈 계산 결과 또한 double 로 나오게됨
		//	 그 결과값인 double 타입의 값을 int 형 변수에 담으려고 해서 오류 발생!!
		
		// 해결방법1) 최종 연산 결과를 int 형에 맞춰서 강제형변환
		int iSum1 = (int)(/* (double) */ iNum + dNum);
		
		System.out.println("iSum1 : " + iSum1); // 15
		// 10 --> 10.0
		// 10.0 + 5.89 = 15.89
		// 15.89 --> 15
		
		// 해결방법2) 연산 전 double 을 int 로 강제형변환
		int iSum2 = iNum + (int)dNum;
		// > 덧셈 전에 에초에 dNum 을 int 형으로 강제형변환
		//	 자동형변환은 iNum 이 double 로 변환되서 연산이 되는 것인데
		//	 그 전에 우리가 미리 dNum을 강제로 변환시킨건
		
		System.out.println("iSum2 : " + iSum2); //15
		// 5.89 --> 5
		// 10 + 5 = 15
		
		// 해결방법3) 애초에 결과값을 int 가 아닌 double 형으로 담기
		double dSum = /* (double) */ iNum + dNum;
		
		System.out.println("dSum : " + dSum); // 15.89
		
		
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
