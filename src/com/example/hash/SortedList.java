package com.example.hash;

//定义有序链表
public class SortedList {
	//定义链表的构成
	private Link first;//定义一个链表引用，指向链表头部
	
	public SortedList(){
		this.first = first;
	}
	
	//插入一个元素
	public void insert(Link theLink){
		int key = theLink.getKey();
		Link current = first;
		Link previous = null;//previous：始终为current的前驱
		//通过循环遍历，从链表头开始找到要插入的位置
		while(current.getKey() < key && current != null){
			previous = current;
			current = current.next;
		}
		if(previous == null){
			first = theLink;
		}else{
			previous.next = theLink;
		}
		theLink.next = current;
	}
	
	//删除一个元素
	public void delete(int key){
		Link current = first;
		Link previous = null;
		//通过遍历找到要删除元素的位置
		while(current != null && current.getKey() != key){
			previous = current;
			current = current.next;
		}
		if(previous == null){
			first = first.next;
		}else{
			previous.next = current.next;
		}
	}
	
	//查找一个元素
	public Link find(int key){
		Link current = first;
		while(current != null && current.getKey() < key){
			current = current.next;
		}
		if(current.getKey() == key){
			return current;
		}else{
			return null;
		}
	}
	
	//遍历整个链表
	public void displayList(){
		System.out.println("List(first---->last):");
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println(" ");
	}
}
