package com.example.sort;

public class Partition {
	private long[] theArray;
	private int nElem; // ��ʾԪ�ظ���

	public Partition(int maxSize) {
		theArray = new long[maxSize];
		nElem = 0;
	}
	//����Ԫ�ظ���
	public int size(){
		return nElem;
	}
	// ����Ԫ��
	public void insertElement(long key) {
		theArray[nElem++] = key;
	}

	// ��ʾ����Ԫ����Ϣ
	public void display() {
		for (int i = 0; i < nElem; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println("  ");
	}

	// ��������Ԫ��,����ָ��Ԫ�أ�����������ұߡ�����С�������
	public int partition(int left, int right, long pivot) {
		while (true) {
			// �������ң��Ҵ���pivot��Ԫ��
			while (left <= right && theArray[left] < pivot) {
				left++;
			}
			// ����������С��pivot��Ԫ��
			while (right >= left && theArray[right] >= pivot) {
				right--;
			}
			if (right < left) {
				break;
			} else {
				swap(left, right);
			}
		}
		return left;
	}

	private void swap(int left, int right) {
		long temp = theArray[left];
		theArray[left] = theArray[right];
		theArray[right] = temp;

	}
	
	//����
	public void quickSort(int left,int right){
		if(left>right){
			return;
		}
		long pivot = theArray[right];
		int partition = partition(left,right,pivot);
		quickSort(left, partition-1);
		quickSort(partition+1,right);
	}
}
