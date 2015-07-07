package com.example.algorithm;

public class LongestSubString {

	public static int lengthOfLongestSubString(String s) {
		/*
		 * ���ڱ�ʾ256��ASCLL�룬true����ʾ�Ѵ��ڡ� false����ʾ��û�д��ڡ��൱��HashMap
		 */

		boolean[] flag = new boolean[256];
		int start = 0;
		int result = 0; // ��¼��Ӵ�
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