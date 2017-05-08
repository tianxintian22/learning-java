package com.test.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {

	public static void main(String[] args) throws IOException {
		//如果该文件不存在，则直接创建，如果存在，删除后创建。（如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处。）
		FileOutputStream out = new FileOutputStream("F:\\javaio\\out.dat");
		out.write('A');//写入了‘A’的低八位（一次只写入一个字节）
		int a = 10;
		out.write(a >>> 24);
		out.write(a >>> 16);
		out.write(a >>> 8);
		out.write(a);
		
		byte[] b = "10".getBytes();
		out.write(b);
		
		out.close();
		
		IOUtils.printHex("F:\\javaio\\out.dat");
		
	}

}
