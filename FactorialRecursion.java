package DateAndTime;

import java.util.Scanner;

class FactorialRecursion {
    public static void main(String[] args) {
        int number = takeInput("Enter a non-negative integer to find factorial: ");
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    static int takeInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        while (!input.hasNextInt()) {
            System.err.print("Invalid input. " + message);
            input.next();
        }
        int num = input.nextInt();
        while (num < 0) {
            System.err.print("Number must be non-negative. " + message);
            num = input.nextInt();
        }
        return num;
    }

    static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
