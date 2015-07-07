package com.example.sort;

public class QuickSortLearn1Drive {
	public static void main(String[] args) {
		int maxSize = 10;
		QuickSortLearn1 qsl1 = new QuickSortLearn1(maxSize);
		// 通过循环插入10个元素
		for (int i = 0; i < maxSize; i++) {
			qsl1.insert((int)(Math.random()*199));
		}
		//打印初始化数组信息
		System.out.println("before sort");
		qsl1.display();
		int left = 0;
		int right = qsl1.size()-1;
		qsl1.quickSort(left, right);
		System.out.println("after sort");
		qsl1.display();
	}
}
