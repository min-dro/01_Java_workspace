package com.kh.chap01_math.run;

// import 선언부
// import java.lang.*;
// > java.lang 패키지의 모든 클래스를 import 해서 쓰겠다.
//	 보이지는 않지만 항상 이미 import 되어있다!!

/*
 * * API (Application Programming Interface)
 * > 개발에 자주 사용되는 클래스 및 인터페이스 묶음의 (개발에 자주 사용되는 코드들의) "사용법" 을 나타냄
 * > 개발자 문서 라고도 부름 (코드의 사용법을 나타내는 용어)
 * 
 * * 라이브러리
 * > 개발에 자주 사용되는 코드들
 * 
 * * 자바 기본 API
 * > 자바 언어에서 제공되는 유용한 코드들에 대한 사용법
 * 
 * https://docs.oracle.com/en/java/javase/21/docs/api/index.html
 * 
 * * 수업시간에 다뤄볼 종류
 * 1. Math 클래스
 * 2. String 클래스
 * 3. Wrapper 클래스
 * 4. Date 클래스
 */

// Math 클래스
public class MathRun { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		/*
		 * * Math 클래스
		 * > 수학과 관련된 필드들, 메소드들이 정의되어있는 유용한 클래스
		 * > 모든 필드와 메소드들이 static 형식임!! ("싱글톤 패턴" 으로 이루어진 클래스)
		 * 	 객체 생성 후에 가져다 쓸 필요가 없이 바로 가져다 쓸 수 있음!!
		 * > java.lang 패키지 내에 정의되어있음 (풀클래스명은 java.lang.Math)
		 * 
		 * * java.lang 패키지
		 * > 자바에서 제공하는 유용한 코드들을 담고 있는 패키지들 중 하나
		 * 	 (그 중에서도 대빵)
		 * > 모든 자바 클래스 코드 상단에는 알게모르게 java.lang 패키지가 포함되어있다 (import)
		 *   그래서 바로 가져다 쓸 수 있는 것!!
		 */
		
		// Math 클래스에서 제공하고 있는 유용한 필드들과 메소드들
		
		// 필드
		// 1. 파이 : 원주율 (상수필드로 정의됨)
		System.out.println("파이 : " + Math.PI); // 3.141592...
		
		// 메소드
		// 메소드명(매개변수) : 반환형
		
		// > 보통 다른 클래스의 메소드를 호출하고자 할 경우에는 객체 생성 후 객체명.메소드명(); 으로 호출해야함!!
		
		// Math 클래스로 갹채 생성해보기
		// Math m = new Math();
		// > 오류가 나면서 객체 생성이 안되는걸 볼 수 있다!!
		//   Math 클래스의 생성자는 private 접근제한자임!!
		//	 애초에 모든 필드와 메소드가 static 이기 때문에 굳이 객체 생성을 하지 말라고 막아둔 것!!
		
		// 1. Math.ceil(double) : double
		// > 올림 연산 처리
		double num1 = 4.349;
		System.out.println("올림 : " + Math.ceil(num1)); // 5.0
		
		// 2. Math.round(double) : long
		// > 반올림 연산 처리
		System.out.println("반올림 : " + Math.round(num1)); // double
		
		// 3. Math.floor(double) : double
		// > 버림 연산 처리
		System.out.println("버림 : " + Math.floor(num1)); // 4.0
		System.out.println("다른 방법으로도 버림 : " + (int)num1); // 4 (강제형변환을 이용한 방법)
		
		// 4. Math.abs(int/double/long/float) : int/double/long/float
		// > 잘대값을 구하는 연산 처리
		int num2 = -10;
		System.out.println("절대값 : " + Math.abs(num2)); // 10
		System.out.println("절대값 : " + Math.abs(num1)); // 4.349
		// 오버로딩을 적용해서 만든 메소드!!
		
		// 5. Math.min(int, int) : int
		// > 최소값을 구하는 연산 처리
		System.out.println("최소값 : " + Math.max(5, 10)); // 5
		
		// 6. Math.max(int, int) : int
		// > 최대값을 구하는 연산 처리
		System.out.println("최대값 : " + Math.max(5, 10)); // 10
		
		// 7. Math.sprt(double) : double
		// > 제곱근 (루트) 을 구하는 연산 처리
		System.out.println("4의 제곱근 : " + Math.sqrt(/* (double) */ 4)); // 2.0
		
		// 8. Math.pow(double, double) : double
		// > 제곱 연산 처리
		System.out.println("2의 10제곱 : " + Math.pow(2,  10)); // 1024.0
		
		// 9. Math.random() : double
		// > 핸덤값 발생 처리
		System.out.println("랜덤값 : " + Math.random()); // 0/0 ~ 0.9999999...
		
	} // main 영역 끝

} // 클래스 영역 끝
