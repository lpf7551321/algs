package com.miracler.string;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import sun.tools.jar.resources.jar;

import com.sun.istack.internal.Builder;
import com.sun.org.apache.regexp.internal.recompile;
import com.sun.swing.internal.plaf.metal.resources.metal;

public class KMP {
	
	static int dfa[][];
	
	
	public static void main(String[] args) {
		String txt=args[0];
		String pat=args[1];
		System.out.println("m:"+pat);
		System.out.println(find(txt, pat));
	}
	public static void buildDFA(String pat) {
		int M=pat.length(),R=256;
		dfa=new int[R][M];
		int X=0;
		dfa[pat.charAt(0)][0]=1;
		for(int j=0;j<M;j++){
			for(int r=0;r<R;r++){
				dfa[r][j]=dfa[r][X];
			}
			dfa[pat.charAt(j)][j]=j+1;
			X=dfa[pat.charAt(j)][X];
		}
	}
	public static int find(String txt,String pat){
		buildDFA(pat);
		int N=txt.length(),M=pat.length();
		int i=0,j=0;
		for(i=0,j=0;i<N&&j<M;i++ ){
			j=dfa[txt.charAt(i)][j];
		}
		if(j==M)return i-M;
		return N;
	}
}
