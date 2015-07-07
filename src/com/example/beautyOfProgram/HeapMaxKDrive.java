package com.example.beautyOfProgram;

public class HeapMaxKDrive {
	public static void main(String[] args) {
		Heap heap = new Heap(10);
		for(int i=0;i<10;i++){
			heap.add(i+2);
		}
		heap.display();
		heap.add(100);
		heap.add(110);
		
		System.out.println("\n after insert");
		heap.display();
	}
}
