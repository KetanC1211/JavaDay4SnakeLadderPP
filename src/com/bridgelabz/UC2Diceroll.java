package com.bridgelabz;

public class UC2Diceroll {
	public static void main(String[] args){
		int p =0;
		int dice = (int)Math.floor(Math.random()*10)%6 + 1;
		System.out.println(dice);
		System.out.println(p);
	}
}
