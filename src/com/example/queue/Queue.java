package com.example.queue;

//循环队列
public class Queue {
	// 定义循环队列的数据结构
	private int[] queueArray;
	private int maxSize;
	private int front; // 始终指向队首元素
	private int rear; // 始终指向队尾元素
	private int nElem; // 元素个数

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queueArray = new int[maxSize];
		front = 0;
		rear = -1;
		nElem = 0;
	}

	// 入队
	public void enQueue(int element) {
		// 判断队列是否满了
		if (rear + 1 == maxSize) {
			rear  = -1;
		}
		queueArray[++rear] = element;
		nElem++;
	}
	
	//w队
	public int deQueue(){
		//判断队列是否为空
		if(front == maxSize){
			front = 0;
		}
		int temp = queueArray[front++];
		nElem--;
		return temp;
	}
	
	//获得对首元素
	public int peekFront(){
		return queueArray[front];
	}
	
	//判断队列是否为空
	public boolean isEmpty(){
		return nElem == 0;
	}
	
	//判断队列是否满了
	public boolean isFull(){
		return nElem == maxSize;
	}
}
