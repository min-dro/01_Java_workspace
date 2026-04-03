package com.hw2.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScoreProcess { // 클래스 영역 시작

	Scanner sc = new Scanner(System.in);
	
	public ScoreProcess() {}
	
	public void scoreSave() { // 메소드 영역 시작
		
		int num = 0;
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.dat"))){
			
			while(true) {
				System.out.println("======다음의 성적을 입력하시오======");
				System.out.print("국어 : ");
				int kor = sc.nextInt();
				sc.nextLine();
				dos.writeInt(kor);
				
				System.out.print("영어 : ");
				int eng = sc.nextInt();
				sc.nextLine();
				dos.writeInt(eng);
				
				System.out.print("수학 : ");
				int math = sc.nextInt();
				sc.nextLine();
				dos.writeInt(math);
				
				int sum = kor + eng + math;
				dos.writeInt(sum);
				
				double avg = (double)sum / 3;
				dos.writeDouble(avg);
				
				num++;
				System.out.println(num + "번째 학생 정보 기록");
				
				System.out.print("계속 저장하시겠습니까? (y/n) : ");
				String yn = sc.nextLine();
				while(true) {
					if(yn.equals("n")) {
						System.out.println("score.dat 파일에 저장 완료");
						return;
					} else if(yn.equals("y")) {
						break;
					} else {
						System.out.println("잘못 입력하였습니다.");
					}
				}
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	} // 메소드 영역 끝
	
	public void scoreRead() { // 메소드 영역 시작
		int kor = 0, eng = 0, mat = 0, sum = 0;
		double avg = 0.0, avgS = 0.0;
		
		int count = 0;
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("score.dat"))) {
			
			while(true) {
				kor = dis.readInt();
				eng = dis.readInt();
				mat = dis.readInt();
				sum = dis.readInt();
				avg = dis.readDouble();
				avgS += avg;
				
				count++;
				System.out.println(count + "번째 학생");
				System.out.println("국   영   수   총점   평균");
				System.out.printf("%d  %d  %d  %d  %.2f\n", kor, eng, mat, sum, avg);
				System.out.println();
			}
			
		} catch(IOException e) {
			
			System.out.println("읽은 횟수  전체 평균");
			System.out.printf("%d       %.2f\n", count, (avgS / count) );
			System.out.println();
		}
		
		System.out.println("score.dat 파일 읽기 완료!");
		
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
