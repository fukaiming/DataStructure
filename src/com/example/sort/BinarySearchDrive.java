package com.example.sort;

public class BinarySearchDrive {
	public static void main(String[] args) {
		int maxSize = 10;
		BinarySearch bs = new BinarySearch(maxSize);
		for(int i=0;i<maxSize;i++){
			bs.insertElement(i*10);
		}
		
		System.out.println("��ʾ����Ԫ��");
		bs.display();
		int searchKey = 20;
		int result = bs.binarySearch(0,bs.size()-1,searchKey);
		if(result >0){
			System.out.println("�ҵ�Ԫ��"+searchKey+"\nԪ������λ��"+result);
		}else{
			System.out.println("û���ҵ�");
		}
	}
}
