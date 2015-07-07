package com.example.algorithm;

public class LinkList {
	private LinkNode front;

	public LinkList() {
		front = null;
	}

	// ����������ӽ��
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

	// ��������
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
	
	//��������ͷָ��
	public LinkNode getFront(){
		return front;
	}
}
