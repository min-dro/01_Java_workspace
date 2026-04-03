package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

// 객체배열 사용 전 - 도서 관리 프로그램을 만든다고 가정
public class ObjectRun { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작

		/*
		// 각각의 도서 정보를 나타내는 Book 타입의 객체 생성
		// 1. 기본생성자로 객체 생성 후 setter 메소드로 각 필드에 대입
		Book bk1 = new Book(); // 초기값으로 셋팅됨
		bk1.setTitle("두잇 자바 프로그래밍");
		bk1.setAuthor("박은종");
		bk1.setPrice(25000);
		bk1.setPublisher("이지스 퍼플리싱");
		
		// 2. 매개변수생성자로 객체 생성과 동시에 각 필드에 초기화
		Book bk2 = new Book("개발자를 위한 쉬운 도커", "황현우", 28000, "위키북스");
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		// 3. 사용자가 키보드로 입력한 값들로 Book 객체를 생성
		// Book bk3 = new Book(사용자가입력한제목, 입력한저자명, 입력한가격, 입력한출판사명);
		
		Scanner sc = new Scanner(System.in);
		// > 사실 스캐너 객체 생성 시에도 "매개변수 생성자" 를 이용했던 것!!
		
		// 도서 정보 입력받기 (변수에 저장)
		System.out.print("제목 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사명 : ");
		String publisher = sc.nextLine();
		
		// 이 저장된 값들을 가지고 Book 객체 생성하고 초기화하기
		Book bk3 = new Book(title, author, price, publisher);
		
		System.out.println(bk3.information());
		*/
		
		// 세 권의 도서정보를 관리한다는 가정 하에
		// 각각의 Book 객체를 따로따로 관리하는 프로그램
		// (단, 도서 정보는 사용자로부터 키보드로 입력받기)
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		// > bk1, bk2, bk3 은 "참조자료형 변수 (객체)", 이 때 자료형은 Book 클래스 (사용자 정의 자료형)
		// 자료형 변수명 = 값; // 지역변수는 항상 초기화 하기!! (보통은 타입 별 기본값으로 넣어줌, 참조자료형의 기본값은 null)
		
		Scanner sc = new Scanner(System.in);
		
		// 3개의 전체 도서 정보를 입력받은 후 각 객체에 초기화
		// > 이전에 봤었던 변수만 가지고 프로그래밍 하는 상황과 똑같음!! (반복문 적용 불가)
		
		// 반복문을 안쓰기에는 코드가 너무 길고 복잡!! 어떻게든 되게 해보겠음!!
		for(int i = 0; i < 3; i++) {
			// i : 0 1 2 (반복 돌아감) / 3 (반복 빠져나감)
			
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자명 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사명 : ");
			String publisher = sc.nextLine();
			
			// 반복 1회차 : bk1 에 셋팅 (i 가 0)
			// 반복 2회차 : bk2 에 셋팅 (i 가 1)
			// 반복 3회차 : bk3 에 셋팅 (i 가 2)
			
			// bki = new Book();
			// > i 에 숫자값이 들어가면서 변수명이 완성되지 않음!!
			
			if(i == 0) {
				
				bk1 = new Book(title, author, price, publisher);
			
			} else if(i == 1) {
				
				bk2 = new Book(title, author, price, publisher);
			
			} else {
			
				bk3 = new Book(title, author, price, publisher);
				
			}
			
		}
		// > 변수만 가지고 프로그래밍 하면 반복문을 쓸 수는 있는데 귀찮아짐..
		
		// 전체 도서 정보 출력 (조회 기능, Read)
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		// 사용자로부터 검색할 도서 제목을 입력받아
		// 각 전체 도서들의 제목과 일일이 비교하져 일치하는 도서의 가격을 알려주는 "검색 기능" 구현
		
		// 검색어 (도서 제목) 입력
		System.out.print("검색할 도서 제목 : ");
		String searchTitle = sc.nextLine();
		
		// searchTitle 과 bk1, bk2, bk3 각각의 title 필드값이 일치하는지를 비교
		
		if(searchTitle.equals(bk1.getTitle())) {
			
			System.out.println(bk1.getPrice());
		}
		
		if(searchTitle.equals(bk2.getTitle())) {
			
			System.out.println(bk2.getPrice());
		}
		
		if(searchTitle.equals(bk3.getTitle())) {
			
			System.out.println(bk3.getPrice());
		}
		
	} // main 영역 끝

} // 클래스 영역 끝
