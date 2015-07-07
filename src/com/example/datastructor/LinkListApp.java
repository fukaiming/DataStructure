package com.example.datastructor;

public class LinkListApp {
	public static void main(String[] args) {
		LinkList theList = new LinkList();
		theList.insertFirst(22, 2.99);
		theList.insertFirst(23, 3.99);
		theList.insertFirst(24, 4.99);
		theList.insertFirst(25, 5.99);
		theList.displayLink();
		
	}
}
