package com.test.io;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) {
		File file = new File("F:\\javaio");
		//文件（目录）是否存在
		if(!file.exists()) {
			//创建目录
			file.mkdir();//file.mkdirs();
		} else {
			//文件（目录）删除
			file.delete();
		}
		//是否是目录 如果是目录返回true，如果不是目录或目录不存在返回false
		System.out.println(file.isDirectory());
		//是否是文件
		System.out.println(file.isFile());
		
		//File file2 = new File("F:\\java\\日记1.txt");
		File file2 = new File("F:\\javaio", "日记2.txt");
		if (!file2.exists()) {
			try {
				//创建文件
				file2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			file2.delete();
		}
		
		System.out.println(file);
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file2.getName());
		System.out.println(file.getParent());
		System.out.println(file.getParent());
	}

}
