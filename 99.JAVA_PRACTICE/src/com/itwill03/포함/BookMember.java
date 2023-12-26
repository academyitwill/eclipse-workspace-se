package com.itwill03.포함;


public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/
	
	/*
	<<기능>>
	  회원정보출력 
	 */
	
	private int no;
	private String name;
	private String phoneNum;
	private Book book;
	
	public void print() {
		System.out.print(this.no+"\t"+this.name+"\t"+phoneNum+"\t 빌린책:");
		if(book!=null) {
			book.print();
		}else {
			System.out.println(">>빌린책없네요 책좀읽으세요~~~");
		}
		
	
	}
	
	
	@Override
	public String toString() {
		return "BookMember [no=" + no + ", name=" + name + ", phoneNum=" + phoneNum + ", book=" + book + "]";
	}


	public BookMember() {
		// TODO Auto-generated constructor stub
	}
	
	public BookMember(int no, String name, String phoneNum) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNum = phoneNum;
	}


	public BookMember(int no, String name, String phoneNum, Book book) {
		this.no = no;
		this.name = name;
		this.phoneNum = phoneNum;
		this.book = book;
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public Book getBook() {
		return book;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	
	
	
}