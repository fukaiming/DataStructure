package com.example.beautyOfProgram;

public class Knapsack {

	/** �������� */
	private int weight;

	/** ������Ʒ��ֵ */
	private int value;

	/***
	 * ������
	 */
	public Knapsack(int weight, int value) {
		this.value = value;
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return "[weight: " + weight + " " + "value: " + value + "]";
	}

}
