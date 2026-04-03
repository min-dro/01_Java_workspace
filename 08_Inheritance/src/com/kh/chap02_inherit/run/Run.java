package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) {
		
		// 비행기, 자동차, 배의 정보를 객체로 나타내보기 (클래스를 이미 만들었음)
		Airplane a = new Airplane("보잉747", 0.02, "여객기", 8, 5);
		
		Car c = new Car("쏘나타", 12.5, "세단", 4);
		
		Ship s = new Ship("낚시배", /* (double) */ 3, "어선", 1);
		
		System.out.println(a.information());
		System.out.println(c.information());
		System.out.println(s.information());
	
		// 각 탈것을 움직여보기
		a.howToMove();
		c.howToMove();
		s.howToMove();
	
	}

} // 클래스 영역 끝
