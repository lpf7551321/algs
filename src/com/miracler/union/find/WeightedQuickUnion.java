package com.miracler.union.find;

import java.util.Iterator;

import com.algs4.stdlib.StdIn;

public class WeightedQuickUnion {
	static int[] id;
	static int count;
	static int[] sizeofroot;

	public WeightedQuickUnion(int N) {
		count = N;
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
		sizeofroot=new int[N];
		for(int i=0;i<N;i++)sizeofroot[i]=1;
	}
	
	
	public static int find(int p) {
		while (p!=id[p]) {
			p=id[p];
		}
		return p;
	}

	public static boolean connected(int p,int q) {
		return find(p)==find(q);
	}
	/**
	 * 
	 * @param p
	 * @param q
	 * 将q联通到p的根触点上
	 */
	
	public static void union(int p,int q) {
		int pID=find(p);
		int qID=find(q);
		if(pID==qID)return;
		if(sizeofroot[p]>sizeofroot[q]){
			id[q]=pID;
			sizeofroot[p]+=sizeofroot[q];
		}
		else {
			id[p]=qID;
			sizeofroot[q]+=sizeofroot[p];
		}
			
		count--;
	}
	public static void main(String[] args) {
		int N=StdIn.readInt();
		WeightedQuickUnion qf=new WeightedQuickUnion(N);
		long start=System.nanoTime();
		while(!StdIn.isEmpty()){
			int p=StdIn.readInt();
			int q=StdIn.readInt();
			qf.union(p, q);
			
		}
		System.out.println("components:"+qf.count);
		long tim=System.nanoTime()-start;
		System.out.println(tim+" ms");
	}

}
