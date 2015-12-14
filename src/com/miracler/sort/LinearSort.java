package com.miracler.sort;

import java.util.Arrays;

import sun.security.krb5.KdcComm;

public class LinearSort {
	public static void main(String[] args) {
		int[] arr=new int[]{60,35,81,98,14,47,2,2};
		System.out.println(Arrays.toString(linearsort(arr)));
	}
	
	/**
	 * stable and linear
	 */
	public static int[] linearsort(int arr[]){
		int length=arr.length;
		int[]count=new int[length],s=new int[length];
		for(int i=0;i<length-1;i++){
			for(int j=i+1;j<length;j++){
				if(arr[i]<arr[j])count[j]++;
				else {
					count[i]++;
				}
			}
		}
		for(int i=0;i<length;i++){
			s[count[i]]=arr[i];
		}
		
		
		
		return s;
	}
	/**
	 * int length=arr.length;
		int count[]=new int[length];
		int s[] =new int[length];
		for(int i=0;i<length-1;i++){
			for (int j = i+1; j <length; j++) {
				if(arr[i]<arr[j])count[j]++;
				else {
					count[i]++;
				}
			}
		}
		for(int k=0;k<length;k++){
			s[count[k]]=arr[k];
		}
		
		return s;
	 */
}
