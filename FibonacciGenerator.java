package DateAndTime;

import java.util.Scanner;

class FibonacciGenerator {
    public static void main(String[] args) {
        int terms = takeInput("Enter number of Fibonacci terms: ");
        generateFibonacci(terms);
    }

    static int takeInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        while (!input.hasNextInt()) {
            System.err.print("Invalid input. " + message);
            input.next();
        }
        return input.nextInt();
    }

    static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
