package com.example.sort;

public class QuickSortLearn1 {
	private int[] theArray;
	private int nElem;

	public QuickSortLearn1(int maxSize) {
		theArray = new int[maxSize];
		nElem = 0;
	}

	// 插入一个元素
	public void insert(int element) {
		if (nElem == theArray.length) {
			return;
		}
		theArray[nElem++] = element;
	}
	
	// 返回元素个数
	public int size(){
		return nElem;
	}
	//显示数组元素
	public void display(){
		for(int i=0;i<nElem;i++){
			System.out.print(theArray[i]+" ");
		}
		System.out.println(" ");
	}
	
	//快排
	public void quickSort(int left,int right){
		if(right - left <= 0){
			return;
		}
		//将数组进行划分，中轴pivot为数组的第一个元素
		int middle = partition(left,right);
		quickSort(left,middle-1);
		quickSort(middle+1,right);
	}

	private int partition(int left, int right) {
		int pivot = theArray[left];
		while(left < right){
			//先从右向左，找到小于pivot的元素，并进行交换
			while(right > left && theArray[right] >=pivot){
				right--;
			}
			theArray[left] = theArray[right];
			//再从左向右，找到大于pivot的元素，并进行交换
			while(left < right && theArray[left] <= pivot){
				left++;
			}
			theArray[right] = theArray[left];
		}
		//当left==right时，将中轴元素放到最终位置
		theArray[left] = pivot;
		return left;
	}
}
