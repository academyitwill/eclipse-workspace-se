package com.itwill03.포함.배열포함;


public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책들
	*/
	private int no;
	private String name;
	private String phoneNumber;
	private Book[] books;
	
	public BookMember() {
		
	}
	
	
	
    public BookMember(int no, String name, String phoneNumber) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
    


	public BookMember(int no, String name, String phoneNumber, Book[] books) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.books = books;
	}
	public void print() {
		System.out.println(this.no+"\t"+this.name+"\t"+this.phoneNumber);
		if(books == null || books.length==0) {
			System.out.println(" >>빌린책 없네요");
		    return;	
		}
		System.out.println("---------빌린책들---------");
		for (Book book : books) {
			book.print();
		}
		
	}
	
	
	/*
	<<기능>>
	  회원정보출력 
	 */
	
	public int getNo() {
		return no;
	}
	public Book[] getBooks() {
		return books;
	}
    
	public void rentBook(Book rentBook) {
		if(books==null) {
			books=new Book[1];
			books[0]=rentBook;
		}else {
			Book[] tempBooks=new Book[books.length+1];
			
			for (int i = 0; i < books.length; i++) {
				tempBooks[i]=books[i];
			}
			tempBooks[tempBooks.length-1]=rentBook;
			books=tempBooks;
		}
	}


	public void setBooks(Book[] books) {
		this.books = books;
	}



	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public static void headerPrint() {
		System.out.printf("---------------도서대여 회원목록----------------------------------------------%n");
		System.out.printf("%s %s %8s %5s %7s %11s %8s%n", "회원번호", "이름", "전화번호", "책번호", "책이름", "책분류", "책설명");
		System.out.printf("------------------------------------------------------------------------------%n");
		
	}
	
	
	
}









