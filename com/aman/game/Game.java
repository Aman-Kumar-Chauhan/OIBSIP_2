package com.aman.game;

public class Game {

	public static void main(String[] args) {
		
		Play play=new Play();
		System.out.println("--:: Welcome to Guess The Number ::--");
		int flag=1;
		int round=1,min=1,max=100,attempts=10,score=0;
		while(flag!=-1)
		{
			System.out.println("This is Round "+round);
			System.out.println("You have to guess the number in range "+min+" to "+max+" in "+attempts+" attempts...");
			flag=play.play(attempts, min, max);
			if(flag!=-1)
			{
				round++;
				max+=50;
				attempts-=2;
				score+=round*flag*10;
			}
		}
		System.out.println("Thanks For Playing!!!! Your final score is "+score);
	}
}
