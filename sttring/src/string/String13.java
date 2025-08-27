package string;

import java.util.Scanner;

public class String13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = removeDigits(str);
        System.out.println("String after removing digits: " + result);
    }

    public static String removeDigits(String str) {
        
        return str.replaceAll("\\d", "");
    }
}
