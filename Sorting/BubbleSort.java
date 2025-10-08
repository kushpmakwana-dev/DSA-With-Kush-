package com.kush;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        /*
        Bubble Sort
        - AKA Sinking Sort, Inplace and Bubble Sort.
        - Comparison sort method.
        - Step 1 - Every Step comparing Adjacent Element.
        - With Every pass the Array start getting sorted from end.
        - With pass number ith, the ith largest element come at ith  last position.
        - We will initialise i and j pointer where j is an internal loop, 'i' is going to keep the counter that iterates till n-1 times
        - Space Complexity is O(1)
        - Time Complexity in best case is O(N) and worst case is O(N^2).
        - When j never swap for ith pass which means that array is sorted
        - Last loop will not run because it will be sorted completely by last loop
        - i will run till 0 -> N-1
        - j will run from 0 --> N-i
        - It is a stable sorting algorithm, Original position is maintained of values that are equal.
         (In case of duplicates)
        */

        int[] arr = {34, 2, 78, 234, 107, 1, 32, 99};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] nums){
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped=false;
            for (int j = 1; j < nums.length - i; j++) {
                if(nums[j-1] > nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
        }
        }
    }

}
