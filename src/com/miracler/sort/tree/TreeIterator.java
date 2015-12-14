package com.miracler.sort.tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.hamcrest.core.Is;

import com.sun.org.apache.xpath.internal.axes.NodeSequence;

import sun.reflect.generics.tree.Tree;


public class TreeIterator {
	static List<TreeNode> trees=new LinkedList<TreeNode>();
	
	static public void createTree(int n){
		for(int i=0;i<n;i++){
			trees.add(new TreeNode(i, null, null));
		}
		for(int k=0;k<n/2-1;k++){
			trees.get(k).leftChild=trees.get(k*2+1);
			trees.get(k).rightChild=trees.get(k*2+2);
		} 
		
	
		int parentNode=n/2;
		trees.get(parentNode-1).leftChild=trees.get((parentNode-1)*2+1);
		if(trees.get((parentNode-1)*2+2)!=null){
			trees.get(parentNode-1).rightChild=trees.get((parentNode-1)*2+2);
		}
	}
	public static void main(String[] args) {
		createTree(9);
		preTraverse(trees.get(0));
		System.out.println();
		postTraverse(trees.get(0));
		System.out.println();
		midTraverse(trees.get(0));
	}
	
	static void preTraverse(TreeNode node){
		if(node!=null){
			System.out.print(node.data);
		}
		else {
			return;
		}
		preTraverse(node.leftChild);
		preTraverse(node.rightChild);
	}
	static public void postTraverse(TreeNode node){
		if(node==null){
			return ;
		}
		postTraverse(node.leftChild);
		postTraverse(node.rightChild);
		System.out.print(node.data);
	}
	
	static public void midTraverse(TreeNode node){
		if(node==null){
			return;
		}
		midTraverse(node.leftChild);
		System.out.print(node.data);
		midTraverse(node.rightChild);
	}
	
	
	/**
	 * 	for(int i=0;i<N;i++){
			nodes.add(new TreeNode(i, null, null));
		}
		
		for(int parentInde=0;parentInde<N/2-1;parentInde++){
			nodes.get(parentInde).leftChild=nodes.get(parentInde*2+1);
			nodes.get(parentInde).rightChild=nodes.get(parentInde*2+2);
		}
	
		int parentIndex=N/2-1;
		nodes.get(parentIndex).leftChild=nodes.get(parentIndex*2+1);
		if(nodes.get(parentIndex*2+2)!=null){
			nodes.get(parentIndex).rightChild=nodes.get(parentIndex*2+2);
		}
		
			if(node!=null){
			System.out.print(node.data);
		}else {
			return;
		}
		preTraverse(node.leftChild);
		preTraverse(node.rightChild);
	 * 
	 */
}
