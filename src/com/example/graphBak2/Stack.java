package com.example.graphBak2;
/**
 * �����ѷ��ʵĶ����±�
 * stack��ʵ��
 * ����
 * top��ʼ��ָ��ջ��Ԫ��
 */
public class Stack {
	private int maxSize = 10;
	private int[] theArray;
	private int top;
	
	public Stack(){
		theArray = new int[maxSize];
		top = -1;
	}
	
	//��ջ
	public void push(int element){
		theArray[++top] = element;
	}
	
	//��ջ
	public int pop(){
		return theArray[top--];
	}
	
	//�ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty(){
		return top == -1;
	}
	
	//��ȡջ��Ԫ����Ϣ
	public int peek(){
		return theArray[top];
	}
}
