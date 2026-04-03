package com.kh.variable;

// 변수 기초
public class A_Variable { // 클래스 영역 시작

	// 1. 변수 사용 이유
	// > 사각형의 면적과 둘레를 계산해서 출력해주는 메소드
	public void printSquare() {	// 메소드 영역 시작
		
		// 사작형의 면적 = 가로길이 X 세로길이
		// 사각형의 둘레 = (가로길이 + 세로길이) X 2
		
		// 가로길이 : 3, 세로길이 : 9 이라는 가정 하에 계산해서 출력해보자!!
		// 1. 자바에서는 곱셉 연산을 X 가 아닌 * 를 이용해서 표현한다.
		// 2. 자바에서 여러개의 텍스트를 한 줄로 연이어줄 때에는 + 기호를 사용할 수 있다.
		
		// 변수 사용 전 (사실 변수 없이도 프로그래밍 가능)
		// System.out.println("사작형의 면적 : " + (3 * 9));
		// System.out.println("사각형의 둘레 : " + (3 + 9) * 2);
		
		// 주기적으로 가로 세로 길이가 바껴야 한다면? 바꿔야할 가로 세로 길이 값의 갯수가 많다면?
		
		// 변수 사용 후
		// 가로 길이를 담을 변수 만들기
		int width = 4;
		
		// 세로 길이를 담을 변수 만들기
		int height = 8;
		
		System.out.println("사격형의 면적 : " + (width * height));
		System.out.println("사각형의 둘레 : " + (width + height) * 2);
		
		/*
		 * * 변수를 사용하는 이유
		 * 1. 변수를 우선적으로 값에 의미를 부여할 목족으로 사용 (가독성이 좋음)
		 * 2. 단 한번 값을 잘 보관해 두고 (기록해 두고)
		 * 	  필요할 때마다 계속 가져다 쓸 목적으로 사용 (코드의 재사용이 높아짐)
		 * 3. 유지보수를 보다 쉽게 할 수 있음
		 */
				
	} // 메소드 영역 끝
	
	// 2. 변수의 선언 및 자료형 개념
	public void declareVariable() { // 메소드 영역 시작
		
		/*
		 * * 변수의 선언
		 * > 값을 기록해두기 위한 변수를 메모리 공간에 확보해두겠다.
		 * > 즉, 값을 담아둘 상자 (박스) 를 만들겠다.
		 * 
		 * [ 표현법 ]
		 * 자료형 변수형;
		 * 
		 * - 자료형 : 변수의 크기 및 모야을 지정하는 부분 (상자의 종류)
		 * - 변수명 : 변수의 이름을 정하는 부분 (값의 의미부여)
		 * 
		 * * 변수 선언 시 주의할점
		 * 1. 변수명은 무조건 소문자로 시작하게끔 이름을 지어줄것 (단, 낙타표기법 지키기)
		 * 2. 같은 영역 ({ 여기 }) 안에서 동일한 이름의 변수명으로 선언 불가 (이름 중복 안됨)
		 * 3. 해당 영역 ({ 여기 }) 내에서 선언된 변수는 그 영역 안쪽에서만 사용 가능
		 * 	  > 지역변수 개념 (local variable)
		 */
		
		// --- 자료형에 대한 개념
		// 1. 논리형
		// 논리값 : 어떤 질문에 대해 예 - true 또는 아니요 - false 로 대답이 나뉘는 값
		boolean isTrue; // 1byte 짜리 빈 상자가 생성됨
		
		// 2. 숫자형
		// 2_1. 정수형
		// 정수값 : 소숫점이 없는 숫자닶
		byte bNum; // 1byte 짜리 빈 상자가 생성됨 (-128 ~ 127)
		short sNum; // 2byte 짜리 빈 상자가 생성됨 (-32xxx ~ 32xxx)
		int iNum; // 4byte 짜리 빈 상자가 생성됨 (정수형 자료형들 중에 제일 기본) (-21억xxx ~ 21억xxx)
		long lNum; // 8byte 짜리 빈 상자가 생성됨(제일 큰 범위)
		// > 정수형 값을 담고자 한다면 보통은 int 를 사용함
		
		// 2_2. 실수형
		// 실수값 : 소숫점이 있는 숫자값
		float fNum; // 4byte 짜리 빈 상자가 생성됨 (소숫점 아래 7자리 까지만 저장됨)
		double dNum; // 8byte 짜리 빈 상자다 생성됨 (소숫점 아래 15자리 까지 저장 가능)
		// > 싱수형 자료형들 중에서 제일 기본은 double 임!!
		
		// 3. 문자형
		// 문자값 : 글자 단 한개를 나타내는 값 ('' 홑따옴표로 감싸서 표현)
		char ch; // 2byte 짜리 빈 상자가 생성됨
		
		// --- 여기까지 총 8개의 자료형 = 기본자료형 (primitive type) ---
		// > 메모리의 stack 이라는 영역에 상자가 만들어지고, 그 상자에 곧바로 값을 담을 수 있다.
		
		// 4. 문자열형
		// 문자열값 : 글자들이 나열되어있는 형태의 값 ("" 쌍따옴표로 감싸서 표현)
		String str; // 표면적으로 4byte 짜리 빈 상자가 만들어짐
		
		// --- 문자열형은 참조자료형 (reference type) ---
		// > 메모리의 stack 영역에 상자가 만들어지지만, 정작 값은 다른 곳에 담긴다.
		// --- 여기까지 총 9개의 빈 상자가 생성됨 ---
		
		/*
		 * * 변수에 값 대입
		 * > 변수에 값을 담겠다. 기록하겠다
		 * 	 (상자에 값을 담겠다. 넣어두겠다.)
		 * 
		 * [ 표현범 ]
		 * 변수명 = 값;
		 * 
		 * - = 은 값을 대입하는 용도임!! (대입연산자)
		 * 참고)
		 * 같다는 ==으로 표현한다. (동등비교연산자)
		 */
		
		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		// > long 타입에 변수에 정수를 대입할 경우에는
		//	 long 타입임을 알려주기 위해 숫자 두에 L 또는 l 을 표가해주는 편!! (대문자 L 을 더 권장)
		
		fNum = 4.0f; 
		// > float 타입에 변수에 실수를 대입할 경우에는
		//	 float 타입임을 알려주기 위해 숫자 뒤에 f 를 반드시 표기해야함!!
		
		dNum= 8.0;
		
		ch = 'A';
		// > 문자는 반드기 '' 로 감싸기!!
		
		str = "ABC";
		// > 문자열은 반드시 "" 로 감싸기!!
		// > 실제 데이터는 메모리의 heap 이라는 영역에 저장됨
		//	 stack 영역에는 그 데이터가 정한 곳의 주고값이 저장됨!!
		
		// 각 변수에 담긴 값들 출력해보기
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		
	}
		
	// 3. 변수 선언과 동시에 대입
	public void initVariable() { // 메소드 영역 시작
		
		/*
		 * * 위와 같이 변수 빈 상자를 하나 만들고 그 이후에 따로 값을 대입할 수도 있지만,
		 * 	 한번에 변수 빈 상자를 만들자마자 내가 원하는 값으로 채워넣을 수 있다!!
		 * 	 > 변수 선언과 동시에 대입하겠다.
		 * 
		 *  - 이 때, 변수가 처음 만들어지고 나서 처음으로 대입하는 행위를 "초기화" 라고 부른다.
		 * 
		 * [ 표현법 ]
		 * 자료형 변수명 = 값
		 * 
		 *  = (대입연산자) 는 항상 첫번째로, 오른쪽이 항상 두번째로 실행됨!!
		 */
		
		// 1. 논리형 (boolean)
		boolean isTrue = 3 < 5;
		
		// 2. 숫자형
		// 2_1. 정수형
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		
		// 2_2. 실수형
		float fNum = 4.0f;
		double dNum = 8.0;
		
		// 3. 문자형
		char ch = '김';
		
		// 4, 문자열형 (참조자료형)
		String str = "자바 공부중";
		
		// 각 변수에 담긴 값들 출력해보기
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
	
	} // 메소드 영역 끝
	
	// 4. 상수 개념
	public void constant() { // 메소드 영역 시작
		
		/*
		 * * 상수
		 * > 수학에서 변하지 않는 고정적인 값을 상수라고 라고 함 
		 * > 프로그래밍에서도 마찬가지로 변하지 않는 고정적인 값을 담을 수 있는 공간을 상수하고 함
		 * 
		 * [ 표현법 ]
		 * 선언 따로 초기화 따로
		 * final 자료형 상수명; // 빈 상자 만들기
		 * 상수명 = 값; // 값 담기 (그 이후로는 절대 다른 값으로 못바꿈)
		 * 
		 *  선언과 동시에 초기화
		 *  final 자료형 상수명 = 값;
		 *  
		 *  - 상수명을 지을 때 관례 상 모두 대문자로 쓴다.
		 */
		
		int age = 20; // 변수 (값 변화가 가능)
		System.out.println("age : " + age);
		
		// 해가 지났다고 가정
		age = 21;
		System.out.println("변경된 age : " + age);
	
		final int AGE = 20; // 값 변화가 불가능)
		System.out.println("AGE : " + AGE);
		
		// 마찬가지로 해가 지났다고 가정
		// AGE = 21;
		// > The final local variable AGE cannot be assigned.
		// 	 상수 형식의 변수는 다른 값으로 대입될 수 없음!!
		
		// > 나이와 같이 자주 바뀌는 값들은 상수로 지정하면 불편함!!
		// > 인증키 등 안변하는 고정값들을 저장할 경우에만 사용!!
	
	} // 메소드 영역 끝
	
	// 5. 데이터 오버플로우
	public void overflow() { // 메소드 영역 시작
		
		byte bNum = 127;
		System.out.println("before : " + bNum); // 127
		
		bNum++;
		// > 기존 bNum 이라는 변수에 담겨있는 값에 1을 더한 후
		//   그 더한 결과를 다시 bNum 변수에 대입해주겠다.
		
		System.out.println("after : " +  bNum); // -128
		// > 128 이 아닌 -128 이 나옴!!
		
	
		
		
	} // 메소드 영역 끝

} // 클래스 영역 끝
