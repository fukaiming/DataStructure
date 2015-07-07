package com.example.sort;

/**
 * 插入排序：假设左边的数组已排好序，右边的数组是待排序的。每经过一次排序，都会将右边数组的第一个元素插入到左边数组中的合适的位置 注：假设第一个元素已排好序
 */

public class InsertSort {
	private int[] theArray;
	private int nElem;// 当前数组中元素的个数

	public InsertSort(int maxSize) {
		theArray = new int[maxSize];
		nElem = 0;
	}

	// 向数组中插入元素
	public void insert(int element) {
		if (theArray.length == nElem) {
			return;
		}
		theArray[nElem++] = element;
	}

	// 展示数组中的内容
	public void display() {
		for (int i = 0; i < nElem; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}

	// 插入排序
	public void insertSort() {
		for (int j = 1; j < nElem; j++) {
			int temp = theArray[j];
			int i = j-1;
			while(i>=0 && theArray[i] >=temp){
				theArray[i+1] = theArray[i];
				i--;
			}
			theArray[i+1] = temp;
		}
	}
}
