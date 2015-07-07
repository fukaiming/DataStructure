package com.example.sort;

public class PartitonDrive {
	public static void main(String[] args) {
		int maxSize = 6;
		Partition partion = new Partition(maxSize);
		for (int i = 0; i < maxSize; i++) {
			long n = (long) (Math.random()*199);
			partion.insertElement(n);
		}
		partion.display();
/*		long pivot = 99;
		System.out.println("pivot ="+pivot);
		int size = partion.size();
		int result = partion.partition(0, size-1, pivot);
		System.out.println(result);
		partion.display();
*/
		partion.quickSort(0,partion.size()-1);
		partion.display();
	}
}
