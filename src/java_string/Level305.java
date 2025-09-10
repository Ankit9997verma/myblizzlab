package java_string;

import java.util.Scanner;

public class Level305 {

    public static char[] uniqueCharacters(String text) {
        char[] arr = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) arr[index++] = c;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = arr[i];
        return result;
    }

    public static String[][] frequencyWithUnique(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[][] result = frequencyWithUnique(input);
        System.out.println("Char\tFreq");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
