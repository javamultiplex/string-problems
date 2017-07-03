package com.javamultiplex.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category String Interview Questions
 * @problem Check whether two Strings are anagram of each other or not.
 *
 */
public class Anagram {

	public static void main(String[] args) {
		
		Scanner input=null;
		try
		{
			input=new Scanner(System.in);
			System.out.println("Enter first string: ");
			String firstString=input.next();
			System.out.println("Enter second string: ");
			String secondString=input.next();
			int firstStringLength=firstString.length();
			int secondStringLength=secondString.length();
			List<Character> firstList=new ArrayList<>();
			List<Character> secondList=new ArrayList<>();
			for(int i=0;i<firstStringLength;i++)
			{
				firstList.add(firstString.charAt(i));            //Converting First String to List
			}
			for(int i=0;i<secondStringLength;i++)
			{
				secondList.add(secondString.charAt(i));         //Converting Second String to List
			}
			if(isAnagram(firstList,secondList))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
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

	private static boolean isAnagram(List<Character> firstList, List<Character> secondList) {
		
		int firstListSize=firstList.size();
		int secondListSize=secondList.size();
		boolean result=false;
		if(firstListSize==secondListSize)
		{
			if(firstList.containsAll(secondList) && secondList.containsAll(firstList))
			{
				result=true;
			}
		}
		return result;
	}
	
}
