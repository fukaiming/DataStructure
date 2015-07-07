package com.example.beautyOfProgram;

public class StackDrive {
	public static void main(String[] args) {
		Stack stack = new Stack();
		//≤‚ ‘»Î’ª
		for(int i=0;i<100;i++){
			stack.push((int)(Math.random()*199));
		}
		
		//≤‚ ‘size
		System.out.println("∂—’ª¥Û–°£∫"+stack.size());
		
		//≤‚ ‘≥ˆ’ª
		for(int i=0;i<stack.size();i++){
			System.out.print(stack.pop()+" ");
		}
	}
}
