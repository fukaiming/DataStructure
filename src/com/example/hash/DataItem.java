package com.example.hash;

//Hash元素的构成
public class DataItem {
	private int iData;
	
	//通过构造函数赋值
	public DataItem(int iData){
		this.iData = iData;
	}
	
	public int getKey(){
		return iData;
	}
}
