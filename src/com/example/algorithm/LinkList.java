package com.example.algorithm;

public class LinkList {
	private LinkNode front;

	public LinkList() {
		front = null;
	}

	// 向链表中添加结点
	public void addLinkNode(int data) {
		if (data < 0) {
			return;
		}
		LinkNode node = new LinkNode(data);

		if (front == null) {
			front = node;
		} else {
			LinkNode current = front;
			LinkNode pre = null;
			while(current != null){
				pre = current;
				current = current.next;
			}
			pre.next = node;
		}

	}

	// 遍历链表
	public void display() {
		if (front == null) {
			return;
		}
		LinkNode current = front;
		while (current != null) {
			System.out.print(current.data+"\t");
			current = current.next;
		}
	}
	
	//返回链表头指针
	public LinkNode getFront(){
		return front;
	}
}
