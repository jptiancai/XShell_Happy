package com.sail2world.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Main {

	public static String root="ScriptPath=C:\\Users\\Administrator\\Documents\\NetSarang\\Xshell\\Scripts\\ScriptSample\\Session\\xshell_session_login.vbs";
	public static String font_14="FontSize=14";
	public static String script_on="UseInitScript=1";
	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\Administrator\\Documents\\NetSarang\\Xshell\\Sessions\\����Q��\\����\\��׿\\(��׿321��-322��)119.29.27.98.xsh";
		String script="ScriptPath=";
		String script_off="UseInitScript=0";
		String font_9="FontSize=9";
		File f=new File(path);
		List<String> list=getContent(f);
		for (int i = 0; i < list.size(); i++) {
			//TODO�����õ�¼��Կ
			
			//TODO���������
			
			//���ô򿪻Ự����rootȨ��
			replace(f, list, i,script_off,script_on);
			replace(f, list, i,script,root);
			//��������Ϊ14�ţ��ʺϲ鿴��־
			replace(f, list, i,font_9,font_14);
			
			
		}
		
	}

	/**
	 * @param f
	 * @param list
	 * @param i
	 * @throws IOException
	 */
	public static void replace(File f, List<String> list, int i,String originInfo,String replaceInfo)
			throws IOException {
		if (list.get(i).equals(originInfo)) {
			list.remove(i);
			list.add(i,replaceInfo);
			FileUtils.writeLines(f, list);
		}
	}
	
	private  static List<String> getContent(File f) throws IOException{
		return FileUtils.readLines(f);
	}

}
