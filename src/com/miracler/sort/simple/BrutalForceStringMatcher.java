package com.miracler.sort.simple;

import java.util.Arrays;

public class BrutalForceStringMatcher {
	public static void main(String[] args) {
		System.out.println(macther("lpf is a good man", "an"));
		
	}
	/**
	 * 
	 * @param arr
	 * @param target
	 * @return 
	 */
	
	static boolean macther(String arr, String target) {
		char[] arr_ = new char[arr.length()];
		char[] target_ = new char[target.length()];
		for (int i = 0; i < arr.length(); i++) {
			arr_[i] = arr.charAt(i);
		}
		for (int i = 0; i < target.length(); i++) {
			target_[i] = target.charAt(i);
		}
		// start

		for (int i = 0; i <= arr_.length - target_.length; i++) {
			int counter = 0;
			for (int j = 0; j < target_.length; j++) {
				if (arr_[j+i] == target_[j]) {
					counter++;
				}
			}
			if(counter==target_.length)return true;
		}

		return false;
	}
}
