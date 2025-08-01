package day5;

import java.util.Scanner;

public class Vowels_and_Constants {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine().toLowerCase();
		int vowels=0, consonents=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLetter(ch)) {
				if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				vowels++;	
				}
				else {
					consonents++;
				}
				}
		}
		System.out.println("vowels:" +vowels);
		System.out.println("consonents:"+consonents);

	}

}
