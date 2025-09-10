package java_string;

import java.util.Scanner;

public class Level302 {

    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static char[] uniqueCharacters(String text) {
        int len = customLength(text);
        char[] unique = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique[index++] = c;
        }

        char[] finalArray = new char[index];
        for (int i = 0; i < index; i++) {
            finalArray[i] = unique[i];
        }
        return finalArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        char[] unique = uniqueCharacters(input);
        System.out.print("Unique Characters: ");
        for (char c : unique) System.out.print(c + " ");
    }
}

