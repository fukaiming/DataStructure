package com.example.beautyOfProgram;

import java.util.Scanner;


public class FindExtraMoney {
	   private static final int[] m = {100,50,20,10,5,2,1};
	    public static void main(String[] args) {
	        Scanner scanner  = new Scanner(System.in);
	        int f = scanner.nextInt();
	        int[] amount = new int[f];
	        for(int i = 0 ; i < f;i++){
	            amount[i] = giveChange(scanner.nextInt());
	        }
	        for(int i = 0 ; i < amount.length;i++){
	            System.out.println(amount[i]);
	        }
	    }
	    public static int giveChange(int n)  { 
	        int num=0;  
	        for(int i=0;i<m.length;i++){  
	            num+=n/m[i];  
	            n=n%m[i];  
	        }  
	        return num;  
	     }
}
