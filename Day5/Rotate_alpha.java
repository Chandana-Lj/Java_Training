package day5;

import java.util.Scanner;

public class Rotate_alpha {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("enter the orginal string: ");
        String original = sc.nextLine();
        System.out.println("enter the rotated string: ");
        String rotated = sc.nextLine();
        String combined=original+original;
        if(combined.contains(rotated)) {
        	System.out.println("yes it is rotated");
        }
        else {
        	System.out.println("no it is rotated");
        }


	}

}
