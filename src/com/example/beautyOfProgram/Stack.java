package com.example.beautyOfProgram;
/**
 * 
 * ��һ����������ʵ��һ���й̶��Ͻ�Ϊ100���Ķ�ջ��ʵ��push,pop,size��������д����Զ�ջ���й��ܲ��ԣ�����ʹ��Java��C#��C++����
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
