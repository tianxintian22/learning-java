package com.test.io;

import java.io.File;
import java.io.IOException;

public class IOUtilsTest {

	public static void main(String[] args) {
		//IOUtils.printHex("D:\\javaProgram\\Hello.java");
		try {
			IOUtils.copyFile(new File("F:\\javaio\\out.dat"), new File("F:\\javaio\\a.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
