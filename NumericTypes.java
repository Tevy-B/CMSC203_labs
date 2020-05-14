import java.util.Scanner;

/**
   This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here 
		Scanner keyboard = new Scanner(System.in);
		//identifier declarations
		final int NUMBER = 2; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		
		
		final double BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		double TempInFa;
		
		
		//Task #2 declare a variable to hold the user’s temperature
		//Task #2 prompt user to input score1
		System.out.println("Please enter your first score: ");
		score1 = keyboard.nextInt();
		//Task #2 read score1 
		System.out.println("Please enter your second score: ");
		score2 = keyboard.nextInt();
		
		//Task #2 prompt user to input score2
		//Task #2 read score2 
		// Find an arithmetic average
		
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0/9.0) * (BOILING_IN_F - 32.0);
		
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.println("Please enter another temperature in Fahrenheit: ");
	
		TempInFa = keyboard.nextInt();
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0/9.0) * (TempInFa - 32.0);
		output = TempInFa + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		//Task #2 prompt user to input another temperature
		//Task #2 read the user’s temperature in Fahrenheit
		//Task #2 convert the user’s temperature to Celsius
		//Task #2 print the user’s temperature in Celsius
		System.out.println("Goodbye"); // to show that the program is ended	
	}

	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}
}

