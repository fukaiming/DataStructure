package com.example.tree;

public class Tree {
	private Node root;// ����һ��root���ã�����ָ�����ĸ��ڵ�

	// �����в��ҹؼ���key,�����ز��ҵĽ��
	public Node find(int key) {
		Node current = root;
		// ѭ����ֹ���������ҵ�iData==key
		while (current.iData != key) {
			if (key < current.iData) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			if (current == null) {
				return null;
			}
		}
		return current;
	}

	// ����һ���½ڵ�
	public void insert(int iData, double dData) {
		Node node = new Node(iData, dData);
		if (root == null) {
			root = node;
		} else {
			// ѭ���˳����������ҵ�Ҫ�������λ��
			Node current = root;
			Node parent = current;
			while (true) {
				parent = current;
				if (iData < current.iData) {
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = node;
						return;
					}
				} else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = node;
						return;
					}
				}
			}
		}

	}

	// �������
	public void inOrder(Node localNode) {
		// �ݹ���ֹ��������localNode == null
		if (localNode != null) {
			inOrder(localNode.leftChild);
			System.out.println(localNode.iData + " ");
			inOrder(localNode.rightChild);
		}
	}

	// �����������в�����Сֵ
	public Node minNode() {
		Node current = root;
		Node parent = current;// parentʼ�մ���current�ĸ��ڵ�
		// ѭ���ظ�ִ�е�������currentָ��ĵ�ǰ��㲻Ϊ�ա�
		while (current != null) {
			parent = current;
			current = current.leftChild;
		}
		return parent;
	}

	// �����������в������ֵ
	public Node maxNode() {
		Node current = root;
		Node parent = current;
		while (current != null) {
			parent = current;
			current = current.rightChild;
		}
		return parent;
	}

	// ����������ɾ����㣨ɾ���Ľ�����ӽڵ㣩
	public boolean delete(int key) {
		boolean isLeftChild = false;//��ʾҪɾ���Ľ�������ӻ����Һ���
		Node current = root;
		Node parent = current;// parent:ʼ�ձ�ʾcurrent�ĸ��ڵ�
		// ѭ���˳���������current�Ľ���е�iData == key
		while (current.iData != key) {
			parent = current;
			if (key < current.iData) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
		}
		//�ж�ɾ���Ľ�㲻���ڵ����
		if(current == null){
			return false;
		}
		//�ж�ɾ���Ľ���ǲ���ֻ��һ����㣬�����ڵ�
		if(current.leftChild == null && current.rightChild == null){
			if(current == root){
				root = null;
			}else if(isLeftChild){
				parent.leftChild = null;
			}else{
				parent.rightChild = null;
			}
		}
	
	return false;
	}
}
