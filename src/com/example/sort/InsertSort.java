package com.example.sort;

/**
 * �������򣺼�����ߵ��������ź����ұߵ������Ǵ�����ġ�ÿ����һ�����򣬶��Ὣ�ұ�����ĵ�һ��Ԫ�ز��뵽��������еĺ��ʵ�λ�� ע�������һ��Ԫ�����ź���
 */

public class InsertSort {
	private int[] theArray;
	private int nElem;// ��ǰ������Ԫ�صĸ���

	public InsertSort(int maxSize) {
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

	// չʾ�����е�����
	public void display() {
		for (int i = 0; i < nElem; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}

	// ��������
	public void insertSort() {
		for (int j = 1; j < nElem; j++) {
			int temp = theArray[j];
			int i = j-1;
			while(i>=0 && theArray[i] >=temp){
				theArray[i+1] = theArray[i];
				i--;
			}
			theArray[i+1] = temp;
		}
	}
}
