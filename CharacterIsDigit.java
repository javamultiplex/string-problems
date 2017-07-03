package com.javamultiplex.string;


import java.util.InputMismatchException;
import java.util.Scanner;

public class CharacterIsDigit
{
	/*
	 * There are 2 ways to check whether particular character is digit or not.
	 * 1) using isDigit(char c) method of Character class.
	 * 2) using ASCII values and regular expression.
	 * 
	 * Here we are looking into 2nd way.
	 */
	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter any character : ");
			char character=input.next(".").charAt(0);
			/*
			 * Regular expression that matches a string contains only one digit [0-9]
			 */
			String pattern="[0-9]";       
			/*Getting ASCII value of character.
			 *For example : ASCII value of A is 65, Z is 90, 0 is 48, 9 is 57 etc.
			 */
			int ascii=character;          
			int value=ascii-48;			
			String valueInString=String.valueOf(value); // Converting int to String.
			if(valueInString.matches(pattern))
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
