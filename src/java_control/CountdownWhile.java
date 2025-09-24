package java_control;
import java.util.Scanner;

class CountdownWhile {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      while (n >= 1) {
         System.out.println(n);
         n--;
      }
      input.close();
   }
}
