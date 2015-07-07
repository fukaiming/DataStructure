package com.example.sort;

public class HeapSortDrive {
	public static void main(String[] args) {
		HeapSort hs = new HeapSort(10);
		hs.insert(1);
		hs.insert(2);
		hs.insert(3);
		hs.insert(4);
		hs.insert(5);
		hs.insert(6);
		hs.insert(7);
		hs.insert(8);
		hs.insert(9);
		hs.insert(10);
		hs.heapSort();
	}
}
