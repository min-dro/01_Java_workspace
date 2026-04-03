package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun { // 클래스 영역 시작

	public static void main(String[] args) { // 메소드 영역 시작
		
		// 1. "기본 생성자" 로 객체 생성
		User u1 = new User();
		
		System.out.println(u1.information());
		// > null, null, null, 0, ''
		//	 각 필드값이 JVM 에 의해 타입별 기본값으로 채워져있음!!
		
		// 내가 원하는 값으로 채워주려면?
		// > setter 메소드를 통해 채워줘야함!! (지금 상황에서는 적어도 5번은 호출해야함)
		
		// 2. "매개변수 3개짜리 생성자" 로 객체 생성
		// > 잘 쓰면 심지어 처음부터 내가 원하는 값으로 필드들이 채워진 객체를 만들어 낼 수 있음!!
		User u2 = new User("user01", "pass01", "김말똥");
		
		System.out.println(u2.information());
		// > "user01", "pass01", "김말똥");
		
		// > u2 에 대해서는 seter 를 두번은 호출해야함!!(나이, 성별이 채워짐)
		
		// 3. "모든 필드를 매개변수로 갖는 생성자" 로 잭체 생성 (매개변수 5개짜리 생성자)
		User u3 = new User("user02", "pass02", "박말순", 38, '여');
		
		System.out.println(u3.information());
		// > "user02", "pass02", "박말순", 38, '여'
		
		// > u3 는 처음부터 내가 원하는 값들로 필드가 채워져서 객체가 생성됨!!
		
		System.out.println("-------");
		
		// * 매개변수는 생성자를 이용하더라도 setter 메소그는 반드시 만들어 줘야 함!!
		// > setter 메소드를 작성하는 행위는 "캡슐화" 과정의 일부이기 때문에 반드시 해야함
		// > 언젠가는 setter 메소드를 쓸 일이 생길 수도 있다!!
		
		// 예시)
		// 박말순 회원이 비밀번호를 변경하고 싶어함!!
		u3.setUserPwd("Password02!");
		
		System.out.println(u3.information());
		
		// 김말똥 회원이 김영희로 개명했음!!
		u2.setUserName("김영희");
		
		System.out.println(u2.information());
		
		// > 작업 중 일부 필드값만 수정할 일이 자주 발생하기 때문에
		//	 setter 메소드는 무조건 만들어야함!! (아무리 매개변수 생성자가 있더라도)
	} // 메소드 영역 끝

} // 클래스 영역 끝
