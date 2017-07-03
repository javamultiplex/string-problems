package com.javamultiplex.string;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @Category String Problems
 * @Problem Reverse of String Using reverse() function
 *
 */
public class ReverseStringUsingInBuiltFunction {

	/*
	 * Here we are using reverse() function of StringBuffer class.
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner input=null;
		try
		{
			input=new Scanner(System.in);
			System.out.println("Enter String: ");
			String string=input.nextLine();
			/*
			 * Converting String to StringBuffer
			 */
			StringBuffer newString=new StringBuffer(string);  
			newString=newString.reverse();
			System.out.println("Reversed String:\n"+newString);
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
