*Author: Darren Douglas
YourGuess.java
In this program, the computer guesses my number.
*/

import java.util.Scanner;
import java.util.Random;

public class YourGuess {
	public static void main (String[] args) {
		//Initialize number range and my guess		
		int RangeMax = 100;
		int RangeMin = 1;
		int MyNumber = 22;

		System.out.print("I hear you're thinking of a number between 1 and 100.");
		int ComputerGuess = (RangeMax+RangeMin)/2;
		System.out.println(" Is your number " + ComputerGuess + "?");	
		
		while (ComputerGuess != MyNumber) { 	
		
			if (ComputerGuess < MyNumber) { 
				System.out.println("Too small.");				
				//Update range				
				RangeMin = ComputerGuess;
				ComputerGuess = (RangeMax + RangeMin)/2;
				System.out.println("Is your number " + ComputerGuess + "?");
			}
			if (ComputerGuess > MyNumber) {
				System.out.println("Too large."); 
				//Update range				
				RangeMax = ComputerGuess;
				ComputerGuess = (RangeMax + RangeMin)/2;
				System.out.println("Is your number " + ComputerGuess + "?");
			}
			
		}
	
		System.out.println("I got it! That wasn't too hard.");
	}
}
