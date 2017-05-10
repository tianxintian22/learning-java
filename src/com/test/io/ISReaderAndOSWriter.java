package com.test.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ISReaderAndOSWriter {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("F:\\javaio\\java.txt");
		FileOutputStream out = new FileOutputStream("F:\\javaio\\java1.txt");
		
		InputStreamReader isr = new InputStreamReader(in, "gbk");
		OutputStreamWriter osw = new OutputStreamWriter(out, "gbk");
		
		int c;
//		while ((c = isr.read()) != -1) {
//			System.out.print((char)c);
//		}
		
		char[] buf = new char[8 * 1024];
		while ((c = isr.read(buf, 0, buf.length)) != -1) {
			String s = new String(buf, 0, c);
			//System.out.println(s);
			osw.write(s);
		}
		
		isr.close();
		osw.close();
	}

}
