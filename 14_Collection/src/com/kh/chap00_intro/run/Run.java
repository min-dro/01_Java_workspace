package com.kh.chap00_intro.run;

import com.kh.chap00_intro.util.MyList;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		// 기본생성자로 MyList 객체 생성
		MyList list = new MyList(); // 10칸짜리 arr, size == 0

		System.out.println(list /* toString() */); // []
		System.out.println("size : " + list.size()); // 0
		System.out.println("isEmpty : " + list.isEmpty()); // true
		
		System.out.println("-----------");
		
		list.add("안녕하세요"); // [0]
		list.add(1); // [1]
		list.add(9.876); // [2]
		list.add("ㅎㅇㅎㅇ"); // [3]
		
		System.out.println(list);
		System.out.println("size : " + list.size()); // 4
		System.out.println("isEmpty : " + list.isEmpty()); // false
		
		System.out.println("------------");
		
		list.add(1, 'a');
		list.add(2, "bye~~~");
		
		System.out.println(list);
		System.out.println("size : " + list.size()); // 6
		
		System.out.println("-----------");
		
		list.set(0, "안녕히계세요");
		
		System.out.println(list);
		
		System.out.println("-----------");
		
		list.remove(3);
		
		System.out.println(list);
		System.out.println("size : " + list.size());
		
		// for문 이용
		for(int i = 0; i < 10; i++) { // 반복 10회
			
			list.add(i);
		}
		
		System.out.println(list);
		System.out.println("size : " + list.size()); // 15
		// > 배열의 크기가 가변적으로 바뀜!!
		
		System.out.println("------------");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		// ...
		
		System.out.println("------------");
		
		// for문 활용
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		
	} // main 영역 끝

} // 클래스 영역 끝

/*
 * * MyList 와 같이 기존 배열의 단점들을 보완해서 썼더니
 * - 다량의 데이터들을 100개, 1000개, 10000개, ... 다량으로 크기에 상관 없이 계속 담을 수 있게 됨!!
 * - 자료형에 상관 없이 아무 타입의 데이터나 다 담을 수 있게 됨!!
 * - 근데 그래도 근본은 배열로 만들었기 때문에 인덱스 개념을 활용해서 반복문을 짤 수 있음!!
 * 	 (즉, 배열의 장접은 살리고 단점만 보완한 형태)
 * 
 * > 다량의 데이터들을 크기, 자료형에 상관 없이 한줄로 세워서 효율적으로 관리가 가능하겠다!!
 * 
 * * "다량의 데이터들" 을 어떻게하면 효율적으로 저장하고, 추가하고, 수정하고, 삭제할 수 있을까?
 * 															 관리할 수 있을까?
 * > 이 방법에 대해서 고민하는 학문 - "자료구조 (Data Structure)"
 *
 * * 다량의 데이터를 효율적으로 저장하고 관리하는 방법 - 자료구조
 * 1. 선형 자료구조 - 한줄로 세워서 보관 (아까 우리가 만든 MyList 에 해당됨)
 * 예) 리스트 (배열 기반으로 데이터들을 줄세워서 관리, 각각의 데이터들을 비엔나 소세지처럼 엮어서 관리 등)
 * 	 스택 (선입 후출 구조로 데이터를 줄세워서 관리)
 * 	 큐 (선입 선출 구조로 데이터를 줄세워서 관리)
 * 	 ...
 * 
 * 2. 비선형 자료구조 - 한줄로 세우지 않고 보관 (그냥 어딘가에서 순서 없이 막 담겠다)
 * 예) 트리 (부모 - 자식 관계를 갖는 모양으로 데이터를 저장, 계층벅으로 데이터 관리)
 * 	  그래프 (그물망 모양으로 데이터들을 무작위로 엮어서 관리)
 */
 