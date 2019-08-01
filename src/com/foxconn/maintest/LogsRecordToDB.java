package com.foxconn.maintest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.foxconn.test.model.Log;


public class LogsRecordToDB {

	/**
	 * 
	 * @param filePathString 文件路径
	 * @param msgString      写入文件的内容
	 */
	public void log(Log logBean) {
		SqlSession sqlSession = LogsRecordToDB.getSqlSession();
		try {
//			for (int i = 1; i < 10; ++i) {
//				Log log=new Log(i+3, "95:24:S2:P0:43:QW", "192.168.10."+i*3, "on", "massage", (byte)0, "it", new Date(2019, 7, 27, 11, 25, 00), "wang", new Date());

				String sql = "logToDB.insert";
				sqlSession.insert(sql,logBean);
//				sqlSession.update(sql, userDB);
				
//				sqlSession.delete(sql, userDB);
				sqlSession.commit();
//			}

		} catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		} finally {
			LogsRecordToDB.closeSqlSession();
		}
	}

	private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();
	private static SqlSessionFactory sqlSessionFactory;
	/**
	 * 加载位于src/mybatis.xml配置文件
	 */
	static {
		try {
			Reader reader = Resources.getResourceAsReader("Mybatis-Config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 禁止外界通过new方法创建 
	 */
//	private LogsRecordToDB(){}

	/**
	 * 获取SqlSession
	 */
	public static SqlSession getSqlSession() {
		// 从当前线程中获取SqlSession对象
		SqlSession sqlSession = threadLocal.get();
		// 如果SqlSession对象为空
		if (sqlSession == null) {
			// 在SqlSessionFactory非空的情况下，获取SqlSession对象
			sqlSession = sqlSessionFactory.openSession();
			// 将SqlSession对象与当前线程绑定在一起
			threadLocal.set(sqlSession);
		}
		// 返回SqlSession对象
		return sqlSession;
	}

	/**
	 * 关闭SqlSession与当前线程分开
	 */
	public static void closeSqlSession() {
		// 从当前线程中获取SqlSession对象
		SqlSession sqlSession = threadLocal.get();
		// 如果SqlSession对象非空
		if (sqlSession != null) {
			// 关闭SqlSession对象
			sqlSession.close();
			// 分开当前线程与SqlSession对象的关系，目的是让GC尽早回收
			threadLocal.remove();
		}
	}
}
