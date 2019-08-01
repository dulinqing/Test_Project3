package com.foxconn.test.dao;


import com.foxconn.test.model.User;

public interface LoginInfoDao {
	
	
	User getLoginInfoFromDB(String username);

}
