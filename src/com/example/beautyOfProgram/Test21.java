package com.example.beautyOfProgram;

/**
 * ���������1�ĸ��� ˼�룺 ��1�������� && ����
 *
 */
public class Test21 {

	public static void main(String[] args) {
		Test21 t21 = new Test21();
		int result =t21.getBinaryCounts(11);
		System.out.println(result);
	}

	// �ж϶����������ж��ٸ�1
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
