package com.miracler.basic;

public class DataStructureBasic {
	public static void main(String[] args) {
		System.out.println("isprime:"+isPrime(3));
		System.out.println("sqrt:"+sqrt(144));
		System.out.println("triangle:"+triangle(3, 4));
		System.out.println("H:"+H(3));
	}
	static public boolean isPrime(int value){
		long start=System.nanoTime(),end;
		if(value<2)return true;
		for(int i=2;i*i<value;i++){
			if(value%i==0)return false;
		}
		end=System.nanoTime();
		System.out.println(end-start);
		return true;
	}
	/**
	 * 
	 * @param value
	 * @return newtown iterator:
	 */
	static public double sqrt(double value){
		double err=1e-18;
		double t=value;
		if(t<0)return Double.NaN;
		while(Math.abs(t-value/t)>=err*t){
			t=(value/t+t)/2.0;
		}
		return t;
	}
	static public double triangle(double a,double b){
		return Math.sqrt(a*a+b*b);
	}
	static public double H(int n){
		double sum=0;
		for(int i=1;i<n+1;i++){
			sum+=(1.0/i);
		}
		return sum;
	}

}
