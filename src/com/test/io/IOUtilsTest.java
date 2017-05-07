package com.test.io;

import java.io.IOException;

public class IOUtilsTest {

	public static void main(String[] args) {
		try {
			IOUtils.printHex("D:\\javaProgram\\Hello.java");
			
			IOUtils.printHexByByteArray("D:\\javaProgram\\Hello.java");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
