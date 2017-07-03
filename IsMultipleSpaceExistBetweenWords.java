package com.javamultiplex.string;

import java.util.Scanner;

public class IsMultipleSpaceExistBetweenWords {

	public static void main(String[] args) {
		
		
		Scanner input=null;
		try
		{
			input=new Scanner(System.in);
			System.out.println("Enter String : ");
			String string=input.nextLine();
			string=string.trim();
			/*
			 * Regular expression that matches a string contains non-whitespace characters
			 * separated by at most one whitespace.
			 */
			String pattern="^([\\S]+\\s{0,1})+$";
			if(string.matches(pattern))
			{
				System.out.println("String contains only single space between words.");
			}
			else
			{
				System.out.println("String contains multiple spaces between words.");
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
