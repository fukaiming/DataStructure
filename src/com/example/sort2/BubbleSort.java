package com.example.sort2;

/**
 * ð������ ˼�룺 �����Ƚϣ�ÿ����һ�����򣬶������ֵ�Ƶ�����ĩβ��
 *
 */
public class BubbleSort {
	private int[] theArray;
	private int currentSize;
	private int maxSize;

	public BubbleSort(int maxSize) {
		this.maxSize = maxSize;
		theArray = new int[maxSize];
		currentSize = 0;
	}

	// ���һ��Ԫ��
	public void insert(int element) {
		if (currentSize >= maxSize) {
			return;
		}
		theArray[currentSize++] = element;
	}

	// ��ȡ����Ԫ�ش�С
	public int size() {
		return currentSize;
	}

	// ��ʾ����Ԫ����Ϣ
	public void display() {
		for (int i = 0; i < currentSize; i++) {
			System.out.print(theArray[i] + " ");
		}
	}

	// ð������
	public void bubbleSort() {
		for (int j = size() - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if(theArray[i] > theArray[i+1]){
					int temp = theArray[i];
					theArray[i] = theArray[i+1];
					theArray[i+1] = temp;
				}
			}

		}
	}

}
