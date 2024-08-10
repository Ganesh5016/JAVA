package javaprogram;
import java.util.Scanner;

public class Validname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        if (isValidUsername(username)) {
            System.out.println("Valid username.");
        } else {
            System.out.println("Invalid username.");
        }
    }
    public static boolean isValidUsername(String username) {
        // Check length
        if (username.length() < 5 || username.length() > 15) {
            return false;
        }
        if (!username.matches("[a-zA-Z0-9]+")) {
            return false;
        }
        if (Character.isDigit(username.charAt(0))) {
            return false;
        }
        return true;
    }
}
