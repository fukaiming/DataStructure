package com.example.sort;

public class BinarySearch {
	// 定义二分查找的属性
	private int[] theArray;
	private int nElem;// 记录元素个数

	public BinarySearch(int maxSize) {
		theArray = new int[maxSize];
		nElem = 0;
	}

	// 获取数组元素个数
	public int size() {
		return nElem;
	}

	// 向数组中添加元素
	public void insertElement(int element) {
		theArray[nElem++] = element;
	}

	// 显示元素内容
	public void display() {
		for (int i = 0; i < size(); i++) {
			System.out.print(theArray[i] + "  ");
		}
		System.out.println(" ");
	}

	// 二分查找元素
	public int binarySearch(int left, int right, int searchKey) {
		while (left < right) {
			int middle = (left + right) / 2;
			if (theArray[middle] == searchKey) {
				return middle;
			} else if (theArray[middle] < searchKey) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}
		return -1;
	}

	public int BinarySearch2(int left, int right, int searchKey) {
		while (left < right) {
			int middle = (left + right) / 2;
			if(searchKey == theArray[middle]){
				return middle;
			}else if(searchKey < theArray[middle]){
				left = middle - 1;
			}else{
				right = middle + 1;
			}
		}
		return -1;
	}

}
