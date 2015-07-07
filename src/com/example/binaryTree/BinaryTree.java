package com.example.binaryTree;

public class BinaryTree {
	private Node root;

	public BinaryTree() {
		this.root = null;
	}

	/**
	 * 查找关键字
	 * 查找的结点不存在（在循环中进行判断）
	 * 查找的结点存在
	 * 
	 */
	public Node find(int key) {
		Node current = root;
		//循环退出的条件是：查找到指定的结点
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
	 * 插入结点
	 * 情形1：插入的结点是根节点（特殊的情况）
	 * 情形2：插入的结点不是根节点
	 */
	public void insert(int iData,double dData){
		Node newNode = new Node(iData,dData);
		//如果插入的结点是根节点
		if(root == null){
			root = newNode;
		}else{
			//循环：当找到插入结点的位置，并插入后返回
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
						return;//循环退出的条件：找到插入结点的位置，插入后并返回。
					}
				}
			}
		}
	}
	
	//前序递归遍历
	public void preOrder(Node localNode){
		if(localNode != null){
			System.out.println(localNode.iData+"");
			preOrder(localNode.leftChild);
			preOrder(localNode.rightChild);
		}
	}
	
	//中序递归遍历
	public void inOrder(Node localNode){
		if(localNode != null){
			inOrder(localNode.leftChild);//以中序遍历的方式遍历左子树
			System.out.println(localNode.iData);
			inOrder(localNode.rightChild);//以中序遍历的方式遍历右子树
		}
	}
	
	//后续递归遍历
	public void postOrder(Node localNode){
		if(localNode != null){
			postOrder(localNode.leftChild);
			postOrder(localNode.rightChild);
			System.out.println(localNode.iData);
		}
	}
	
	
	
}
