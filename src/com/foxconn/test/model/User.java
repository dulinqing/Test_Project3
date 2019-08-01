package com.foxconn.test.model;

public class User {
	private String userString;
	private String passwordString;
	
	public String getUserString() {
		return userString;
	}
	public void setUserString(String userString) {
		this.userString = userString;
	}
	public String getPasswordString() {
		return passwordString;
	}
	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "用户名："+this.userString+"密码："+this.passwordString;
	}
}
