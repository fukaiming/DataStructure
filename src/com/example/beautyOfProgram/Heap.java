package com.example.beautyOfProgram;

/**
 * 构造一个最小堆 数组元素大小为K
 *
 */
public class Heap {
	private Node[] heapArray;
	private int currentSize;
	private int maxSize;

	// 构造一个含有k个元素的堆
	public Heap(int k) {
		this.maxSize = k;
		heapArray = new Node[k];
		currentSize = 0;
	}

	// 向堆中添加元素
	public void add(int element) {
		if (currentSize == maxSize) {
			if (heapArray[0].getKey() >= element) {
				return;
			}
			delete();
			insert(element);
		} else {
			insert(element);
		}
	}

	public void insert(int element) {
		Node newNode = new Node(element);
		heapArray[currentSize] = newNode;
		shiftUp(currentSize++);

	}

	private void shiftUp(int current) {
		Node bottom = heapArray[current];
		int parent = (current - 1) / 2;
		while (current > 0 && bottom.getKey() < heapArray[parent].getKey()) {
			heapArray[current] = heapArray[parent];
			current = parent;
			parent = (current - 1) / 2;
		}
		heapArray[current] = bottom;

	}

	public Node delete() {
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		shiftDown(0);
		return root;
	}

	private void shiftDown(int current) {
		Node top = heapArray[current];
		int smallChild;
		while (current < currentSize / 2) {
			int leftChild = (2 * current) + 1;
			int rightChild =  leftChild + 1;
			if(rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()){
				smallChild = leftChild;
			}else{
				smallChild = rightChild;
			}
			if(top.getKey() < heapArray[smallChild].getKey()){
				break;
			}
			heapArray[current] = heapArray[smallChild];
			current = smallChild;
		}
		heapArray[current]  = top;
	}
	
	//遍历堆
	public void display(){
		for(int i=0;i<currentSize;i++){
			System.out.print(heapArray[i].getKey()+" ");
		}
	}
}
