package java_control;

import java.util.Scanner;

class SmallestCheck {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int p = input.nextInt();
      int q = input.nextInt();
      int r = input.nextInt();
      System.out.println("Is the first number the smallest? " + (p < q && p < r));
      input.close();
   }
}
