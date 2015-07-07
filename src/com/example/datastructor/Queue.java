package com.example.datastructor;

public class Queue {
	private Stack inStack;
	private Stack outStack;
	private int maxSize = 10;

	public Queue() {
		inStack = new Stack(maxSize);
		outStack = new Stack(maxSize);
	}

	// ���
	public void enqueue(int element) {
		inStack.push(element);
	}

	// ����
	public int dequeue() {
		if (outStack.isEmpty()) {

			while (!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
		return outStack.pop();
	}

	// �ж϶����Ƿ�Ϊ��
	public boolean isEmpty() {
		return inStack.isEmpty() && outStack.isEmpty();
	}
}
