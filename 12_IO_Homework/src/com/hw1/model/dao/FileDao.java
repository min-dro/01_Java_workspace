package com.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao { // 클래스 영역 시작

	Scanner sc = new Scanner(System.in);
	
	public FileDao() {}
	
	public void fileSave() { // 메소드 영역 시작
		
		StringBuilder sb = new StringBuilder();
		System.out.print("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");
		while(true) {
			String str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			} else {
				sb.append(str + "\n");
			}
		}
		
		System.out.print("저장하시겠습니까? (y/n) : ");
		String yn = sc.nextLine();
		
		yn = yn.toLowerCase();
		if(yn.equals("y")) {
			System.out.print("저장할 파일명 입력 : ");
			String file = sc.nextLine();
			
			BufferedWriter bw = null;
			FileWriter fw = null;
			try {
				fw = new FileWriter(file + ".txt");
				bw = new BufferedWriter(fw);
				
				bw.write(sb.toString());
				System.out.println(file + ".txt 파일에 성공적으로 저장하였습니다.");
				
			} catch(IOException e) {
				
				e.printStackTrace();
			} finally {
				try {
					bw.close();
					fw.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("다시 메뉴로 돌아갑니다.");
		}
		
	} // 메소드 영역 끝
	
	public void fileOpen() { // 메소드 영역 시작
		System.out.print("열기 할 파일명 : ");
		String file = sc.nextLine();
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader(file + ".txt");
			br = new BufferedReader(fr);
			String value = "";
			
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		} catch(FileNotFoundException e){
			System.out.println("존재하는 파일이 없습니다.");
			
		} catch(IOException e) {
				
				e.printStackTrace();
				
		} finally {
			try {
				br.close();
				fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	} // 메소드 영역 끝
	
	public void fileEdit() { // 메소드 영역 시작
		
		System.out.print("수정할 파일명 : ");
		String file = sc.nextLine();
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(file + ".txt");
			br = new BufferedReader(fr);
			
			StringBuilder sb = new StringBuilder();
			String value = "";
			while((value = br.readLine()) != null) {
				System.out.println(value);
				sb.append(value + "\n");
			}
	
			fw = new FileWriter(file + ".txt");
			bw = new BufferedWriter(fw);
			
			System.out.print("파일에 추가할 내용을 입력하시오 : ");
			while(true) {
				String str = sc.nextLine();
				
				if(str.equals("exit")) {
					break;
				} else {
					sb.append(str + "\n");
				}
			}
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
			String yn = sc.nextLine();
			
			yn = yn.toLowerCase();
			if(yn.equals("y")) {
					
				bw.write(sb.toString());
				System.out.println(file + ".txt 파일의 내용이 변경되었습니다.");	
				
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
				fw.close();
				fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
