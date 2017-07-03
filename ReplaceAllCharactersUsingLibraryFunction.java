package com.javamultiplex.string;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReplaceAllCharactersUsingLibraryFunction {

	
	public static void main(String[] args) {
		
		Scanner input=null;
		try
		{
			input=new Scanner(System.in);
			System.out.println("Enter String : ");
			String string=input.nextLine();
			System.out.println("Enter character that you want to replace : ");
			char character1=input.next(".").charAt(0);
			System.out.println("Enter new character that you want to replace with old character : ");
			char character2=input.next(".").charAt(0);
			string=string.replaceAll(String.valueOf(character1), String.valueOf(character2));
			System.out.println("String after replacement : ");
			System.out.println(string);
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
