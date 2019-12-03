package arrayclass;

import java.util.Scanner;
import java.util.Random;

public class arrayclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
Random rnd = new Random();
		
		//create empty array of size 5
		//array index is 0 to 4
			int[] key = new int[5];
			//System.out.println("What is the score of");
			//key[0] = keyboard.nextInt();
			
			key[0] = 1;
			key[1] = 999;
			key[2] = 3;
			key[3] = 11;
			key[4] = 12;
			System.out.println("The value in index 1 = " + key[1]);
	
			for(int i = 0;i<key.length;i++)
			{
				System.out.println("Index " + i + " contains " + key[i]);
			}
	
			
			//Declare variables and collect input
			int arraySize=0;
			System.out.print("How many sections do you want to play?");
			arraySize = keyboard.nextInt();
			int[] scores = new int[arraySize];
			int totalScore = 0;
			
			for(int i =0;i<arraySize;i++)
			{
				
				scores[i] = rnd.nextInt(1000);
				System.out.println("Section " +(i+1) +" Scores: " + scores[i]);
				totalScore = totalScore + scores[i];
				
			}
			System.out.println("Total Score" + totalScore);
	
	}
	

}
