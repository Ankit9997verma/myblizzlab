package string;
import java.util.*;
public class string02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String st= sc.nextLine();
		int n = st.length();
		StringBuilder sb = new StringBuilder();
		int i =0 ; 
		while(i< n) {
			char ch = st.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                sb.append((char)(ch - 'a' + 'A'));
            } else {
                sb.append(ch);
            }
            i++;
        }

        System.out.println("Uppercase string: " + sb.toString());
        
        sc.close();
	
	}
}
