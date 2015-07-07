package com.example.sort;

/**
 * 堆 堆底层实现是数组 数组元素类型：Node
 *
 */
public class HeapSort {
	private Node[] heapArray;// 定义数组
	private int currentSize;// 当前数组所有元素的个数
	private int maxSize;// 数组的最大值

	public HeapSort(int maxSize) {
		this.maxSize = maxSize;
		heapArray = new Node[maxSize];
		currentSize = 0;
	}

	// 判断数组是否为空
	public boolean isEmpty() {
		return currentSize == 0;
	}

	/**
	 * 向堆中添加元素 step1:添加元素到数组末尾 step2：想上移至最终位置
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
	 * 删除堆顶元素
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
		//循环退出的条件：找到插入的位置
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
