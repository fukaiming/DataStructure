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

		int tmp = list[low]; // ����ĵ�һ����Ϊ����

		while (low < high) {

			while (low < high && list[high] >= tmp) {

				high--;

			}

			list[low] = list[high]; // ������С�ļ�¼�Ƶ��Ͷ�

			while (low < high && list[low] <= tmp) {

				low++;

			}

			list[high] = list[low]; // �������ļ�¼�Ƶ��߶�

		}

		list[low] = tmp; // �����¼��β

		return low; // ���������λ��

	}

	public void _quickSort(int[] list, int low, int high) {

		if (low < high) {

			int middle = getMiddle(list, low, high); // ��list�������һ��Ϊ��

			_quickSort(list, low, middle - 1); // �Ե��ֱ���еݹ�����

			_quickSort(list, middle + 1, high); // �Ը��ֱ���еݹ�����

		}

	}

	public void quick(int[] theArray) {

		if (theArray.length > 0) { // �鿴�����Ƿ�Ϊ��

			_quickSort(theArray, 0, theArray.length - 1);

		}

	}

}
