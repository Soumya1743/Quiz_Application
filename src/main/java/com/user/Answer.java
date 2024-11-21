package com.user;

import jakarta.persistence.*;

@Entity
public class Answer {

	@Id
	String uname;
	String password;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Answer [uname=" + uname + ", password=" + password + ", getUname()=" + getUname() + ", getPassword()="
				+ getPassword() + "]";
	}
	
	
}
