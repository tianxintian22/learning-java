package com.test;

public class Demo15 {
	public static void main(String[] args) {
		Demo15 demo = new Demo15();
		demo.complete();
		try {
			demo.complete1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void devide(int one, int two) throws Exception {
		if (two == 0) {
			throw new Exception("两数相除，除数不能为0");
		} else {
			System.out.println("两数相除，结果为：" + one / two);
		}
	}
	
	public void complete() {
		try {
			devide(5, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void complete1() throws Exception {
		devide(3, 0);
	}
}
