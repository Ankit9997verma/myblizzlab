package java_control;
import java.util.Scanner;

class NumberCheck {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      if (n > 0) {
         System.out.println("positive");
      } else if (n < 0) {
         System.out.println("negative");
      } else {
         System.out.println("zero");
      }
      input.close();
   }
}
