package com.example.sort;

/**
 * 冒泡排序 思想：从数组第一个元素开始，从左向右俩俩比较。每经过一趟排序，都会将该趟的最大值排在最右边
 *
 */
public class BubbleSort {
	private int[] theArray;
	private int nElem;

	public BubbleSort(int maxSize) {
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
	
	//返回元素个数
	public int size(){
		return nElem;
	}
	
	//显示数组内容
	public void display(){
		for(int i=0;i<nElem;i++){
			System.out.print(theArray[i]+" ");
		}
		System.out.println(" ");
	}
	
	//冒泡排序
	public void bubble(){
		for(int j=nElem-1;j>0;j--){
			for(int i=0;i<j;i++){
				if(theArray[i]>theArray[i+1]){
					int temp = theArray[i];
					theArray[i] = theArray[i+1];
					theArray[i+1] = temp; 
				}
			}
		}
	}
}
