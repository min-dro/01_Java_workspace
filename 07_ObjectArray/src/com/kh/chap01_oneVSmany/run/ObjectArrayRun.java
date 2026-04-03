package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

// 객체배열 사용 후 - 도서관리 프로그램을 만든다고 가정
public class ObjectArrayRun { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		// 3권의 도서 정보 관리 (객체 배열을 이용해서)
		
		// 3개의 Book 객체를 묶어 담아서 보관할 배열 생성
		// 자료형[] 배열명; // 선언
		// 배열명 == new 자료형[크기]; // 할당 (new == 생성)
		// > 자료형[] 배열명 = new 자료형[크기]; // 한번에 선언과 동시애 할당
		
		Book[] arr = new Book[3];
		// > Book 클래스 : 사용자 정의 자료형
		//	 객체 : 참조자료형 변수

		// arr[0] arr[1] arr[2]
		// null	  null   null
		// > 각 인덱스 자리에는 Book 타입의 주소값만 담길 수 있다!!
		
		Scanner sc = new Scanner(System.in);
		
		// 배열의 가장 큰 장점 : 반복문 활용이 가능하다
		for(int i = 0; i < arr.length; i++) {
			// > i : 0 1 2 (반복이 돔) / 3 (빠져나옴)
			
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자명 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사명 : ");
			String publisher = sc.nextLine();
			
			arr[i] = new Book(title, author, price, publisher);
				
		}
		
		// > 배열의 규칙은 인덱스 기준!!
		//	 시작수는 늘 0 부터, 끝수는 배열의 크기보다 작을 때 까지
		//	 (반복문 활용이 쉬워짐)
		
		// 전채 도서 정보들을 출력하기 (조회)
		/*
		System.out.println(arr[0].information());
		System.out.println(arr[1].information());
		System.out.println(arr[2].information());
		*/
		
		// 반복문 활용
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i].information());
			
			// System.out.println(arr[i]); // 주소값
			// > 배열의 각 인덱스 자리에는 주소값이 담겨있다!!
		}
		
		// 사용자에세 검색할 도서 제족을 입력받아 각 전체 도서들의 제목과 일일이 비교하며
		// 일치하는 도서의 가격을 알려주는 "검색 기능" 구현
		System.out.println("검색할 책 제목 : ");
		String searchTitle = sc.nextLine();
		
		// + 기능 보완
		// 만약 일치하는 도서를 찾지 못한 경우 "검색된 도서가 없습니다." 라고 출력하기
		
		// 보조해주는 변수 활용
		int count = 0; // 반복문 내부에서 일치하는 도서를 찾을 때 마다 1씩 증가시킬 예정
		// > 결국 일치하는 도서의 갯수를 셋 용도의 변수
		//	 일치하는 도서를 찾을 때 마다 count++;
		
		// searchTitle 과 arr[0].title, arr[1].title, arr[2].title 을 비교
		for(int i = 0; i < arr.length; i++) {
			
			if(searchTitle.equals(arr[i].getTitle())) {
				// > 검색어 도서명과 i 번째 도서명이 일치할경우 (즉, 일치하는 도서를 찾았을 경우)
				
				System.out.println(arr[i].getPrice());
				
				count++;
				break;
				// > "책의 제목들이 서로 중복되지 않는다 라는 가정 하에"
				//	첫번째 검색 결과가 일치한다면? 그 이후의 검사는 굳이 안해도 됨!!
				//	일치하는 도서를 찾자마자 count 를 1 증가시키고 검사용 반복문 빠져나가기
			}
		}
		
		// 이 시점 기준으로 count 에는
		// 도서의 권수 만큼의 정수값이 담겨있을 것!!
		// > 일치하는 도서가 단 한권도 없었다면? count == 0
		//	 일치하는 도서가 한권이라도 있다면? count != 0
		if(count == 0) {
			
			System.out.println("검색된 도서가 없습니다.");
		}
		
		// 연습문제)
		// > 새학기 맞이 도서 할인 행사를 열려고 함
		//	 각 도서를 10% 씩 할인된 가격으로 출력해보기
		
		System.out.println("도서 할인행사 합니다!");
		int discountRate = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			discountRate = (int)(arr[i].getPrice() -(arr[i].getPrice() * 0.1));
			
			System.out.println("도서명 : " + arr[i].getTitle() 
					+ ", 정가 : " + arr[i].getPrice() 
					+ ", 할인가 : " + (int)(arr[i].getPrice() * 0.9));
		}
		
	} // main 영역 끝

} // 클래스 영역 끝
