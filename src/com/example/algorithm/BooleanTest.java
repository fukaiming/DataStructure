package com.example.algorithm;

public class BooleanTest {
	public static void main(String[] args) {
		boolean[] result = new boolean[256];
		char ab = 'a';
		if(result[ab]){
			result['a'] = true;
		}
		
		int[] ints = new int[100];
		ints['c'] = 10;
	}
}
