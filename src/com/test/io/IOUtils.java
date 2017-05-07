package com.test.io;

import java.io.FileInputStream;
import java.io.IOException;

public class IOUtils {
	/**
	 * 读取指定文件内容，按照十六进制输出到控制台
	 * 并且每输出10个byte换行
	 * @param fileName
	 * @throws IOException
	 */
	public static void printHex(String fileName) throws IOException {
		//把文件作为字节流进行读操作
		FileInputStream in = new FileInputStream(fileName);
		int b;
		int i = 1;
		while ((b = in.read()) != -1) {
			if (b <= 0xf) {
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(b) + "  ");
			if (i % 10 == 0) {
				System.out.println("");
			}
			i++;
		}
		in.close();
	}
}
