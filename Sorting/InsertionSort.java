package com.kush;

import java.util.Arrays;

public class InsertionSort {

    /*
    Insertion Sort
    - We are partially sorting the array.
    - for every index you are at put that index element at the correct index of LHS
    - With every pass Selected part is going to get sorted
    - i will run for n-2
      because - for i = 0 sort till index 1
                for i = 1 sort till index 2
                for i = 2 sort till index 3
                ..... continue till n - 2
                and j = i+1 soo at last index it will out of bound
    - When element j is not smaller than previous element break the loop because the array will sorted
    - In worst case the complexity is O(N^2) because the worst case could be "array sorted in decreasing order"
    - Best case O(N) because it only make (N-1) Comparison that is linear graph
    - Why to use insertion
     - Number of swap get reduced in Best Case because of break.
     - Stable
     - Smaller values of N (length of an array)
     - Works good for partially sorted array. and can take part in Hybrid Sorting
    */

    public static void main(String[] args) {
        int[] arr = {34, 2, 78, 234, 107, 1, 32, 99};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(nums[j] < nums[j-1]){
                    swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] nums, int firstIndex, int secondIndex){
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }
}
