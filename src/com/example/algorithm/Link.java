package com.example.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//��д���򣬽����������Ӽ������룬�Ե�������ʽ�洢������Ȼ����㵥�����н��ĸ���������ָ��Pָ�������ĵ�һ����㣩��
public class Link {
	private Node first;
	
	//��ӽ��
	public void addNode(int iData){
		Node node = new Node(iData);
		if(first == null){
			first = node;
		}else{
			node.next = first;
			first = node;
		}
	}
	
	//������ĸ���
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
	
	//�Ӽ�����������������
	public void getInput() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] results = br.readLine().split("\t");
		for(String result : results){
			addNode(Integer.parseInt(result));
		}
		
	}
}
