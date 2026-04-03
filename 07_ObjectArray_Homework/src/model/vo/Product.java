package model.vo;

public class Product { // 클래스 영역 시작

	private String productName;
	private int price;
	private int amount;
	
	public Product() {}

	public Product(String productName, int price, int amount) {
		this.productName = productName;
		this.price = price;
		this.amount = amount;
	}

	public void setProductName(String productName) { // 메소드 영역 시작
		this.productName = productName;
	} // 메소드 영역 끝

	public void setPrice(int price) { // 메소드 영역 시작
		this.price = price;
	} // 메소드 영역 끝

	public void setAmount(int amount) { // 메소드 영역 시작
		this.amount = amount;
	} // 메소드 영역 끝

	public String getProductName() { // 메소드 영역 시작
		return productName;
	} // 메소드 영역 끝

	public int getPrice() { // 메소드 영역 시작
		return price;
	} // 메소드 영역 끝

	public int getAmount() { // 메소드 영역 시작
		return amount;
	} // 메소드 영역 끝

	public String information() { // 메소드 영역 시작
		return "상품명 : " + productName + ", 상품가격 : " + price + "원 , 수량 : " + amount;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
