package DateAndTime;

import java.util.Scanner;

class GcdLcmCalculator {
    public static void main(String[] args) {
        int a = takeInput("Enter first number: ");
        int b = takeInput("Enter second number: ");

        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b, gcd);

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
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

    static int calculateGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    static int calculateLCM(int x, int y, int gcd) {
        return (x * y) / gcd;
    }
}
