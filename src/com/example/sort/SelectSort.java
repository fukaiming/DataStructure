package com.example.sort;
//ѡ������ÿ����һ�������ҵ������������Сֵ���ڵ�λ�ã�Ȼ����i��ָ���Ԫ�ؽ��н���
public class SelectSort {
	private int[] theArray;
	private int nElem;

	public SelectSort(int maxSize) {
		theArray = new int[maxSize];
		nElem = 0;
	}

	// �������в���Ԫ��
	public void insert(int element) {
		if (theArray.length == nElem) {
			return;
		}
		theArray[nElem++] = element;
	}

	// ����Ԫ�ظ���
	public int size() {
		return nElem;
	}

	// ��ʾ��������
	public void display() {
		for (int i = 0; i < nElem; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println(" ");
	}

	// ѡ������
	public void selectSort() {
		for (int i = 0; i < nElem - 1; i++) {
			int min = i;
			for (int j = i + 1; j < nElem; j++) {
				if(theArray[j] < theArray[min]){
					min = j;
				}
			}
			int temp = theArray[i];
			theArray[i] = theArray[min];
			theArray[min] = temp;
		}
	}
}
