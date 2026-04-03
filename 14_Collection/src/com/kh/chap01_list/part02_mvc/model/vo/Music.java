package com.kh.chap01_list.part02_mvc.model.vo;

// VO : 정보를 담는 용도
public class Music { // 클래스 영역 시작

	// 필드부
	private String title;
	private String artist;
	
	// 생성자부
	public Music() {}

	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	
	// 메소드부
	public String getTitle() { // 메소드 영역 시작
		return title;
	} // 메소드 영역 끝

	public void setTitle(String title) { // 메소드 영역 시작
		this.title = title;
	} // 메소드 영역 끝

	public String getArtist() { // 메소드 영역 시작
		return artist;
	} // 메소드 영역 끝

	public void setArtist(String artist) { // 메소드 영역 시작
		this.artist = artist;
	} // 메소드 영역 끝

	@Override
	public String toString() { // 메소드 영역 시작
		return "Music [title=" + title + ", artist=" + artist + "]";
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
