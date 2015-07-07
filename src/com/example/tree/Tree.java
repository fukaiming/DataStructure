package com.example.tree;

public class Tree {
	private Node root;// 定义一个root引用，用于指向树的根节点

	// 在树中查找关键字key,并返回查找的结点
	public Node find(int key) {
		Node current = root;
		// 循环终止的条件是找到iData==key
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

	// 插入一个新节点
	public void insert(int iData, double dData) {
		Node node = new Node(iData, dData);
		if (root == null) {
			root = node;
		} else {
			// 循环退出的条件是找到要插入结点的位置
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

	// 中序遍历
	public void inOrder(Node localNode) {
		// 递归终止的条件：localNode == null
		if (localNode != null) {
			inOrder(localNode.leftChild);
			System.out.println(localNode.iData + " ");
			inOrder(localNode.rightChild);
		}
	}

	// 二叉搜索树中查找最小值
	public Node minNode() {
		Node current = root;
		Node parent = current;// parent始终代表current的父节点
		// 循环重复执行的条件是current指向的当前结点不为空。
		while (current != null) {
			parent = current;
			current = current.leftChild;
		}
		return parent;
	}

	// 二叉搜索树中查找最大值
	public Node maxNode() {
		Node current = root;
		Node parent = current;
		while (current != null) {
			parent = current;
			current = current.rightChild;
		}
		return parent;
	}

	// 二叉搜索树删除结点（删除的结点是子节点）
	public boolean delete(int key) {
		boolean isLeftChild = false;//表示要删除的结点是左孩子还是右孩子
		Node current = root;
		Node parent = current;// parent:始终表示current的父节点
		// 循环退出的条件是current的结点中的iData == key
		while (current.iData != key) {
			parent = current;
			if (key < current.iData) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
		}
		//判断删除的结点不存在的情况
		if(current == null){
			return false;
		}
		//判断删除的结点是不是只有一个结点，即根节点
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
