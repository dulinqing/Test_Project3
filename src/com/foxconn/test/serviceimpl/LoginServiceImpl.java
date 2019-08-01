package com.foxconn.test.serviceimpl;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;

import com.foxconn.test.daoimpl.UserJDBCTemplate;
import com.foxconn.test.model.User;
import com.foxconn.test.service.LoginService;
import com.foxconn.test.utils.Consts;
import com.foxconn.test.vo.MessageVo;


@Service
public class LoginServiceImpl implements LoginService{

public Log log = LogFactory.getLog(LoginServiceImpl.class); 
	
	@Autowired
	UserJDBCTemplate loginInfoDaoImpl;
	@Override
	public MessageVo login(String user, String password) {
		// TODO Auto-generated method stub
		
		MessageVo messageVo = new MessageVo();
		try {
//			log.error("getLoginInfo start");
			loginInfoDaoImpl=(UserJDBCTemplate) ContextLoader.getCurrentWebApplicationContext().getBean("userjdbctemplate");
			User userAndPasswordTest= loginInfoDaoImpl.getLoginInfoFromDB(user);
			
//			log.error("getLoginInfo end");
			Boolean userequalBoolean=userAndPasswordTest.getUserString().equals(user);
//			Boolean passwdequalBoolean=userAndPasswordTest.getPasswordString().equals(password);
			if (userequalBoolean) {
				System.out.println("chenggong");
				messageVo.setData("");
				messageVo.setCode("1");
				messageVo.setInfo("登录成功");
				
			}else {
				System.out.println("defect");
				messageVo.setData("");
				messageVo.setCode("0");
				messageVo.setInfo("登录失败");
			}
		}catch (Exception e) {
			System.out.println("exception");
			log.error(e.getMessage());
			messageVo.setCode(Consts.EXCEPTIONCODE);
			messageVo.setInfo(Consts.EXCEPTIONINFO);
			messageVo.setData("");
		}
		
		
		return messageVo;
	}

}
