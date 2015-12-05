package com.miracler.basic;

import java.sql.Blob;

public class Euclidien {
	public static void main(String[] args) {
		int result=new Euclidien().gcd(12000, 1200);
		System.out.println("result:"+result);
	}
	
	
	public int gcd(int a,int b){
		int big,small;
		if(a>b){
			big=a;
			small=b;
		}else {
			big=b;
			small=a;
		}
		if(small==0)return big;
		int x=big%small;
		return gcd(small, x);
	}
}
