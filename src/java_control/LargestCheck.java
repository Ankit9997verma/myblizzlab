package java_control;

import java.util.Scanner;

class LargestCheck {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int p = input.nextInt();
      int q = input.nextInt();
      int r = input.nextInt();
      System.out.println("Is the first number the largest? " + (p > q && p > r));
      System.out.println("Is the second number the largest? " + (q > p && q > r));
      System.out.println("Is the third number the largest? " + (r > p && r > q));
      input.close();
   }
}
