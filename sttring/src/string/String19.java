
package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Map<Character, Integer> freq = charFrequency(str);
        System.out.println("Character frequencies: " + freq);
    }

    public static Map<Character, Integer> charFrequency(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return map;
    }
}
