package com.example.beautyOfProgram;

public class FindMaxAndMin {
	private static int[] theArray = { 5, 9, 1, 2, 4 };

	public static int size() {
		return theArray.length - 1;
	}

	public static void main(String[] args) {
		MaxAndMin mam = finaMaxAndMin(theArray, 0, size());
		System.out.println("���ֵ��"+mam.getMax()+"\n��Сֵ��"+mam.getMin());
	}

	// ���ڲ��������е����ֵ����Сֵ
	public static MaxAndMin finaMaxAndMin(int[] theArray, int left, int right) {
		MaxAndMin mam = new MaxAndMin();
		// �ݹ��˳�������
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
		MaxAndMin leftMam = finaMaxAndMin(theArray, left, middle);//������������ֵ
		MaxAndMin rightMam = finaMaxAndMin(theArray, middle + 1, right);//�ұ����������ֵ
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
