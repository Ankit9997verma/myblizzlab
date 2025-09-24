package DateAndTime;

import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100. The computer will try to guess it.");

        int low = 1;
        int high = 100;
        boolean guessed = false;

        while (!guessed) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            String feedback = getFeedback(input);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Hooray! The computer guessed your number!");
                guessed = true;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input! Please enter 'high', 'low', or 'correct'.");
            }
        }

        input.close();
    }

    // Generate random guess between low and high
    static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    // Get feedback from user
    static String getFeedback(Scanner input) {
        System.out.print("Is the guess high, low, or correct? ");
        return input.nextLine();
    }
}
