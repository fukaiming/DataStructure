package com.example.beautyOfProgram;

/**
 * N的阶乘末尾有多少个0 思想：2*5 = 10；即2乘以5会产生一个0.同时5的个数又比2多。所以只需要看含有多少个5
 *
 */
public class Test22 {
	public static void main(String[] args) {
		Test22 t22 = new Test22();
		int n = 12;
		int factorialValue = t22.factorial(n);
		System.out.println(n+"的阶乘："+factorialValue);
		int result = t22.getZeroCount(n);
		System.out.println("含有0的个数："+result);
	}

	// N的阶乘含有多少个0
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
	
	//求N的阶乘
	public int factorial(int n){
		if(n == 1){
			return 1;
		}
		return n * factorial(n-1);
	}
}
