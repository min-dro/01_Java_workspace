package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run { // 클래스 영역 시작

	/*
	 * 7. "캡슐화" 과정을 통해 더 완벽한 클래스의 형태를 갖추게 하자
	 * 
	 * - 캡슐화를 하지 않으면 : 외부로부터 직접 접근이 가능하기 때문에
	 * 						  함부로 값이 변질되거나 함부로 값이 조회가 가능해지게 됨!!
	 * 예) 다흔 학생이 김영희 학생의 정보를 보면 안됨 / 다른 학생이 김영희 학생의 정보를 수정해서도 안됨
	 * 
	 * > 그래서 캡슐화 작업을 반드시 해줘야 함!!
	 * 	 객체지향 설계 원칙 중 하나가 "정보은닉", 정보은닉 기술 중 하나가 "캡슐화" (데이터은닉)
	 * 
	 * 캡슐화 : 데이터의 접근 제한을 원칙으로 하여 외부로부터 직접 접근을 막자! 라는 컨셉임
	 * 		   단, 대신에 간접적으로나마 값을 처리 (대입, 조회) 할 수 있게끔 조치는 취해두자!!
	 * 
	 * 1) 정보은닉 단계
	 * > 필드들을 외부로부터 직접 접근을 막기 위해 public 대신에 private 으로 바꿔쓰기
	 * 	 (접근제한자를 private 으로 바꾸기)
	 * 
	 * 2) setter / getter 메소드 작성
	 * > 간접적으로나마 접근해서 값을 담거나 (대입하거나, 변경하거나)
	 * 	 그 값을 가져올 수 있게끔 처리하는 과정
	 * 	 setter 메소드 : 값을 필드에 담는 (셋팅해주는) 용도의 메소드
	 * 	 getter 메소드 : 값을 필드로부터 가져올 수 있는 용도의 메소드
	 * 
	 * > 이 2단계 간접적으로 풀어주는 과정까지 대입
	 */
	
	public static void main(String[] args) { // main 영역 시작
		
		// 방금 만든 Student 클래스로 객체 생성해보기
		Student hong = new Student();
		
		// 아까처럼 필드에 직접 접근해서 값을 대입해보기!!
		/*
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 168.7;
		*/
		// > 클래스명.필드명 is not visible. 오류 발생 (보이지가 않아)
		// 	 각 필드의 접근제한자를 private 으로 설정한다면 외부에서 이 필드를 볼 수가 없어짐!!
		//	 그래서 직접 접근이 불가해진다!!
		// > setter 메소드를 통해 간접적으로 값을 넣어줄 수 있도록 해야함!!

		// setter 메소드 호출해보기 (간접대입)
		// 대변할이름.메소드명();
		// 객체명.메소드명();
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setHeight(168.7);
		// > 내가 필드에 대입하고자 하는 값을 호출 시 (여기) 에 적는다!!
		//	 setter 메소드의 매개변수가 그 값을 담아서 필드에 대입!!
		
		// 참고) 호출할 때 (여기) 에 적어서 넘기는 값을 "인자" 라고 부른다.
		//		 그 값을 메소드에서 받아주는 변수를 "매개변수" 라고 부른다.
		
		// 각 필드값이 잘 대입되었나 확인해보기 (출력)
		/*
		System.out.println(hong.name);
		System.out.println(hong.age);
		System.out.println(hong.height());
		*/
		// > 마찬가지로 is not visible 오류 발생 (보이지 않음)
		
		// getter 메소드로 각 필드값을 얻어내보기 (간접적으로 꺼내오기)
		// 객체명.메소드명();
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
		
		// 이번에도
		// "xxx님의 나이는 xx살이고, 키는 xxx.xcm 입니다." 형식으로 출력하고 싶음
		System.out.println(hong.getName() + "님의 나이는 " + hong.getAge() + "살이고, 키는 " + hong.getHeight()+ "cm 입니다.");
		System.out.printf("%s님의 나이는 %d살이고, 키는 %.1fcm 입니다.\n", hong.getName(), hong.getAge(), hong.getHeight());
	
		// > private 으로 필드의 직접접근을 막고,
		//	 setter / getter 메소드까지 작성하는 것을 "캡슐화"
		
		// > information 메소드를 호출해서 출력해보기
		System.out.println(hong.information());
		// > 매번 getter 메소드로 출력할 내용을 엮는 것 보다 더 간단해짐!!
		
		// ------------------------
		
		// 퀴즈) 고길동, 24, 180.3 학생 객체를 만들고, 정보를 출력하세요
		
		Student ko = new Student();
		// > null, 0, 0.0 (기본값으로 셋팅됨)
		
		// setter 로 값 넣어주기
		ko.setName("고길동");
		// > "고길동", 0, 0.0
		
		ko.setAge(24);
		// > "고길동" 24, 0.0
		
		ko.setHeight(180.3);
		// > "고길동" 24 180.3
		
		// 고길동 학생의 정보를 출력하기
		// 방법1) getter 를 매번 호출하는 방법
		System.out.println(ko.getName() + "님은 " + ko.getAge() + "살이묘, 키는 " + ko.getHeight() + "cm 입니다.");
		// 방법2) 아까 만든 추가적인 메소드인 information 메소드를 호출하는 방법
		System.out.println(ko.information());
		
		// 앞으로 VO 를 만들 때
		// 1. 필드 만들기
		// 2. getter/setter 만들기
		// 3. information() 만들기

	} // main 영역 끝

} // 클래스 영역 끝
