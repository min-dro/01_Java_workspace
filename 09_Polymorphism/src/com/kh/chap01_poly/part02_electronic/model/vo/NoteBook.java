package com.kh.chap01_poly.part02_electronic.model.vo;

// 자식클래스
public class NoteBook extends Electronic { // 클래스 영역 시작

	// 필드부
	private int usbPort;

	// 생성자부
	public NoteBook() {}

	public NoteBook(String brand, String name, int price, int usbPort) {
		super(brand, name, price);
		this.usbPort = usbPort;
	}

	// 메소드부
	public int getUsbPort() { // 메소드 영역 시작
		return usbPort;
	} // 메소드 영역 끝

	public void setUsbPort(int usbPort) { // 메소드 영역 시작
		this.usbPort = usbPort;
	} // 메소드 영역 끝

	@Override
	public String toString() { // 메소드 영역 시작
		return "NoteBook [brand=" + super.getBrand() + ", name=" + super.getName() + ", price=" 
			+ super.getPrice() + ", usbPort=" + usbPort + "]";
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
