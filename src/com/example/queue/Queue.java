package com.example.queue;

//ѭ������
public class Queue {
	// ����ѭ�����е����ݽṹ
	private int[] queueArray;
	private int maxSize;
	private int front; // ʼ��ָ�����Ԫ��
	private int rear; // ʼ��ָ���βԪ��
	private int nElem; // Ԫ�ظ���

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queueArray = new int[maxSize];
		front = 0;
		rear = -1;
		nElem = 0;
	}

	// ���
	public void enQueue(int element) {
		// �ж϶����Ƿ�����
		if (rear + 1 == maxSize) {
			rear  = -1;
		}
		queueArray[++rear] = element;
		nElem++;
	}
	
	//w��
	public int deQueue(){
		//�ж϶����Ƿ�Ϊ��
		if(front == maxSize){
			front = 0;
		}
		int temp = queueArray[front++];
		nElem--;
		return temp;
	}
	
	//��ö���Ԫ��
	public int peekFront(){
		return queueArray[front];
	}
	
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty(){
		return nElem == 0;
	}
	
	//�ж϶����Ƿ�����
	public boolean isFull(){
		return nElem == maxSize;
	}
}
