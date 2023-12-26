package com.itwill03.포함.배열포함;
/*
 * 회원객체생성
 */
/*
 * Dvd객체생성
 */

/*
 * 회원이Dvd을 대여
 * 
 * Dvd객체참조변수를 회원의 멤버변수에대입
 */

/*
 * 회원정보출력(회원이빌린Dvd정보출력)
 */

public class DvdShopMain {

	public static void main(String[] args) {
		
		Dvd[] dvds = { new Dvd(0, "태권브이", "만화"), new Dvd(1, "마징가Z", "만화"),
						new Dvd(2, "원피스", "만화")};
		
		
		DvdMember dvdMember = new DvdMember();
		dvdMember.setMemberNo(0);
		dvdMember.setMemberName("홍길동");
		dvdMember.setMemberPhone("010-1234-5678");
		dvdMember.setRentDvd(dvds);
		
		
		
		
		DvdMember.headerPrint();
		
		dvdMember.print();
		
		
		
		
		
	}

}
