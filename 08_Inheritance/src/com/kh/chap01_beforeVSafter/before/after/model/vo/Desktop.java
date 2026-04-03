package com.kh.chap01_beforeVSafter.before.after.model.vo;

//			 자식클래스		 부모클래스
//			 후손클래스		 조상클래스
//			 하위클래스		 상위클래스
//			 서브클래스		 슈퍼클래스
public class Desktop extends Product { // 클래스 영역 시작
	// > 공통 코드를 물려받아 쓰고 싶을 경우에는 클래스명 extends 부모클래스명
	//	 코드를 상속받는 순간 필드 4개, 메소드 9개를 마치 내꺼처럼 가져다 쓸 수 있게 된다.
	
	// 필드부 (이미 4개 갖고있음)
	private boolean allInOne;

	// 생성자부
	public Desktop() { }
	
	// 아무리 코드 상으로 필드가 하나뿐이더라도 최종적으로 물려받은 필드까지 총 5개의 필드를 갖고있는 꼴임!!
	// > 매개변수 생성자를 작성할 때 물려받은 필드까지 다 고려해서 만들어 줘야 한다.
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		
		// brand, pCode, pName, price, allInOne 필드에 각각 초기화
		/*
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		*/
		
		// > this. : 자기 자신의 주소값을 담고 있는 개념
		//	 물려받은 필드들은 자식클래스에서 this. 으로 접근 가능하다!!
		
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		// > super. : 해당 부모객체의 주소값을 담고 있는 개념
		//	 물려받은 필드들은 자식클래스에서 super. 으로도 접근 가능하다!!
		
		// > 물려받은 필드들은 this. 혹은 super. 으로 접근해서 가져다 쓸 수 있다!!
		//	 단, 접근하고자 하는게 private 일 경우는 직접 접근이 불가하다!! (is not visible 오류 발생)
		
		// 해결방법1)
		// 부모클래스의 필드를 자식까지는 접근 가능하게끔 접근 제한을 살짝만 풀어주는 방법
		// 부모 필드의 접근제한자를 private --> protected 로 변경
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		
		// 해결방법2)
		// 부모클래스의 public 접근제한자인 setter 메소드를 호출해서 간접적으로 값을 필드에 대입하는 방법
		// > this.SetXxx() 또는 super.setXxx()
		/*
		this.setBrand(brand);
		this.setpCode(pCode);
		this.setpName(pName);
		this.setPrice(price);
		*/
		
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// 해결방법3)
		// 부모클래스의 생성자를 호출하는 방법
		// this(brand, pCode,  pName, price);
		// > 부모클래스의 생성자는 this 로 호출 불가!!
		//	 기본적으로 this 생성자는 이 클래스 내의 생성자를 찾아서 호출해줌
		//	 (쉽게 생각하던 필드와 메소드는 상속의 대상이 맞는데, 생성자는 상속의 대상이 아님)
		// > 부모클래스의 생성자는 super 로 호출한다.
		
		// super(); // 부모클래스의 기본생성자를 호출하겠다.
		
		super(brand, pCode, pName, price);
		
		this.allInOne = allInOne;		
		
		// super(brand, pCode, pName, price);
		// > 반드시 호출 구문은 첫 줄에 작성해야함!! (this 생성자와 마찬가지)
		
		// this : 내꺼를 지정
		// super. : 부모꺼를 지침 (더 명시적이라서 주로 씀)
		// > 상속 - 부모님꺼도 내꺼 내꺼도 내꺼
	}
	
	// 메소드부 (이미 9개 갖고있음)
	public boolean isAllInOne() { // 메소드 영역 시작
		return allInOne;
	} // 메소드 영역 끝

	public void setAllInOne(boolean allInOne) { // 메소드 영역 시작
		this.allInOne = allInOne;
	} // 메소드 영역 끝
	
	// information 메소드
	// > 부모클래스로부터 물려받은 상태라서 이 자리에 information 메소드가 있는 거나 마찬가지
	//	 단, price 까지만 문자열로 내보내고, allInOne 필드는 누락된 상황!!
	// > 물려받은 메소드의 내용을 내 입맛에 맞게 좀 수정해서 쓸 수 있다.
	public String information() { // 메소드 영역 시작
		
		return "brand : " + super.getBrand() + ", pCode : " + super.getpCode()
				+ ", pName : " + super.getpName() + ", price : " + super.getPrice()
				+ ", allInOne : " + allInOne;
	} // 메소드 영역 끝
	// > 이렇게 쓴다고 해서 물려 받은 information 한개, 내가 직접 정의한 information 한개 개념이 아니라,
	//	 물려받은 information 메소드의 {영역} 안의 코드를 내 입맛에 맞게 재정의한 것!! 
} // 클래스 영역 끝
