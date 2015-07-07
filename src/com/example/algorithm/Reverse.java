package com.example.algorithm;

public class Reverse {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int n = array.length-1;
		for(int i=0;i<=array.length/2;i++){
			int temp = array[i];
			array[i] = array[n-i];
			array[n-i] = temp;
		}
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
	}
}

