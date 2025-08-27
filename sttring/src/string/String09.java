package string;
import java.util.*;
public class String09 {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a string: ");
	        String str = sc.nextLine();

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            int ascii = (int) ch;  
	            System.out.println(ch + " -> " + ascii);
	        }
	        sc.close();
	}
}
