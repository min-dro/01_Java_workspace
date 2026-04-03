package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		Student s[] = new Student[10];
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			s[count] = new Student();
			
			System.out.print("학년 입력 : ");
			s[count].setGrade(sc.nextInt());
			sc.nextLine();
			
			System.out.print("반 입력 : ");
			s[count].setClassroom(sc.nextInt());
			sc.nextLine();
			
			System.out.print("이름 입력 : ");
			s[count].setName(sc.nextLine());
			
			System.out.print("국어점수 입력 : ");
			s[count].setKor(sc.nextInt());
			sc.nextLine();
			
			System.out.print("영어점수 입력 : ");
			s[count].setEng(sc.nextInt());
			sc.nextLine();
			
			System.out.print("수학점수 입력 : ");
			s[count].setMath(sc.nextInt());
			sc.nextLine();
			count++;
			System.out.print("계속 학생을 추가하려면 아무키나 입력하세요.(나가려면 n을입력하세요) : ");
			char yn = sc.next().charAt(0);
			sc.nextLine();
			
			if(yn == 'n') {
				break;
			}
		}
		
		for(int i = 0; i <= count; i++) {
			System.out.println(s[i].information());   
			
		}
		
	} // main 영역 끝

} // 클래스 영역 끝
