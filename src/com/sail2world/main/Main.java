package com.sail2world.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.sail2world.cons.Constants;

public class Main {

	public static void main(String[] args) throws IOException {

		File dny_f = new File(Constants.dny_path);
		String[] ext = { "xsh" };
//		Collection<File> dny_files = FileUtils.listFiles(dny_f, ext, true);
		Collection<File> dny_files = new ArrayList<File>();
		dny_files.add(new File(Constants.dny_temp_path));
		happy_dny(Constants.userName_off, Constants.userKey_off,
				Constants.script, Constants.script_off, Constants.font_9,
				dny_files);

	}

	/**
	 * @param script
	 * @param script_off
	 * @param font_9
	 * @param dny_files
	 * @throws IOException
	 */
	private static void happy_dny(String userName_off, String userKey_off,
			String script, String script_off, String font_9,
			Collection<File> dny_files) throws IOException {
		for (File f : dny_files) {
			List<String> list = getContent(f);
			for (int i = 0; i < list.size(); i++) {
				// 设置登录公钥
//				replace(f, list, i, userName_off, Constants.userName_on);
//				replace(f, list, i, userKey_off, Constants.userKey_on);
				// 设置隧道
				add(f, list, i);
				replace(f, list, i, Constants.mysql_sd_7_off, Constants.mysql_sd_7_on);
				// // 设置打开会话即是root权限
				// replace(f, list, i, script_off, script_on);
				// replace(f, list, i, script, root);
				// // 设置字体为14号，适合查看日志
				// replace(f, list, i, font_9, font_14);

			}
			System.out.println(f.getName() + "--->√");
		}
	}

	private static void add(File f, List<String> list, int i)throws IOException{
		if (list.get(i).equals(Constants.sd_flag)) {
			list.add(i+1, Constants.mysql_sd_1_add);
			list.add(i+2, Constants.mysql_sd_2_add);
			list.add(i+3, Constants.mongo_sd_1_add);
			list.add(i+4, Constants.mongo_sd_2_add);
			list.add(i+5, Constants.mysql_sd_3_add);
			list.add(i+6, Constants.mongo_sd_3_add);
			list.add(i+7, Constants.mysql_sd_4_add);
			list.add(i+8, Constants.mysql_sd_5_add);
			list.add(i+9, Constants.mysql_sd_6_add);
			list.add(i+10, Constants.mongo_sd_4_add);
			list.add(i+11, Constants.mongo_sd_5_add);
			list.add(i+12, Constants.mongo_sd_6_add);
			list.add(i+13, Constants.mysql_sd_8_add);
			list.add(i+14, Constants.mongo_sd_8_add);
			FileUtils.writeLines(f, list);
		}
	}
	
	
	/**
	 * @param f
	 * @param list
	 * @param i
	 * @throws IOException
	 */
	private static void replace(File f, List<String> list, int i,
			String originInfo, String replaceInfo) throws IOException {
		if (list.get(i).equals(originInfo)) {
			list.remove(i);
			list.add(i, replaceInfo);
			FileUtils.writeLines(f, list);
		}
	}

	private static List<String> getContent(File f) throws IOException {
		return FileUtils.readLines(f);
	}

}
