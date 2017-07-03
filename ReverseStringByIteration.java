package com.javamultiplex.string;

import java.util.Scanner;

public class ReverseStringByIteration {

	public static void main(String[] args) {
		
		Scanner input=null;
		try
		{
			input=new Scanner(System.in);
			System.out.println("Enter String :");
			String string=input.nextLine();
			int length=string.length();
			StringBuffer newString=new StringBuffer();
			for(int i=length-1;i>=0;i--)
			{
				newString.append(string.charAt(i));                  
			}
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
	
}
