package java_string;

public class Level104 {
    // Method to generate NullPointerException
    public static void generateNPE() {
        String text = null;
        System.out.println(text.length()); // Will throw NPE
    }

    // Method to handle NullPointerException
    public static void handleNPE() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // generateNPE(); // Uncomment to see abrupt stop
        handleNPE();
    }
}
