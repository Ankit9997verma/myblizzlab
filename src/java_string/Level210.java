package java_string;

import java.util.Random;
import java.util.Scanner;

public class Level210 {
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Physics 60–100
            scores[i][1] = rand.nextInt(41) + 60; // Chemistry
            scores[i][2] = rand.nextInt(41) + 60; // Math
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // total, avg, percent
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return results;
    }

    public static String[] assignGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percent = results[i][2];
            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else grades[i] = "D";
        }
        return grades;
    }

    public static void displayReport(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" +
                    (int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grades = assignGrades(results);
        displayReport(scores, results, grades);
    }
}
