package javaprogram;
import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N value: ");
        int n = scanner.nextInt();
        System.out.print("Enter " + n + " digit number: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10; 
            number /= 10;       
        }
        while (sum >= 10) {
            sum = sum / 10 + sum % 10;
        }
        System.out.println("Sum of digits : " + sum);
    }
}
