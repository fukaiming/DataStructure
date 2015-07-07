package com.example.sort;

/**
 * 归并排序 实现方式：分治算法 分治算法： （1）将一个复杂的问题分解成若干个同类问题的子问题【一般情况下，都是将一个复杂的问题一分为二】
 * （2）子问题和原问题是同质的 （3）子问题的解可以合并成原问题的解
 *
 */
public class MergeSort {
	private static  int[] theArray = { 5, 9, 1, 2, 3 };

	// 归并排序
	public void recMergeSort(int[] theArray, int left, int right) {
		// 递归提出的条件：当只有一个元素时，表示以排好序
		if (right - left == 0) {
			return;
		}

		// 一分为二，对左边数组进行排序，对右边数组进行排序。
		int middle = (left + right) / 2;
		recMergeSort(theArray, left, middle);
		recMergeSort(theArray, middle + 1, right);
		// 再将两个已排好序的子数组合并成一个有序数组
		merge(theArray, left, middle, right);
	}

	public static int size() {
		return theArray.length;
	}

	private void merge(int[] theArray, int left, int middle, int right) {
		int[] sortArray = new int[theArray.length];
		int leftPtr = left;
		int rightPtr = middle + 1;
		int index = left;
		while ((leftPtr <= middle) && (rightPtr <= right)) {
			if (theArray[leftPtr] < theArray[rightPtr]) {
				sortArray[index++] = theArray[leftPtr++];
			} else {
				sortArray[index++] = theArray[rightPtr++];
			}
		}

		while (leftPtr <= rightPtr) {
			sortArray[index++] = theArray[leftPtr++];
		}

		while (middle <= rightPtr) {
			sortArray[index++] = theArray[rightPtr++];
		}

	}

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int left = 0;
		int right = size() - 1;
		ms.recMergeSort(theArray, left, right);
		for(int i=0;i<theArray.length;i++){
			System.out.print(theArray[i]);
		}
	}
}
