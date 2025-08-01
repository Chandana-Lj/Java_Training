package day5;

import java.util.Scanner;

public class Count_no_of_words {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the sentence:");
		String sentence=sc.nextLine();
		String[] words=sentence.split(" ");
		System.out.println(words.length);

	}

}
