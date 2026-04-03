package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectsDao;

public class ObjectsRun { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작

		ObjectsDao ods = new ObjectsDao();
		
		// ods.fileSave();
		ods.fileRead();
		
	} // main 영역 끝

} // 클래스 영역 끝
