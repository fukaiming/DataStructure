package com.example.hash;

//����һ��HashTable
public class HashTable2 {
	// hash���Ԫ�ع���
	private DataItem[] hashArray;
	private int arraySize;
	private DataItem nonItem;

	public HashTable2(int arraySize) {
		hashArray = new DataItem[arraySize];
		this.arraySize = arraySize;
		nonItem = new DataItem(-1);
	}

	// ����hash����������������
	public int hashFun1(int key) {
		return key % arraySize;
	}

	// ����hash���������ڵ�������ͻ��ʱ�򣬽����ٹ�ϣ��(��������)
	public int hashFun2(int key) {
		return 5 - key % 5;
	}

	// ����HashTable
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

	// ��HashTable�в���һ��Ԫ��
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

	// ��HashTable�в���һ��Ԫ��
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

	// ��HashTable��ɾ��һ��Ԫ��
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
