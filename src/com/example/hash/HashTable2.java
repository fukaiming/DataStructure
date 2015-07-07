package com.example.hash;

//定义一个HashTable
public class HashTable2 {
	// hash表的元素构成
	private DataItem[] hashArray;
	private int arraySize;
	private DataItem nonItem;

	public HashTable2(int arraySize) {
		hashArray = new DataItem[arraySize];
		this.arraySize = arraySize;
		nonItem = new DataItem(-1);
	}

	// 定义hash函数，除留余数法
	public int hashFun1(int key) {
		return key % arraySize;
	}

	// 定义hash函数，用于当发生冲突的时候，进行再哈希。(决定步长)
	public int hashFun2(int key) {
		return 5 - key % 5;
	}

	// 遍历HashTable
	public void displayHashTable() {
		for (int i = 0; i < arraySize; i++) {
			if (hashArray[i] != null) {
				System.out.print(hashArray[i] + " ");
			} else {
				System.out.printf("** ");
			}
		}
		System.out.println("");
	}

	// 向HashTable中插入一个元素
	public void insert(DataItem dataItem) {
		int key = dataItem.getKey();
		int hashVal = hashFun1(key);
		int stepVal = hashFun2(key);
		while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
			hashVal += stepVal;
			hashVal %= arraySize;
		}
		hashArray[hashVal] = dataItem;
	}

	// 向HashTable中查找一个元素
	public DataItem find(int key) {
		int hashVal = hashFun1(key);
		int stepVal = hashFun2(key);
		while (hashArray[hashVal] != null) {
			if (hashArray[hashVal].getKey() == key) {
				return hashArray[hashVal];
			} else {
				hashVal += stepVal;
				hashVal %= arraySize;
			}
		}
		return null;
	}

	// 在HashTable中删除一个元素
	public DataItem delete(int key) {
		int hashVal = hashFun1(key);
		int stepVal = hashFun2(key);
		while (hashArray[hashVal] != null) {
			if (hashArray[hashVal].getKey() == key) {
				DataItem temp = hashArray[hashVal];
				hashArray[hashVal] = nonItem;
				return temp;
			} else {
				hashVal += stepVal;
				hashVal %= arraySize;
			}
		}
		return null;
	}
}
