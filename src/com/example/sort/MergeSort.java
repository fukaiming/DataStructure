package com.example.sort;

/**
 * �鲢���� ʵ�ַ�ʽ�������㷨 �����㷨�� ��1����һ�����ӵ�����ֽ�����ɸ�ͬ������������⡾һ������£����ǽ�һ�����ӵ�����һ��Ϊ����
 * ��2���������ԭ������ͬ�ʵ� ��3��������Ľ���Ժϲ���ԭ����Ľ�
 *
 */
public class MergeSort {
	private static  int[] theArray = { 5, 9, 1, 2, 3 };

	// �鲢����
	public void recMergeSort(int[] theArray, int left, int right) {
		// �ݹ��������������ֻ��һ��Ԫ��ʱ����ʾ���ź���
		if (right - left == 0) {
			return;
		}

		// һ��Ϊ�������������������򣬶��ұ������������
		int middle = (left + right) / 2;
		recMergeSort(theArray, left, middle);
		recMergeSort(theArray, middle + 1, right);
		// �ٽ��������ź����������ϲ���һ����������
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
