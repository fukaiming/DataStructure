package com.example.binaryTree;

public class BinaryTree {
	private Node root;

	public BinaryTree() {
		this.root = null;
	}

	/**
	 * ���ҹؼ���
	 * ���ҵĽ�㲻���ڣ���ѭ���н����жϣ�
	 * ���ҵĽ�����
	 * 
	 */
	public Node find(int key) {
		Node current = root;
		//ѭ���˳��������ǣ����ҵ�ָ���Ľ��
		while(current.iData != key){
			if(key < current.iData){
				current = current.leftChild;
			}else{
				current = current.rightChild;
			}
			
			if(current == null){
				return null;
			}
		}
		return current;
	}
	
	/**
	 * ������
	 * ����1������Ľ���Ǹ��ڵ㣨����������
	 * ����2������Ľ�㲻�Ǹ��ڵ�
	 */
	public void insert(int iData,double dData){
		Node newNode = new Node(iData,dData);
		//�������Ľ���Ǹ��ڵ�
		if(root == null){
			root = newNode;
		}else{
			//ѭ�������ҵ��������λ�ã�������󷵻�
			Node current = root;
			Node parent = null;
			while(true){
				parent = current;
				if(iData < current.iData){
					current = current.leftChild;
					if(current == null){
						parent.leftChild = newNode;
						return;
					}
				}else{
					current = current.rightChild;
					if(current == null){
						parent.rightChild = newNode;
						return;//ѭ���˳����������ҵ��������λ�ã�����󲢷��ء�
					}
				}
			}
		}
	}
	
	//ǰ��ݹ����
	public void preOrder(Node localNode){
		if(localNode != null){
			System.out.println(localNode.iData+"");
			preOrder(localNode.leftChild);
			preOrder(localNode.rightChild);
		}
	}
	
	//����ݹ����
	public void inOrder(Node localNode){
		if(localNode != null){
			inOrder(localNode.leftChild);//����������ķ�ʽ����������
			System.out.println(localNode.iData);
			inOrder(localNode.rightChild);//����������ķ�ʽ����������
		}
	}
	
	//�����ݹ����
	public void postOrder(Node localNode){
		if(localNode != null){
			postOrder(localNode.leftChild);
			postOrder(localNode.rightChild);
			System.out.println(localNode.iData);
		}
	}
	
	
	
}
