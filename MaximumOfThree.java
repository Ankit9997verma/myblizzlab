package DateAndTime;

import java.util.Scanner;

class MaximumOfThree {
    public static void main(String[] args) {
        int a = takeInput("Enter first number: ");
        int b = takeInput("Enter second number: ");
        int c = takeInput("Enter third number: ");

        int max = findMaximum(a, b, c);
        System.out.println("The maximum number is: " + max);
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

    static int findMaximum(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }
}
