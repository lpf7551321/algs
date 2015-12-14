package com.miracler.sort.advance;

import java.util.Arrays;

public class HeapSort {
	public static void sink(int[] arr, int parentNode, int n) {
		int maxNode=parentNode,leftNode=2*parentNode,rightNode=parentNode*2+1;
		if(leftNode<=n&&arr[leftNode-1]>arr[maxNode-1]){
			maxNode=leftNode;
		}
		if(rightNode<=n&&arr[rightNode-1]>arr[maxNode-1]){
			maxNode=rightNode;
		}
		if(maxNode!=parentNode){
			swap(arr, parentNode-1, maxNode-1);
			sink(arr, parentNode, n);
		}
		
	}
	public static void sink2(int[] arr, int parentNode,int n){
		int leftNode=parentNode*2,rightNode=parentNode*2+1,minNode=parentNode;
		if(leftNode<=n&&arr[leftNode-1]<arr[minNode-1]){
			minNode=leftNode;
		}
		if(rightNode<=n&&arr[rightNode-1]<arr[minNode-1]){
			minNode=rightNode;
		}
		if(minNode!=parentNode){
			swap(arr, parentNode-1, minNode-1);
			sink2(arr, parentNode, n);
		}
		
	}
	
	
	public static int max(int[] arr) {
		buildHeap(arr);
		return arr[0];
	}
	
	public static int min(int[] arr){
		buildHeap2(arr);
		return arr[0];
	}


	//ÉýÐò
	public static void buildHeap(int[] arr) {
		int length=arr.length;
		for(int i=length/2;i>0;i--){
			sink(arr, i, length);
		}
	}
	public static void buildHeap2(int[] arr) {
		int length=arr.length;
		for(int i=length/2;i>0;i--){
			sink2(arr, i, length);
		}
	}
	

	public static void sort(int[] arr) {
		int length=arr.length;
		while (length>0) {
			swap(arr, 0, --length);
			sink(arr,1, length);
		}
	}
	
	public static void sort2(int[] arr) {
		int length=arr.length;
		while (length>0) {
			swap(arr, 0, --length);
			sink2(arr, 1, length);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 323, 3, 65, 23, 786, 231,2};
		//System.out.println(min(arr));
		buildHeap(arr);
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	public static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	

}
