package java_string;

import java.util.Scanner;

public class Level103 {
    // Method to convert string to char array manually
    public static char[] toCharArrayManual(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // Method to compare char arrays
    public static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] manual = toCharArrayManual(text);
        char[] builtin = text.toCharArray();

        System.out.println("Arrays equal? " + compareArrays(manual, builtin));
    }
}
