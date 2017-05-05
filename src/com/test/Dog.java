package com.test;

public class Dog extends Animal {
	public int age = 3;
	public void eat() {
		System.out.println("年龄"+age+"岁的狗是可以吃骨头的");
	}
	public Dog(){
		super();
		System.out.println("dog的构造方法");
	}
	public void method(){
		System.out.println(super.age);
		super.eat();
	}
}
