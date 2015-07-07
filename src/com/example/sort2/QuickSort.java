package com.example.sort2;
/**
 * 快排思想
 * 选取一个基点（默认为数组首元素），将数组一分为二，pivot左边的比基点小，右边的比基点大。
 * 在分别对左右数组进行快排
 *
 */
public class QuickSort {
	private int[] theArray;
	private int currentSize;
	private int maxSize;
	
	public QuickSort(int maxSize){
		this.maxSize = maxSize;
		theArray = new int[maxSize];
		currentSize = 0;
	}
	
	//添加一个元素
	public void insert(int element){
		if(currentSize >= maxSize){
			return;
		}
		theArray[currentSize++] = element;
	}
	
	//获取数组元素大小
	public int size(){
		return currentSize;
	}
	
	//显示数组元素信息
	public void display(){
		for(int i=0;i<currentSize;i++){
			System.out.print(theArray[i]+" ");
		}
	}
	
	//快速排序
	public void quickSort(int left,int right){
		if(right - left <= 0){
			return;
		}
		int middle = partition(left,right);
		quickSort(left,middle-1);
		quickSort(middle+1,right);
	}

	private int partition(int left, int right) {
		int pivot = theArray[left];
		while(left < right){
			while(left < right && theArray[right] >= pivot){
				right--;
			}
			theArray[left] = theArray[right];
			
			while(left < right && theArray[left] <= pivot){
				left++;
			}
			theArray[right] = theArray[left];
		}
		theArray[left] = pivot;
		return left;
	}
}
