package com.javamultiplex.string;

import java.util.Scanner;

public class RemoveMultipleSpacesBetweenWords {

	
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
				
				string=getStringAfterRemovingMultipleSpacesBetweenWords(string);
				System.out.println("***String after removing multiple spaces.***\n"+string);
				
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

	private static String getStringAfterRemovingMultipleSpacesBetweenWords(
			String string) {
		
		int length=string.length();
		StringBuffer newString=new StringBuffer();
		for(int i=0;i<length;i++)
		{
			if(!(Character.isWhitespace(string.charAt(i))))
			{
				newString.append(string.charAt(i));
				if((i+1)<length && Character.isWhitespace(string.charAt(i+1)))
				{
					newString.append(string.charAt(i+1));
				}
			}
		}
		
		return newString.toString();
	}
	
}
