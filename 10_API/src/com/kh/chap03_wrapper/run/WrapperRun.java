package com.kh.chap03_wrapper.run;

// Wrapper 클래스
public class WrapperRun { // 클래스 영역 시작

	/*
	 * * Wrapper 클래스
	 * > "기본 자료형" 을 "참조 자료형" 으로 포장해주는 역할의 클래스들
	 * > 각 기본자료형에 맞는 Wrapper 타입들이 별도로 존재함
	 * 
	 * [ 종류 ]
	 * 기본자료형 			<--->			참조자료형
	 * boolean							Boolean
	 * char								Character
	 * byte								Byte
	 * short							Short
	 * int								Inteager
	 * long								Long
	 * float							Float
	 * double							Double
	 */
	
	public static void main(String[] args) { // main 영역 시작

		// 왜 Wrapper 클래스가 필요한가?
		int num1 = 10;
		int num2 = 15;
		
		// num1 과 num2 가 일치합니까?
		// System.out.println(num1 == num2);
		// System.out.println(num1..equals(num2));
		// > 일반 기본 자료형에서 참조 자료형의 유용한 메소드들을 호출해서 가져다 쓰고 싶은 경우
		//	 Wrapper 클래스 타입으로 변환해서 사용할 수 있다!!

		// 기본 자료형 --> Wrapper 자료형 (Boxing)
		// 1. 객체 생성 구문을 이용하는 방법 (생성자를 호출)
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		
		System.out.println(i1); // 10
		System.out.println(i2 /* .toString() */); // 15
		
		System.out.println(i1 == i2); // false (주소값 비교)
		
		System.out.println(i1.equals(i2)); // false (내용물 비교)
		
		System.out.println(i1.hashCode()); // 10
		System.out.println(i2.hashCode()); // 15
		// > 내용물 기반으로 해시코드 리턴
		
		// 대소비교를 하고 싶다면?
		// System.out.println(i1 < i2); // true
		System.out.println(i1.compareTo(i2));
		// > compareTo 메소드도 Object 클래스에서 제공하는 유용한 메소드들 중 하나
		// 	 두 값을 비교할 수 있는 메소드
		//   a.compareTo(b); : a 가 b 보다 크면 1, b 가 더 크면 -1, 같으면 0 리턴
		
		// 2. 객체를 생성하지 않고 곧바로 대입하는 방법
		Integer i3 = num1;
		Integer i4 = num2;
		
		// > 주의사항
		// AutoBoxing 이 안되는 경우!!
		// Integer i5 = "123"; // X
		Integer i5 = new Integer("123"); // O
		// > 정수 모양의 문자열을 Integer 로 바꾸고 싶을 때
		
		// Wrapper 자료형 --> 기본 자료형 (UnBoxing)
		// 1. 해당 그 Wrapper 클래스에서 제공하는 xxxValue() 메소드를 활용하는 방법
		int num3 = i3.intValue(); // i3 --> num3
		int num4 = i4.intValue(); // i4 --> num4
		
		// System.out.println(num3.equals(num4));
		System.out.println(num3 == num4);
		
		// 2. 메소드 따위는 이용하지 않고 곧바로 대입하는 방법 (AutoUnBoxing))
		int num5 = i1;
		int num6 = i2;
	
		System.out.println("---------------------");
		
		// 기본 자료형 <----> String
		
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // "1015.3"
		
		// 1. String ---> 기본 자료형
		// > "파싱한다" (parsing)
		
		// [ 표현법 ]
		// 해당Wrapper클래스명.parseXxx("변환할문자열");
		// > static 메소드이기 때문에 클래스명.메소드명() 임!!
		
		int i = Integer.parseInt(str1); // "10" ---> 10
		double d = Double.parseDouble(str2); // "15.3" ---> 15.3
		
		System.out.println(i + d); // 25.3
		
		// 파싱 시 주의사항
		// Integer.parseInt("12.3");
		// Float.parseFloat("abc~");
		// > 형식에 맞지 않는 문자열을 제시했을 경우 NumberFormatException 오류가 발생!!
		
		// 예시)
		// 나중에 웹페이지를 만들 때 숫자로 입력하더라도 입력받은 숫자값이 자바의 "문자열" 로 넘어오게 됨!!
		// 나이 : 20 을 입력했을 경우 "20" 으로 넘어오게 됨다!!
		// > 이런 경우에는 파싱이 필수임!!
		
		// 2. 기본 자료형 ---> String 
		// 2_1. String 클래스에 정의된 valueOf 라는 메소드를 활용하는 방법
		// [ 표현법 ]
		// String.valueOf(변경할값) : String
		// > 오버로딩된 형태
		String strI = String.valueOf(i); // 10 --> "10"
		String strD = String.valueOf(d); // 15.3 --> "15.3"
		
		System.out.println(strI + strD); // "1015.3"
		
		//  2_2. "" (빈 문자열) 을 접합하는 방법
		String result = 10 + "";
		
	} // main 영역 끝

} // 클래스 영역 끝

