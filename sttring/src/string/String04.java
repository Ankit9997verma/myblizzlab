package string;
import java.util.*;
public class String04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count =0; 
		for(char ch: str.toCharArray()) {
			count++;
		}
		System.out.println(count);
	}
}
