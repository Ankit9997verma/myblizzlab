package java_string;

import java.util.Scanner;

public class Level201 {
    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // loop stops when charAt goes beyond limit
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int customLength = findLength(input);
        int builtinLength = input.length();

        System.out.println("Custom Length: " + customLength);
        System.out.println("Built-in Length: " + builtinLength);
    }
}
