package com.example.hash;
//定义链表结点
public class Link {
	//定义链表结点属性
	private int iData;
	public Link next;
	
	public Link(int iData){
		this.iData = iData;
	}
	
	public int getKey(){
		return iData;
	}
	
	public void displayLink(){
		System.out.println(iData+"  ");
	}
}
