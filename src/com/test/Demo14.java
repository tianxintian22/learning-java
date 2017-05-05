package com.test;
import java.util.Scanner;

import java.util.InputMismatchException;

public class Demo14 {
	public static void main(String[] args) {
		int deliver = 10;
		int result = 10;
		try {
			
			while (deliver > -1)
			{
				deliver--;
				result = result + result / deliver;
			}
			System.out.println("最后的结果是：" + result);
		} catch (Exception e) {
			System.out.println("有异常");
		} finally {
			System.out.println("结果是：" + result);
		}
		System.out.println("程序结束了");
	}
}
