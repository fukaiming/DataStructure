package com.example.datastructor;

public class LinkList {
	// ����һ��first�����ڱ�ʾָ�������׽��
	private Link first;

	public LinkList() {
		first = null;
	}

	// �ж������Ƿ�Ϊ��
	public boolean isEmpty() {
		return first == null;
	}

	// �ڱ�ͷ����һ���½��
	public void insertFirst(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		newLink.next = first;
		first = newLink;
	}

	// ɾ����ͷ���
	public Link deletFirst() {
		if (!isEmpty()) {
			Link deleteNode = first;
			first = deleteNode.next;
			return deleteNode;
		} else {
			return null;
		}

	}

	// ����ָ��iData==key���
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
	 * ɾ��iData==key��� ��������� ��1��ɾ������ͷԪ�� ��2��ɾ�������е�Ԫ��
	 */
	public Link delete(int key) {
		Link current = first;
		Link previous = first;
		// step1:��ͨ�������ҵ���Ԫ��,ѭ���˳����������ҵ��˸ý��
		while (current.getiData() != key) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}
		// step2:���жϸ�Ԫ���Ǳ�ͷԪ�ػ��Ǳ��е�Ԫ�أ��ֱ���д���
		if (current == first) {
			first = current.next;
		} else {
			previous.next = current.next;
		}
		return current;
	}

	// ���½����뵽���������ָ��λ��
	public void insert(int iData, double dData) {
		Link newNode = new Link(iData, dData);
		Link current = first;
		Link previous = null;
		while (current != null && current.getiData() < newNode.getiData()) {
			previous = current;
			current = current.next;
		}

		// ����Ľ�����׽���λ��
		if (previous == null) {
			first = newNode;

		} else {
			previous.next = newNode;
		}
		newNode.next = current;

	}

	// ��������
	public void displayLink() {
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
