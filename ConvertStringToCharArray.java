package com.javamultiplex.string;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertStringToCharArray {
	
	public static void main(String[] args) {
		
		Scanner input=null;
		try
		{
			input=new Scanner(System.in);
			System.out.println("Enter String : ");
			String string=input.next();
			char[] charArray=string.toCharArray();
			System.out.println("Character Array is :");
			/*
			 * For printing Array either we can use loop(for,while or do while)
			 * or
			 * toString() method of Arrays class
			 */
			System.out.println(Arrays.toString(charArray));
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
