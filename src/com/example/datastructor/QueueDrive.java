package com.example.datastructor;

public class QueueDrive {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.print(queue.dequeue()+" ");
		queue.enqueue(4);
		System.out.print(queue.dequeue()+" ");
		System.out.print(queue.dequeue()+" ");
		
	}
}
