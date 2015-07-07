package com.example.sort;

public class QuickSortLearn1 {
	private int[] theArray;
	private int nElem;

	public QuickSortLearn1(int maxSize) {
		theArray = new int[maxSize];
		nElem = 0;
	}

	// ����һ��Ԫ��
	public void insert(int element) {
		if (nElem == theArray.length) {
			return;
		}
		theArray[nElem++] = element;
	}
	
	// ����Ԫ�ظ���
	public int size(){
		return nElem;
	}
	//��ʾ����Ԫ��
	public void display(){
		for(int i=0;i<nElem;i++){
			System.out.print(theArray[i]+" ");
		}
		System.out.println(" ");
	}
	
	//����
	public void quickSort(int left,int right){
		if(right - left <= 0){
			return;
		}
		//��������л��֣�����pivotΪ����ĵ�һ��Ԫ��
		int middle = partition(left,right);
		quickSort(left,middle-1);
		quickSort(middle+1,right);
	}

	private int partition(int left, int right) {
		int pivot = theArray[left];
		while(left < right){
			//�ȴ��������ҵ�С��pivot��Ԫ�أ������н���
			while(right > left && theArray[right] >=pivot){
				right--;
			}
			theArray[left] = theArray[right];
			//�ٴ������ң��ҵ�����pivot��Ԫ�أ������н���
			while(left < right && theArray[left] <= pivot){
				left++;
			}
			theArray[right] = theArray[left];
		}
		//��left==rightʱ��������Ԫ�طŵ�����λ��
		theArray[left] = pivot;
		return left;
	}
}
