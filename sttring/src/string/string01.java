package string;
import java.util.*;

public class string01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if(s1.equals(s2)) {
			System.out.println("case sensitive");
		}else {
			System.out.println("case sensitive not equal");
		}
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("case insensitive equal");
			
		}else {
			System.out.println("case insensitive not equal");
		}
		
		
	}
}
