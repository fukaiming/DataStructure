package com.example.algorithm;

public class StringToInteger2 {

	public static int stringToInteger(String str) {
		int result = 0;
		/**
		 * （1）输入为空，或者空字符串 （2）输入为字符 （3）超过最大或最小整数范围 （4）输入带符号的 eg:+1 -1 （5）输入带空格的
		 */
		if (str == null || str.equals("")) {
			return 0;
		}

		int i = 0;
		// 定义一个标志位，表示该字符代表的是正数还是负数。
		char flag = '+';
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		}

		if (str.charAt(0) == '+') {
			flag = '+';
			i++;
		}

		// 计算值
		while (str.length() > i) {
			if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
				result = result * 10 +  (str.charAt(i)-'0');
				i++;
			} else {
				return 0;
			}
		}
		
		//添加符号位
		if(flag == '-'){
			result = -result;
		}
		// 判断是否在最带最小整数范围内
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}

		if (result < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(stringToInteger("asdasdass"));
	}
}
