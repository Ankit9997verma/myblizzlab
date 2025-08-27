package string;
import java.util.*;

public class String10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();          
            result.append(sb).append(" "); 
        }

        System.out.println("Reversed words: " + result.toString().trim());
        sc.close();
    }
}
