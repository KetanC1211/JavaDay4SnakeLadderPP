package com.bridgelabz;

public class UC4NonZero{
  public static final int ladder = 1;
  public static final int snake = 2;
  public static final int noPlay = 3;
  
  public static void main(String[] args)
  {
    int p = 0;
    while (p <= 100)
    {
      int dice = (int)Math.floor(Math.random() * 10.0D) % 6 + 1;
      int instruction = (int)Math.floor(Math.random() * 10.0D) % 3 + 1;
      if (p == 100)
      {
        System.out.println("You Won the Game ");
        break;
      }
      switch (instruction)
      {
      case 1: 
        if (p + dice <= 100) {
          p += dice;
        }
        break;
      case 2: 
        if (p - dice >= 0) {
          p -= dice;
        }
        break;
      case 3: 
        p += 0;
      }
      System.out.println("Position of Player is " + p);
    }
  }
}
