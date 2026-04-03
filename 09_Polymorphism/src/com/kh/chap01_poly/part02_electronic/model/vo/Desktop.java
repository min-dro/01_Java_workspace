package com.kh.chap01_poly.part02_electronic.model.vo;

//자식클래스
public class Desktop extends Electronic { // 클래스 영역 시작

	// 필드부
	public static final String CPU = "intel";
	private String graphic;
	
	// 생성자부
	public Desktop() {}

	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}

	// 메소드부
	public String getGraphic() { // 메소드 영역 시작
		return graphic;
	} // 메소드 영역 끝
	
	public void setGraphic(String graphic) { // 메소드 영역 시작
		this.graphic = graphic;
	} // 메소드 영역 끝

	@Override
	public String toString() { // 메소드 영역 시작
		return "Desktop [brand=" + super.getBrand() + ", name=" + super.getName() + ", price=" 
			+ super.getPrice() + ", graphic=" + graphic + "]";
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
