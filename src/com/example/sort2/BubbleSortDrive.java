package com.example.sort2;

public class BubbleSortDrive {
	public static void main(String[] args) {
		int maxSize = 10;
		BubbleSort bubbleSort = new BubbleSort(maxSize);
		//向数组中添加元素
		for(int i=0;i<maxSize;i++){
			bubbleSort.insert((int)(Math.random()*199));
		}
		System.out.println("before sort");
		bubbleSort.display();
		bubbleSort.bubbleSort();
		System.out.println();
		System.out.println("after sort");
		bubbleSort.display();
	}
}
