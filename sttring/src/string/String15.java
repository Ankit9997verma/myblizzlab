package string;

import java.util.Scanner;

public class String15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isNumeric(str)) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains other characters as well.");
        }
    }

    public static boolean isNumeric(String str) {
       
        return str.matches("\\d+");
    }
}

