package com.miracler.basic.draw;

import com.algs4.stdlib.StdDraw;

public class SpineLine {
	public static void main(String[] args) {
		int N=100;
		StdDraw.setXscale(0,N);
		StdDraw.setYscale(0,N);
		StdDraw.setPenRadius(0.01);
		for(int i=0;i<N;i++){
			StdDraw.point(i, i);
			StdDraw.point(i, i*i);
			StdDraw.point(i, i*Math.log(i));
		}
		
	}
}
