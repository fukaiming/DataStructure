package com.example.graph;
//����һ�����У����ڱ����ѷ��ʵĶ���Ԫ���±�
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
	
	//���
	public void enQueue(int currentVertex){
		if(rear+1 == MAX_SIZE){
			rear = -1;
		}
		theArray[++rear] = currentVertex;
	}
	
	//����
	public int outQueue(){
		if(front== MAX_SIZE){
			front = 0;
		}
		return theArray[front++];
	}
	
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty(){
		if(rear+1 == front){
			return true;
		}else{
			return false;
		}
	}
}
