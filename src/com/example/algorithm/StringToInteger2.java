package com.example.algorithm;

public class StringToInteger2 {

	public static int stringToInteger(String str) {
		int result = 0;
		/**
		 * ��1������Ϊ�գ����߿��ַ��� ��2������Ϊ�ַ� ��3������������С������Χ ��4����������ŵ� eg:+1 -1 ��5��������ո��
		 */
		if (str == null || str.equals("")) {
			return 0;
		}

		int i = 0;
		// ����һ����־λ����ʾ���ַ���������������Ǹ�����
		char flag = '+';
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		}

		if (str.charAt(0) == '+') {
			flag = '+';
			i++;
		}

		// ����ֵ
		while (str.length() > i) {
			if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
				result = result * 10 +  (str.charAt(i)-'0');
				i++;
			} else {
				return 0;
			}
		}
		
		//��ӷ���λ
		if(flag == '-'){
			result = -result;
		}
		// �ж��Ƿ��������С������Χ��
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
