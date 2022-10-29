package com.aman.game;
import java.util.*;
public class Play {
	
	public int play(int attempts , int min , int max)
	{
		Scanner sc=new Scanner(System.in);
		int r=(int)(Math.random()*(max-min+1)+min);
		int guess=-1,trials=0;
		while(guess!=r)
		{
			System.out.print("Enter Your Guess : ");
			guess=sc.nextInt();
			trials++;
			if(guess==r)
			{
				System.out.println("Congrats You guessed Correctly!!!!");
				System.out.println("Your Score is "+trials+" trials...");
				break;
			}
			else if(guess<r)
			{
				System.out.println("OOPS!! The number you guessed is lower than the original number, Try to go higher...");
			}
			else
			{
				System.out.println("OOPS!! The number you guessed is higher than the original number, Try to go lower...");
			}
			if(trials>attempts)
				return -1;
		}
		return attempts-trials;
	}
	
}
