package com.example.heap;

/**
 * �� �ѵĵײ�ʵ�������飨���������������ȶ��� �ѣ���ȫ������+ÿ����㶼�����������ӽڵ� �ʣ����ڵ��ֵ�����ֵ
 */
public class Heap {
	private Node[] heapArray;
	private int currentSize;// ������Ԫ�صĸ���
	private int maxSize;// ������Ԫ�ص�������

	public Heap(int maxSize) {
		this.maxSize = maxSize;
		heapArray = new Node[maxSize];
		currentSize = 0;
	}

	// �ж϶��Ƿ�Ϊ��
	public boolean isEmpty() {
		return currentSize == 0;
	}

	/**
	 * ����в���һ��Ԫ��
	 * ˼�룺
	 * step1��������ĩβ���һ��Ԫ��
	 * step2��shiftUp(),����Ԫ����ӵ����ʵ�λ����
	 * ע���ȽϷ�ʽ--�븸�ڵ���бȽ�
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
				&& (bottom.getKey() > heapArray[parent].getKey())) {
			heapArray[current] = heapArray[parent];
			current = parent;
			parent = (current - 1) / 2;
		}
		heapArray[current] = bottom;
	}

	// �ڶ���ɾ���Ѷ�Ԫ��
	public Node delete() {
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		shiftDown(0);
		return root;
	}

	private void shiftDown(int current) {
		int largeChild;
		Node top = heapArray[current];
		while (current < currentSize / 2) {
			int leftChild = 2 * current + 1;
			int rightChild = leftChild + 1;
			if(rightChild < currentSize && (heapArray[leftChild].getKey() < heapArray[rightChild].getKey())){
				largeChild = rightChild;
			}else{
				largeChild = leftChild;
			}
			if(top.getKey() > heapArray[largeChild].getKey()){
				break;
			}
			heapArray[current] = heapArray[largeChild];
			current = largeChild;
		}
		heapArray[current] = top;
	}
	
	
	//�ı�index����Ԫ�ص�ֵ
	public boolean change(int index,int newValue){
		if(index < 0 && index > currentSize){
			return false;
		}
		int oldValue = heapArray[index].getKey();
		heapArray[index].setKey(newValue);
		if(newValue > oldValue){
			shiftUp(index);
		}else{
			shiftDown(index);
		}
		return true;
	}

}
