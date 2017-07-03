package com.javamultiplex.string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category String Interview Question
 * @Problem Print all duplicate characters in a String
 *
 */
public class DuplicateCharactersInString {

	public static void main(String[] args) {
		
		Scanner input=null;
		try
		{
			input=new Scanner(System.in);
			System.out.println("Enter String: ");
			String string=input.next();
			
					char[] stringToChar=string.toCharArray();       //Converting String to char Array.
					int orignalLength=stringToChar.length,charCount=0;
					String newString=getStringAfterDuplicatesRemoval(stringToChar);
					char[] stringToCharAfterDuplicateRemoval=newString.toCharArray(); //Converting String to char Array.
					int newLength=stringToCharAfterDuplicateRemoval.length;
					if(string.equals(newString))
					{
						System.out.println("No duplicate character available.");
					}
					else
					{
						System.out.println("Duplicate characters are: ");
							for(int i=0;i<newLength;i++)
							{
								charCount=0;
								for(int j=0;j<orignalLength;j++)
								{
									if(stringToCharAfterDuplicateRemoval[i]==stringToChar[j])
									{
										charCount++;
									}
								}
								if(charCount>1)
								{
									System.out.println(stringToCharAfterDuplicateRemoval[i]);
								}
							}
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
		
	

	/*
	 * Removing duplicates by converting char Array to Set.
	 */
	private static String getStringAfterDuplicatesRemoval(char[] stringToChar) {
		HashSet<Character> set=new LinkedHashSet<>();
		String result="";
		int orignalLength=stringToChar.length;
		for(int i=0;i<orignalLength;i++)
		{
			set.add(stringToChar[i]);
		}
		Iterator<Character> iterator=set.iterator();
		while(iterator.hasNext())
		{
			result+=iterator.next();                //Converting Set to String
		}
		return result;
	}
	
}
