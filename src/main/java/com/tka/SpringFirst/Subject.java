package com.tka.SpringFirst;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Subject {
   @Id
   //@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	private String sname;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Subject [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	

}
