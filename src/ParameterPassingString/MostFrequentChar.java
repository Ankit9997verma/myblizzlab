package ParameterPassingString;

//File: MostFrequentChar.java
import java.util.Scanner;

public class MostFrequentChar {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a string: ");
     String str = sc.nextLine();

     int[] freq = new int[256];
     for (char c : str.toCharArray()) {
         freq[c]++;
     }

     char mostFreq = ' ';
     int maxCount = 0;
     for (int i = 0; i < freq.length; i++) {
         if (freq[i] > maxCount) {
             maxCount = freq[i];
             mostFreq = (char) i;
         }
     }

     System.out.println("Most Frequent Character: '" + mostFreq + "'");
 }
}
