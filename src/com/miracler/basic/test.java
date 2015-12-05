package com.miracler.basic;

public class test {
	public static void main(String[] args) {
		int numbers[] = new int[] { 2, 7, 11, 15 }, target = 9;

		int s[] = new test().twoSum(numbers,target);
		System.out.println("index1=" + s[0] + ",index2=" + s[1]);
	}

	public int[] twoSum(int[] nums, int target) {
		int N = nums.length;
		int results[] = new int[2];
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (nums[i] + nums[j] == target) {
					results[0] = i+1;
					results[1] = j+1;
					break;
				}
			}
		}
		return results;
	}

}
