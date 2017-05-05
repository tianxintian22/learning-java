package com.test;

public class Cat extends Animal{
	public int age = 2;
	public void eat() {
		System.out.println("兔子吃胡萝卜");
	}
	public void nature() {
		System.out.println("兔子胆小");
	}
	@Override
	public String toString() {
		return "Cat [age=" + age + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (age != other.age)
			return false;
		return true;
	}

	
}
