package com.example.beautyOfProgram;

public class FindMaxAndMin {
	private static int[] theArray = { 5, 9, 1, 2, 4 };

	public static int size() {
		return theArray.length - 1;
	}

	public static void main(String[] args) {
		MaxAndMin mam = finaMaxAndMin(theArray, 0, size());
		System.out.println("最大值："+mam.getMax()+"\n最小值："+mam.getMin());
	}

	// 用于查找数组中的最大值和最小值
	public static MaxAndMin finaMaxAndMin(int[] theArray, int left, int right) {
		MaxAndMin mam = new MaxAndMin();
		// 递归退出的条件
		if (right - left <= 1) {
			if (theArray[left] < theArray[right]) {
				mam.setMax(theArray[right]);
				mam.setMin(theArray[left]);
				return mam;
			} else {
				mam.setMax(theArray[left]);
				mam.setMin(theArray[right]);
				return mam;
			}
		}

		int middle = (left + right) / 2;
		MaxAndMin leftMam = finaMaxAndMin(theArray, left, middle);//左边子问题的最值
		MaxAndMin rightMam = finaMaxAndMin(theArray, middle + 1, right);//右边子问题的最值
		MaxAndMin finalMam = new MaxAndMin();
		if(leftMam.getMax() >= rightMam.getMax()){
			finalMam.setMax(leftMam.getMax());
		}else{
			finalMam.setMax(rightMam.getMax());
		}
		
		if(leftMam.getMin() < rightMam.getMin()){
			finalMam.setMin(leftMam.getMin());
		}else{
			finalMam.setMin(rightMam.getMin());
		}
		return finalMam;

	}

}
