package com.example.beautyOfProgram;
/**
 * heap：完全二叉树+每个结点都>=其子节点
 * heap底层实现：数组（数组+当前数组元素个数+数组中最大容量）
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
	 * 向堆中插入元素
	 * step1:在数组末尾插入该元素
	 * step2：shiftup向上移动到合适的位置（父节点比它大，子节点比它小）
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
		//循环退出的条件是：找到插入的位置
		while(current > 0 && bottom.getKey() > heapArray[parent].getKey()){
				heapArray[current] = heapArray[parent];
				current = parent;
				parent = (current-1)/2;
			}
		heapArray[current] = bottom;
		
	}
	
	/**
	 * 删除堆顶元素
	 * step1:定义一个变量root，保存堆顶元素值,并返回该堆顶元素
	 * step2:将数组末尾元素放置到堆顶元素。
	 * step3：shiftDown向下移动至合适的位置
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
			//循环终止条件：找到插入的位置
			if(top.getKey() >= heapArray[largeChild].getKey()){
				break;
			}
			heapArray[current] = heapArray[largeChild];
			current = largeChild;
		}
		heapArray[current] = top;
	}
	
	//显示heap的内容
	public void display(){
		System.out.print(delete().getKey()+" ");
	}
	
	
	
	
	
	
	
	
	
}
