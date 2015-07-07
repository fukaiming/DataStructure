package com.example.sort2;
/**
 * ����˼��
 * ѡȡһ�����㣨Ĭ��Ϊ������Ԫ�أ���������һ��Ϊ����pivot��ߵıȻ���С���ұߵıȻ����
 * �ڷֱ������������п���
 *
 */
public class QuickSort {
	private int[] theArray;
	private int currentSize;
	private int maxSize;
	
	public QuickSort(int maxSize){
		this.maxSize = maxSize;
		theArray = new int[maxSize];
		currentSize = 0;
	}
	
	//���һ��Ԫ��
	public void insert(int element){
		if(currentSize >= maxSize){
			return;
		}
		theArray[currentSize++] = element;
	}
	
	//��ȡ����Ԫ�ش�С
	public int size(){
		return currentSize;
	}
	
	//��ʾ����Ԫ����Ϣ
	public void display(){
		for(int i=0;i<currentSize;i++){
			System.out.print(theArray[i]+" ");
		}
	}
	
	//��������
	public void quickSort(int left,int right){
		if(right - left <= 0){
			return;
		}
		int middle = partition(left,right);
		quickSort(left,middle-1);
		quickSort(middle+1,right);
	}

	private int partition(int left, int right) {
		int pivot = theArray[left];
		while(left < right){
			while(left < right && theArray[right] >= pivot){
				right--;
			}
			theArray[left] = theArray[right];
			
			while(left < right && theArray[left] <= pivot){
				left++;
			}
			theArray[right] = theArray[left];
		}
		theArray[left] = pivot;
		return left;
	}
}
