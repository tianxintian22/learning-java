package com.test;
import java.util.Arrays;

public class Demo5 {
	public static void main(String[] args) {
		Demo5 demo = new Demo5();
		int length = 5;
		int[] nums = demo.getArray(length);
		System.out.println("数组为：" + Arrays.toString(nums));
	}
	public int[] getArray(int length) {
		int[] nums = new int[length];
		for (int i = 0; i <length; i++) {
			nums[i] = (int)(Math.random() * 100);
		}
		return nums;
	}
}
