package com.example.sort;

/**
 * ����˼�� ͨ�����ֽ�����һ��Ϊ������ߵı�pivotС���ұߵı�pivot�� �ڷֱ���������߽�������
 *
 */
public class QuickSortLearn {
	static int theArray[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4,
			62, 99 };

	// ����
	public void quickSort(int[] theArray, int left, int right) {
		if (right - left <= 0) {
			return;
		}
		int middle = partition(theArray, left, right);
		quickSort(theArray, left, middle - 1);
		quickSort(theArray, middle + 1, right);
	}

	private int partition(int[] theArray, int left, int right) {
		int pivot = theArray[left];
		while (left < right) {
			while (right > left && theArray[right] >= pivot) {
				right--;
			}
			theArray[left] = theArray[right];// ����Ч�ʸ��ڽ���

			while (left < right && theArray[left] <= pivot) {
				left++;
			}
			theArray[right] = theArray[left];
		}
		theArray[left] = pivot;
		return left;
	}
	
	
	//��ӡ����
	public void display(){
		for(int i=0;i<theArray.length;i++){
			System.out.print(theArray[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		QuickSortLearn qsl = new QuickSortLearn();
		System.out.println("before sort");
		qsl.display();
		qsl.quickSort(theArray, 0, theArray.length-1);
		System.out.println("after sort");
		qsl.display();
	}
}
