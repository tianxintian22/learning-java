package com.test;

public class Demo18 {
	public static void main(String[] args) {
		String str = "a";
		String str2 = "B" + str;
		String s1 = new Demo18().toString();
		String s2 = new Demo18().toString();
		System.out.println(s1 == s2);
	}
	public String toString(){
		String a = "a";	
		String b = "b";
		//return a + " " + b;
		//return "a" + "b"; 
		//return a;
		String s = "a" + "b";
		return s;
		}
}
