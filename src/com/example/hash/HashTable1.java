package com.example.hash;

//����ַ��
public class HashTable1 {
	// ����HashTable�Ĺ���
	private SortedList[] hashArray;
	private int arraySize;

	public HashTable1(int size) {
		this.arraySize = size;
		hashArray = new SortedList[size];// �����Ǵ���������
		// Ϊ���鸳ֵ
		for (int i = 0; i < arraySize; i++) {
			hashArray[i] = new SortedList();
		}
	}

	// ����hashTable
	public void displayHashTable() {
		for (int i = 0; i < arraySize; i++) {
			System.out.print(i + ".");
			hashArray[i].displayList();
		}
	}
	
	//����hash������ʵ�ֽ�keyӳ�䵽ָ����bucket��
	public int hashFun(int key){
		return key % arraySize;
	}
	
	//��hash���в���һ��LinkԪ��
	public void insert(Link theLink){
		int hashVal = hashFun(theLink.getKey());
		hashArray[hashVal].insert(theLink);
	}
	
	//��hash����ɾ��ָ����LinkԪ��
	public void delete(int key){
		//ͨ��hash�������ҵ�Ҫɾ��Ԫ�ص�λ��
		 int hashVal = hashFun(key);
		hashArray[hashVal].delete(key);
		 
	}
	
	//��Hash���в���ָ����LinkԪ��
	public Link find(int key){
		int hashVal = hashFun(key);
		Link theLink = hashArray[hashVal].find(key);
		return theLink;
	}
}
