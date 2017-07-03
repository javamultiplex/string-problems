package com.javamultiplex.string;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		
		Scanner input=null;
		try
		{
			input=new Scanner(System.in);
			System.out.println("Enter String : ");
			String string=input.next();
			char[] charArray=string.toCharArray();   //Coverting String to char Array
			System.out.println("Before removing duplicate characters : ");
			System.out.println(Arrays.toString(charArray));
			int length=charArray.length;
			Set<Character> charSet=new LinkedHashSet<>();
			for(int i=0;i<length;i++)
			{
				charSet.add(charArray[i]);
			}
			System.out.println("After removing duplicate characters : ");
			System.out.println(charSet.toString());
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
