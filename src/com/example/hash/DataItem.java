package com.example.hash;

//HashԪ�صĹ���
public class DataItem {
	private int iData;
	
	//ͨ�����캯����ֵ
	public DataItem(int iData){
		this.iData = iData;
	}
	
	public int getKey(){
		return iData;
	}
}
