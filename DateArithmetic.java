package DateAndTime;

import java.time.LocalDate;
import java.util.Scanner;

class DateArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String dateStr = input.nextLine();

        try {
            LocalDate date = LocalDate.parse(dateStr);

            // Add 7 days, 1 month, and 2 years
            LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);

            // Subtract 3 weeks
            newDate = newDate.minusWeeks(3);

            System.out.println("Original Date: " + date);
            System.out.println("Modified Date: " + newDate);
        } catch (Exception e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
        }

        input.close();
    }
}
