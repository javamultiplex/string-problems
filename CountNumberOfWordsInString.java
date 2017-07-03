package com.javamultiplex.string;

import java.util.Scanner;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		
		Scanner input=null;
		try
		{
			input=new Scanner(System.in);
			System.out.println("Enter String: ");
			String string=input.nextLine();
			int words=0;
			if(isOnlyOneWordString(string))
			{
				System.out.println("Number of word(s) : 1");
			}
			else
			{
				if(isMultipleSpacesExistBetweenWords(string))
				{
					string=getStringAfterRemovingMultipleSpacesBetweenWords(string);
					
				}
				words=getNumberOfWordsInString(string);
				System.out.println("Number of word(s) : "+words);
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

	private static int getNumberOfWordsInString(String string) {
		
		String[] words=string.split("\\s");
		int count=words.length;
		return count;
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

	private static boolean isMultipleSpacesExistBetweenWords(String string) {
		
		String newString=string.trim();
		String pattern="([\\S]+\\s{0,1})+";
		boolean result=true;
		if(newString.matches(pattern))
		{
			result=false;
		}
		return result;
	}

	private static boolean isOnlyOneWordString(String string) {
		
		String newString=string.trim();
		boolean result=false;
		String pattern="^[\\S]+$";
		if(newString.matches(pattern))
		{
			result=true;
		}
		return result;
		
	}
	
	
}
