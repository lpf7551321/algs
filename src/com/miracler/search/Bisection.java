package com.miracler.search;

import java.util.Arrays;

import com.miracler.sort.advance.HeapSort;

public class Bisection {
	public static void main(String[] args) {
		int[] arr = new int[] { 323, 3, 65, 23, 786, 231 };
		HeapSort.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(find(arr, 3));
	}

	public static int find(int[] arr, int target) {
		int start=0,end=arr.length-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(arr[mid]<target){
				start=mid+1;
			}
			else if (arr[mid]>target) {
				end=mid;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
