package com.example.algorithm;

public class Test21 {
	private int number;

	public Test21(int number) {
		this.number = number;
	}

	// �жϸö����ƺ��ж��ٸ�1
	public static int containOne(int n) {
		int count = 0;

		while (n>0) {
			count++;
			//n & (n - 1)���ٵ�ȥ������ߵ�1
			n = (n & (n - 1));
		}

		return count;
	}
	
	public static int sumOfOne(int n){
		int count = 0;
		while(n>0){
			if((n&1)>0){
				count++;
			}
			n>>=1;
		}
		return count;
	}

	public static void main(String[] args) {
		int result = Test21.containOne(7);
		System.out.println(result);
		int result2 = Test21.containOne(7);
		System.out.println(Test21.sumOfOne(7));
	}
}
