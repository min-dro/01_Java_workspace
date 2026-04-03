package com.kh.array;

import java.util.Arrays;

// 배열 복사
public class B_ArrayCopy { // 클래스 영역 시작
	
	/*
	 * * 배열 복사
	 * > 배열을 복사하는 과정
	 * 
	 * [ 종류 ]
	 * 1. 얕은복사 : 복사하는 척만 하는것
	 * 2. 깊은복사 : 제대로 복사하는 것
	 */
	
	// 얕은복사
	public void method1() { // 메소드 영역 시작
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("=== 원본 배열 출력 ===");
		
		for(int i = 0; i < origin.length; i++) {
			
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		
		// 복사본 배열
		// 얕은 복사 방식으로 만들기
		int[] copy = origin;
		
		System.out.println("=== 복사본 배열 출력 ===");
		
		for(int i = 0; i < copy.length; i++) {
			
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		// > 콘솔창에 출력된 결과로는 복사가 잘 된걸로 보임!!
		
		// copy 배열 수정해보기
		copy[2] = 99;
		
		System.out.println("===== 복사본 배열 수정 후 =====");
		
		System.out.println("=== 원본 배열 출력 ===");
		
		for(int i = 0; i < origin.length; i++) {
			
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("=== 복사본 배열 출력 ===");
		
		for(int i = 0; i < copy.length; i++) {
			
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		
		// > 복사본 배열만 가지고 수정했는데
		//	 복사본 뿐만 아니라 원본 배열도 같이 수정이 된 것 같다!!
		//	 (즉, 원복 배열의 내용이 훼손되었다)
		// > 결국 복사가 제대로 되지 않았다!!
		
		// * 얕은복사
		// > 배열의 "주소값" 이 복사되어 원본과 복사본이 같은 상태!!
		// > 즉, heap 영역의 같은 곳을 가리키는 꼴
		
		// > 원본과 복사본의 "주소값" 이 같은 상태
		
		// 주소값을 출력
		System.out.println(origin);
		System.out.println(copy);
		
		// 해시코드들도 출력
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
		
		// 주소값을 동등 비교
		System.out.println(origin == copy); // true
		
	} // 메소드 영역 끝

	// 깊은복사 - 총 4가지 방법
	public void method2() { // 메소드 영역 시작
	
		
		// 1. for문을 이용하는 방법
		// > 새로운 배열을 생성한 후 (new) 각 인덱스 별 내부 값을 for문을 이용해서 일일이 대입하는 방법
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("=== 원본 배열 출력 ===");
		
		for(int i = 0; i < origin.length; i++) {
			
			System.out.println(origin[i] + " ");
		}
		
		System.out.println();
		
		// 복사본 배열
		int[] copy = new int[origin.length];
		// > 일부러 원본 배열의 크기와 동일하게 하달
		/*
		copy[0] = origin[0];
		copy[1] = origin[1];
		...
		*/
 
		// 반복문 활용
		// for(int i = 0; i < copy.length; i++)
		for(int i = 0; i < copy.length; i++) {
				
				copy[i] = origin[i];
			}
			
		System.out.println("=== 복사본 배열 출력 ===");
		
		for(int i = 0; i < copy.length; i++) {
			
			System.out.println(copy[i] + " ");
			
		}
		
		System.out.println();
		
		// copy 배열 수정
		copy[2] = 99;
		
		System.out.println("===== 복사본 배열 수정 후 =====");
		
		System.out.println("=== 원본 배열 출력 ===");
		
		for(int i = 0; i < origin.length; i++) {
			
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("=== 복사본 배열 출력 ===");
		
		for(int i = 0; i < copy.length; i++) {
			
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		
		// > 복사본 배열의 내용을 수정하더라도 원본 배열의 내용은 보존되는 것을 볼 수 있다!!
		
		// * 깊은복사
		// > 단순히 주소값을 복사하는 것이 아닌, heap 영역에 실제 배열 실물 자체를 복사 뜨는 방법
		//	 (즉, 다른 주소지에 똑같은 모양의 배열이 하나 더 있는 꼴)
		
		// 주소값을 출력
		System.out.println(origin);
		System.out.println(copy);
		
		// 해시코드를 출력
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
		
		// 대놓고 동등비교
		System.out.println(origin == copy); // false
		
	} // 메소드 영역 끝
	
	public void method3() { // 메소드 영역 시작
		
		// 2. 새로운 배열을 생성 후
		// 자바의 System 이라는 클래스에서 제공하는 arraycopy 라는 메소드를 이용하는 방법
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열
		int[] copy = new int[10];
		// > 일부터 원본 배열의 크기보다 넉넉하게 만들어움!!
		
		// copy 배열
		// 0 0 0 0 0 0 0 0 0 0 (기본값)
		
		// * System 클래스의 arraycopy 메소드
		// > 배열의 깊은 복사를 위해 만들어진 메소드 (자바에서 쓰라고 만들어준 메소드)
		
		// [ 표현법 ]
		// System.arraycopy(원본배열명, 원본배열의복사를시작할인덱스, 복사본배열명, 복사본배열의복사될시작인덱스, 복사할갯수);
		
		// System.arraycopy(origin, 0, copy, 0, 5);
		// 1 2 3 4 5 0 0 0 0 0
		
		// System.arraycopy(origin, 0, copy, 1, 5);
		// 0 1 2 3 4 5 0 0 0 0
		
		//System.arraycopy(origin, 2, copy, 1, 3);
		
		// System.arraycopy(origin, 2, copy, 9, 2);
		
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		// 0 3 4 5 0 0 0 0 0 3 / 4 (인덱스 범위 벗어남)
		// > ArrayIndexOutOfBoundsException 오류 발상
		//	 복사후 내부적으로 붙여넣기를 하는 과정에서 인덱스 범위를 벗어났기 때문에 발생함
		
		// 붙여넣기 시 인덱스 범위를 맞춰서 붙여넣기 할 수 있도록 신경쓰기!!
		// 복사 후 남는 부분은 원해의 값으로 계속 유지가 됨!!
		
		// 복사본 배열만 출력
		for(int i = 0; i < copy.length; i++) {
			
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		
		// > 깊은복사가 베대로 됬는지 확인할 때 굳이 복사본을 수정해서 원본이 훼손되었는지 확인하지 않아도
		//	 알 수 있음!! (주소값만 비교)
		
		// 깊은복사가 잘 되었는지 확인
		System.out.println("원본 주솟값 : " + origin);
		System.out.println("복사본 주솟값 : " + copy);
		// > 원본과 복사본의 주소값이 다르므로 "깊은복사" 가 잘 되었다 라고 볼 수 있음!!
		
		System.out.println(origin == copy); // false
		
	} // 메소드 영역 끝
	
	public void method4() { // 메소드 영역 시작
		
		// 3. Arrays 라는 클래스에서 제공하는 copyOf 라는 메소드를 이용하는 방법
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		// * Arrays 클래스의 copyOf 메소드
		// > 깊은복사를 해주는 메소드
		
		// [ 표현법 ]
		// 복사본배열명 = Arrays.copyOf(원본배열명, 복사할갯수);
		
		// 복사본 배열
		int[] copy = Arrays.copyOf(origin, 3);
		// > 복사할갯수는 원본배열의 크기보다 작거나 크게 지정할 수 있다!!
		//	 원본배열의 0번 인덱스의 값부터 해당 갯수만큼 복사되서 붙여넣기됨!!
		//	 단, 크기를 더 크게 지정하면 그 크기 만큼의 복사본 배열이 만들어짐 (남는 부분은 기본적으로 채워짐)
		//	 (복사할갯수 == copy배열의 크기)
		
		// 복사본 배열만 출력
		for(int i = 0; i < copy.length; i++) {
			
			System.out.println(copy[i] + " ");
		}
		
		System.out.println();
		
		// 복사가 잘 일어났는지 확인
		System.out.println("원본 해시코드 : " + origin.hashCode());
		System.out.println("복사본 해시코드 : " + origin.hashCode());
		
		// 동등비교까지
		System.out.println(origin == copy); // false
	
	} // 메소드 영역 끝
	
	public void method5() {
		
		// 4. clone 이라는 메소드를 이용하는 방법
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		// * clone 메소드
		// > 배열의 깊은 복사를 해주는 메소드
		
		// [ 표현법 ]
		// 복사본배열명 = 원본배열명.clone();
		
		// 복사본 배열
		int[] copy = origin.clone();
		// > 인덱스 직접지정 X, 복사할갯수 지정 X
		//	 즉, 옵션이 없기 때문에 원본 배열과 완전히 똑같이 복제해 온다!!
		
		// 복사본 배열만 출력
		/*
		for(int i = 0; i < copy.length; i++) {
			
			System.out.println(copy[i] + " ");
		}
		*/
		
		// 복사본 배열을 출력하고 싶은데, 이왕이면
		// "[1, 2, 3, 4, 5]" 형식으로 예쁘게 출력하고 싶음
		
		System.out.print("[");
		
		for(int i = 0; i < copy.length; i++) {
			
			if(i == (copy.length - 1)) {
				// 반복 마지막회차일 경우
				
				System.out.print(copy[i]);
				
			} else {
				// 반복 마지막회차가 아닐경우
				
				System.out.print(copy[i] + ", ");
			}
			
		}
		
		System.out.println("]");
		
		System.out.println();
		
		// > Arrays.toString(출력할배열명);
		//	 앞과 뒤에 [], [] 사이에는 해당 비열의 각 인덱스에 담긴 값들을 , 로 구분해서 찍어주면서
		//	 하나의 문자열로 나타내주는 메소드
		System.out.println(Arrays.toString(copy));
		
		// 복사가 잘 되었는지 확인
		System.out.println(origin);
		System.out.println(copy);
		
		System.out.println(origin == copy);
	}
} // 클래스 영역 끝
