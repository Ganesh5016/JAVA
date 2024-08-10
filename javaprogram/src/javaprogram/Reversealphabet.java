package javaprogram;
import java.util.Arrays;
public class Reversealphabet {
    public static void main(String[] args) {
        String word = "chinnu";
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }
        String result = new String(charArray);
        System.out.println("Reversed alphabetical order: " + result);
    }
}
