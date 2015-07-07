package com.example.hash;

//链地址法
public class HashTable1 {
	// 定义HashTable的构成
	private SortedList[] hashArray;
	private int arraySize;

	public HashTable1(int size) {
		this.arraySize = size;
		hashArray = new SortedList[size];// 仅仅是创建了数组
		// 为数组赋值
		for (int i = 0; i < arraySize; i++) {
			hashArray[i] = new SortedList();
		}
	}

	// 遍历hashTable
	public void displayHashTable() {
		for (int i = 0; i < arraySize; i++) {
			System.out.print(i + ".");
			hashArray[i].displayList();
		}
	}
	
	//定义hash函数，实现将key映射到指定的bucket中
	public int hashFun(int key){
		return key % arraySize;
	}
	
	//向hash表中插入一个Link元素
	public void insert(Link theLink){
		int hashVal = hashFun(theLink.getKey());
		hashArray[hashVal].insert(theLink);
	}
	
	//向hash表中删除指定的Link元素
	public void delete(int key){
		//通过hash函数，找到要删除元素的位置
		 int hashVal = hashFun(key);
		hashArray[hashVal].delete(key);
		 
	}
	
	//在Hash表中查找指定的Link元素
	public Link find(int key){
		int hashVal = hashFun(key);
		Link theLink = hashArray[hashVal].find(key);
		return theLink;
	}
}
