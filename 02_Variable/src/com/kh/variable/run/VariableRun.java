package com.kh.variable.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Cast;
import com.kh.variable.D_Printf;

public class VariableRun { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 시작

		A_Variable a = new A_Variable();
		
		// a.printSquare();
		// a.declareVariable();
		// a.initVariable();
		// a.constant();
		
		B_KeyboardInput b = new B_KeyboardInput();
		
		// b.InputTest1();
		// b.inputTest2();
		b.inputTest3();
		// b.inputTest4();
		// b.inputTest5();
		
		C_Cast c = new C_Cast();
		
		// c.autoCasting();
		// c.forceCasting();
		
		D_Printf d  = new D_Printf();
		
		//d.printfTest();
		
	} // main 영역 끝

} // 클래스 영역 끝
