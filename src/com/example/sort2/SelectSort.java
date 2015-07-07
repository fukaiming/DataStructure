package com.example.sort2;
/**
 * 选择排序
 * 思想：
 * 每经过一次排序，找到该排序的最小值所在位置，和未排好序的首元素进行交换
 *
 */
public class SelectSort {
	private int[] theArray;
	private int currentSize;
	private int maxSize;

	public SelectSort(int maxSize) {
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
	
	//选择排序
	public void selectSort(){
		for(int i=0;i<size()-1;i++){
			int min = i;
			for(int j=i+1;j<size();j++){
				if(theArray[j]<theArray[min]){
					min = j;
				}
			}
			int temp = theArray[i];
			theArray[i] = theArray[min];
			theArray[min] = temp;
		}
	}

}
