package com.test;

public class Demo21 {
	public static void main(String[] args) {
		String str = "你好Java";
		byte[] b1 = str.getBytes();
		for (byte b : b1) {
			System.out.print(Integer.toHexString(b) + "  ");
		}
		System.out.println("");
		for (byte b : b1) {
			System.out.print(Integer.toHexString(b & 0xff) + "  ");
		}
	}
}
