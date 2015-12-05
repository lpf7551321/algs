package com.miracler.hanoi;

public class Hanoi {
	public static void main(String[] args) {
		move("a", "c", "b", 3);
	}
	
	static void move(String from,String to,String help,int n){
		if(n==1){
			System.out.println(from+" move to "+to);
			return;
		}
		move(from, help, to, n-1);
		System.out.println(from+" move to "+to);
		move(help, to, from, n-1);
	}
}
