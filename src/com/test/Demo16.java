package com.test;

public class Demo16 {
	public static void main(String[] args) {
//		String str = "hello";
//		System.out.println(str + "world");
//		System.out.println(str);
//		
//		StringBuilder str2 = new StringBuilder("java");
//		System.out.println(str2.append(" hello"));
//		System.out.println(str2.append(520));
//		System.out.println(str2.length());
//		System.out.println(str2.insert(10, ","));
//		System.out.println(str2.toString());StringBuilder str = new StringBuilder();
        
		StringBuilder str = new StringBuilder();
		// 追加字符串
		str.append("jaewkjldfxmopzdm");
		
        // 从后往前每隔三位插入逗号
        int i = str.length() - 3;
        System.out.println(str.length());
		while (i >= 0) {
		    str.insert(i, ",");
		    i -= 3;
		}
        // 将StringBuilder对象转换为String对象并输出
		System.out.print(str.toString());
		
	}
}
