package com.miracler.search.simple;

import java.util.Arrays;

import sun.security.util.Length;

public class SearchSimple {
	public static void main(String[] args) {
		int[] arr=new int[]{2,1,323,4,23};
		System.out.println(search(arr, 24));
	}
	static boolean search(int[] arr,int target){
		int len=arr.length,result=0;
		int[] arr_=new int[len+1];
		for(int i=0;i<len;i++){
			arr_[i]=arr[i];
		}
		arr_[len]=target;
		for(int i=0;i<=len;i++){
			if(target==arr_[i]){
				result=i;
				if(result<len)return true;
			}
		}
		

		return false;
	}
}
