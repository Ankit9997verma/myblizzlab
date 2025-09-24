package Array_Control;

import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int EMPLOYEE_COUNT = 10;
        double[] salary = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonus = new double[EMPLOYEE_COUNT];
        double[] newSalary = new double[EMPLOYEE_COUNT];

        double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;

        // Input salary and years of service
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            do {
                System.out.print("Enter salary: ");
                while (!input.hasNextDouble()) {
                    System.err.print("Invalid input. Enter positive salary: ");
                    input.next();
                }
                salary[i] = input.nextDouble();
            } while (salary[i] <= 0);

            do {
                System.out.print("Enter years of service: ");
                while (!input.hasNextDouble()) {
                    System.err.print("Invalid input. Enter positive years: ");
                    input.next();
                }
                yearsOfService[i] = input.nextDouble();
            } while (yearsOfService[i] < 0);

            // Calculate bonus
            if (yearsOfService[i] > 5) bonus[i] = salary[i] * 0.05;
            else bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] +
                               ", Bonus = " + bonus[i] + ", New Salary = " + newSalary[i]);
        }
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        input.close();
    }
}
