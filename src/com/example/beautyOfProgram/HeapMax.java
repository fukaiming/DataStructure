package com.example.beautyOfProgram;
/**
 * heap����ȫ������+ÿ����㶼>=���ӽڵ�
 * heap�ײ�ʵ�֣����飨����+��ǰ����Ԫ�ظ���+���������������
 *
 */
public class HeapMax {
	private Node[] heapArray;
	private int currentSize;
	private int maxSize;
	
	public HeapMax(int maxSize){
		this.maxSize = maxSize;
		heapArray = new Node[maxSize];
		currentSize = 0;
	}
	
	/**
	 * ����в���Ԫ��
	 * step1:������ĩβ�����Ԫ��
	 * step2��shiftup�����ƶ������ʵ�λ�ã����ڵ�������ӽڵ����С��
	 * */
	public void insert(int key){
		if(currentSize == maxSize){
			return;
		}
		Node newNode = new Node(key);
		heapArray[currentSize] = newNode;
		shiftup(currentSize++);
		
	}

	private void shiftup(int current) {
		Node bottom = heapArray[current];
		int parent = (current -1)/2;
		//ѭ���˳��������ǣ��ҵ������λ��
		while(current > 0 && bottom.getKey() > heapArray[parent].getKey()){
				heapArray[current] = heapArray[parent];
				current = parent;
				parent = (current-1)/2;
			}
		heapArray[current] = bottom;
		
	}
	
	/**
	 * ɾ���Ѷ�Ԫ��
	 * step1:����һ������root������Ѷ�Ԫ��ֵ,�����ظöѶ�Ԫ��
	 * step2:������ĩβԪ�ط��õ��Ѷ�Ԫ�ء�
	 * step3��shiftDown�����ƶ������ʵ�λ��
	 */
	public Node delete(){
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		shiftDown(0);
		return root;
	}

	private void shiftDown(int current) {
		Node top = heapArray[current];
		int largeChild;
		
		while(current < currentSize/2){
			int leftChild = (2 * current) + 1;
			int rightChild = leftChild + 1;
			if(rightChild < currentSize && heapArray[leftChild].getKey() <= heapArray[rightChild].getKey()){
				largeChild = rightChild;
			}else{
				largeChild = leftChild;
			}
			//ѭ����ֹ�������ҵ������λ��
			if(top.getKey() >= heapArray[largeChild].getKey()){
				break;
			}
			heapArray[current] = heapArray[largeChild];
			current = largeChild;
		}
		heapArray[current] = top;
	}
	
	//��ʾheap������
	public void display(){
		System.out.print(delete().getKey()+" ");
	}
	
	
	
	
	
	
	
	
	
}
