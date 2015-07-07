package com.example.recursion;

public class Calaculate {

	// sum方法用于计算1~num的累加和
	public int sum(int num) {
		int result = 0;
		if (num == 1) {
			result = 1;
		} else {
			result = num + sum(num - 1);
		}
		return result;

	}

	// factorial方法用于计算n的阶乘
	public long factorial(int n) {
		long result = 0;
		// 递归退出的条件（当问题化简到该程度时，可以进行求解了）
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
