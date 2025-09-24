package java_control;

import java.util.Scanner;

class DivisibleByFive {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int a = input.nextInt();
      System.out.println("Is the number " + a+ " divisible by 5? " + (a % 5 == 0));
      input.close();
   }
}
