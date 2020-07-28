package chapter4;

import java.util.Scanner;

public class LetterSearch {
	
	public static void main (String [] ergs) {
		
		// Get text
		
		System.out.println("Enter some text");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();
		// Find out how long the text is
		boolean letterFound = false;
		
		for(int i=0;i<input.length();i++) {
			char currentLetter = input.charAt(i);
			if (currentLetter=='A'||currentLetter=='a') {
				letterFound = true;
				break;
			}
		
		}
		
		if (letterFound ==true) {
			System.out.println("This text contains the letter A.");
		}
		else 
			System.out.println("This text does not contain the letter A");
		
	}

}
