package com.test.io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderAndFileWriter {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("F:\\javaio\\javautf.txt");
		FileWriter fw = new FileWriter("F:\\javaio\\javautf1.txt");
		//FileWriter fw = new FileWriter("F:\\javaio\\javautf1.txt", true);//向指定文件中追加内容
		
		char[] buf = new char[1 * 1024];
		int c;
		while ((c = fr.read(buf, 0, buf.length)) != -1) {
			System.out.println(c);
			fw.write(buf, 0, c);
			fw.flush();
		}
		fr.close();
		fw.close();
	}
}
