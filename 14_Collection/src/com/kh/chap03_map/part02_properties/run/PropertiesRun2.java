package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		Properties prop = new Properties();
		
		System.out.println(prop); // {}
		
		try {
		
			// 3. 파일로부터 데이터를 키 + 밸류 형식으로 읽어들이는 메소드 (입력)
			// > load(InputStream is) : .properties 파일로부터 읽어들임
			// prop.load(new FileInputStream("test.properties"));
		
			// > loadFromXML(InputStream is) : .xml 파일로부터 읽어들임
			prop.loadFromXML(new FileInputStream("test.xml"));
			
		} catch(IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(prop);
		// > {Set=HashSet, List=ArrayList, Map=Properties}
		
		// 4. Properties 객체에 담긴 데이터들을 대해 키값을 제시해서 밸류값만 뽑아보고 싶을 때?
		// System.out.println(prop.get("Set")); // HashSet
		// > Key + Value 가 모두 문자열로 저장되어있다 라는 가정 하에
		//	 문자열 키값을 제시했을 때 문자열로 밸류값이 리턴되는 메소드가 별도로 존재!!
		// getProperty(String key) : String value
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("Map"));
		
	} // main 영역 끝

} // 클래스 영역 끝

/*
 * * .properties 파일
 * > 어떤 프로그램이 기본적으로 가져야 하는 정보들을 보통. properties 형식의 파일로 저장해둔다.
 * 	 (보통 프로그램 관련 "환경설정" 위주의 데이터들이 담겨있음)
 * > Properties 객체 자체가 key, value 모두 문자열로 주로 쓰기 때문에 Properties 객체와 붙여서 유용하게 사용 가능
 *   (key, value 모두 일반 텍스트 문자열이기 때문에 개발자가 아닌 일반 관리자 입장에서 환경설정 
 * 
 * * .xml 파일
 * > 방대한 데이터들을 "구조화된(<태그> 로 감싸서)" 현식으로 저장하기 위한 파일
 * > 다양한 프로그래밍 언어 간의 호환이 쉽다!!
 * > Properties 객체와 엮어서 입출력 할 때 많이 쓰이고, 마찬가지로
 * 	 프로그램의 "환경설정" 위주의 데이터들을 담는 용도로도 많이 쓰인다!!
 * 
 * - .properties 파일과 .xml 파일의 차이점이라고 한다면
 * .properties 파일은 한줄짜리 밸류값만 표현 가능함!!
 * .xml 파일은 여러줄짜리 밸류값을 표현 가능함!!
 * 
 * > JDBC 파트에서 활용해볼 예정!
 */
 