package com.javamultiplex.string;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category String Problems
 * @problem String is palindrome or not? 
 *
 */
public class StringPalindromeUsingIteration {

 /**
  * There are 2 ways to check whether String is Palindrome or not. 
  * 1.Using library function of String class. 
  * 2.Using Iteration.
  * 
  * Here we are using 2nd method - using Iteration.
  */
 public static void main(String[] args) {

  Scanner input = null;
  try {
   input = new Scanner(System.in);
   System.out.println("Enter String : ");
   String string = input.next();
   int length = string.length();
   int j = length - 1;
   int count = 0, halflength = length / 2;
   for (int i = 0; i < halflength; i++) {
    if (string.charAt(i) == string.charAt(j)) {
     count++;
    } else {
     break;
    }
    j--;
   }
   if (count == halflength) {
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