package com.miracler.test;

import java.util.Arrays;
import java.util.Stack;

public class ECX {
	public static void main(String[] args) {
		String[] input_s = "123,12,423,54656,7678,1,2321".split(",");
		String[] base_s = "4,2,11,13,5,18,14".split(",");
		int[] input=new int[input_s.length];
		int[] base=new int[base_s.length];
		String[] output=new String[input.length];
 		for (int i = 0; i < base.length; i++) {
			input[i]=Integer.parseInt(input_s[i]);
			base[i]=Integer.parseInt(base_s[i]);
			if(base[i]>16||base[i]<2){
				output[i]="NAN from base";
			}
		}
 		for (int i = 0; i < output.length; i++) {
 			output[i]=exc(input[i], base[i]);
		}
 		System.out.println(Arrays.toString(output));
 		

	}
	static String exc(int input,int base){
        String result=""; 
        String digths = "0123456789ABCDEF";  
        Stack<Character> s = new Stack<Character>();  
        while(input != 0){  
            s.push(digths.charAt(input%base));  
            input/=base;  
        }  
        while(!s.isEmpty()){  
        	result+=s.pop();
        }  
        return result;  
	}
}
