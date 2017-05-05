package com.test;

public class Initail {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 12;
		/*
		Cat cat = new Cat();
		cat.age = 3;
		Cat cat2 = new Cat();
		cat2.age = 3;
		if (cat.equals(cat2)) {
			System.out.println("两个对象相同");
		} else {
			System.out.println("两个对象不同");
		}
		if (num1 == num2) {
			System.out.println("两个数的值相同");
		} else {
			System.out.println("两个数的值不相同");
		}
		System.out.println(cat.getClass());
		
		Animal animal = new Animal();
		Animal cat = new Cat();
		//Cat cat1 = new Animal();
		animal.eat();
		cat.eat();
		//animal.nature();
		 */
		Dog dog = new Dog();
		Animal animal = dog;//向上类型转换
		
		if (animal instanceof Dog) {
			Dog dog2 = (Dog)animal;
		} else {
			System.out.println("无法转换为Dog类型");
		}
		
		if (animal instanceof Cat) {
			Cat cat = (Cat)animal;
		} else {
			System.out.println("无法转换为Cat类型");
		}
	}

}
