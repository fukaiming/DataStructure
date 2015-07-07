package com.example.sort;
//选择排序：每经过一次排序，找到该躺排序的最小值所在的位置，然后与i所指向的元素进行交换
public class SelectSort {
	private int[] theArray;
	private int nElem;

	public SelectSort(int maxSize) {
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

	// 返回元素个数
	public int size() {
		return nElem;
	}

	// 显示数组内容
	public void display() {
		for (int i = 0; i < nElem; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println(" ");
	}

	// 选择排序
	public void selectSort() {
		for (int i = 0; i < nElem - 1; i++) {
			int min = i;
			for (int j = i + 1; j < nElem; j++) {
				if(theArray[j] < theArray[min]){
					min = j;
				}
			}
			int temp = theArray[i];
			theArray[i] = theArray[min];
			theArray[min] = temp;
		}
	}
}
