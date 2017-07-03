package com.javamultiplex.string;

import java.util.Scanner;

public class ReverseWordsInString {

public static void main(String[] args) {
		
		Scanner input=null;
		try
		{
			input=new Scanner(System.in);
			System.out.println("Enter String: ");
			String string=input.nextLine();
			if(isOnlyOneWordString(string))
			{
				System.out.println("This is single word string, Please enter string with atleast 2 words.");
			}
			else
			{
				if(isMultipleSpacesExistBetweenWords(string))
				{
					string=getStringAfterRemovingMultipleSpacesBetweenWords(string);
					
				}
				string=getStringAfterReversingIndivisualWords(string);
				System.out.println("String after reversing indivisual words:\n"+string);
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



	private static String getStringAfterReversingIndivisualWords(String string) {
	
		String space=" ";
		String[] words=string.split(space);
		String word=null;
		StringBuffer result=new StringBuffer();
		int length=words.length;
		for(int i=0;i<length;i++)
		{
			word=words[i];
			word=getReversedString(word);
			result.append(word);
			if(i!=(length-1))
			{
				result.append(space);
			}
		}
		
		
	return result.toString();
}



	private static String getReversedString(String word) {
		
		String string="";
		int length=word.length();
		for(int i=length-1;i>=0;i--)
		{
			string+=word.charAt(i);
		}
		
		return string;
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
