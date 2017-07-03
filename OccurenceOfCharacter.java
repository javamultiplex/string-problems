package com.javamultiplex.string;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		
		Scanner input=null;
		try
		{
			input=new Scanner(System.in);
			System.out.println("Enter String : ");
			String string=input.next();
			int length=string.length();
			System.out.println("Enter character : ");
			char character=input.next(".").charAt(0);
			int count=0;
			for(int i=0;i<length;i++)
			{
				if(string.charAt(i)==character)
				{
					count++;
				}
			}
			System.out.println("'"+character + "' occurences in "+"\""+string+"\" is "+count);
			
		}
		catch(InputMismatchException exception)
		{
			System.out.println("Please enter valid character.");
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
