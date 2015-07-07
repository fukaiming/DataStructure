package com.example.datastructor;

public class Stack {
	private int[] theArray;
	private int top;

	public Stack(int maxSize) {
		theArray = new int[maxSize];
		top = -1;
	}

	// ��ջ
	public void push(int element) {
		if (top + 1 >= theArray.length) {
			return;
		}
		theArray[++top] = element;
	}
	
	//��ջ
	public int pop(){
		if(top == -1){
			return -1;
		}
		return theArray[top--];
	}
	
	//�ж�ջΪ��
	public boolean isEmpty(){
		return top == -1;
	}

}
