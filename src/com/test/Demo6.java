package com.test;
import java.util.Arrays;

public class Demo6 {
	public static void main(String[] args) {
		Demo6 demo = new Demo6();
		double[] scores = {89, -23, 61, 91, 119, 52, 73};
		double[] scores1 = demo.getScores(scores);
		System.out.println("考试成绩前三名为：" + Arrays.toString(scores1));
	}
	public double[] getScores(double[] scores) {
		int length = scores.length;
		double[] newScores = new double[3];
		Arrays.sort(scores);
		int num = 0;
		for (int i = length - 1; i >= 0; i--) {
			if (scores[i] > 100 || scores[i] < 0) {
				continue;
			}
			newScores[num] = scores[i];
			num++;
			if (num >= 3){
				break;
			}
		}
		return newScores;
	}
}
