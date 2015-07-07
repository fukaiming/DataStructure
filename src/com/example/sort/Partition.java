package com.example.sort;

public class Partition {
	private long[] theArray;
	private int nElem; // 表示元素个数

	public Partition(int maxSize) {
		theArray = new long[maxSize];
		nElem = 0;
	}
	//数组元素个数
	public int size(){
		return nElem;
	}
	// 插入元素
	public void insertElement(long key) {
		theArray[nElem++] = key;
	}

	// 显示数组元素信息
	public void display() {
		for (int i = 0; i < nElem; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println("  ");
	}

	// 划分数组元素,按照指定元素，比他大的在右边。比他小的在左边
	public int partition(int left, int right, long pivot) {
		while (true) {
			// 从左向右，找大于pivot的元素
			while (left <= right && theArray[left] < pivot) {
				left++;
			}
			// 从右向左，找小于pivot的元素
			while (right >= left && theArray[right] >= pivot) {
				right--;
			}
			if (right < left) {
				break;
			} else {
				swap(left, right);
			}
		}
		return left;
	}

	private void swap(int left, int right) {
		long temp = theArray[left];
		theArray[left] = theArray[right];
		theArray[right] = temp;

	}
	
	//快排
	public void quickSort(int left,int right){
		if(left>right){
			return;
		}
		long pivot = theArray[right];
		int partition = partition(left,right,pivot);
		quickSort(left, partition-1);
		quickSort(partition+1,right);
	}
}
