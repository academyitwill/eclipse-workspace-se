package com.itwill03.포함;


public class Dvd {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  번호
		타이틀
		쟝르
	 * 
	 * <<기능>>
	 *   Dvd정보출력
	 *   
	 */
	private int no;
	private String title;
	private String genre;
	
	public Dvd() {
		// TODO Auto-generated constructor stub
	}

	public Dvd(int no, String title, String genre) {
		super();
		this.no = no;
		this.title = title;
		this.genre = genre;
	}
	
	public void print() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Dvd [no=" + no + ", title=" + title + ", genre=" + genre + "]";
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

	public void setNo(int no) {
		this.no = no;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
	
	
}