package com.javamultiplex.string;

import java.util.Scanner;

public class ReversedStringByRecursion {

	public static void main(String[] args) {
		
		Scanner input=null;
		try
		{
			input=new Scanner(System.in);
			System.out.println("Enter String :");
			String string=input.nextLine();
			int length=string.length();
			String newString=getReverseString(string,length);
			System.out.println("Reversed String is :\n"+newString);
			
		}
		finally
		{
			if(input!=null)
			{
				input.close();
			}
		}
	}

	private static String getReverseString(String string,int length) {
		
		if(length==1)
			return String.valueOf(string.charAt(0));    //Converting char to String.
		else
			return string.charAt(length-1)+getReverseString(string,length-1);
		
	}
	
}
