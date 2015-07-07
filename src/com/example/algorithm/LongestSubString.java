package com.example.algorithm;

public class LongestSubString {

	public static int lengthOfLongestSubString(String s) {
		/*
		 * 用于表示256个ASCLL码，true：表示已存在。 false：表示还没有存在。相当于HashMap
		 */

		boolean[] flag = new boolean[256];
		int start = 0;
		int result = 0; // 记录最长子串
		char[] theArray = s.toCharArray();
		for (int i = 0; i < theArray.length; i++) {
			char current = theArray[i];
			if (flag[current]) {
				result = Math.max(result, i - start);
				start++;
			} else {
				flag[current] = true;
			}
		}
		result = Math.max(theArray.length-start, result);
		return result;
	}

	public static void main(String[] args) {
		String str = "pwwkew";
		int result = lengthOfLongestSubString(str);
		System.out.println(result);
	}

}