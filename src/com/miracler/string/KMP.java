package com.miracler.string;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import sun.tools.jar.resources.jar;

import com.sun.istack.internal.Builder;
import com.sun.org.apache.regexp.internal.recompile;

public class KMP {
	
	static int dfa[][];
	
	
	public static void main(String[] args) {
		String txt=args[0];
		String pat=args[1];
		System.out.println(find(txt, pat));
	}
	public static void buildDFA(String pat) {
		int M=pat.length(),R=256;
		dfa=new int[R][M];
		dfa[pat.charAt(0)][0]=1;
		int X=0;
		for(int i=0;i<M;i++){
			for (int r = 0; r < R; r++) {
				dfa[r][i]=dfa[r][X];
			}
			dfa[pat.charAt(i)][i]=i+1;
			X=dfa[pat.charAt(i)][X];
		}
	}
	public static int find(String txt,String pat){
		buildDFA(pat);
		int n=txt.length(),m=pat.length();
		int i,j;
		for(i=0,j=0;i<n&&j<m;i++){
			if(txt.charAt(i)==pat.charAt(j))
				j=dfa[pat.charAt(j)][j];
		}
		if(j==m)return i-m;
		return  n;
	}
}
