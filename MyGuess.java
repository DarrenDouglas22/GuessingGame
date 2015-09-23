/*Author: Darren Douglas
MyGuess.java
In this program, I guess the computer's number.
*/

import java.util.Scanner;
import java.util.Random;

public class MyGuess {
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
	
		//Generate random number
		Random rand = new Random();
		int number = rand.nextInt(100)+1;
		int guess;

		//Keep track of how many guesses it takes
		int attempts = 1;

		System.out.print("I'm thinking of a number between 1 and 100. Your guess: ");
		guess = reader.nextInt();

		while (guess != number) { 	
		
			if (guess < number) 
				System.out.println("Too small");
			
			if (guess > number) 
				System.out.println("Too large");

			System.out.print("Guess again: ");
			guess = reader.nextInt();
			
			attempts += 1;
		}
	
		System.out.println("You got it! It only took you " + attempts + " attempts.");
	}
}
