package com.example.datastructor;

public class Queue {
	private Stack inStack;
	private Stack outStack;
	private int maxSize = 10;

	public Queue() {
		inStack = new Stack(maxSize);
		outStack = new Stack(maxSize);
	}

	// 入队
	public void enqueue(int element) {
		inStack.push(element);
	}

	// 出队
	public int dequeue() {
		if (outStack.isEmpty()) {

			while (!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
		return outStack.pop();
	}

	// 判断队列是否为空
	public boolean isEmpty() {
		return inStack.isEmpty() && outStack.isEmpty();
	}
}
