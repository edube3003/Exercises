package chapter4;

import java.util.Scanner;

public class AddNumbers {
	
	public static void main (String [] args) {
		boolean again = false;
		Scanner scanner = new Scanner (System.in);
		
		do {
				System.out.println("Enter the first number:");
				double num1 = scanner.nextDouble();	
				
				System.out.println("Enter the second number:");
				double num2 = scanner.nextDouble();
				
				double sum = num1+num2;
				System.out.println("The sum of " + num1 + " and "+ num2 + " is "+sum+ ".");
				
				System.out.println("Would you like to do that again?");
				again = scanner.nextBoolean();
				
		} while(again);
		scanner.close();
	}

}
