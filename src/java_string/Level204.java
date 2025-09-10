package java_string;

import java.util.Scanner;

public class Level204 {
    public static String[] customSplit(String text) {
        return text.trim().split(" ");
    }

    public static int findLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    public static int[] findShortestLongest(String[] words) {
        int shortest = findLength(words[0]);
        int longest = findLength(words[0]);

        for (String word : words) {
            int len = findLength(word);
            if (len < shortest) shortest = len;
            if (len > longest) longest = len;
        }
        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        int[] result = findShortestLongest(words);

        System.out.println("Shortest word length: " + result[0]);
        System.out.println("Longest word length: " + result[1]);
    }
}
