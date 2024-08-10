package javaprogram;
public class Specialcharacters {
    public static void main(String[] args) {
        System.out.print("Please Enter Alpha Numeric Special String: ");
        String str = "Chinnu@2606";
        int alph = 0, digi = 0, spl = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                alph++;
            } else if (Character.isDigit(ch)) {
                digi++;
            } else {
                spl++;
            }
        }
        System.out.println("Number of Alphabet Characters: " + alph);
        System.out.println("Number of Digit Characters: " + digi);
        System.out.println("Number of Special Characters: " + spl);
    }
}