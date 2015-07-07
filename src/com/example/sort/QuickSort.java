package com.example.sort;


public class QuickSort {

	int theArray[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99};

	public QuickSort() {

		quick(theArray);

		for (int i = 0; i < theArray.length; i++)

			System.out.print(theArray[i]+" ");

	}

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
	}

	public int getMiddle(int[] list, int low, int high) {

		int tmp = list[low]; // 数组的第一个作为中轴

		while (low < high) {

			while (low < high && list[high] >= tmp) {

				high--;

			}

			list[low] = list[high]; // 比中轴小的记录移到低端

			while (low < high && list[low] <= tmp) {

				low++;

			}

			list[high] = list[low]; // 比中轴大的记录移到高端

		}

		list[low] = tmp; // 中轴记录到尾

		return low; // 返回中轴的位置

	}

	public void _quickSort(int[] list, int low, int high) {

		if (low < high) {

			int middle = getMiddle(list, low, high); // 将list数组进行一分为二

			_quickSort(list, low, middle - 1); // 对低字表进行递归排序

			_quickSort(list, middle + 1, high); // 对高字表进行递归排序

		}

	}

	public void quick(int[] theArray) {

		if (theArray.length > 0) { // 查看数组是否为空

			_quickSort(theArray, 0, theArray.length - 1);

		}

	}

}
