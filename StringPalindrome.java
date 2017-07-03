package com.javamultiplex.string;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category String Problems
 * @problem String is palindrome or not? 
 *
 */
public class StringPalindrome {

 /*
  * There are 2 ways to check whether String is Palindrome or not.
  *  1.Using library function of String class. 
  *  2.Using Iteration.
  * 
  * Here we are using 1st method - using library function of String class
  */
 public static void main(String[] args) {

  Scanner input = null;
  try {
   input = new Scanner(System.in);
   System.out.println("Enter String : ");
   String string = input.next();
   /*
    * There are 3 ways to Reverse any String. 
    * 1. Using library function of StringBuilder class. 
    * 2. Using Iteration method. 
    * 3. Using Recursion method.
    * 
    * Here we are using 1st method - using library function.
    */
   StringBuilder stringBuilder = new StringBuilder(string); 
   String newString = stringBuilder.reverse().toString();
   if (string.equals(newString)) {
    System.out.println("String is Palindrome.");
   } else {
    System.out.println("String is not Palindrome.");
   }
  } finally {
   if (input != null) {
    input.close();
   }
  }

 }

}
