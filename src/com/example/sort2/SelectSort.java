package com.example.sort2;
/**
 * ѡ������
 * ˼�룺
 * ÿ����һ�������ҵ����������Сֵ����λ�ã���δ�ź������Ԫ�ؽ��н���
 *
 */
public class SelectSort {
	private int[] theArray;
	private int currentSize;
	private int maxSize;

	public SelectSort(int maxSize) {
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
	
	//ѡ������
	public void selectSort(){
		for(int i=0;i<size()-1;i++){
			int min = i;
			for(int j=i+1;j<size();j++){
				if(theArray[j]<theArray[min]){
					min = j;
				}
			}
			int temp = theArray[i];
			theArray[i] = theArray[min];
			theArray[min] = temp;
		}
	}

}
