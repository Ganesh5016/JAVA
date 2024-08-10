package javaprogram;
import java.util.*;
public class Mean_median_mode {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 5, 6, 6, 6, 7 }; 
        double mean = calculateMean(array);
        System.out.println("Mean: " + mean);
        double median = calculateMedian(array);
        System.out.println("Median: " + median);
        int mode = calculateMode(array);
        System.out.println("Mode: " + mode);
    }
    public static double calculateMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }   
    public static double calculateMedian(int[] array) {
        Arrays.sort(array);
        int middle = array.length / 2;
        if (array.length % 2 == 0) {
            double median = (array[middle - 1] + array[middle]) / 2.0;
            return median;
        } else {
            return array[middle];
        }
    }  
    public static int calculateMode(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int mode = 0;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mode = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }6    
        return mode;
    }
}


.