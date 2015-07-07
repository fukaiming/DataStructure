package com.example.sort;

public class SelectSortDrive {
	public static void main(String[] args) {
		int maxSize = 10;
		SelectSort selectSort = new SelectSort(maxSize);
		//向数组中添加元素
		for(int i=0;i<maxSize;i++){
			selectSort.insert((int)(Math.random()*199));
		}
		System.out.println("before sort");
		selectSort.display();
		selectSort.selectSort();
		System.out.println("after sort");
		selectSort.display();
	}
}
