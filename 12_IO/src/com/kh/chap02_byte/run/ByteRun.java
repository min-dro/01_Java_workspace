package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteDao;

public class ByteRun { // 클래스 영역 시작

	/*
	 * * "바이트" "기반" 스트림
	 * - 바이트 스트림 : 1byte 단위로만 입출력 할 수 있는 "좁은 통로"
	 * 				  (XXXInputStream / XXXOutputStream)
	 * - 기반 스트림 : 외부 매체외 "직접적" 으로 연결되는 "메인 통로"
	 * 
	 * > 외부매체를 지정하고 그 외부매체와 직접적으로 연결되는 1byte 폭의 메인 통로를 써보겠다.
	 * 
	 * XXXInputStream : XXX 라는 외부 매체로부터 데이터를 "입력" 받는 통로
	 * 					(읽어들이겠다, 가져오겠다)
	 * 
	 * XXXOutputStream : XXX 라는 외부 매체로 데이터를 "출력"해주는 통로
	 * 					 (쓰겠다, 내보내겠다)
	 * 
	 * > File 이라는 외부매체 기준으로
	 * FileInputStream, FileOutputStream 객체를 쓸 수 있다!!
	 */
	
	public static void main(String[] args) { // main 영역 시작
		
		FileByteDao fb = new FileByteDao();
		
		// fb.fileSave();
		fb.fileRead();
		
	} // main 영역 끝

} // 클래스 영역 끝
