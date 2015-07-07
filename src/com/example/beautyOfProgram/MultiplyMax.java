package com.example.beautyOfProgram;

public class MultiplyMax {
	private static int[] theArray = { 5, 9, 1, 7, 6, 4, 2 };

	// 找到该数组中的最小值所在的下标
	public int findMinIndex() {
		int min = 0;
		for (int i = 1; i < theArray.length; i++) {
			if (theArray[i] < theArray[min]) {
				min = i;
			}
		}
		return min;
	}

	// 计算N-1个数的乘积
	public int multiplyValue(int minIndex) {
		int results = 1;
		for (int i = 0; i < theArray.length; i++) {
			if (i == minIndex) {
				continue;
			}
			results *= theArray[i];
		}
		return results;
	}

	public static void main(String[] args) {
		MultiplyMax mm = new MultiplyMax();
		int minIndex = mm.findMinIndex();
		int results = mm.multiplyValue(minIndex);
		System.out.println(results);
	}
}
