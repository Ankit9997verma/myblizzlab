package string;

import java.util.Scanner;

public class String05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a String :-");
		String str= sc.nextLine();
		StringBuilder sb  = new StringBuilder();
		
		for(int i =str.length()-1 ; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		sb.toString();
		if(str.equals(sb)) {
			System.out.println("yes string is a palindrome");
		}else {
			System.out.println("no string is not a palindrome ");
		}
		
	}
}
