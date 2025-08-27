package string;
import java.util.*;
public class String07 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        int wordCount = st.countTokens();
        System.out.println("Number of words: " + wordCount);

        sc.close();
	}
}
