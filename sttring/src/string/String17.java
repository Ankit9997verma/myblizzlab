package string;

import java.util.Scanner;

public class String17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String toggled = toggleCase(str);
        System.out.println("Toggled case: " + toggled);
    }

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch); // keep non-alphabetic characters as is
            }
        }

        return sb.toString();
    }
}
