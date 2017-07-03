package com.javamultiplex.string;

import java.util.Scanner;

public class IsStringContainsOnlyDigitsUsingRegularExpression {

	public static void main(String[] args) {
		
		Scanner input=null;
		try
		{
			input=new Scanner(System.in);
			System.out.println("Enter String: ");
			String string=input.next();
			/*
			 * Regular Expression that matches a string contains only digits
			 * and at least one digit should present.
			 */
			String Pattern="^[0-9]+$";            
			if(string.matches(Pattern))
			{
				System.out.println("String contains only digits.");
			}
			else
			{
				System.out.println("String not contains only digits.");
			}
		}
		finally
		{
			if(input!=null)
			{
				input.close();
			}
		}
		
	}
	
}
