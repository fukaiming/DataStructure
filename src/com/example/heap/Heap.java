package com.example.heap;

/**
 * 堆 堆的底层实现是数组（不是链表）。即优先队列 堆：完全二叉树+每个结点都大于其左右子节点 故：根节点的值是最大值
 */
public class Heap {
	private Node[] heapArray;
	private int currentSize;// 数组中元素的个数
	private int maxSize;// 数组中元素的最大个数

	public Heap(int maxSize) {
		this.maxSize = maxSize;
		heapArray = new Node[maxSize];
		currentSize = 0;
	}

	// 判断堆是否为空
	public boolean isEmpty() {
		return currentSize == 0;
	}

	/**
	 * 向堆中插入一个元素
	 * 思想：
	 * step1：在数组末尾添加一个元素
	 * step2：shiftUp(),将该元素添加到合适的位置上
	 * 注：比较方式--与父节点进行比较
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

	// 在堆中删除堆顶元素
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
	
	
	//改变index数组元素的值
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
