package string;
import java.util.*;
public class string03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a String :-");
		String str= sc.nextLine();
		
		char [] arr = {'a','e','i','o','u','A','E','I','O','U'};
		int n = arr.length; 
		int count =0 ;
		int i =0;
		while( i< str.length()) {
			int j =0; 
			while(j<arr.length) {
			if(str.charAt(i)==arr[j]) {
				count ++;
				break;
				
			}else {
				j++;
			}
		
		}
			i++;
		}
		System.out.println(count);
	}
}
