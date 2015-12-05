package com.miracler.basic.exervises;

public class test {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < i; j++) {
				sum += j;
			}
		}
		System.out.println(sum);
		System.out.println(intToBinaryString(256));
		System.out.println(MaxFromlog2N(127));
		System.out.println(exr1(6));
		System.out.println(mystery(2, 25));
	}

	static String intToBinaryString(int count) {
		String s = "";
		int bits = 0;
		for (int i = count; i > 0; i /= 2) {
			s = (i % 2) + s;
			bits++;
		}
		return s + ":" + bits;
	}

	static String MaxFromlog2N(int N) {
		String s = "";
		int bits = 0, count = 0;

		for (int i = N; i > 0; i /= 2) {
			bits = i % 2;
			s = bits + s;
			count++;

		}
		return (count - 1) + "";
	}

	static String exr1(int n) {
		if (n <= 0)
			return "";
		return exr1(n - 2) + n + exr1(n - 3) + n;
	}

	static int mystery(int a, int b) {
		if (b == 0)
			return 0;
		if (b % 2 == 0) {
			System.out.println("aa");
			return mystery(a + a, b / 2);
		}
		return mystery(a + a, b / 2) + a;
	}
}
