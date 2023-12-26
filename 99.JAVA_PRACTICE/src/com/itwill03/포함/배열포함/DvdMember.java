package com.itwill03.포함.배열포함;

public class DvdMember {
	private int memberNo;
	private String memberName;
	private String memberPhone;
	private Dvd[] rentDvd;//빌린dvd
	
	public DvdMember() {
	}
	
	public DvdMember(int memberNo, String memberName, String memberPhone, Dvd[] rentDvd) {
		this.memberNo=memberNo;
		this.memberName=memberName;
		this.memberPhone=memberPhone;
		this.rentDvd=rentDvd;
	}
	
	public static void headerPrint() {
		System.out.printf("---------------DVD대여 회원목록----------------------------------------------%n");
		System.out.printf("%s %s %8s %8s %8s %11s%n", "회원번호", "이름", "전화번호", "DVD번호", "DVD타이틀", "DVD장르");
		System.out.printf("------------------------------------------------------------------------------%n");
		
	}
	/*
	public void print() {
			
		for (int i = 0; i < rentDvd.length; i++) {
			System.out.print(memberNo+"\t"+memberName+"\t"+memberPhone+"\t");
			rentDvd[i].print();
		}
	}
	*/
	
	public void print() {
		if(rentDvd!=null) {
			for (Dvd dvd : rentDvd) {
				System.out.print(memberNo+"\t"+memberName+"\t"+memberPhone+"\t");
				dvd.print();
			}
		}else {
			System.out.println(">>빌린책 없다.");
		}
	}
	
	
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public Dvd[] getRentDvd() {
		return rentDvd;
	}
	public void setRentDvd(Dvd[] rentDvd) {
		this.rentDvd = rentDvd;
	}
	
	
}