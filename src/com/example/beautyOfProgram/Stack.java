package com.example.beautyOfProgram;
/**
 * 
 * 用一个整形数组实现一个有固定上界为100个的堆栈，实现push,pop,size方法并编写代码对堆栈进行功能测试，语言使用Java，C#或C++均可
 *
 */
public class Stack {
	private int[] theArray;
	private int top;
	private int maxSize = 100;
	
 	public Stack(){
 		theArray = new int[maxSize];
 		top = -1;
 	} 
 	
 	public void push(int element){
 		if(top == maxSize){
 			return;
 		}
 		theArray[++top] = element;
 	}
 	
 	public int pop(){
 		if(top == -1){
 			return -1;
 		}
 		return theArray[top--];
 	}
 	
 	public int size(){
 		return top+1;
 	}
}
