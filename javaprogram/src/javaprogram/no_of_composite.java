package javaprogram;

public class no_of_composite {
    public static void main(String[] args) {
        int[] array1 = {16, 18, 27, 16, 23, 21, 19};
        findCompositeNumbers(array1);
    }
    public static void findCompositeNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isComposite(num)) {
                System.out.println(num);
            }
        }
    }
    public static boolean isComposite(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return true;
        }
        return false;
    }
}
