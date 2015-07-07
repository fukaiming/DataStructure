package com.example.algorithm;

public class ReverseInteger {
	public static void main(String[] args) {
		int result = reverse(-1234);
		System.out.println(result);
	}

	public static int reverse(int number) {
		int result = 0;  
        while (number != 0) {  
            result = result * 10 + number % 10; // 每一次都在原来结果的基础上变大10倍，再加上余数  
            number = number / 10; // 对x不停除10  
        }  
        return result;  
	}
}
