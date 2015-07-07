package com.example.algorithm;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	private static int[] numbers = { 2,3,4,9,11 };
	private Map<Integer, Integer> maps;

	public TwoSum() {
		maps = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			maps.put(numbers[i], i);
		}
	}

	public int[] twoSum(int[] numbers, int target) {
		int[] indexs = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			int temp = numbers[i];
			int another = target - temp;
			if (maps.containsKey(another)) {
				indexs[0] = i;
				indexs[1] = maps.get(another);
				break;
			}
		}
		return indexs;
	}

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int target = 13;
		int[] indexs = twoSum.twoSum(numbers, target);
		System.out.print("第一个索引值：" + indexs[0] + "\n第二个索引值：" + indexs[1]);
	}
}
