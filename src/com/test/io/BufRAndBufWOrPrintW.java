package com.test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class BufRAndBufWOrPrintW {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("F:\\javaio\\javautf.txt")));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\javaio\\javautf2.txt")));
		PrintWriter pw = new PrintWriter("F:\\javaio\\javautf3.txt");
		
		String s;
		while ((s = br.readLine()) != null) {
			//一次读一行，不能识别换行符
			//bw.write(s);
			//bw.newLine();//写入一个行分隔符
			//bw.flush();
			pw.println(s);//通过写入行分隔符字符串终止当前行
			pw.flush();
		}
		br.close();
		//bw.close();
		pw.close();
		
	}

}
