package com.test.io;

import java.io.File;
import java.io.IOException;

/**
 * File类的常用操作
 * @author Administrator
 *
 */
public class FileUtils {
	/**
	 * 列出指定目录下（包括其子目录）的所有文件
	 * @param dir
	 * @throws IOException
	 */
	public static void listDirectory(File dir) throws IOException{
		if (!dir.exists()) {
			throw new IllegalArgumentException("目录" + dir + "不存在");
		}
		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "不是目录");
		}
		String[] filenames = dir.list();
		for (String string : filenames) {
			System.out.println(string);
		}
	}
}
