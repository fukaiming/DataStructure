package com.example.graph;

/**
 * ջ ���ڴ�����з��ʹ���Ԫ�ص��±�
 *
 */
public class StackX {
	private int maxSize;
	private int[] stack;
	private int top;

	public StackX() {
		this.maxSize = 20;
		this.stack = new int[maxSize];
		this.top = -1;
	}

	// ��ջ
	public void push(int index) {
		stack[++top] = index;
	}

	// ��ջ
	public int pop() {
		return stack[top--];
	}

	// ��ȡջ��Ԫ���±�
	public int peek() {
		return stack[top];
	}
	
	//�ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty(){
		return top == -1;
	}
}
