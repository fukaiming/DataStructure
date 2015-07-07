package com.example.graphBak;

//定义一个堆栈
public class StackX {
	private int maxSize = 20;//定义数组大小
	private int[] vertexIndexs; //定义已访问的顶点元素的下标
	private int top;//始终指向栈顶元素
	
	public StackX(){
		vertexIndexs = new int[20];
		top = -1;
	}
	
	//入栈 
	public void push(int vertexIndex){
		vertexIndexs[++top] = vertexIndex;
	}
	
	//出栈
	public int pop(){
		return vertexIndexs[top--];
	}
	
	//输出栈顶元素的值
	public int peek(){
		return vertexIndexs[top];
	}
	
	//判断栈是否为空
	public boolean isEmpty(){
		return top == -1;
	}
}
