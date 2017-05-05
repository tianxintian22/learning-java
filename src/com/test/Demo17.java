package com.test;

public class Demo17 {
	public static void main(String[] args) {
		int c = 12;
		String str1 = Integer.toString(c);
		String str2 = String.valueOf(c);
		String str3 = c + "";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String d = "13";
		int i1 = Integer.parseInt(d);
		int i2 = Integer.valueOf(d);
		System.out.println(i1);
		System.out.println(i2);
		
		int i = 3;
		Integer m = new Integer(5);
		Integer n = i;
		
		int x = m.intValue();
		int y = m;
		System.out.println(x);
		
		//System.out.println(i);
		//System.out.println(m);
		//System.out.println(n);
		System.out.println(m.byteValue());
		System.out.println(m.doubleValue());
		System.out.println(m.floatValue());
		System.out.println(m.longValue());
		System.out.println(m.parseInt("12"));
		String s = m.toString();
		System.out.println(s);
		System.out.println(Integer.valueOf(s) + 1);
	}
}
