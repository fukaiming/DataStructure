package com.example.beautyOfProgram;

/**
 * 1的个数 写下从1开始，到N的所有整数个数
 *
 */
public class Test24 {
	public static void main(String[] args) {
		Test24 t24 = new Test24();
		int result = t24.getOneCount(10);
		System.out.println(result);
	}

	// 统计1的个数
	public int getOneCount(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			int j = i;
			while (j != 0) {
				if (j % 10 == 1) {
					count++;
				}
				j = j / 10;

			}

		}
		return count;
	}
}
