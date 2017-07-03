package com.javamultiplex.string;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReplaceAllCharacters {

public static void main(String[] args) {
		
		Scanner input=null;
		try
		{
			input=new Scanner(System.in);
			System.out.println("Enter String : ");
			String string=input.nextLine();
			int length=string.length();
			System.out.println("Enter character that you want to replace : ");
			char character1=input.next(".").charAt(0);
			System.out.println("Enter new character that you want to replace with old character : ");
			char character2=input.next(".").charAt(0);
			StringBuilder newstring=new StringBuilder();
			for(int i=0;i<length;i++)
			{
				if(string.charAt(i)==character1)
				{
					newstring.append(character2);
				}
				else
				{
					newstring.append(string.charAt(i));
				}
			}
			System.out.println("String after replacement : ");
			System.out.println(newstring.toString());
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
