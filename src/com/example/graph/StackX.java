package com.example.graph;

/**
 * 栈 用于存放所有访问过的元素的下标
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

	// 入栈
	public void push(int index) {
		stack[++top] = index;
	}

	// 出栈
	public int pop() {
		return stack[top--];
	}

	// 获取栈顶元素下标
	public int peek() {
		return stack[top];
	}
	
	//判断栈是否为空
	public boolean isEmpty(){
		return top == -1;
	}
}
