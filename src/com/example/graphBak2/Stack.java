package com.example.graphBak2;
/**
 * 保存已访问的顶点下标
 * stack的实现
 * 数组
 * top：始终指向栈顶元素
 */
public class Stack {
	private int maxSize = 10;
	private int[] theArray;
	private int top;
	
	public Stack(){
		theArray = new int[maxSize];
		top = -1;
	}
	
	//入栈
	public void push(int element){
		theArray[++top] = element;
	}
	
	//出栈
	public int pop(){
		return theArray[top--];
	}
	
	//判断栈是否为空
	public boolean isEmpty(){
		return top == -1;
	}
	
	//获取栈顶元素信息
	public int peek(){
		return theArray[top];
	}
}
