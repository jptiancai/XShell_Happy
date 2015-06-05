package com.sail2world.cons;

public class Constants {
	public static final String root = "ScriptPath=C:\\Users\\Administrator\\Documents\\NetSarang\\Xshell\\Scripts\\ScriptSample\\Session\\xshell_session_login.vbs";
	public static final String font_14 = "FontSize=14";
	public static final String script_on = "UseInitScript=1";
	public static final String userName_on = "UserName=jiangzy";
	public static final String userKey_on = "UserKey=jiangzy_id_rsa";
	public static final String mysql_sd_7_on = "FwdReqCount=2";
	public static final String default_path = "C:\\Users\\Administrator\\Documents\\NetSarang\\Xshell\\Sessions\\龙珠Q传\\";
	public static final String script = "ScriptPath=";
	public static final String script_off = "UseInitScript=0";
	public static final String font_9 = "FontSize=9";
	public static final String userName_off="UserName=root";
	public static final String userKey_off="UserKey=mouyu_id_rsa";
	public static final String userName_jq_off = "UserName=lidx";
	public static final String userKey_jq_off = "UserKey=lidx_id_rsa";
	public static final String sd_flag="ForwardToXmanager=1";
	public static final String mysql_sd_1_add="FwdReq_0_Incoming=0";
	public static final String mysql_sd_2_add="FwdReq_0_Description=";
	public static final String mysql_sd_3_add="FwdReq_0_Source=localhost";
	public static final String mysql_sd_4_add="FwdReq_0_Port=41001";//根据需要更换
	public static final String mysql_sd_5_add="FwdReq_0_LocalOnly=1";
	public static final String mysql_sd_6_add="FwdReq_0_Host=localhost";
	//配置mysql和mongoDB隧道，所以个数为2。localhost:41001-->localhost:3306,localhost:40001-->localhost:40000
	public static final String mysql_sd_7_off="FwdReqCount=0";
	public static final String mysql_sd_8_add="FwdReq_0_HostPort=3306";
	
	public static final String mongo_sd_1_add="FwdReq_1_Incoming=0";
	public static final String mongo_sd_2_add="FwdReq_1_Description=";
	public static final String mongo_sd_3_add="FwdReq_1_Source=localhost";
	public static final String mongo_sd_4_add="FwdReq_1_Port=40001";//根据需要更换
	public static final String mongo_sd_5_add="FwdReq_1_LocalOnly=1";
	public static final String mongo_sd_6_add="FwdReq_1_Host=localhost";
	//配置mysql和mongoDB隧道，所以个数为2。localhost:41001-->localhost:3306,localhost:40001-->localhost:40000
	public static final String mongo_sd_7_off="FwdReqCount=0";
	public static final String mongo_sd_8_add="FwdReq_1_HostPort=40000";
}
