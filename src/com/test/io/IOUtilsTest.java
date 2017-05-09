package com.test.io;

import java.io.File;
import java.io.IOException;

public class IOUtilsTest {

	public static void main(String[] args) {
		//IOUtils.printHex("D:\\javaProgram\\Hello.java");
		try {
			long start = System.currentTimeMillis();
			//IOUtils.copyFile(new File("F:\\javaio\\1.mp3"), new File("F:\\javaio\\2.mp3"));//211ms
			//IOUtils.copyFileByBuffer(new File("F:\\javaio\\1.mp3"), new File("F:\\javaio\\3.mp3"));//18583ms
			IOUtils.copyFileByByte(new File("F:\\javaio\\1.mp3"), new File("F:\\javaio\\4.mp3"));//37822ms
			long end = System.currentTimeMillis();
			System.out.println(end - start);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
