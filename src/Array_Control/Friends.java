package Array_Control;

import java.util.Scanner;

class Friends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // Input age and height
        for (int i = 0; i < 3; i++) {
            do {
                System.out.print("Enter age of " + names[i] + ": ");
                while (!input.hasNextInt()) {
                    System.err.print("Invalid input. Enter positive age: ");
                    input.next();
                }
                age[i] = input.nextInt();
            } while (age[i] <= 0);

            do {
                System.out.print("Enter height of " + names[i] + " (in cm): ");
                while (!input.hasNextDouble()) {
                    System.err.print("Invalid input. Enter positive height: ");
                    input.next();
                }
                height[i] = input.nextDouble();
            } while (height[i] <= 0);
        }

        // Find youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) youngestIndex = i;
            if (height[i] > height[tallestIndex]) tallestIndex = i;
        }

        System.out.println("Youngest: " + names[youngestIndex]);
        System.out.println("Tallest: " + names[tallestIndex]);
        input.close();
    }
}

