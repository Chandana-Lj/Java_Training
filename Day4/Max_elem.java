package day4;

import java.util.*;

public class Max_elem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=sc.nextInt();
		
		int[] num=new int[n];
		System.out.println("enter" +n + "no.");
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		int max=num[0];
		for(int i=1;i<n;i++) {
			if(num[i]>max) {
				max=num[i];
			}
				
		}
		System.out.println("max elem in array is"+max);
		sc.close();
	}

}

