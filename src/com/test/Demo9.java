package com.test;

public class Demo9 {
	int age;
	String name;
	static String sex;
	public Demo9() {
		age = 12;
		System.out.println("通过构造函数初始化age");
	}
	{
		name = "java";
		System.out.println("通过初始化块初始化name");
	}
	static {
		sex = "女";
		System.out.println("通过静态初始化块初始化sex");
	}
	
	public static void main(String[] args) {
		Demo9 demo = new Demo9();
		System.out.println("年龄" + demo.age + "姓名" + demo.name + "性别" + sex);
		Demo9 demo1 = new Demo9();
	}
}
