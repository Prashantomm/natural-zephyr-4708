package com.masai;

public class Student {
	private int sturoll;
	private String stuname;
	private int stufee;
	private String stubatch;
	
	public Student(int sturoll, String stuname, int stufee, String stubatch) {
		super();
		this.sturoll = sturoll;
		this.stuname = stuname;
		this.stufee = stufee;
		this.stubatch = stubatch;
	}
	
	public int getRoll() {
		return sturoll;
	}
	public int getFee() {
		return stufee;
	}
	public String getName() {
		return stuname;
	}
	public String getBatch() {
		return stubatch;
	}

	@Override
	public String toString() {
		return "Student [StudentRoll = " + sturoll + ", StudentName = " + stuname + ", StudentFee = " + stufee + ", Studentbatch = " + stubatch
				+ "]";
	}

	
	

}
