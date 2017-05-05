package com.test;

public class Demo8 {
	public static String classroom = "Java班";
	public String schoolName = "希望小学";
	
	public static void getName() {
		System.out.println("=======getName=======");
		System.out.println(classroom);
		Demo8 demo  = new Demo8();
		System.out.println(demo.schoolName);
	}
	
	public void func() {
		System.out.println("=======func=======");
		System.out.println(classroom);
		System.out.println(schoolName);
	}

	public static void main(String[] args) {
		System.out.println("=======main=======");
		System.out.println(Demo8.classroom);
		System.out.println(classroom);
		Demo8.getName();
		getName();
		Demo8 demo = new Demo8();
		demo.func();
	}

}
