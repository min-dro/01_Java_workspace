package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

// 자바 구문을 통해 간단하게 파일을 만드는 과정 및 메소드들
public class FileRun { // 클래스 영역 시작

	/*
	 * * File 클래스
	 * > 자바 구문을 통해 파일 또는 폴더를 만들거나 그 이외의 부가적인 기능을 제공하는 자바 클래스
	 * > java.io 패키지 안에 정의되어있음 (풀클래스명은 java.io.File)
	 * > File 객체가 생성되었다고 해서 파일이 실제로 만들어 진 것은 아님!!
	 */
	
	public static void main(String[] args) { // 메소드 영역 시작
		
		
		try {
			
			// * 파일 만들어보기
			// 1. 별도의 경로 지정을 하지 않고 파일명 (test.txt) 만 제시해서 생성 - 상대경로 방식
			File file1 = new File("test.txt");
			
			file1.createNewFile();
			// > 해당 파일을 실제로 컴퓨터에 만들어주는 메소드
			// > 현재 내가 작업중인 12_IO 이 프로젝트 폴더 내에 바로 파일이 만들어짐!!
			
			// 2. 경로 지정을 한 파일명 (C:\aaa\test.txt) 을 제시해서 생성 - 절대 경로 방식 (루트 디렉토리부터 시작하는 경로 제시)
			
			// > Windows 기준으로 \ 로 폴더의 포함 관계를 나타낼 수 있다!! (C드라이브 안에 aaa 폴더 안에 test.txt 파일)
			//	 단, 자바에서 \ 는 이스케이프 문자를 나타내기 때문에 그냥 쓸 수 없다!! (\\ 로 써야 함)
			// File file2 = new File("C:\\aaa\\test.txt);
			File file2 = new File("C:/aaa/test.txt"); // / 도 가능
			// > 리눅스 기준으로는 / 로 폴더의 포함 관계를 나타낼 수 있다!! (Windows 에서도 호환되는 표기법임)
			
			file2.createNewFile();
			// > 반드시 존재하는 폴더 경로로 제시해야함!!
			//	 존재하지 않는 폴더 경로를 제시하면 IOException 발생!! (지정된 경로를 찾을 수 없습니다)
			// > 즉, C:\\aaa 라는 폴더가 이미 존재해야지만 오류가 안나고 제대로 생성될것임!!
			
			/*
			 * * 절대경로와 상대경로
			 * - 절대경로 : C 드라이브 또는 D 드라이브 (루트 디렉토리) 를 포함하여 모든 경로를 공유해서 전부 기입하는 방식
			 * 
			 * - 상대경로 : 반대로 루트 디렉토리 로 부터 시작하지 않는 방식
			 * 			  현재 내가 작업중인 폴더를 기준점으로 경로가 시작됨
			 */
			
			// 3. 폴더를 생성하고 나서 그 안에 파일을 생성하는 방법 - 절대경로 방식
			File bbbFolder = new File("C:/bbb");
			bbbFolder.mkdir();
			// > 해당 폴더를 실제로 만들어 주는 메소드 (mkdir == make diretory)
			
			File file3 = new File("C:/bbb/test.txt");
			file3.createNewFile();
	
			// 4. "별도의 경로 지정 없이" 생성 후 파일 생성하기 - 상대경로 방식
			File folder = new File("test");
			folder.mkdir();
			// > 폴더 또한 상대경로 방식일 경우 현재 내가 작업중인 이 프로젝트 폴더 내에 폴더가 만들어짐!!
			
			File file = new File("test/person.txt");
			file.createNewFile();
			// > 마찬가지로 상대경로 방식
			//	 (내가 현재 작업중인 폴더로부터) test 폴더 내의 person.txt 파일
			
			// * File 클래스에서 제공하는 유용한 메소드들
			
			// folder.mkdir() : 폴더를 생성해주는 메소드
			// file.createNewFile() : 파일을 생성해주는 메소드
			
			System.out.println(folder.isFile());
			System.out.println(file.isFile());
			// > isFile() : 파일형식인지 검사 후 파일이면 true / 아니면 false
			
			System.out.println("파일명 : " + file.getName()); // person.txt 
			System.out.println("상위폴더 : " + file.getParentFile()); // test
			// > 폴더끼리의 포함 관계 또한 가계도 (트리 구조) 로 나타낼 수 있다!! (즉, 부모 자식 관계로 부를 수 있다)
			// > person.txt 파일의 부모는 이 파일을 포함시키고 있는 test 폴더가 됨!!
			
			System.out.println("절대경로 : " + file.getAbsolutePath());
			// > C:\01_Java-workspace\12_IO\test\person.txt
			// > 아무리 상대경로 방식으로 만들어진 파일이더라도 절대경로 방식으로 표현할 수 있다!!
			
			System.out.println("파일용량 : " + file.length());
			
			file.delete();
			// > 파일 삭제
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	} // 메소드 영역 끝

} // 클래스 영역 끝

/*
 * * IO(Inputt Output, 입출력)
 * > 프로그램 상의 데이터를 "외부매체"로 내보내거나, "외부매체" 로부터 일어들이는 과정
 *
 * - 내보내는 방향 : Output (출력)
 * - 읽어들이는 방향 : Input (입력)
 *
 * > 항상 기준점은 내가 작성중인 이 프로그램!! 명심!!
 * 
 * * 프로그램 상의 데이터를 외부매체 (모니터, 스피커, "파일" 등) 로 출력하거나
 *   입력장치 (키보드, 마우스 등) 로 입력받는 과정을 거치려면 반드시
 *   프로그램과 그 외부메체 사이의 "연결 통로" 를 만들어 줘야 한다!!
 * > 연결 통호 == "스트림" (Stream)
 * 
 * * 스트림의 특징
 * 1. 단방향성
 * - 입력이면 입력, 출력이면 출력
 * 	 즉, 입력용, 출력용 스트림이 각각 "따로" 존재함
 *   동시에 입출력을 하고자 한다면 최소 스트림이 두 개 필요함!! 하나의 스트림으로는 절대 불가함!!
 *   
 * 2. 선입선출 (First in, First out - FIFO)
 * - 먼저 통로로 진입한 값이 제일 먼저 나가게 됨
 * 
 * 참고) 선임후출 (First In, Last Out - FILO)
 * - 먼저 통로로 진입한 값이 제일 마지막에 나가게 됨
 * 
 * 3. 시간지연 문제가 발생할 수 있다. (delay)
 * - 단방향성 + 선입선출구조 가 합쳐지면서 시간 지연이 일어날 수도 있음!!
 * 
 * > 자바에서는 이 통로 (스트림) 를 각각의 클래스로 정의해서 제공해주고 있음!!
 *   그래서 통로를 열어주려면 해당 클래스로 해당 객체를 생성하면 된다!! (스트림 객체 생성 == 연결 통로를 만들어 주는 과정)
 * > 자바에서 제공하는 스트림 클래스가 엄청 많음!! 상황에 맞는 것을 찾아 쓰자!!
 * 
 * * 스트림의 구문
 * 1. 통로의 사이즈 (너비)
 * 바이트 스트림 : 1byte 짜리의 데이터가 이동할 수 있을 정도의 사이즈 (좁은 통로)
 * 			    입력 (XXXInputStream) / 출력 (XXXOutputStream)
 * 문자 스트림 : 2byte 짜리의 데이터가 이동할 수 있을 정도의 사이즈 (넓은 통로)
 * 			   입력 (XXXReader) / 출력 (XXXWriter)
 * 
 * 2. 외부매체와의 직접적인 연결 여부
 * 기반 스트림 : 외부 매체와 직접적으로 연결되는 메인 통로
 * 보조 스트림 : 기반 스트림 만으로 부족한 성능을 항상시켜주는 용도의 스트림
 * 			  절대 단독으로 사용 불가 (즉, 메인 통로로는 못씀)
 * 			  반드시 기반 스트림과 "결합" 해서 같이 쓴다!!
 * 			  예) 속도 항상, 객체 단위로 입출력하게끔 도와줌, 자료형에 데이터를 맞춰 변환 등
 */