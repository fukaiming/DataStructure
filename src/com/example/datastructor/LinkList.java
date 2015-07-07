package com.example.datastructor;

public class LinkList {
	// 定义一个first，用于表示指向链表首结点
	private Link first;

	public LinkList() {
		first = null;
	}

	// 判断链表是否为空
	public boolean isEmpty() {
		return first == null;
	}

	// 在表头插入一个新结点
	public void insertFirst(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		newLink.next = first;
		first = newLink;
	}

	// 删除表头结点
	public Link deletFirst() {
		if (!isEmpty()) {
			Link deleteNode = first;
			first = deleteNode.next;
			return deleteNode;
		} else {
			return null;
		}

	}

	// 查找指定iData==key结点
	public Link find(int key) {
		Link current = first;
		while (current != null) {
			if (current.getiData() == key) {
				return current;
			} else {
				current = current.next;
			}
		}
		return null;
	}

	/**
	 * 删除iData==key结点 分两种情况 （1）删除链表头元素 （2）删除链表中的元素
	 */
	public Link delete(int key) {
		Link current = first;
		Link previous = first;
		// step1:先通过遍历找到该元素,循环退出的条件是找到了该结点
		while (current.getiData() != key) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}
		// step2:在判断该元素是表头元素还是表中的元素，分别进行处理
		if (current == first) {
			first = current.next;
		} else {
			previous.next = current.next;
		}
		return current;
	}

	// 将新结点插入到有序链表的指定位置
	public void insert(int iData, double dData) {
		Link newNode = new Link(iData, dData);
		Link current = first;
		Link previous = null;
		while (current != null && current.getiData() < newNode.getiData()) {
			previous = current;
			current = current.next;
		}

		// 插入的结点是首结点的位置
		if (previous == null) {
			first = newNode;

		} else {
			previous.next = newNode;
		}
		newNode.next = current;

	}

	// 遍历链表
	public void displayLink() {
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
