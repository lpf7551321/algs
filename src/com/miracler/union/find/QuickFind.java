package com.miracler.union.find;

import com.algs4.stdlib.StdIn;

//through test by miracler

public class QuickFind {
	static int[] id;
	static int count;

	public QuickFind(int N) {
		count=N;
		id=new int[N];
		for (int i = 0; i < count; i++) {
			id[i]=i;
		}
	}

	public static int find(int p) {
		return id[p];
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
		for(int i=0;i<count;i++){
			if(id[i]==qID)id[i]=pID;
		}
		count--;
	}

	public static void main(String[] args) {
		int N=StdIn.readInt();
		QuickFind qf=new QuickFind(N);
		
		long start=System.nanoTime();
		while (!StdIn.isEmpty()) {
			int p=StdIn.readInt();
			int q=StdIn.readInt();
			union(p, q);
		}
		System.out.println("components:"+count);
		long tim=System.nanoTime()-start;
		System.out.println(tim+" ms");
	}

}
