package com.example.datastructor;

public class FirstLastLinkDrive {
	public static void main(String[] args) {
		FirstLastLink firstLastLink = new FirstLastLink();
		firstLastLink.insertLast(1, 1.1);
		firstLastLink.insertLast(2, 2.1);
		firstLastLink.insertLast(3, 3.1);
		firstLastLink.insertLast(4, 4.1);
		firstLastLink.insertLast(5, 5.1);
		firstLastLink.displayLink();
	}
}
