package co.grandcircus.Lab6;

import java.util.Random;
import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		
		//Declares variables and creates scanner
		Scanner scnr = new Scanner(System.in);
		int numSides;
		int count = 1;
		int numDie1;
		int numDie2;
		String rollAgain;
		String message;
		
		//Welcomes user, with an extra line before next part
		System.out.println("Welcome to the Fabulous Grand Circus Casino!\n");
		
		//Prompts user to enter number of sides for the dice
		System.out.println("How many sides should each die have?");
		numSides = scnr.nextInt();
		
		//Loop iterates as long as user wishes to continue
		do {
			//Prints and updates count of rolls
			System.out.println();
			System.out.println("Roll " + count  + ":");
			count++;
			
			//Calls getRandom method to generate random number
			numDie1 = getRandomInt(numSides);
			numDie2 = getRandomInt(numSides);
			
			//Calls namesofRolls from my DiceRollerApp class and assigns it to message
			message = DiceRollerApp.namesOfRolls(numDie1, numDie2);
			
			//Prints out the results of the dice roll
			System.out.println(numDie1);
			System.out.println(numDie2);
			
			//Prints message if message is not empty
			if (!message.equals("")) {
			System.out.println(message);
			System.out.println();
			}
			
			else {
				System.out.println();
			}
			
			//Prompts user to continue or exit
			System.out.println("Are you feeling lucky? (y/n)");
			rollAgain = scnr.next();
			
			//if user chooses not to continue, gives number of times dice were rolled and exits
			if (rollAgain.toLowerCase().startsWith("n")) {
				count--;
				System.out.println("Wow! You rolled " + count + " time(s). Thanks for playing! Goodbye.");
			}
		}
		while (rollAgain.toLowerCase().startsWith("y"));
		
		//Closes scanner to prevent memory leaks
		scnr.close();

	}
	
	//Method to get random number
	
	//Accepts maximum desired number as parameter and returns a "random" int
	public static int getRandomInt(int maxNum) {
		
		//Creates new instance of Random class of java.util
		Random randomNum = new Random();
		
		//Returns the next random integer, from 0 to the maximum desired number
		//Added 1 because nextInt() is non-inclusive of the upper bound, but inclusive of 0 (no 0 on dice)
		return randomNum.nextInt(maxNum) + 1;
	}

}
