package java_string;

import java.util.Scanner;

public class Level301 {

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);
            String status;

            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 24.9) status = "Normal";
            else if (bmi < 29.9) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.format("%.1f", weight);
            result[i][1] = String.format("%.1f", heightCm);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Display BMI Table
    public static void display(String[][] table) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        for (String[] row : table) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = calculateBMI(data);
        display(result);
    }
}
