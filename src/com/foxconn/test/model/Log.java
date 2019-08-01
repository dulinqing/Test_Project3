package com.foxconn.test.model;

import java.util.Date;

public class Log {
	
	private int id;
	private int channel_id;
	private String mac_addr;
	private String ip;
	private int port;
	private String operation;
	private String message;
	private byte del_flag;
	private String create_by;
	private Date create_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(int channel_id) {
		this.channel_id = channel_id;
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
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
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
	public Log( int channel_id, String mac_addr, String ip, int port, String operation, String message,
			byte del_flag, String create_by, Date create_date) {
		super();
//		this.id = id;
		this.channel_id = channel_id;
		this.mac_addr = mac_addr;
		this.ip = ip;
		this.port = port;
		this.operation = operation;
		this.message = message;
		this.del_flag = del_flag;
		this.create_by = create_by;
		this.create_date = create_date;
	}
	public Log() {
		// TODO Auto-generated constructor stub
	}
	

}
