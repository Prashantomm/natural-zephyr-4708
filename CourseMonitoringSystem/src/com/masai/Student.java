package com.masai;

import java.io.Serializable;

public class Student implements Serializable {
	private int sno;
	private String sname;
	private String semail;
	private int sfee;
	private String sbatch;
	
	public Student(int sno, String sname, String semail, int sfee, String sbatch) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.semail =semail;
		this.sfee = sfee;
		this.sbatch = sbatch;
	}
	
	public int getRoll() {
		return sno;
	}
	public String getName() {
		return sname;
	}
	
	public String getEmail() {
		return semail;
	}
	public int getFee() {
		return sfee;
	}
	
	public String getBatch() {
		return sbatch;
	}
	

	@Override
	public String toString() {
		return "StudentRoll = " + sno + ", StudentName = " + sname + ",StudentMail = " + semail + ", StudentFee = " + sfee + ", Studentbatch = " + sbatch
				;
	}

	
	

}
