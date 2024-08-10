package javaprogram;
import java.util.Arrays;
import java.util.Scanner;
public class alphabeticalreverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        StringBuilder reversedWord = new StringBuilder(new String(charArray));
        reversedWord.reverse();
        System.out.println("Reversed word in alphabetical order: " + reversedWord.toString());
    }
}
