package com.example.algorithm;

public class ReverseInteger {
	public static void main(String[] args) {
		int result = reverse(-1234);
		System.out.println(result);
	}

	public static int reverse(int number) {
		int result = 0;  
        while (number != 0) {  
            result = result * 10 + number % 10; // ÿһ�ζ���ԭ������Ļ����ϱ��10�����ټ�������  
            number = number / 10; // ��x��ͣ��10  
        }  
        return result;  
	}
}
