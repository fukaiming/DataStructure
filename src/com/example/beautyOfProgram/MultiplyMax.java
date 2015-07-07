package com.example.beautyOfProgram;

public class MultiplyMax {
	private static int[] theArray = { 5, 9, 1, 7, 6, 4, 2 };

	// �ҵ��������е���Сֵ���ڵ��±�
	public int findMinIndex() {
		int min = 0;
		for (int i = 1; i < theArray.length; i++) {
			if (theArray[i] < theArray[min]) {
				min = i;
			}
		}
		return min;
	}

	// ����N-1�����ĳ˻�
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
