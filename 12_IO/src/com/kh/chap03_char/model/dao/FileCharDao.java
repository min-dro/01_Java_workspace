package com.kh.chap03_char.model.dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao { // 클래스 영역 시작

	/*
	 * * 입출력 과정 (3 steps)
	 * 1. 통로 열기
	 * 2. 볼일 보기
	 * 3. 통로 닫기
	 */
	
	// 프로그램 (기준점) ---> 외부매체 (파일)
	// 출력 : 프로그램 내의 데이터를 파일로 내보내기 (즉, 파일로 기록하겠다)
	public void fileSave() { // 메소드 영역 시작
		
		// FileWriter
		// > "파일" 로 데이터를 2byte 단위로 출력하는 스트림
		
		// 0. FileWriter 참조 변수 선언 및 null
		FileWriter fw = null;
		
		try {
				
			// 1. 통로 열기 (== 스트림 객체 생성)
			fw = new FileWriter("b_char.txt"/* , false */);
			// > 출력 통로는 존재하지 않는 파일명 제시 시, 해당 파일을 내부적으로 만들고 나서 연결 통로가 이어짐!!
			//	 (파일명만 제시했기 때문에 상대경로 방식에 의해 이 작업중인 프로젝트 폴더 내부에 바로 만들어짐)
			// > 마찬가지로 false 가 기본값으로 "덮어쓰기" 옵션임!!
			//	 true 로 매개변수를 추가할 경우 "이어쓰기" 옵션이 됨!!
			
			// 2. 볼일 보기
			// > 2byte 단위로 데이터 내보내기
			//	 write() 메소드 사용
			fw.write("와! IO 재밌다..ㅎ");
			// > 한글 전송 가능!!
			// > 해당 문자열의 문자 하나하나씩을 끊어서 일일이 내보내는 개념임!!
			
			fw.write('A');
			fw.write(' ');
			fw.write('\n'); // 개행문자 (Enter 키)
			
			char[] cArr = {'k', 'i', 'w', 'i'};
			fw.write(cArr);
			// > 오버로딩된 형태 활용 가능!!
			
			// 3. 통로 닫기 (close) - 마지막에 무조건 꼭 일어나야 하는 구문 (finally 에서 작업)
			
		} catch(IOException e) {
			
			e.printStackTrace();
		
		} finally { 
			
			try {
				// 3. 다 쓴 스트림 자원 반납 (close)
				fw.close();
			} catch(IOException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료");
		
	} // 메소드 영역 끝
	
	// 프로그램 (기준점) <--- 외부매체 (파일)
	// 입력 : 파일로부터 데이터를 가져오겠다. 읽어들이겠다.
	public void fileRead() { // 메소드 영역 시작
		
		// FileReader
		// > "파일" 로부터 데이터를 2byte 단위로 입력받는 스트림
		
		// 0. FileReader 참조 변수 선언 및 null
		FileReader fr = null;
		
		try {
		
			// 1. 통로 열기 (== 스트림 객체 생성)
			fr = new FileReader("b_char.txt");
			// > 반드시 존재하는 파일명으로만 제시해야함!!
			
			// 2. 볼일 보기
			// > 2byte 단위로 읽어들이는 작업
			//	 read() 메소드 사용
			// > 마찬가지로 문자로 저장된 걸 읽어오더라도 정수로 변환해서 갖고 옴!!
			// System.out.println((char)fr.read()); // 50752 --> '와'
			// System.out.println(fr.read()); // 33 --> '!'
			// System.out.println(fr.read()); // 32 --> ' '
			// ...
			
			// 파일의 끝을 만나면? 즉, 더이상 읽어들일 문자가 없다면?
			// > fr.read() 를 호출했을 때 -1 를 리턴함
			
			// > 이 점을 활용하면 마찬가지로 반복문을 쓸 수 있게 된다.
			
			/*
			while(fr.read() != -1) {
				
				System.out.println(fr.read());
			}
			*/
			// > 마찬가지로 퐁당퐁당 출력
			
			// 1)
			/*
			while(true) {
				
				int value = fr.read();
				
				if(value == -1) {
					
					break;
				}
				
				System.out.println(value);
			}
			*/
			
			// 2)
			int value = 0;
			
			while((value = fr.read()) != -1) {
				
				System.out.print((char)value);
			}
			
			// 3. 통로 닫기 - 마지막에 무조건 실행 (finally)
			
		} catch(IOException e) {
			// > IOException 에 대한 catch 블록만 작성해도 무방함!!
			//	 FileNotFoundException 이 자식 타입이므로 다형성에 의해 부모타입 catch 블록이
			//	 자식 타입의 예외도 모두 다 잡아주기 때문!!
			
			e.printStackTrace();
			
		} finally {
			
			try {
		
				// 3. 자원 반납
				fr.close();
			
			} catch(IOException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
		
	} // 메소드 영역 끝
	
	/*
	 * * Input/OutputStream 계열의 객체와 Reader/Writer 계열의 객체를 사용법이
	 * 	 전반적으로 비슷비슷하다!!
	 * > 각 계열별로 모든 클래스들의 부모가 전부 같음!!
	 * 	 (동일한 코드를 물려받아서 만든 구조라는 뜻)
	 * > 그래서 사용법이 다 거기서 거기임!!
	 */
	
} // 클래스 영역 끝
