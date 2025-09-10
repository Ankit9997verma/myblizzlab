package java_string;

import java.util.Scanner;

public class Level209 {
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        return switch (choice) {
            case 0 -> "rock";
            case 1 -> "paper";
            default -> "scissors";
        };
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("rock") && comp.equals("scissors") ||
            user.equals("paper") && comp.equals("rock") ||
            user.equals("scissors") && comp.equals("paper")) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 1; i <= games; i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;

            System.out.println("Game " + i + ": User=" + user + ", Computer=" + comp + " → Winner=" + winner);
        }
