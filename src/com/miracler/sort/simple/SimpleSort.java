package com.miracler.sort.simple;

import java.util.Arrays;

public class SimpleSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 3,2, 1, 323, 4, 23,100 };
		System.out.println(Arrays.toString(BubbleSort(arr)));
		System.out.println(Arrays.toString(SelectedSort(arr)));
		System.out.println(Arrays.toString(insertSort(arr)));

	}

	public static int[] insertSort(int[] arr) {
		int length=arr.length;
		for(int i=0;i<length-1;i++){
			for(int j=length-1;j>i;j--){
				if(arr[j]<arr[i])swap(arr, i, j);
			}
		}
		return arr;
	}

	/**
	 * ����n-2�֣�ÿ��n-2-i�εıȽϣ�����ķ��ں���
	 * 
	 * @param arr
	 * @return key swap n^2-times value swap n^2-times
	 */
	static int[] BubbleSort(int[] arr) {
		int length=arr.length;
		for(int i=0;i<length-1;i++)
			for(int j=0;j<length-1-i;j++){
				if(arr[j+1]<arr[j])swap(arr, j, j+1);
			}
		return arr;
	}

	/**
	 * 
	 * @param arr
	 *            ��i�Ժ��Ԫ��һ������i�Ƚϣ���С�ķ���ǰ��
	 * @return key swap n-times value swap n^2-times
	 */

	static int[] SelectedSort(int[] arr) {
		int length = arr.length;
		int min=0;
		for(int i=0;i<length-1;i++){
			min=i;
			for(int j=i+1;j<length;j++){
				if(arr[i]>arr[j])min=j;
			}
			swap(arr, min, i);
		}
		return arr;
	}

	static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	/*
	 * 
	 */
}
