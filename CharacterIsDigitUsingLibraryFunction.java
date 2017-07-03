package com.javamultiplex.string;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CharacterIsDigitUsingLibraryFunction {

	/*
	 * There are 2 ways to check whether particular character is digit or not.
	 * 1) using isDigit(char c) method of Character class.
	 * 2) using ASCII values and regular expression.
	 * 
	 * Here we are looking into 1st way.
	 */
	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter any character : ");
			char character=input.next(".").charAt(0);
			if(Character.isDigit(character))
			{
				System.out.println("Character is a digit.");
			}
			else
			{
				System.out.println("Character is not a digit.");
			}

		} catch(InputMismatchException exception){
			System.out.println("Please enter valid character");
		}finally {
			if (input != null) {
				input.close();
			}
		}

	}
}
