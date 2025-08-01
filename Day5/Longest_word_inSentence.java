package day5;

import java.util.Scanner;

public class Longest_word_inSentence {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the sentence:");
		String sentence=sc.nextLine();
		String[] words=sentence.split(" ");
		String longest="";
		for(String word: words) {
			if(word.length()>longest.length()) {
				longest=word;
				
			}
		}
		System.out.println("longest:"+longest);
	}

}

