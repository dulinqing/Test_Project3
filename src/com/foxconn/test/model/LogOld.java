package com.foxconn.test.model;

import java.util.Date;

public class LogOld {
	
	private int id;
	private String mac_addr;
	private String ip;
	private String operation;
	private String message;
	private byte del_flag;
	private String create_by;
	private Date create_date;
	private String edite_by;
	private Date edite_date;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMac_addr() {
		return mac_addr;
	}
	public void setMac_addr(String mac_addr) {
		this.mac_addr = mac_addr;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public byte getDel_flag() {
		return del_flag;
	}
	public void setDel_flag(byte del_flag) {
		this.del_flag = del_flag;
	}
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public String getEdite_by() {
		return edite_by;
	}
	public void setEdite_by(String edite_by) {
		this.edite_by = edite_by;
	}
	public Date getEdite_date() {
		return edite_date;
	}
	public void setEdite_date(Date edite_date) {
		this.edite_date = edite_date;
	}
	
	
	public LogOld(int id, String mac_addr, String ip, String operation, String message, byte del_flag, String create_by,
			Date create_date, String edite_by, Date edite_date) {
		super();
		this.id = id;
		this.mac_addr = mac_addr;
		this.ip = ip;
		this.operation = operation;
		this.message = message;
		this.del_flag = del_flag;
		this.create_by = create_by;
		this.create_date = create_date;
		this.edite_by = edite_by;
		this.edite_date = edite_date;
	}
	public LogOld(int id, String mac_addr, String ip, String operation, String message, byte del_flag) {
		super();
		this.id = id;
		this.mac_addr = mac_addr;
		this.ip = ip;
		this.operation = operation;
		this.message = message;
		this.del_flag = del_flag;
	}
	
	public LogOld() {
		super();
	}
	

}
