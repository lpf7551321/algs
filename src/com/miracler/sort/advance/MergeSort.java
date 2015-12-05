package com.miracler.sort.advance;

import java.util.Arrays;

public class MergeSort {
	static int[] aux;
	
	public MergeSort(int[] arr) {
		int length=arr.length;
		aux=new int[length];
		sort(arr, 0, length-1);
		
	}
	public static void sort(int[] arr ,int lo,int hi){
		if(lo>=hi)return;
		int mid=lo+(hi-lo)/2;
		sort(arr, lo, mid);
		sort(arr, mid+1, hi);
		merge(arr, lo, mid, hi);
	}
	public static void merge(int[] arr,int lo,int mid,int hi) {
		int i=lo,j=mid+1;
		for(int k=lo;k<=hi;k++){
			aux[k]=arr[k];
		}
		
		for(int k=lo;k<=hi;k++){
			if(i>mid)arr[k]=aux[j++];
			else if(j>hi)arr[k]=aux[i++];
			else if(aux[i]<aux[j])arr[k]=aux[i++];
			else {
				arr[k]=aux[j++];
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr=new int[]{3234,323,1,65,23,786,231};
		new MergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
}
