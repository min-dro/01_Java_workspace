package com.kh.run;

import com.kh.view.MemberView;
import com.kh.view.MemberView2;
import com.kh.view.ParkingTowerView;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작
		
		MemberView mv = new MemberView();
		// mv.mainMenu();

		MemberView2 mv2 = new MemberView2();
		mv2.mainMenu();
		
		ParkingTowerView ptv = new ParkingTowerView();
		// ptv.mainMenu();
	} // main 영역 끝

} // 클래스 영역 끝
