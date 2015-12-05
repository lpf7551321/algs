package com.miracler.basic;

import java.util.Arrays;

import com.algs4.stdlib.In;

public class BinarySearch {
	public static void main(String[] args) {
		int s=(int)1.2f;
		int[] m = { 2, 43, 1, 22,3234,4, 3, 667, 8 };
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
		long start = System.nanoTime();
		entry e = rankHard(m, 8);
		long end = System.nanoTime();
		System.out.println(end - start);
		System.out.println(e.getKey() + ":" + e.getValue());
	}

	public static entry rank(int[] array, int value) {
		int lo = 0;
		int hi = array.length - 1;
		while (lo <= hi) {

			int mid = (lo + hi) / 2;
			if (value < array[mid])
				hi = mid - 1; 
			
			
			else if (value > array[mid])
				lo = mid + 1;
			else
				return new entry(mid, array[mid]);
		}
		return null;
	}

	public static entry rankHard(int[] array, int value) {
		for(int i=0;i<array.length;i++){
			if(value==array[i])return new entry(i, value);
		}
		return null;
	}

}
