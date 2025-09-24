package java_control;

import java.util.Scanner;

class NaturalSum {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      if (n >= 1) {
         int total = n * (n + 1) / 2;
         System.out.println("The sum of " + n + " natural numbers is " + total);
      } else {
         System.out.println("The number " + n + " is not a natural number");
      }
      input.close();
   }
}
