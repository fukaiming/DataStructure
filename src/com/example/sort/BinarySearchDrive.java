package com.example.sort;

public class BinarySearchDrive {
	public static void main(String[] args) {
		int maxSize = 10;
		BinarySearch bs = new BinarySearch(maxSize);
		for(int i=0;i<maxSize;i++){
			bs.insertElement(i*10);
		}
		
		System.out.println("显示数组元素");
		bs.display();
		int searchKey = 20;
		int result = bs.binarySearch(0,bs.size()-1,searchKey);
		if(result >0){
			System.out.println("找到元素"+searchKey+"\n元素所在位置"+result);
		}else{
			System.out.println("没有找到");
		}
	}
}
