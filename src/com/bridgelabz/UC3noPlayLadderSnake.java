package com.bridgelabz;

public class UC3noPlayLadderSnake {
	public static final int ladder=1;
	public static final int snake=2;
	public static final int noPlay=3;

	public static void main(String[] args){
		int p=0;//position of player

		while(p<=100) {
			if(p==100) {
				break;
			}
			int dice = (int)Math.floor(Math.random()*10)%6 + 1;
			int instruction = (int)Math.floor(Math.random()*10)%3 + 1;
			
			//Case Statements
			switch(instruction){
			case ladder:
				p=p+dice;
				break;
			case snake:
				p=p-dice;
				break;
			case noPlay:
				p=p+0;
				break;
			}
			System.out.println("Position of Player is " +p);
		}
	}
}
