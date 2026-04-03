package com.kh.chap02_objectArray.run;

import java.util.Arrays;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		// 휴대폰 3대를 관리하는 프로그램
		// 방법1)
		/*
		Phone p1 = null;
		Phone p2 = null;
		Phone p3 = null;
		*/
		// > 각각의 객체를 따로따로 관리하는 방법으로 코드 짜기 (즉, 변수만 가지고 프로그래밍 할 때와 같은 상황)
		
		// 방법2)
		Phone[] arr = new Phone[3];
		// [0]  [1]  [2]
		// null null null
		
		System.out.println(arr); // 배열의 주소값
		System.out.println(arr.length); // 배열의 크기
		System.out.println(arr[0]); // null (참조자료형의 기본값)
		
		System.out.println(Arrays.toString(arr));
		// > 아직까지는 모두 null 만 담겨있음!!
		
		// 해결방법2 를 위해 휴대폰 데이터의 갯수를 셀 보조해주는 변수 셋팅하기
		int count = 0;
		// > 휴대폰 객체가 하나씩 "생성 (new)" 될 때 마다 1씩 증가시킬 것!!
		
		// 1. 기본생성자로 객체 생성 후 setter 메소드로 값 세팅
		arr[0] = new Phone();
		arr[0].setName("아이폰");
		arr[0].setSeries("11pro");
		arr[0].setBrand("애플");
		arr[0].setPrice(100000);
		count++;
		
		// 2. 매개변수생성자로 객체 생성과 동시에 값 세팅
		arr[1] = new Phone("플립폰", "1", "삼성", 120000);
		count++;
		
		System.out.println("----");
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("----");
		
		// 휴대폰 총 3대를 보관할 수 있는 배열에서 앞에서부터 2칸만 휴대폰을 채웠뒀음!!
		// > 반복을 평소처럼 배열의 크기만큼 돌렸더니 null 을 만나는 반복 횟수로 들어오는 순간 NullPointerException 오류가 발생!!
		
		// 해결방법1) 반복문 안에서 if문을 이용해서 null 과 일치하는지 (또는 일치하지 않는지) 검사 후
		//			 null 과 일치하지 않을 경우에만 메소드를 호출하는 식으로 변경
		
		// 휴대폰 정보 출력 및총 가격을 계산하는 for문
		int sum = 0;
		
		/*
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] != null) {
				
				System.out.println(arr[i].information());
		
				sum = sum = arr[i].getPrice(); // sum += arr[i].getPrice();
		
			}
			
		}
		*/
		
		// 해결방법2) "0번 인덱스에서 부터 차곡차곡 데이터를 담아왔을 경우에만 해당"
		// > 담긴 데이터의 갯수만큼만 반복을 돌리기
		for(int i = 0; i < count; i++) {
			
			System.out.println(arr[i].information());
			
			sum += arr[i].getPrice();
		}
		
		
		System.out.println("----");
		
		System.out.println("총 가격 : " + sum + "원");
		System.out.println("평균가 : " + (sum / count) + "원");
		
	} // main 영역 끝

} // 클래스 영역 끝
