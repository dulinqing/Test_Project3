package com.foxconn.test.daoimpl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.foxconn.test.dao.LoginInfoDao;
import com.foxconn.test.mapper.LoginImplMapper;
import com.foxconn.test.model.User;


public class UserJDBCTemplate implements LoginInfoDao{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public User getLoginInfoFromDB(String username) {
		
		String sqlString="select USER_NAME username,PASWD password from USER_T where USER_NAME = ?";
		String[] para= {username};
		User user= jdbcTemplateObject.queryForObject(sqlString, para, new LoginImplMapper());
		
		System.out.println("数据库访问sql："+user.toString());
		return user;
	}

	public void setDataSource(DataSource ds) {
		
		this.dataSource = ds;
	    this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		
	}

}
