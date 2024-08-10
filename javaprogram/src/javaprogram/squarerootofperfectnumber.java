package javaprogram;
import java.util.Scanner; v    
public class squarerootofperfectnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        double sqrt = Math.sqrt(number);
        if (sqrt - Math.floor(sqrt) == 0) {
            System.out.println("Square Root: " + (int)sqrt + ", " + (-(int)sqrt));
        } else {
            System.out.println("The entered number is not a perfect square.");
        }
    }
}