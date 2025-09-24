package DateAndTime;

import java.util.Scanner;

class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Temperature Converter Menu:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option (1 or 2): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                double celsius = takeInput("Enter temperature in Celsius: ");
                System.out.println(celsius + "°C = " + celsiusToFahrenheit(celsius) + "°F");
                break;
            case 2:
                double fahrenheit = takeInput("Enter temperature in Fahrenheit: ");
                System.out.println(fahrenheit + "°F = " + fahrenheitToCelsius(fahrenheit) + "°C");
                break;
            default:
                System.err.println("Invalid option!");
        }

        input.close();
    }

    static double takeInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        while (!input.hasNextDouble()) {
            System.err.print("Invalid input. " + message);
            input.next();
        }
        return input.nextDouble();
    }

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
