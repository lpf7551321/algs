package com.miracler.sort.tree;

public class TreeNode {
	TreeNode leftChild;
	TreeNode rightChild;
	int data;
	public TreeNode(int data,TreeNode left,TreeNode right) {
		this.data=data;
		this.leftChild=left;
		this.rightChild=right;
	}
}
