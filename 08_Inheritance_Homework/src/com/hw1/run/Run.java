package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Person;
import com.hw1.model.vo.Student;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 끝
		// Student s[] = new Student[3];
		Person p[] = new Person[13];
		int count = 0;
		p/*s*/[0] = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
		count++;
		p/*s*/[1] = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
		count++;
		p/*s*/[2] = new Student("강개순", 23, 167.0, 45, 4, "정보통신공학과");
		count++;
		/*
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].information());
		}
		*/
		// Employee emp[] = new Employee[10];
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("이름 입력 : ");
			String name = sc.nextLine();
			
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("신장(cm) 입력 : ");
			double height = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("몸무게(kg) 입력 : ");
			double weight = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("급여 입력 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			
			System.out.print("부서 입력 : ");
			String dept = sc.nextLine();
			
			/*emp*/p[count] = new Employee(name, age, height, weight, salary, dept);
			count++;
			
			System.out.print("계속 추가하려면 아무키나 입력하세요.(나가려면 n을입력하세요) : ");
			char yn = sc.next().charAt(0);
			sc.nextLine();
			
			if(yn == 'n') {
				break;
			}
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println(/*emp*/p[i].information());
		}
		
	} // main 영역 시작

} // 클래스 영역 끝
