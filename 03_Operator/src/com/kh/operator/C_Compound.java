package com.kh.operator;

// 복합 대입 연산자 (산술 대입)
public class C_Compound { // 클래스 영역 시작 
	
	/*
	 * * 복합 대입 연산자 (산술 대입)
	 * > 이항 연산자로써, 산술 연산자와 대입 연산자를 함께 사용하는 연산자
	 * 	 즉, 산술 연산자와 대입 연산자가 합쳐진 형태
	 * > 산술 연산 후 그 결과를 다시 자기 자신한테 "대입" 까지 하는게 역할
	 * 
	 * [ 종류 ]
	 * +=, -=, *=, /=, %=
	 * 
	 * [ 표현법 ]
	 * 변수명 += 3; // 변수명 = 변수명 + 3; 와 같은 뜻
	 * - 즉, 기존의 변수에 들은 값에 3을 더해서 그 변수에 다시 그 결과를 대입해주겠다.
	 */
	
	public void method1() {
		
		int num = 12;
		
		System.out.println("현재 num : " + num); // 12
		
		// num 을 3 증가시키기
		num = num + 3;
		
		System.out.println("3 증가시킨 num : " + num); // 15
		
		// num 에 3을 또 증가시키기
		num += 3; // num = num + 3; 와 같은뜻임!!
		
		System.out.println("또 3 증가시킨 num : " + num); // 18
		
		// num 을 5 감소시키기
		num -= 5; // num = num - 5; 와 같은뜻임!!
		
		System.out.println("5 감소시킨 num : " + num);
		
		// num 을 6배 증가시키기
		num *= 6; // num = num * 6; 와 같은뜻임!!
		
		System.out.println("6배 증가시킨 num : " + num); // 78
		
		// num 을 2배 감소시키기
		num /= 2; // num = num / 2; 와 같은뜻임!!
		
		System.out.println("2배 감소시킨 num : " + num); // 39
		
		// num 을 4로 나눴을 때의 나머지를 num에 대입
		num %= 4; // num = num % 4; 와 같은뜻임!!
		
		System.out.println("최종 num : " + num); // 3
		
		// + 연산자는
		// 숫자끼리에서의 연산은 산술연산으로써 덧셈을 행하게 된다!!
		// 문자열과 다른 자료형의 값 사이에서는 한줄의 문자열로 연이어주는 접합의 역할을 해줌!!
		
		// += 의 경우
		// 마찬가지로 산술연산  + 대입 용도로 사용 가능하지만,
		// 또한 문자열접합 + 대입 용도로도 사용 가능해짐!!
		
		String str = "Hello";
		
		System.out.println("원래 str : " + str);
		
		// str = str + "World";
		
		str += "World";
		
		System.out.println("변경된 str : " + str);
		
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
