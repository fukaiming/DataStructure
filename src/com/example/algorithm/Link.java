package com.example.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//编写程序，将若干整数从键盘输入，以单链表形式存储起来，然后计算单链表中结点的个数（其中指针P指向该链表的第一个结点）。
public class Link {
	private Node first;
	
	//添加结点
	public void addNode(int iData){
		Node node = new Node(iData);
		if(first == null){
			first = node;
		}else{
			node.next = first;
			first = node;
		}
	}
	
	//输出结点的个数
	public int  getNodeCount(){
		int count = 0;
		if(first != null){
			Node current = first;
			while(current != null){
				count++;
				current = current.next;
			}
		}
		return count;
	}
	
	//从键盘中输入若干整数
	public void getInput() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] results = br.readLine().split("\t");
		for(String result : results){
			addNode(Integer.parseInt(result));
		}
		
	}
}
