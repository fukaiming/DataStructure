package com.example.datastructor;

//����������
public class Link {
	private int iData;
	private double dData;
	public Link next;// ����ָ����һ�����

	public Link() {

	}

	public Link(int iData, double dData) {
		this.iData = iData;
		this.dData = dData;
	}

	public void displayLink() {
		System.out.println("{" + iData + "," + dData + "}");
	}

	public int getiData() {
		return iData;
	}

	public void setiData(int iData) {
		this.iData = iData;
	}

	public double getdData() {
		return dData;
	}

	public void setdData(double dData) {
		this.dData = dData;
	}

	

}
