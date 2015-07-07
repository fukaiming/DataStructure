package com.example.sort2;

public class QuickSortDrive {
	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort(10);
		for(int i=0;i<10;i++){
			quickSort.insert((int)(Math.random()*199));
		}
		System.out.println("before sort");
		quickSort.display();
		System.out.println();
		System.out.println("after sort");
		int left = 0;
		int right = quickSort.size()-1;
		quickSort.quickSort(left,right);
		quickSort.display();
	}
}
