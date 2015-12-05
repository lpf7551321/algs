package com.miracler.sort.advance;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr=new int[]{43,323,1,65,23,786,231};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] arr,int lo,int hi){
		if(lo>=hi)return;
		int j=partition(arr, lo, hi);
		sort(arr, lo, j);
		sort(arr, j+1, hi);
	}
	
	public static int partition(int[] arr,int lo,int hi) {
		int i=lo,j=hi;
		int length=arr.length;
		int value=arr[lo];
		while(true){
			while(arr[++i]<value){if(i==hi)break;}
			while(arr[--j]>value){if(j==lo)break;}
			if(i>=j)break;
			swap(arr, j, i);
		}
	
		swap(arr, j, lo);
		return j;
	}
	public static void swap(int[] arr,int a,int b){
		int tmp=arr[a];
		arr[a]=arr[b];
		arr[b]=tmp;
	}
	

}
