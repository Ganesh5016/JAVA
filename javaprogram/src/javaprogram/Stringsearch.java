package javaprogram;

public class Stringsearch{
    public static void main(String[] args) {
        String inputString = "Hello, world!";
        char targetChar = 'o'; 
        int index = findCharacterIndex(inputString, targetChar);
        if (index != -1) {
            System.out.println("Character '" + targetChar + "' found at index: " + index);
        } else {
            System.out.println("Character '" + targetChar + "' not found in the string.");
        }
    }
    public static int findCharacterIndex(String str, char target) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == target) {
                return i;
            }
        }
        return -1; 
    }
}

