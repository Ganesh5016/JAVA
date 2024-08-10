package javaprogram;
import java.util.Scanner;

public class powerofthree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        boolean result = isPowerOfThree(n);
        System.out.println(result);
    }
    public static boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
