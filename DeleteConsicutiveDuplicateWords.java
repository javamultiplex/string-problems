package com.javamultiplex.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteConsicutiveDuplicateWords {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String sentence = input.nextLine();
		String output = deleteConsicutiveDuplicateWords(sentence);
		System.out.println(output);
		input.close();
	}

	private static String deleteConsicutiveDuplicateWords(String sentence) {

		String[] words = sentence.split(" ");
		ArrayList<String> wordList = new ArrayList<>(Arrays.asList(words));
		int size = wordList.size();
		for (int i = 0; i < size - 1; i++) {
			if (wordList.get(i).equals(wordList.get(i + 1))) {
				wordList.remove(i);
				wordList.remove(i);
				i=-1;
				size=size-2;
			}
		}
		String result=String.join(" ", wordList);
		return result;
	}

}
