package java_control;

import java.util.Scanner;

class FriendsCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ageAmar = input.nextInt();
        int heightAmar = input.nextInt();

        int ageAkbar = input.nextInt();
        int heightAkbar = input.nextInt();

        int ageAnthony = input.nextInt();
        int heightAnthony = input.nextInt();

        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Youngest: Amar");
        } else if (ageAkbar < ageAnthony) {
            System.out.println("Youngest: Akbar");
        } else {
            System.out.println("Youngest: Anthony");
        }

        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Tallest: Amar");
        } else if (heightAkbar > heightAnthony) {
            System.out.println("Tallest: Akbar");
        } else {
            System.out.println("Tallest: Anthony");
        }

        input.close();
    }
}
