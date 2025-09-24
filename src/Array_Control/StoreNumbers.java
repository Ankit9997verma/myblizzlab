package Array_Control;

import java.util.Scanner;

class StoreNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (stop at 0 or negative):");

        while (true) {
            if (index == numbers.length) {
                break;
            }
            double value = input.nextDouble();
            if (value <= 0) {
                break;
            }
            numbers[index] = value;
            total += value;
            index++;
        }

        System.out.println("\nNumbers Entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum = " + total);

        input.close();
    }
}

