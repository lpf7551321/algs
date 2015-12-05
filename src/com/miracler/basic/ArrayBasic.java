package com.miracler.basic;

import java.util.Arrays;

import org.junit.Test;

public class ArrayBasic {

	public static void main(String[] args) throws Exception {
		new ArrayBasic().testMatrixMultiply();
	}
	
	/**
	 * 
	 *| @throws Exception
	 *	@function nn* nn
	 */
	@Test
	public void testMatrixMultiply() throws Exception {
		int[][] m={{1,2},{3,4}};
		System.out.println(Arrays.toString(MatrixMultiply(m, m)[0])+","+Arrays.toString(MatrixMultiply(m, m)[1]));
		
	}
	public int[][] MatrixMultiply(int[][] a,int[][] b){
		int N=a.length;
		int[][] m=new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				for (int k = 0; k <N; k++) {
					m[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return m;
	}
	@Test
	public void testReverse() throws Exception {
		int[] m={12,34,22,54,6};
		System.out.println(Arrays.toString(ReverseFromArray(m)));
	}
	public int[] ReverseFromArray(int[] array){
		int N=array.length,temp;
		for (int i = 0; i <N/2; i++) {
			temp=array[i];
			array[i]= array[N-i-1];
			array[N-i-1]=temp;
		}
		return array;
	}
	@Test
	public void testCopy() throws Exception {
		int[] m={12,34,22,54,6};
		System.out.println(Arrays.toString(CopyFromArray(m)));
		System.out.println(m==CopyFromArray(m));
	}
	public int[] CopyFromArray(int array[]){
		int N=array.length;
		int[] m=new int[N];
		for(int i=0;i<N;i++){
			m[i]=array[i];
		}
		return m;
	}
	
	@Test
	public void testAverage() throws Exception {
		int[] m={12,34,22,54,6};
		System.out.println(AverageFromArray(m));
		
	}
	
	public int AverageFromArray(int[] array){
		int total=0,N=array.length,value;
		for(int i=0;i<N;i++){
			total+=array[i];
		}
		value=total/N;
		return value;
		
	}
	
	@Test
	public void testMAX() throws Exception {
		int[] m={12,34,22,54,6};
		entry e=new ArrayBasic().MaxFromArray(m);
		System.out.println(e.getKey()+":"+e.getValue());
		
	}

	public entry MaxFromArray(int[] array) {
		int index = 0, max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		entry e = new entry(index, max);
		return e;

	}

}
