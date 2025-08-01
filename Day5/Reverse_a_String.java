package day5;
import java.util.*;

public class Reverse_a_String {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        String reversed="";
	        for(int i=str.length()-1;i>=0;i--) {
	        	reversed+=str.charAt(i);
	        }
	        System.out.println("reversed string:"+reversed);
	}

}
