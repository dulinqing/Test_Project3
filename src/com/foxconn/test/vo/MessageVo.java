

    /**  

     * 文件名：MessageVo.java  

     *  

     * 版本信息：  

     * 日期：2016/3/29 

     * Copyright 足下 Corporation 2016   

     * 版权所有  

     *  

     */  

    
package com.foxconn.test.vo;


public class MessageVo {
	private String code;
	private String info;
	private Object data;
	


	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "MessageVo [code=" + code + ", info=" + info + ", data=" + data
				+ "]";
	}
	
	
	
}
