package javaprogram;
import java.util.*;

public class missingnumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1}; // Example input
        System.out.println("The missing number is: " + findMissingNumber(nums));
    }   
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }       
        return expectedSum - actualSum;
    }
}
