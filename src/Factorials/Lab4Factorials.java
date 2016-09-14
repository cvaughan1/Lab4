package Factorials;

import java.util.Scanner;

public class Lab4Factorials {

	public static void main(String[] args) {
			
		//Recursion strategy
		
		System.out.println("Welcome to the Grand Circus Factorial Calculator!");
		System.out.println();
		String choice = "y";
		
		while (choice.equals("y")) {
		
		System.out.println("Enter an integer between 0 and 10");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = factorial(n);
		
	
		
		
		System.out.println("The factorial of " + n + " is " + result);
		
		
		
	// Continue block

	System.out.print("Continue? (y/n): ");
	choice = sc.next();
	System.out.println();

		
				}	
		
		

}//pvsm


private static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
	
		}//else
}//end method



}//class
