package com.example.treeBak;

//����������
public class Tree {
	private Node root;// ����һ��root����ָ���׽��

	// ����ָ���ؼ���
	public Node find(int key) {
		Node current = root;
		//ѭ���˳���������current.iData == key
		while (current.iData != key) {
			if (key < current.iData) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			if(current == null){
				return null;
			}
		}
		 return current;
	}
	
	//����һ���½��
	public void insert(int iData){
		Node newNode = new Node(iData);
		Node current = root;
		Node parent;//parentʼ����current�ĸ��ڵ�
		while(true){
			parent = current;
			if(newNode.iData <= current.iData){
				current = current.leftChild;
				if(current == null){
					parent.leftChild = newNode;
					return;
				}
			}else{
				current = current.rightChild;
				if(current == null){
					parent.rightChild = newNode;
				}
			}
		}
		
	}
	
	// �����������в�����Сֵ
	public Node findMin(){
		Node current = root;
		Node parent = current;
		while(current != null){
			parent = current;
			current = current.leftChild;
		}
		return parent;
	}
	
	// �����������в������ֵ
	public Node findMax(){
		Node current = root;
		Node parent = current;//parent:ʼ�ձ�ʾcurrent�ĸ��ڵ�
		while(current != null){
			parent = current;
			current = current.rightChild;
		}
		return parent;
	}
	
	//ǰ��������ݹ飩
	
	
	
	
	
	
	
	
	
	
}
