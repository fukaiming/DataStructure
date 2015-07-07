package com.example.recursion;

public class Calaculate {

	// sum�������ڼ���1~num���ۼӺ�
	public int sum(int num) {
		int result = 0;
		if (num == 1) {
			result = 1;
		} else {
			result = num + sum(num - 1);
		}
		return result;

	}

	// factorial�������ڼ���n�Ľ׳�
	public long factorial(int n) {
		long result = 0;
		// �ݹ��˳��������������⻯�򵽸ó̶�ʱ�����Խ�������ˣ�
		if (n == 3) {
			result = 6;
		} else {
			result = n * factorial(n - 1);
		}
		return result;
	}

	public static void main(String[] args) {
		Calaculate calc = new Calaculate();
		int result = calc.sum(10);
		System.out.println("result = " + result);
		
		long factorialResult = calc.factorial(5);
		System.out.println("factorial result = "+factorialResult);
	}
}
