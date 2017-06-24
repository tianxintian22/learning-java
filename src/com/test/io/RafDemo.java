package com.test.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RafDemo {

	public static void main(String[] args) throws IOException {
		File demo = new File("demo");
		if (!demo.exists()) {
			demo.mkdir();
		}
		File file = new File(demo, "raf.dat");
		if (!file.exists()) {
			file.createNewFile();
		}
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		System.out.println(raf.getFilePointer());
		
		raf.write('A');//一个char型占两个字节，但是write一次只写入一个字节（A字符的后八位）
		System.out.println(raf.getFilePointer());
		raf.write('B');
		
		int i = 0x7fffffff;
		raf.write(i >>> 24);//写入i的高八位
		raf.write(i >>> 16);
		raf.write(i >>> 8);
		raf.write(i);
		System.out.println(raf.getFilePointer());
		//直接写入一个int
		raf.writeInt(i);
		
		String s = "你";
		byte[] b = s.getBytes("utf8");
		raf.write(b);
		System.out.println(raf.length());
		
		//读文件，必须把指针移到头部
		raf.seek(0);
		//一次性读取，把文件中的内容都读到字节数组中
		byte[] buf = new byte[(int) raf.length()];
		raf.read(buf);
		System.out.println(Arrays.toString(buf));
		for (byte c : buf) {
			System.out.print(Integer.toHexString(c & 0xff) + "  ");
		}
		//关闭文件
		raf.close();
	}

}
