package com.hw3.model.vo;

import java.util.Objects;

public class Product { // 클래스 영역 시작

	private String brand;
	private String name;
	private String color;
	private int price;
	
	public Product() {}

	public Product(String brand, String name, String color, int price) {
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getBrand() { // 메소드 영역 시작
		return brand;
	} // 메소드 영역 끝

	public void setBrand(String brand) { // 메소드 영역 시작
		this.brand = brand;
	} // 메소드 영역 끝

	public String getName() { // 메소드 영역 시작
		return name;
	} // 메소드 영역 끝

	public void setName(String name) { // 메소드 영역 시작
		this.name = name;
	} // 메소드 영역 끝

	public String getColor() { // 메소드 영역 시작
		return color;
	} // 메소드 영역 끝

	public void setColor(String color) { // 메소드 영역 시작
		this.color = color;
	} // 메소드 영역 끝

	public int getPrice() { // 메소드 영역 시작
		return price;
	} // 메소드 영역 끝

	public void setPrice(int price) { // 메소드 영역 시작
		this.price = price;
	} // 메소드 영역 끝

	@Override
	public String toString() { // 메소드 영역 시작
		return "brand=" + brand + ", name=" + name + ", color=" + color + ", price=" + price;
	} // 메소드 영역 끝

	@Override
	public int hashCode() { // 메소드 영역 시작
		return Objects.hash(brand, color, name, price);
	} // 메소드 영역 끝

	@Override
	public boolean equals(Object obj) { // 메소드 영역 시작
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color)
				&& Objects.equals(name, other.name) && price == other.price;
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
