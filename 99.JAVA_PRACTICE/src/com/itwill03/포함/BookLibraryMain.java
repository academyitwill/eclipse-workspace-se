package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bMem1 = new BookMember(1,"Charlie","01012059623");
		BookMember bMem2 = new BookMember(2,"Puth","01023948159");
		BookMember bMem3 = new BookMember(3,"Sam","01016931724");
		
		bMem1.print();
		bMem2.print();
		bMem3.print();
		System.out.println();
		System.out.println();
		System.out.println();
		/*
		 * 책객체생성
		 */
		Book book1 = new Book(1,"HonGongJa","Edu","study java");
		Book book2 = new Book(2,"HonGongPa","Edu","study python");
		Book book3 = new Book(3,"HonGongC","Edu","study C");
		Book book4 = new Book(4,"Check","Novel","check check");
		Book book5 = new Book(5,"Choco","Health","health info");
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		bMem1.setBook(book1);
		bMem2.setBook(book5);
		bMem3.setBook(book4);
		
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		bMem1.print();
		bMem2.print();
		bMem3.print();
		
		
	}
}