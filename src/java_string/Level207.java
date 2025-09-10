package java_string;

import java.util.Scanner;

public class Level207 {
    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;

        return new int[]{start, end};
    }

    public static String customSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String trimmedCustom = customSubstring(input, indexes[0], indexes[1]);
        String trimmedBuiltin = input.trim();

        System.out.println("Custom Trim
