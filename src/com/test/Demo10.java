package com.test;

public class Demo10 {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public class Inner {
		public void show() {
			System.out.println("Welcome to java");
			setName("tom");
			System.out.println(getName());
		}
	}
	
	public static void main(String[] args) {
		Demo10 demo = new Demo10();
		Inner i = demo.new Inner();
		i.show();
	}
}
