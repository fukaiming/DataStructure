package com.example.hash;

//������������
public class SortedList {
	//��������Ĺ���
	private Link first;//����һ���������ã�ָ������ͷ��
	
	public SortedList(){
		this.first = first;
	}
	
	//����һ��Ԫ��
	public void insert(Link theLink){
		int key = theLink.getKey();
		Link current = first;
		Link previous = null;//previous��ʼ��Ϊcurrent��ǰ��
		//ͨ��ѭ��������������ͷ��ʼ�ҵ�Ҫ�����λ��
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
	
	//ɾ��һ��Ԫ��
	public void delete(int key){
		Link current = first;
		Link previous = null;
		//ͨ�������ҵ�Ҫɾ��Ԫ�ص�λ��
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
	
	//����һ��Ԫ��
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
	
	//������������
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
