package com.miracler.basic.draw;

import java.util.Arrays;

import com.algs4.stdlib.StdDraw;
import com.algs4.stdlib.StdRandom;

public class Rectangle {

	public static void main(String[] args) {
		randomArraySorted();
		randomArray();
	}

	public static void randomArray() {
		int n = 50;
		double[] a = new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = StdRandom.random();
		}
		StdDraw.setPenColor(StdDraw.BLACK);
		for (int i = 0; i < n; i++) {
			double x = 1.0 * i / n;
			double y = a[i] / 2;
			double rw = 0.5 / n;
			double rh = y;
			StdDraw.filledRectangle(x, y, rw, rh);

		}
	}

	public static void randomArraySorted() {
		int n = 50;
		double[] a = new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = StdRandom.random();
		}
		Arrays.sort(a);
		StdDraw.setPenColor(StdDraw.BLUE);
		for (int i = 0; i < n; i++) {
			double x = 1.0 * i / n;
			double y = a[i] / 2;
			double rw = 0.5 / n;
			double rh = y;
			StdDraw.filledRectangle(x, y, rw, rh);

		}
	}
}
