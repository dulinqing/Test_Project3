package com.foxconn.test.model;

public class UserDB {
	
	private int	id;
	private String nameString;
	private String 	passwordString;
	
	public UserDB() {
		super();
	}
	
	public UserDB(String nameString, String passwordString) {
		super();
		this.nameString = nameString;
		this.passwordString = passwordString;
	}
	
	public UserDB(String nameString, String passwordString , int id) {
		super();
		this.id=id;
		this.nameString = nameString;
		this.passwordString = passwordString;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
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
		return this.id+"------"+this.nameString+"--------"+this.passwordString;
	}

}
