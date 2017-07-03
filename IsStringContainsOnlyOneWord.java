package com.javamultiplex.string;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category Date and Time
 * @problem Check whether string contains one or more words.
 *
 */
public class IsStringContainsOnlyOneWord {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter String : ");
			String string = input.nextLine();
			string = string.trim();
			/*
			 * Regular expression that matches a string contains only
			 * non-whitespace characters.
			 */
			String pattern = "^[\\S]+$";
			if (string.matches(pattern)) {
				System.out.println("String contains only one word.");
			} else {
				System.out.println("String contains more than one word.");
			}

		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

}
