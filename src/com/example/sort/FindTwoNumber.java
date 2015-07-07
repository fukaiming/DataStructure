package com.example.sort;

import java.util.HashMap;
import java.util.Map;

public class FindTwoNumber {
	private int[] theArray = { 1, 2, 3, 4, 5, 6 };
	private int sum = 0;

	public FindTwoNumber(int sum) {
		this.sum = sum;
	}

	public int findTwoNum() {
		Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
		for (int i = 0; i < theArray.length; i++) {
			maps.put(theArray[i], theArray[i]);
		}

		for (int i = 0; i < theArray.length; i++) {
			int anotherNum = sum - theArray[i];
			if (maps.containsKey(anotherNum)) {
				return maps.get(anotherNum);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		FindTwoNumber ftn = new FindTwoNumber(6);
		int anotherNum = ftn.findTwoNum();
		System.out.println(anotherNum);
	}
}
