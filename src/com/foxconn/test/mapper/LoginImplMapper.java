package com.foxconn.test.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.foxconn.test.model.User;

public class LoginImplMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet arg0, int arg1) throws SQLException {
		
		User user=new User();
		
		user.setUserString(arg0.getString("username"));
		user.setPasswordString(arg0.getString("password"));
		
		
		System.out.println("获取结果集"+user.toString());
		
		return user;
	}

}
