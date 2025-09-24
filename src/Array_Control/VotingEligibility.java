package Array_Control;

import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ageArray = new int[10];

        System.out.println("Enter the age of 10 students:");

        for (int i = 0; i < ageArray.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            int age = input.nextInt();

            if (age < 0) {
                System.err.println("Invalid age entered. Exiting program.");
                System.exit(0);
            }

            ageArray[i] = age;
        }

        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < ageArray.length; i++) {
            int age = ageArray[i];
            if (age >= 18) {
                System.out.println("Student " + (i + 1) + " with age " + age + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + age + " cannot vote.");
            }
        }

        input.close();
    }
}

