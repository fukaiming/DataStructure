package com.example.algorithm;

public class SumOfOne {
	private int number;

	public SumOfOne(int number) {
		this.number = number;
	}

	// 计算该二进制中含有多少个1
	public int containOne() {
		int count = 0;
		while (number > 0) {
			if ((number & 1) > 0) {
				count++;
			}
			number = number >> 1;
		}
		return count;

	}

	public int hammingWeight(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) > 0) {
				count++;
			}
			n = n >> 1;
		}
		return count;
	}

	public static void main(String[] args) {
		int number = 11;
		SumOfOne soo = new SumOfOne(number);
		int result = soo.containOne();
		System.out.println(result);
	}
}
