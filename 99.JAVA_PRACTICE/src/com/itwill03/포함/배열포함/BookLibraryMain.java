package com.itwill03.포함.배열포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bookMember1=new BookMember();
		bookMember1.setNo(1);
		bookMember1.setName("KANG");
		bookMember1.setPhoneNumber("333-9090");
		bookMember1.print();
		BookMember bookMember2=
				new BookMember(2, "KIM", "123-7887");
		bookMember2.print();
		/*
		 * 책객체들[]생성
		 */
		Book[] rentBooks1= {
				new Book(8, "SPRING", "IT", "좋은책"),
				new Book(4, "JPA", "IT", "멋진책"),
				new Book(11, "MTBATIS", "에세이", "어려운책"),
		};
		
		Book[] rentBooks3= {
				new Book(1, "JAVA", "시", "좋은책"),
				new Book(2, "SPRING", "소설", "멋진책"),
				new Book(3, "OOP", "에세이", "어려운책"),
		};
		
		System.out.println();
		System.out.println();
		
		/*
		 * 회원이 책들[] 대여
		 * 
		 * 책객체들[] 참조변수를 회원의 멤버변수에대입
		 */
		bookMember1.setBooks(rentBooks1);
		bookMember1.print();
		System.out.println();
		
		
		bookMember2.rentBook(new Book(34, "JSP", "IT", "오래된책"));
		bookMember2.rentBook(new Book(56, "JAVA", "IT", "어려운책"));
		bookMember2.rentBook(new Book(67, "JABA", "ESSAY", "어려운책"));
		bookMember2.print();
		System.out.println();
		
		BookMember bookMember3=
				new BookMember(3, "KING", "666-8888", rentBooks3);
		bookMember3.print();
		
		
		
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		
		
		
		
	}
}
















