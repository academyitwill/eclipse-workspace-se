package com.itwill03.포함;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember m1 = new DvdMember(null, 1, "name1", "phone1");
		DvdMember m2 = new DvdMember(null, 2, "name2", "phone2");
		DvdMember m3 = new DvdMember(null, 3, "name3", "phone3");
		DvdMember m4 = new DvdMember(null, 4, "name4", "phone4");
		/*
		 * Dvd객체생성
		 */
		Dvd d1 = new Dvd(1, "dvdname1", "genre1");
		Dvd d2 = new Dvd(2, "dvdname2", "genre2");
		Dvd d3 = new Dvd(3, "dvdname3", "genre3");
		Dvd d4 = new Dvd(4, "dvdname4", "genre4");
		Dvd d5 = new Dvd(5, "dvdname5", "genre5");
		Dvd d6 = new Dvd(6, "dvdname6", "genre6");
		Dvd d7 = new Dvd(7, "dvdname7", "genre7");
		Dvd d8 = new Dvd(8, "dvdname8", "genre8");
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		m1.setRentDvd(d8);
		m2.setRentDvd(d6);
		m3.setRentDvd(d7);
		m4.setRentDvd(d1);
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		m1.print();
		m2.print();
		m3.print();
		m4.print();
	}

}