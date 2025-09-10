package java_string;

import java.util.Scanner;

public class Level206 {
    public static String classifyChar(char ch) {
        char lower = Character.toLowerCase(ch);
        if (lower >= 'a' && lower <= 'z') {
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')
                return "Vowel";
            else
                return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] classifyString(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = classifyChar(text.charAt(i));
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Char\tType");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[][] result = classifyString(input);
        displayTable(result);
    }
}
