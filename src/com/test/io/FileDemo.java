package com.test.io;

import java.io.UnsupportedEncodingException;

public class FileDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "你好ABC123";
		byte[] b1 = str.getBytes();//转换成字节系列用的是项目默认的编码
		for (byte b : b1) {
			//把字节（转换成了int）以十六进制方式显示
			System.out.print(Integer.toHexString(b & 0xff) + "  ");
		}
		
		System.out.println("");
		//utf8编码，中文占用3个字节，英文和数字占用1个字节
		byte[] b2 = str.getBytes("utf8");
		for (byte b : b2) {
			System.out.print(Integer.toHexString(b & 0xff) + "  ");
		}
		
		System.out.println("");
		//gbk编码，中文占用两个字节，英文和数字占用1个字节
		byte[] b3 = str.getBytes("gbk");
		for (byte b : b3) {
			System.out.print(Integer.toHexString(b & 0xff) + "  ");
		}
		
		System.out.println("");
		//java是双字节编码 utf-16be
		//utf-16be编码，中文占2个字节，英文和数字也占用2个字节
		byte[] b4 = str.getBytes("utf-16be");
		for (byte b : b4) {
			System.out.print(Integer.toHexString(b & 0xff) + "  ");
		}
		
		System.out.println("");
		//当字节序列是某种编码时，这时候想把字节序列变成字符串，也需要用这种编码方式，否则会出现乱码
		String str1 = new String(b4);//使用项目默认的编码
		System.out.println(str1);
		String str2 = new String(b4, "utf-16be");
		System.out.println(str2);
		
		/*
		 * 文本文件就是字节序列，可以是任意编码的字节序列
		 * 如果我们在中文机器上直接创建文本文件，那么该文本文件只认识ansi编码（中文系统下，ansi编码代表gbk编码）
		 */
	}
}
