package com.example.sort2;

/**
 * 冒泡排序 思想： 俩俩比较，每经过一次排序，都将最大值移到数组末尾。
 *
 */
public class BubbleSort {
	private int[] theArray;
	private int currentSize;
	private int maxSize;

	public BubbleSort(int maxSize) {
		this.maxSize = maxSize;
		theArray = new int[maxSize];
		currentSize = 0;
	}

	// 添加一个元素
	public void insert(int element) {
		if (currentSize >= maxSize) {
			return;
		}
		theArray[currentSize++] = element;
	}

	// 获取数组元素大小
	public int size() {
		return currentSize;
	}

	// 显示数组元素信息
	public void display() {
		for (int i = 0; i < currentSize; i++) {
			System.out.print(theArray[i] + " ");
		}
	}

	// 冒泡排序
	public void bubbleSort() {
		for (int j = size() - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if(theArray[i] > theArray[i+1]){
					int temp = theArray[i];
					theArray[i] = theArray[i+1];
					theArray[i+1] = temp;
				}
			}

		}
	}

}
