package com.itwill03.포함;


public class DvdMember {
	/*
	- 캡슐화
	<<속성>>
	회원번호
	회원이름
	전화번호
	빌린dvd
	 */
	private Dvd rentDvd;//빌린dvd
	private int no;
	private String name;
	private String phoneNum;
	/*
	<<기능>>
	  회원정보출력 
	 */
	public DvdMember() {
		// TODO Auto-generated constructor stub
	}
	public DvdMember(Dvd rentDvd, int no, String name, String phoneNum) {
		super();
		this.rentDvd = rentDvd;
		this.no = no;
		this.name = name;
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "DvdMember [rentDvd=" + rentDvd + ", no=" + no + ", name=" + name + ", phoneNum=" + phoneNum + "]";
	}
	public void print() {
		System.out.println(toString());
	}
	public Dvd getRentDvd() {
		return rentDvd;
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
	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
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
	
	
}