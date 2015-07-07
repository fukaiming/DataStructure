package com.example.datastructor;

public class FirstLastLink {
	private Link first; // ָ���׽��
	private Link last;// ָ��β���

	public FirstLastLink() {
		first = null;
		last = null;
	}

	// �ж�˫�������Ƿ�Ϊ��
	public boolean isEmpty() {
		if (first == null && last == null) {
			return true;
		} else {
			return false;
		}
	}

	// �ڱ�ͷ����һ��Ԫ��
	public void insertFirst(int iData, double dData) {
		Link newNode = new Link(iData, dData);
		if (isEmpty()) {
			last = newNode;
		}
		newNode.next = first;
		first = newNode;
	}

	// �ڱ�β����һ��Ԫ��
	public void insertLast(int iData, double dData) {
		Link newNode = new Link(iData, dData);
		if (isEmpty()) {
			first = newNode;
			last = newNode;
		}
		last.next = newNode;
		last = newNode;
	}

	// ɾ����ͷԪ��
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
	
	//����˫������
	public void displayLink(){
 		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
