package com.itwill03.포함.배열포함;
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

public class Dvd {
	
	private int dvdNo;
	private String dvdName;
	private String dvdSort;
	
	public Dvd() {
	}

	public Dvd(int dvdNo, String dvdName, String dvdSort) {
		this.dvdNo=dvdNo;
		this.dvdName=dvdName;
		this.dvdSort=dvdSort;
	}
	
	public void print() {
		System.out.println(this.dvdNo+"\t"+this.dvdName+"\t"+this.dvdSort);
		
	}

	public int getDvdNo() {
		return dvdNo;
	}

	public void setDvdNo(int dvdNo) {
		this.dvdNo = dvdNo;
	}

	public String getDvdName() {
		return dvdName;
	}

	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}

	public String getDvdSort() {
		return dvdSort;
	}

	public void setDvdSort(String dvdSort) {
		this.dvdSort = dvdSort;
	}
	
	
}	

	
	
	

