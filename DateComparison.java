package DateAndTime;
import java.time.LocalDate;
import java.util.Scanner;

class DateComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter first date (yyyy-MM-dd): ");
            LocalDate date1 = LocalDate.parse(input.nextLine());

            System.out.print("Enter second date (yyyy-MM-dd): ");
            LocalDate date2 = LocalDate.parse(input.nextLine());

            if (date1.isBefore(date2)) {
                System.out.println(date1 + " is before " + date2);
            } else if (date1.isAfter(date2)) {
                System.out.println(date1 + " is after " + date2);
            } else if (date1.isEqual(date2)) {
                System.out.println(date1 + " is equal to " + date2);
            }
        } catch (Exception e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
        }

        input.close();
    }
}
