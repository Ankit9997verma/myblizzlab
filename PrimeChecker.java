package DateAndTime;

import java.util.Scanner;

class PrimeChecker {
    public static void main(String[] args) {
        int number = takeInput("Enter a number to check for prime: ");
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
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

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
