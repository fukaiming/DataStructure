package com.example.beautyOfProgram;

/**
 * N�Ľ׳�ĩβ�ж��ٸ�0 ˼�룺2*5 = 10����2����5�����һ��0.ͬʱ5�ĸ����ֱ�2�ࡣ����ֻ��Ҫ�����ж��ٸ�5
 *
 */
public class Test22 {
	public static void main(String[] args) {
		Test22 t22 = new Test22();
		int n = 12;
		int factorialValue = t22.factorial(n);
		System.out.println(n+"�Ľ׳ˣ�"+factorialValue);
		int result = t22.getZeroCount(n);
		System.out.println("����0�ĸ�����"+result);
	}

	// N�Ľ׳˺��ж��ٸ�0
	public int getZeroCount(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			int j = i;// point
			while (j % 5 == 0) {
				count++;
				j = j / 5;
			}
		}
		return count;
	}
	
	//��N�Ľ׳�
	public int factorial(int n){
		if(n == 1){
			return 1;
		}
		return n * factorial(n-1);
	}
}
