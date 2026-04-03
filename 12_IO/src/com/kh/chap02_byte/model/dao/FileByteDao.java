package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * * 클래스를 어떤 용도에 따라 만드느냐에 따라 구분이 바뀜
 * 1. 정보를 담는 용도의 클래스 : VO
 * 2. 기능 위주의 클래스 : Controller
 * 3. 데이터가 보관되어있는 "외부 매체" 와 통로를 열어 직접 데이터를 입출력하는 용도의 클래스 : DAO
 * 	  > Data Access Object
 */

// "파일" 이라는 "외부매체" 와 연결하는 스트림 (통로) 를 만들어 데이터를 입출력할 용도로 만든 클래스
// > 데이터 입출력용 메소드만 정의하기!!
public class FileByteDao { // 클래스 영역 시작

	/*
	 * * 입출력 과정 (3 steps)
	 * 1. 통로 열기 (== 스트림 객체 생성)
	 * 2. 볼일 보기 (입력이든 출력이든 간에)
	 * 3. 통로 닫기
	 */
	
	// 프로그램 (기준점) ---> 외부매체 (파일)
	// > 출력 : 프로그램 내의 데이터를 파일로 내보내기 (즉, 파일로 기록하겠다)
	public void fileSave() { // 메소드 영역 시작
		
		// FileOutputStream
		// > "파일" 로 데이터를 1byte 단위로 출력해주는 기반스트림
		
		// 0. FileOutputStream 참조 변수 선언 및 null 로 초기화
		// > finally 에서의 지역변수 이슈를 해결하기 위해
		FileOutputStream fout = null;
		
		try {
			
			// 1. 통로 열기 (== 스트림 객체 생성)
			fout = new FileOutputStream("a_byte.txt" /*, false */);
			// > a_byte.txt 파일과 출력 통로를 연결해주겠다.
			// > 객체 생성 시 연결하고자 하는 파일명을 매개변수로 제시함!!
			//	 이 떄, 해당 파일이 존재하지 않으면
			//	 내부적으로 해당 파일이 생성되고 그 이후에 통로가 연결됨
			//	 해당 파일이 이미 존재한다면 그냥 통로가 연결됨
			// > 여기서 별도의 경로 없이 해당 파일명만 제시 시 현재 내가 작업중인 프로젝트 폴더 내에 생성
			//	 (상대경로 방식)
			
			// FileOutputStream fout = new FileOutputStream("a_byte.txt" true);
			// > 객체 생성 시 매개변수로 true 작성 시 : 기존에 해당 파일이 있을 경우 내용이 "이어쓰여짐"
			//					    false 작성 시 : 기존에 해당 파일이 있을 경우 내용이 "덮어쓰여짐"
			// > boolean 매개변수 생략 시 "덮어쓰여짐"!! (기본 옵션은 덮어쓰기 false 임!!)
			
			// 2. 볼일 보기 (출력 방향)
			// > 1byte 단위로 "내보내는" 작업
			//	 write() 메소드 사용
			
			// 1byte : -128 ~ 127 사이의 정수
			// 단, 파일에 기록되기를 0 ~ 127 까지만 기록됨 (아스키 코드표에 의해)
			fout.write(97); // 'a' 기록
			fout.write('b'); // 'b' 기록
			// char 와 int 사이는 자동형변환이 됨!!
			// > int 로 출력할 값을 넘기더라도 파일에 실제로 기록되기를 아스키 코드표에 의한 문자로 기록됨!!
			
			// fout.write('김'); // '@' 기록
			// > 한글은 2byte 이기 때문에 깨져서 저장!! (바이트 스트림으로는 한글이 제한적임)
			
			byte[] bArr = {99, 100, 101};
			fout.write(bArr); // 'c', 'd', 'e' 기록
			
			fout.write(bArr, 1, 2); // 'd', 'e' 기록
			// > 오버로딩된 형태들도 활용 가능!!
			
			// 3. 통로 닫기
			// > 통로 닫기 == 다 쓴 스트림 자원을 반납하겠다.
			//	 close() 메소드 사용
			// fout.close();
			// > 위에서 통로를 열고 볼일을 보는 동안 갑자기 혹시라도 예외가 발생할 경우
			//	 바로 catch 블록으로 예외 흐름이 빠질거임!!
			// > close 메소드가 호출되지 않거 (특, 통로가 닫히지 않고) 마저 흐름이 진행될것임!!
			// > 통로를 닫는 구문은 예외가 발생하든 발생하지 않든 간에 무조건 반드시 실행되야함!!
			//	 (finally 블록에서 작성)
			
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
			
		} catch(IOException e) {
			// > IOException 은 FileNotFoundException 의 부모클래스임!! (아래에 적어야 함!!)
			
			e.printStackTrace();
			
		} finally {
			
			/*
			 * finally 블록
			 * > try ~ catch문 뒤에 옵션처험 붙여 쓸 수 있는 코드 블록
			 * > try 안쪽 구문 중에서 예외가 발생하든 발생하지 않든 간에
			 * 	 제일 마지맏에 무조건 실행해야 하는 구문이 있다면
			 * 	 finally 블록 안쪽에서 해당 구문을 작성한다!!
			 */
			
			try {
				
				// 3. 통로 닫기
				fout.close();
			
			} catch(IOException e) {
				
				e.printStackTrace();
			}
			// > try ~ catch문도 언제든지 중첩 사용이 가능!!
		}
		
		System.out.println("프로그램 종료");
		
	} // 메소드 영역 끝
	
	// 프로그램 (기준점) <--- 외부매체 (파일)
	// 입력 : 파일로부터 데이터를 가지고 오겠다. 읽어들이겠다.
	public void fileRead() { // 메소드 영역 시작
		
		// FileInputStream
		// > "파일" 로 부터 데이터를 1byte 단위로 입력받는 스트림
		
		// 0. FileInputStream 참조 변수 선언 및 null 로 초기화
		FileInputStream fin = null;
		
		try {
				// 1. 통로 열기 (== 스트림 객체 생성)
				fin = new FileInputStream("a_byte.txt");
				// > FileOutputStream 객체 생성 시에는 없는 파일명을 제시해도 파일을 생성 후 연결해줬었음!!
				// > 하지만 FileInputStream 객체 생성 시에는 없는 파일명을 제시하면 그대로 오류 발생!!
				//	 (FileNotFoundException 오류 발생!!)
				// > FileInputStream 객체 생성 시 없는 파일명을 제시하면 파일을 자동으로 생성해주지 않음!!
				
				// 2. 볼일 보기
				// > 해당 파일로부터 데이터를 1byte 단위로 읽어들이는 과정
				//   read() 메소드 사용
				// > 문자로써 기록되어있어도 읽어들일 때에는 아스키 코드표애 의해 숫자로 읽어들림!!
				// > 한번에 한개의 문자만 읽어들임!!
				
				/*
				System.out.println(fin.read()); // 97
				System.out.println(fin.read());	// 98 
				System.out.println(fin.read()); // 99
				System.out.println(fin.read()); // 100
				System.out.println(fin.read()); // 101
				System.out.println(fin.read()); // 100
				System.out.println(fin.read()); // 101
				
				System.out.println(fin.read()); // -1
				System.out.println(fin.read()); // -1
				System.out.println(fin.read()); // -1
				*/
				// > 더이상 일어들일 문자가 없을 경우 (즉, 파일의 끝을 만나는 경우)
				// 	 -1 을 리턴해준다!!
					
				// 파일의 데이터를 모두 읽어들일 수 있도록 반복문을 활용
				/*
				for(int i = 0; i < 7; i++) {
					
					System.out.println(fin.read());
				}
				*/
				// > 파일의 글자수가 몇이나 될 줄 알고 for문을 막 쓰는건 아님!!
					
				// "이 파일의 글자수 만큼만" 반복을 돌리겠다. (글자수를 셀 수 없는 상황)
				// > 반복 횟수가 애매함!! (for문 대신 while문)
				
				/*
				while(fin.read() != -1) {
				
					System.out.println(fin.read());
				}
				*/
				// > 퐁당퐁당 출력됨!!
				//	 반복 1회차 당 read 메소드가 검사용 1번, 출력용 1번
				//   총 2번씩 호출되기 때문!!
				
				// 해결방법1)
				// 무한반복을 이용해서 매번 조건검사 하기
				/*
				while(true) {
					
					int value = fin.read();
					
					if(value == -1) {
						
						break;
					}
					
					System.out.println(value);
				}
				*/
				
				// 해결방법2)
				// 조건식 내부에 "대입" 구문을 활용하기 (연산 우선순위 주의!!)
				int value = 0;
				
				while((value = fin.read()) != -1) {
					
					System.out.print((char)value);
				}
				
				System.out.println();
				
				// 3. 통로 닫기 (close)
				// > finally 블록에서 작성!!
				
		} catch(FileNotFoundException e) {
			
				e.printStackTrace();
		
		} catch(IOException e) {
			
				e.printStackTrace();
			
		} finally {
				try {
				
					// 3. 다 쓴 스트림 자원 반납
					fin.close();
			
				} catch(IOException e) {
			
					e.printStackTrace();
				}
		}
		
		System.out.println("프로그램 종료");
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
