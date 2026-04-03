package com.hw2.Run;

import com.hw2.model.dao.ScoreProcess;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		ScoreProcess sp = new ScoreProcess();
		
		sp.scoreSave();
		sp.scoreRead();
		
	} // main 영역 끝

} // 클래스 영역 끝
