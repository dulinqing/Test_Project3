package com.foxconn.maintest;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.foxconn.test.daoimpl.UserJDBCTemplate;
import com.foxconn.test.model.Log;
//import com.foxconn.test.model.LogOld;


public class TestSpring {


	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		
//		UserJDBCTemplate  usertemplate= 
//			      (UserJDBCTemplate)context.getBean("userjdbctemplate");
//		
//		usertemplate.getLoginInfoFromDB("杜林青");
//		
//		
//		
//		context.close();
		
		
//		//测试日志的代码
//		
//		ResourceBundle sourcePath=ResourceBundle.getBundle("DB");
//		
//		String msgString = sourcePath.getString("messageLog");
//		
//		
//		String filePathString=sourcePath.getString("storePath");
//		
//		LogsRecord logsRecord=new LogsRecord();
//		
//		logsRecord.logInfo(filePathString, msgString);
//		
//		logsRecord.deleteLog_OutOfDate(new File(filePathString));
		
		
		
		//测试mabatis的代码
		
//		Connection conn = TestSpring.getSqlSession().getConnection();
//		System.out.println(conn!=null?"连接成功":"连接失败");
		
		
		Log log2=new Log(12, "95:24:S2:P0:43:QW", "192.168.10.90", 3324, "on", "massage", (byte)0, "it", new Date());
		LogsRecordToDB logsRecordToDB=new LogsRecordToDB();
		logsRecordToDB.log(log2);
		
//		try {
//
//				String sql = "universal.selectByPage";
//				Map<String, Integer> map=new HashMap<String, Integer>();
//				map.put("start", 0);
//				map.put("end", 9);
//				List<UserDB> list=sqlSession.selectList(sql,map);
//				System.out.println(list);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			sqlSession.rollback();
//		} finally {
//			TestSpring.closeSqlSession();
//		}

	}
	

}
