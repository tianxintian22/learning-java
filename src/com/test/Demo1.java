package com.test;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入考试成绩信息：");
		
		int score = input.nextInt();
		int count = 0;
		System.out.println(score);
		while (score < 60) {
			score++;
 			count++;
		}
		System.out.println(score);
		System.out.println(count);
	}
}
