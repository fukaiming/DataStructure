package com.example.sort;

public class BinarySearch {
	// ������ֲ��ҵ�����
	private int[] theArray;
	private int nElem;// ��¼Ԫ�ظ���

	public BinarySearch(int maxSize) {
		theArray = new int[maxSize];
		nElem = 0;
	}

	// ��ȡ����Ԫ�ظ���
	public int size() {
		return nElem;
	}

	// �����������Ԫ��
	public void insertElement(int element) {
		theArray[nElem++] = element;
	}

	// ��ʾԪ������
	public void display() {
		for (int i = 0; i < size(); i++) {
			System.out.print(theArray[i] + "  ");
		}
		System.out.println(" ");
	}

	// ���ֲ���Ԫ��
	public int binarySearch(int left, int right, int searchKey) {
		while (left < right) {
			int middle = (left + right) / 2;
			if (theArray[middle] == searchKey) {
				return middle;
			} else if (theArray[middle] < searchKey) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}
		return -1;
	}

	public int BinarySearch2(int left, int right, int searchKey) {
		while (left < right) {
			int middle = (left + right) / 2;
			if(searchKey == theArray[middle]){
				return middle;
			}else if(searchKey < theArray[middle]){
				left = middle - 1;
			}else{
				right = middle + 1;
			}
		}
		return -1;
	}

}
