package com.example.graph;
//定义一个队列，用于保存已访问的顶点元素下标
public class Queue {
	private int[] theArray;
	private final int MAX_SIZE=20;
	private int front;
	private int rear;
	
	public Queue(){
		theArray = new int[MAX_SIZE];
		front = 0;
		rear = -1;
	}
	
	//入队
	public void enQueue(int currentVertex){
		if(rear+1 == MAX_SIZE){
			rear = -1;
		}
		theArray[++rear] = currentVertex;
	}
	
	//出队
	public int outQueue(){
		if(front== MAX_SIZE){
			front = 0;
		}
		return theArray[front++];
	}
	
	//判断队列是否为空
	public boolean isEmpty(){
		if(rear+1 == front){
			return true;
		}else{
			return false;
		}
	}
}
