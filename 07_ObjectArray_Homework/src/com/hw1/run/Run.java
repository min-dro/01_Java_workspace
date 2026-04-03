package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // 메소드 영역 시작
		Employee emp[] = new Employee[3];

		emp[0] = new Employee();
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333"
				, "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F'
				, 1000000, 0.01, "01011112222", "서울 마곡");
		for(int i = 0; i < emp.length; i++) {
			System.out.println("emp[" + i + "] : " + emp[i].information());
		}
		System.out.println("===============================");
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("서울 마곡");
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		System.out.println(emp[0].information());
		System.out.println(emp[1].information());
		System.out.println("=================================");
		double total = 0;
		for(int i = 0; i < emp.length; i++) {
			total += (emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint())) * 12;
			System.out.println(emp[i].getEmpName() + "의 연봉 : " + (int)(emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint())) * 12 + "원");
		}
		System.out.println("=================================");
		int avg = (int)(total / 3);
		System.out.println("직원들의 연봉의 평균 : " + avg + "원");
	} // 메소드 영역 끝

} // 클래스 영역 끝
