package com.test;

public class Demo12 {
	
	public void show() {
		final int a = 12;
		int b = 13;
		
		class MInner {
			int c= 2;
			public void print() {
				System.out.println("外部类方法中的变量a=" + a);
				System.out.println("外部类方法中的变量b=" + b);
				System.out.println("内部类中的变量c=" + c);
			}
		}
		MInner mi = new MInner();
		mi.print();
	}
	
	public static void main(String[] args) {
		Demo12 demo = new Demo12();
		demo.show();
	}
}
