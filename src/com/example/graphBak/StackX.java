package com.example.graphBak;

//����һ����ջ
public class StackX {
	private int maxSize = 20;//���������С
	private int[] vertexIndexs; //�����ѷ��ʵĶ���Ԫ�ص��±�
	private int top;//ʼ��ָ��ջ��Ԫ��
	
	public StackX(){
		vertexIndexs = new int[20];
		top = -1;
	}
	
	//��ջ 
	public void push(int vertexIndex){
		vertexIndexs[++top] = vertexIndex;
	}
	
	//��ջ
	public int pop(){
		return vertexIndexs[top--];
	}
	
	//���ջ��Ԫ�ص�ֵ
	public int peek(){
		return vertexIndexs[top];
	}
	
	//�ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty(){
		return top == -1;
	}
}
