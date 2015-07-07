package com.example.datastructor;

public class FirstLastLink {
	private Link first; // 指向首结点
	private Link last;// 指向尾结点

	public FirstLastLink() {
		first = null;
		last = null;
	}

	// 判断双端链表是否为空
	public boolean isEmpty() {
		if (first == null && last == null) {
			return true;
		} else {
			return false;
		}
	}

	// 在表头插入一个元素
	public void insertFirst(int iData, double dData) {
		Link newNode = new Link(iData, dData);
		if (isEmpty()) {
			last = newNode;
		}
		newNode.next = first;
		first = newNode;
	}

	// 在表尾插入一个元素
	public void insertLast(int iData, double dData) {
		Link newNode = new Link(iData, dData);
		if (isEmpty()) {
			first = newNode;
			last = newNode;
		}
		last.next = newNode;
		last = newNode;
	}

	// 删除表头元素
	public Link deleteFirst() {
		Link deleteNode = first;
		if (first.next != null) {
			first = first.next;
		}else{
			first = null;
			last = null;
		}
		return deleteNode;
	}
	
	//遍历双端链表
	public void displayLink(){
 		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
