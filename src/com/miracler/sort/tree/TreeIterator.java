package com.miracler.sort.tree;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.hamcrest.core.Is;

import sun.reflect.generics.tree.Tree;


public class TreeIterator {
	static List<TreeNode> nodes=new LinkedList<TreeNode>();
	public TreeIterator(int N) {
	}
	public static void createTree(int N) {
		for(int i=0;i<N;i++){
			nodes.add(new TreeNode(i, null, null));
		}
		int  parentNode=N/2;
		for(int k=0;k<=parentNode-1;k++){
			nodes.get(k).leftChild=nodes.get(2*k+1);
			nodes.get(k).rightChild=nodes.get(2*k+2);
		}
		
		int lastParentNod=parentNode/2-1;
		nodes.get(lastParentNod).leftChild=nodes.get(lastParentNod*2+1);
		if(nodes.get(lastParentNod*2+2)!=null){
			nodes.get(lastParentNod).rightChild=nodes.get(lastParentNod*2+2);
		}
			
		
	}
	public static void preTraverse(TreeNode node) {
		if(node!=null){
			System.out.print(node.data);
		}
		else {
			return ;
		}
		preTraverse(node.leftChild);
		preTraverse(node.rightChild);
	
	}
	public static void inTraverse(TreeNode node) {
		if(node==null){
			return;
		}
		
		inTraverse(node.leftChild);
		System.out.print(node.data);
		inTraverse(node.rightChild);
	}
	public static void postTraverse(TreeNode node) {
		if(node==null){
			return;
		}
		postTraverse(node.leftChild);
		postTraverse(node.rightChild);
		System.out.print(node.data);
	}
	
	public static void main(String[] args) {
		createTree(9);
		Iterator<TreeNode> it=nodes.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().data);
		}
		TreeNode root=nodes.get(0);
		System.out.println("前序遍历");
		preTraverse(root);
		System.out.println("");
		System.out.println("中序遍历");
		inTraverse(root);
		System.out.println("");
		System.out.println("后序遍历");
		postTraverse(root);
		
		
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
