package com.test;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double score = 0;
		double avg = 0;
		for (int i = 1; i <= 3; i++)
		{
			score = 0;
			avg = 0;
			for (int j = 1; j<= 4; j++) {
				System.out.print("请输入分数:");
				score = score + input.nextInt();
			}
			System.out.print("总分是：" + score);
			avg = score / 4;
			System.out.println("平均分是：" + avg);
		}
	}
}
