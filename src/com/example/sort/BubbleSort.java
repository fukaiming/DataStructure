package com.example.sort;

/**
 * ð������ ˼�룺�������һ��Ԫ�ؿ�ʼ���������������Ƚϡ�ÿ����һ�����򣬶��Ὣ���˵����ֵ�������ұ�
 *
 */
public class BubbleSort {
	private int[] theArray;
	private int nElem;

	public BubbleSort(int maxSize) {
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
	
	//����Ԫ�ظ���
	public int size(){
		return nElem;
	}
	
	//��ʾ��������
	public void display(){
		for(int i=0;i<nElem;i++){
			System.out.print(theArray[i]+" ");
		}
		System.out.println(" ");
	}
	
	//ð������
	public void bubble(){
		for(int j=nElem-1;j>0;j--){
			for(int i=0;i<j;i++){
				if(theArray[i]>theArray[i+1]){
					int temp = theArray[i];
					theArray[i] = theArray[i+1];
					theArray[i+1] = temp; 
				}
			}
		}
	}
}
