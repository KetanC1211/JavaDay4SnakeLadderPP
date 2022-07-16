package com.bridgelabz;

public class UC6DiceCountingTillWin {
	public static final int ladder=1;
	public static final int snake=2;
	public static final int noPlay=3;

	public static void main(String[] args){
		int p=0;//position of player
		int i=0;//used for counter

		while(p<=100) {
			i++;//counter for dice
			int dice = (int)Math.floor(Math.random()*10)%6 + 1;
			int instruction = (int)Math.floor(Math.random()*10)%3 + 1;
			if(p==100) {
				break;
			}
			System.out.println("instruction "+instruction+",Dice = "+dice+",dice count "+i+" time");
			switch(instruction){
			//Case Statements
			case ladder://instruction 1
				if(p+dice>100){
					break;
				}
				p=p+dice;
				break;
			case snake://instruction 2
				if(p-dice<0){
					break;
				}
				p=p-dice;
				break;
			case noPlay://instruction 3
				p=p+0;
				break;
			}
			System.out.println("Position of Player is "+p);
		}
}
}