package java_string;

import java.util.Scanner;

public class Level203 {
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

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] table = wordWithLength(words);

        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
