package string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class String11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = removeDuplicates(str);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (set.add(ch)) { 
                sb.append(ch);
            }
        }

        return sb.toString();
        
    }
}
