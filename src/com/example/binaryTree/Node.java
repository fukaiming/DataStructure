package com.example.binaryTree;

public class Node {
	public int iData; // key
	public double dData;
	public Node leftChild; // ����
	public Node rightChild;// �Һ���

	public Node(int iData, double dData) {
		this.iData = iData;
		this.dData = dData;
	}

	public void display() {
		System.out.print("{");
		System.out.print(iData);
		System.out.print(",");
		System.out.print(dData);
		System.out.print("}");
	}
}
