package com.user;

import jakarta.persistence.*;

@Entity
public class User {
	@Id
	private String fname;
	private String password;
	public User() {	
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String fname, String password) {
		super();
		this.fname = fname;
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", password=" + password + ", getFname()=" + getFname() + ", getPassword()="
				+ getPassword() + "]";
	}
	
	
	
	
	
}
