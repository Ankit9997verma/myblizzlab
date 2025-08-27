package string;
import java.util.*;

public class String08 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String st = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                st += "-";   
            } else {
                st += str.charAt(i);  
            }
        }

        System.out.println("Modified string: " + st);
        sc.close();
    }
}
