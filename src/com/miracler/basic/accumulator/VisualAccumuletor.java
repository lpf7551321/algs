package com.miracler.basic.accumulator;

import java.awt.Color;
import java.util.HashMap;

import com.algs4.stdlib.In;
import com.algs4.stdlib.StdDraw;
import com.algs4.stdlib.StdRandom;

public class VisualAccumuletor {
	double sum;
	int count;

	public VisualAccumuletor(int trail, double max) {
		StdDraw.setXscale(0, trail);
		StdDraw.setYscale(0, max);
		StdDraw.setPenRadius(.005);
	}

	public double mean() {
		return sum / count;
	}

	public void add( double y) {
		count++;
		sum += y;
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.point(count, y);
		StdDraw.setPenColor(Color.RED);
		StdDraw.point(count, sum / count);
	}

	@Override
	public String toString() {
		return "mean :" + this.mean();
	}
	public static void main(String[] args) {
		int count= Integer.parseInt(args[0]);
		VisualAccumuletor accumulator=new VisualAccumuletor(count, 1.0);
		for (int i = 0; i < count; i++) {
			accumulator.add( StdRandom.random());
		}
		System.out.println( accumulator.mean());
	}

}
