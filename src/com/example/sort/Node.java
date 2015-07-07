package com.example.sort;

public class Node {
	private int iData;

	public Node(int iData) {
		this.iData = iData;
	}
	
	public int getKey(){
		return iData;
	}
	
	public void setKey(int key){
		this.iData = key;
	}
}
