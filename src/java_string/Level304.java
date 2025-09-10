package java_string;

import java.util.Scanner;

public class Level304 {

    public static String[][] frequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        String[][] result = new String[text.length()][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] > 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0; // avoid duplicate count
                index++;
            }
        }

        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[][] result = frequency(input);

        System.out.println("Char\tFreq");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
