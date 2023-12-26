package com.itwill03.포함;

public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
	
	private int no;
	private String title;
	private String genre;
	private String detail;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int no, String title, String genre, String detail) {
		this.no = no;
		this.title = title;
		this.genre = genre;
		this.detail = detail;
	}
	
	public int getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public String getDetail() {
		return detail;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public void print() {
		System.out.println(this.no+"\t"+this.title+"\t"+this.genre+"\t"+this.detail);
	}

	@Override
	public String toString() {
		return "Book [no=" + no + ", title=" + title + ", genre=" + genre + ", detail=" + detail + "]";
	}
	//source-generate toString
	
	
}