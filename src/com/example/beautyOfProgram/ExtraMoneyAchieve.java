package com.example.beautyOfProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ExtraMoneyAchieve {
	private double[] faceValue = { 100, 50, 20, 10, 5, 1, 0.5, 0.1 };
	private static Map<Double, Integer> results = null;
	private static double value = 0;

	public ExtraMoneyAchieve() {
		results = new HashMap<Double, Integer>();
	}

	public Map<Double,Integer> findExtraMoney(double value) {
		 Map<Double, Integer> results = new HashMap<Double,Integer>();
		int i = 0;
		// �ҵ���valueС�������ֵ
		while (value <= faceValue[i]) {
			i++;
		}

		while ((i < faceValue.length) && (value > 0)) {
			double key = faceValue[i];
			if (value >= key) {
				if (results.get(key) == null) {
					results.put(key, 1);
				} else {
					results.put(key, results.get(key) + 1);
				}
				value -= key;
			} else {
				i++;
			}
		}
		
		return results;
	}

	public static void main(String[] args) {
		System.out.println("������Ǯ��");
		Scanner scanner = new Scanner(System.in);
		value = scanner.nextDouble();
		ExtraMoneyAchieve ema = new ExtraMoneyAchieve();
		results = ema.findExtraMoney(value);
		System.out.println("����Ǯ�����");
		Iterator iterator = results.entrySet().iterator();
		while(iterator.hasNext()){
			Entry entry = (Entry) iterator.next();
			System.out.print(entry.getKey()+":"+entry.getValue()+"��\n");
			
		}
	}
}
