package com.foxconn.test.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ContextLoader;

import com.foxconn.test.daoimpl.UserJDBCTemplate;
import com.foxconn.test.serviceimpl.LoginServiceImpl;
import com.foxconn.test.vo.MessageVo;




@RestController
@RequestMapping("/login")
public class LogTest {
	@Autowired
	LoginServiceImpl loginServiceImpl;
	@GetMapping(value="/loginInfo",produces="application/json;charset=UTF-8")
	public String loginForTest(String user,String password) throws JsonGenerationException, JsonMappingException, IOException {  
		
		System.out.println("输入的用户名为"+user+"密码为"+password);
		
		loginServiceImpl=(LoginServiceImpl) ContextLoader.getCurrentWebApplicationContext().getBean("loginServiceImpl");
		MessageVo vo=loginServiceImpl.login(user, password);
		System.out.println("end");
		ObjectMapper obfMapper=new ObjectMapper();
		
		return obfMapper.writeValueAsString(vo);
		
	}
	@GetMapping(value="/logintest",produces="application/json;charset=UTF-8")
	public void loginForTest2() {
		
		System.out.println("输入的用户名为:密码为");
		

		

		
	}

}
