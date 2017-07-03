package com.javamultiplex.string;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category String Interview Questions
 * @problem How many vowels and consonants present in String?
 *
 */
public class CountVowelsAndConsonants {

 public static void main(String[] args) {

  Scanner input = null;
  try {
   input = new Scanner(System.in);
   System.out.println("Enter String : ");
   String string = input.next();
   // Converting String to lower case
   string = string.toLowerCase();
   int length = string.length();
   // Regular expression that matches a string containing a,e,i,o or u.
   String vowelsPattern = "[aeiou]";
   /**
    * Regular expression that matches a string containing other than
    * a,e,i,o or u.
    */
   String consonantsPattern = "[b-d]|[f-h]|[j-n]|[p-t]|[v-z]";
   String temp = null;
   int vowels = 0, consonants = 0;
   for (int i = 0; i < length; i++) {
    temp = String.valueOf(string.charAt(i));
    if (temp.matches(vowelsPattern)) {
     vowels++;
    } else if (temp.matches(consonantsPattern)) {
     consonants++;
    }
   }
   System.out.println("Vowels : " + vowels);
   System.out.println("Consonants : " + consonants);
  } finally {
   if (input != null) {
    input.close();
   }
  }

 }

}

