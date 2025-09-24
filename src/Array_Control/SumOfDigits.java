package Array_Control;
import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input validation
        int number;
        do {
            System.out.print("Enter a positive number: ");
            while (!input.hasNextInt()) {
                System.err.print("Invalid input. Enter a positive integer: ");
                input.next();
            }
            number = input.nextInt();
        } while (number < 0);

        // Count digits
        int temp = number, count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Store digits in array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Calculate sum
        int sum = 0;
        for (int digit : digits) sum += digit;

        System.out.println("Sum of digits: " + sum);
        input.close();
    }
}
