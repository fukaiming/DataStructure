package com.example.beautyOfProgram;

public class HeapDrive {
	public static void main(String[] args) {
		HeapMax heap = new HeapMax(10);
		for(int i=0;i<10;i++){
			heap.insert((int)(Math.random()*199));
		}
		for(int i=0;i<10;i++){
		heap.display();
		}
	}
}
