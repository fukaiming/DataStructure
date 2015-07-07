package com.example.beautyOfProgram;

//������������Ѱ������k����
public class Test25 {
	private int[] theArray;
	private int currentSize;

	// ��������
	public void quickSort(int left, int right) {
		if (right - left <= 0) {
			return;
		}
		int middle = partition(left, right);
		quickSort(left, middle - 1);
		quickSort(middle + 1, right);

	}

	private int partition(int left, int right) {
		int pivot = theArray[left];
		while (left < right) {
			while (left < right && theArray[right] >= pivot) {
				right--;
			}
			theArray[left] = theArray[right];

			while (left < right && theArray[left] < pivot) {
				left++;
			}
			theArray[right] = theArray[left];
		}
		theArray[left] = pivot;
		return left;
	}

	// �������k��ֵ
	public void displayK(int k) {
		for (int i = currentSize - 1; i > currentSize - 1 - k; i--) {
			System.out.print(theArray[i] + " ");
		}
	}

	//ѡ����������k��ֵ
	public void selectSortMaxK(int k){
		if(k>currentSize){
			return;
		}
		for(int i=0;i<k;i++){
			
		}
	}
}
