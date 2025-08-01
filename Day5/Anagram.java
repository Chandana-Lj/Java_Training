package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter the first string");
		String str1=sc.nextLine();
		System.out.println("Enter the second string");
		String str2=sc.nextLine();
		str1=str1.replaceAll(" ", "").toLowerCase();
		str2=str2.replaceAll(" ", "").toLowerCase();
		char[] arr1=str.toCharArray();		
		char[] arr2=str.toCharArray();		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (Arrays.equals(arr1,arr2)){
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
		
		}

}
