package com.example.beautyOfProgram;

/**
 * 1�ĸ��� д�´�1��ʼ����N��������������
 *
 */
public class Test24 {
	public static void main(String[] args) {
		Test24 t24 = new Test24();
		int result = t24.getOneCount(10);
		System.out.println(result);
	}

	// ͳ��1�ĸ���
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
