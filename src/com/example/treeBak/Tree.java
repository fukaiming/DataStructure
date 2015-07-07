package com.example.treeBak;

//创建二叉树
public class Tree {
	private Node root;// 定义一个root引用指向首结点

	// 查找指定关键字
	public Node find(int key) {
		Node current = root;
		//循环退出的条件是current.iData == key
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
	
	//插入一个新结点
	public void insert(int iData){
		Node newNode = new Node(iData);
		Node current = root;
		Node parent;//parent始终是current的父节点
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
	
	// 二叉搜索树中查找最小值
	public Node findMin(){
		Node current = root;
		Node parent = current;
		while(current != null){
			parent = current;
			current = current.leftChild;
		}
		return parent;
	}
	
	// 二叉搜索树中查找最大值
	public Node findMax(){
		Node current = root;
		Node parent = current;//parent:始终表示current的父节点
		while(current != null){
			parent = current;
			current = current.rightChild;
		}
		return parent;
	}
	
	//前序遍历（递归）
	
	
	
	
	
	
	
	
	
	
}
