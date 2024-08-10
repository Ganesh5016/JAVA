package javaprogram;
import java.util.ArrayList;
import java.util.Collections;
public class mergearray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};       
       ArrayList<Integer> mergedList = new ArrayList<>();       
        for (int val : arr1) {
            mergedList.add(val);
        }
        
        for (int val : arr2) {
            mergedList.add(val);
        }
        Collections.sort(mergedList);       
        System.out.println("Merged and Sorted Array:");
        System.out.println(mergedList);
    }
}