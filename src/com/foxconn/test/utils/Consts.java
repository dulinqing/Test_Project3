package com.foxconn.test.utils;


public class Consts {
	
	public static final String SERVER_38_28 = "10.191.38.28";
	
	public static final String SERVER_82_81 = "10.134.82.81";

	public static final String SERVER_82_82 = "10.134.82.82";
	
	public static final String SERVER_38_49 = "10.191.38.49";
	
	public static final String SERVER_38_50 = "10.191.38.50";
	
	public static final String SERVER_170_69 = "10.244.170.69";
	
	//上线修改变量！！！！！！！！！！！！！！！！！！！！
//	public static final boolean isTestEnvir = true;
//	
//	public static final boolean ISLH = false;
	
	public static final String SERVER_FLAG = SERVER_38_28;
	//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	//10.191.38.49服务器信息
	public static final String HOST_38_49 = "10.191.38.49"; 
	public static final int PORT_38_49 = 40022;
	public static final String USER_38_49 = "f7680339";
	public static final String PWD_38_49 = "idsbg123.1234";
	
	//10.191.38.50服务器信息
	public static final String HOST_38_50 = "10.191.38.50"; 
	public static final int PORT_38_50 = 40022;
	public static final String USER_38_50 = "f7680339";
	public static final String PWD_38_50 = "idsbg123.1234";
	
	//LH图片服务器信息!!!!!!!!!!!!!!!!!!!!!!
	public static final String HOST_82_82 = "10.134.82.82"; 
	public static final int PORT_82_82 = 22;
	public static final String USER_82_82 = "f7680339";
	public static final String PWD_82_82 = "idsbg123.1234";
	//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	//CD图片服务器信息!!!!!!!!!!!!!!!!!!!!!!
	public static final String HOST_135_221 = "10.244.135.221"; 
	public static final int PORT_135_221 = 22;
	public static final String USER_135_221 = "svcuser";
	public static final String PWD_135_221 = "Foxconn7680339.";
	//!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	//*******************LH正式环境服务器**********************
//	public static final String HOST = ISLH ? "10.134.82.82" : "10.244.135.221";
//	
//	public static final int PORT = 22;
//	
//	public static final String USER = ISLH ? "f7680339" : "svcuser";
//	
//	public static final String PWD2 = ISLH ? "foxconn7680339.." : "Foxconn7680339.";
//	public static final String PWD = ISLH ? "idsbg123.1234" : "Foxconn7680339.";
	//*******************正式环境服务器**********************
	
	
	//天行者locCode和systemCode
	public static final int TXZLOCCODE = 99;
	
	public static final String AIDUODUO_MANAGE_UUID = "AI-DUO-DUO-PROPRIETARY-UUID";
	
	public static final String TXZSYSTEMALIAS = "syncStaffImageByEmpNo";
	
	public static final String SUCCESSCODE = "0";
	
	public static final String SUCCESSINFO = "success!";
	
	public static final String FAILCODE = "1";	
	
	public static final String FAILINFO = "fail!";
	
	public static final String EXCEPTIONCODE = "-1";	
	
	public static final String EXCEPTIONINFO = "error!"; 
	//windows文件
//	public static final String IMAGE_FIRST_PATH = "F:"+ File.separator+"faceImage";
	
	//Linux文件
//	public static final String IMAGE_FIRST_PATH = File.separator + "var" + File.separator + "faceImage" + File.separator ;
	
	/**
	 * API
	 */
	
	//获取照片url前缀
	public static final String GET_IMAGE_PREFIXX_82 = "http://10.134.82.82:8080";
	
	//txz上传图片到82.82
	public static final String UPLOADIMAGE_TO_82 = "http://10.134.82.82:8080/FaceRec/privateOperateImage/uploadImage";
	
	public static final String DELETEIMAGE_TO_82 = "http://10.134.82.82:8080/FaceRec/privateOperateImage/deleteImage";
	
	//获取员工图片
	public static final String GETEMPIMAGE = "http://10.134.81.233:8123/gateinfo/employeeinfo";
	
	//测试环境获取员工信息
	public static final String GETEMPINFOURL = "http://10.191.38.60/APPServiceTest/UserInfoService.asmx/GetEmpBaseInfo";
	
	//************登录***********************
	public static final String LOGINBYENKNOWN = "http://10.191.38.60/AppService/UserLoginService.asmx/UserLoginAddSex";
	/**工号尚未注册*/
	public static final String LOGIN_E = "E";
	
	/**工号与密码不匹配*/
	public static final String LOGIN_F = "F";
	
	/**工号或者密码不能为空！*/
	public static final String LOGIN_A = "A";
	
	/**工号或者密码不能为空！*/
	public static final String LOGIN_C = "C";
	
	/**服务器异常*/
	public static final String LOGIN_G = "G";
	
	/**服务器异常*/
	public static final String LOGIN_Q = "Q";
	
	/**登录成功*/
	public static final String LOGIN_Y = "Y";
	//**********************************
}
