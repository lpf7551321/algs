package com.miracler.sort.advance;

import java.util.Arrays;

public class HeapSort2 {

	public static void sort(int[] data) {
		// ��������
		buildMaxHeap(data);
		// ѭ����ÿ�ΰѸ��ڵ�����һ���ڵ����λ��
		for (int i = data.length; i > 1; i--) {
			int tmp = data[0];
			data[0] = data[i - 1];
			data[i - 1] = tmp;

			// �ѵĳ��ȼ���1���ų��û������λ�õĸ��ڵ�
			maxHeapify(data, 1, i - 1);
		}
	}

	// �����������鹹��һ������
	private static void buildMaxHeap(int[] data) {
		for (int i = data.length / 2; i > 0; i--) {
			maxHeapify(data, i, data.length);
		}
	}

	// �ѵ�����ʹ����������

	private static void maxHeapify(int[] data, int parentNodeIndex,
			int heapSize) {
		// ���ӽڵ�����
		int leftChildNodeIndex = parentNodeIndex * 2;
		// ���ӽڵ�����
		int rightChildNodeIndex = parentNodeIndex * 2 + 1;
		// ���ڵ�����
		int largestNodeIndex = parentNodeIndex;

		// ������ӽڵ���ڸ��ڵ㣬�����ӽڵ���Ϊ���ڵ�
		if (leftChildNodeIndex <= heapSize
				&& data[leftChildNodeIndex - 1]
						<(data[parentNodeIndex - 1]) ) {
			largestNodeIndex = leftChildNodeIndex;
		}

		// ������ӽڵ�����ڵ㻹����ô���ڵ�Ӧ�������ӽڵ�
		if (rightChildNodeIndex <= heapSize
				&& data[rightChildNodeIndex - 1]
						<(data[largestNodeIndex - 1])) {
			largestNodeIndex = rightChildNodeIndex;
		}

		// ���������ڵ�͸��ڵ㲻һ�£��򽻻����ǵ�ֵ
		if (largestNodeIndex != parentNodeIndex) {
			int tmp = data[parentNodeIndex - 1];
			data[parentNodeIndex - 1] = data[largestNodeIndex - 1];
			data[largestNodeIndex - 1] = tmp;

			// �����길�ڵ���ӽڵ��ֵ���Ի���ֵ���ӽڵ����Ƿ�������ѵ�����
			maxHeapify(data, largestNodeIndex, heapSize);
		}
	}
	public static void main(String[] args) {
		int[] arr=new int[]{323,3,65,23,786,231};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
