package com.foxconn.test.service;

import com.foxconn.test.vo.MessageVo;

public interface LoginService {

	MessageVo login(String user, String password);
}
