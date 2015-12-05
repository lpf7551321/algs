package com.miracler.union.find;

import com.algs4.stdlib.StdIn;

public class QuickUnion {
	
	static int[] id;
	static int count;

	public QuickUnion(int N) {
		count = N;
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	//找出分连通量p的根触点
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
		if(qID==pID)return;
		id[qID]=pID;
		count--;
	}
	public static void main(String[] args) {
		int N=StdIn.readInt();
		QuickUnion qf=new QuickUnion(N);
		long start=System.nanoTime();
		while(!StdIn.isEmpty()){
			int p=StdIn.readInt();
			int q=StdIn.readInt();
			qf.union(p, q);
			
		}
		System.out.println("components:"+count);
		long tim=System.nanoTime()-start;
		System.out.println(tim+" ms");
	}
	
}
