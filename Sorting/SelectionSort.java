package com.kush;

import java.util.Arrays;

public class SelectionSort {
    /*
    Selection Sort
    - Select an element and put it to it correct position
    - Find the max (or min) and put in right position by swapping & you are done
    - Worst case = O(N^2)
    - Best case = O(N^2) because it is finding maximum value.
    - not stable sorting algo.
    - it is used for small lists.
    */
    public static void main(String[] args) {
        int[] arr = {34, 2, 78, 234, 107, 1, 32, 99};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int maxIndex = max(nums,0, last);
            swap(nums, maxIndex, last);
        }
    }

    static void swap(int[] nums, int firstIndex, int secondIndex){
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }

    static int max(int[] nums, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(nums[max] < nums[i]){
                max = i;
            }
        }
        return max;
    }
}
