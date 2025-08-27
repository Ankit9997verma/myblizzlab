package string;

import java.util.Scanner;

public class String14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String result = capitalizeFirstLetters(sentence);
        System.out.println("After capitalization: " + result);
    }

    public static String capitalizeFirstLetters(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
     
                sb.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    sb.append(word.substring(1).toLowerCase());
                }
                sb.append(" "); 
            }
        }

        return sb.toString().trim();
    }
}
