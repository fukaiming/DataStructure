package com.example.beautyOfProgram;

/**
 * 求二进制中1的个数 思想： 与1做与运算 && 右移
 *
 */
public class Test21 {

	public static void main(String[] args) {
		Test21 t21 = new Test21();
		int result =t21.getBinaryCounts(11);
		System.out.println(result);
	}

	// 判断二进制数中有多少个1
	public int getBinaryCounts(int number) {
		int count = 0;
		while (number != 0) {
			if ((number & 1) > 0) {
				count++;
			}
			number = number >> 1;
		}
		return count;
	}
}
