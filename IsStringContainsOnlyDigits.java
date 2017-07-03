package com.javamultiplex.string;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category String Problems
 * @problem How to check whether string contains only digits?
 *
 */
public class IsStringContainsOnlyDigits {

 public static void main(String[] args) {

  Scanner input = null;
  try {
   input = new Scanner(System.in);
   System.out.println("Enter String : ");
   String string = input.next();
   int length = string.length();
   int count = 0;
   for (int i = 0; i < length; i++) {
    /**
     * For checking whether particular character is digit or not we
     * can use isDigit(char c) method of Character class.
     */
    if (Character.isDigit(string.charAt(i))) {
     count++;
    } else {
     break;
    }
   }
   if (count == length) {
    System.out.println("String contains only digits.");
   } else {
    System.out.println("String not contains only digits.");
   }
  } finally {
   if (input != null) {
    input.close();
   }
  }

 }

}