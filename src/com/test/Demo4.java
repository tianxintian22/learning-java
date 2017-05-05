package com.test;

public class Demo4 {
	public static void main(String[] args) {
		Demo4 demo = new Demo4();
		demo.show();
		double avg = demo.calAvg();
		System.out.println("平均成绩为：" + avg);
		
		int maxAge = demo.getMaxAge();
		System.out.println("最大年龄为：" + maxAge);
	}
	
	public void show() {
		System.out.println("Welcome to java!");
	}
	
	public double calAvg() {
		double java = 92.5;
		double php = 83.0;
		double avg = (java + php) / 2;
		return avg;
	}
	
	public int getMaxAge () {
		int[] ages = {18, 23, 21, 19, 25, 29, 17};
		int max = ages[0];
		for (int i = 1; i < ages.length; i++) {
			if (ages[i] > max) {
				max = ages[i];
			}
		}
		return max;
	}
}

