package com.miracler.string;

public class StringFind {
	public static void main(String[] args) {
		String txt=args[0];
		String pat=args[1];
		System.out.println(find(txt, pat));
	}
	public static int  find(String txt,String pat) {
		int N=txt.length(),M=pat.length();
		int i=0,j=0;
		for(i=0,j=0;i<N&&j<M;i++){
			if(txt.charAt(i)==pat.charAt(j))j++;
			else {
				i-=j;
				j=0;
			}
		}
		if(j==M)return i-M;
		else return N;
	}
}
