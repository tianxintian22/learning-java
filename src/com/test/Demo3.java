package com.test;
import java.util.Arrays;

public class Demo3 {
	public static void main(String[] args) {
		String[] subjects = new String[5];
		subjects[0] = "Oricle";
		subjects[1] = "PHP";
		subjects[2] = "Linux";
		subjects[3] = "Java";
		subjects[4] = "Html";
		//System.out.println("数组中第4个科目为：" + subjects[3]);
		Arrays.sort(subjects);
		for (int i =  0; i < subjects.length; i++) {
			System.out.println(subjects[i]);
		}
		System.out.println("输出数组中的元素：" + Arrays.toString(subjects));
		for (String subject : subjects) {
			System.out.println(subject);
		}
		
		String[][] names = {{"tom", "jack", "mike"}, {"zhangsan", "lisi", "wangwu"}};
		for (int i= 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.println(names[i][j]);
			}
		}
		
	}
}
