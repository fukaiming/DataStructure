package com.example.sort;

/**
 * �� �ѵײ�ʵ�������� ����Ԫ�����ͣ�Node
 *
 */
public class HeapSort {
	private Node[] heapArray;// ��������
	private int currentSize;// ��ǰ��������Ԫ�صĸ���
	private int maxSize;// ��������ֵ

	public HeapSort(int maxSize) {
		this.maxSize = maxSize;
		heapArray = new Node[maxSize];
		currentSize = 0;
	}

	// �ж������Ƿ�Ϊ��
	public boolean isEmpty() {
		return currentSize == 0;
	}

	/**
	 * ��������Ԫ�� step1:���Ԫ�ص�����ĩβ step2��������������λ��
	 */
	public void insert(int key) {
		if (currentSize == maxSize) {
			return;
		}
		Node newNode = new Node(key);
		heapArray[currentSize] = newNode;
		shiftUp(currentSize++);
	}

	private void shiftUp(int current) {
		Node bottom = heapArray[current];
		int parent = (current - 1) / 2;
		while (current > 0
				&& bottom.getKey() >= heapArray[parent].getKey()) {
			heapArray[current] = heapArray[parent];
			current = parent;
			parent = (current - 1) / 2;
		}
		heapArray[current] = bottom;
	}

	/**
	 * ɾ���Ѷ�Ԫ��
	 */
	public Node delete() {
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		shiftDown(0);
		return root;
	}

	private void shiftDown(int current) {
		Node top = heapArray[current];
		int largeChild;
		//ѭ���˳����������ҵ������λ��
		while (current < currentSize / 2) {
			int leftChild = 2 * current + 1;
			int rightChild =  leftChild + 1;
			if(rightChild < currentSize && heapArray[leftChild].getKey() >= heapArray[rightChild].getKey()){
				largeChild = leftChild;
			}else{
				largeChild = rightChild;
			}
			if(top.getKey()> heapArray[largeChild].getKey()){
				break;
			}
			heapArray[current] = heapArray[largeChild];
			current = largeChild;
		} 
		heapArray[current] = top;
	}
	
	public void heapSort(){
		System.out.println("heap sort");
		while(currentSize > 0){
			System.out.print(delete().getKey()+" ");
		}
	}

}
