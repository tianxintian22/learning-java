package com.test;

public class Demo11 {
	private static int score = 32;
	public int num = 111;
	
	public static class Inner {
		int score = 90;
		public void show() {
			System.out.println("外部类中的score=" + Demo11.score);
			System.out.println("内部类中的score=" + score);
			System.out.println("外部类中的num=" + new Demo11().num);
		}
	}
	
	public static void main(String[] args) {
		Inner i = new Inner();
		i.show();
	}
}
