package com.miracler.sort.advance;

import java.util.Arrays;

import edu.princeton.cs.algs4.Alphabet;
import sun.misc.Sort;

public class QuickThree {
	public static void main(String[] args) {
		
		int[] arr=new int[]{43,323,1,65, 64,786,231};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		int[] a=new int[3];
	}
	public static void sort(int[] arr,int lo,int hi) {
		if(lo>=hi)return ;
		int lt=lo,gt=hi,i=lo+1;
		int value=arr[lo];
		while (i<=gt) {
			if(arr[i]<value)swap(arr, i++, lt++);
			else if(arr[i]>value)swap(arr, gt--, i);
			else{
				i++;
			}
		}
		sort(arr, lo, lt-1);
		sort(arr, gt+1, hi);
	}
	public static void swap(int[] arr,int a,int b){
		int tmp=arr[a];
		arr[a]=arr[b];
		arr[b]=tmp;
	}
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 	if(lo>=hi)return;
		int length=arr.length;
		int lt=lo,i=lo+1,gt=hi;
		int value=arr[lo];
		while (i<=gt) {
			if(arr[i]<value)swap(arr, lt++, i++);
			else if(arr[i]>value)swap(arr, gt--, i);
			else {
				i++;
			}
			
		}
		
		sort(arr, lo, lt-1);
		sort(arr, gt+1, hi);
	 * 
	 */
	

}
