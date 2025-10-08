package com.kush;
import java.util.Arrays;
public class CyclicSort {
    /*
    - When given range like from 1 to N then use Cyclic Sort
    - When a number is sorted then the index is going to be that VALUE - 1.
    - If -> my array is {3, 5, 2, 1, 4}
            after sorting -> {1, 2, 3, 4, 5}
            Value -> Position
            1 -> 0
            2 -> 1
            3 -> 2
            4 -> 3
            5 -> 4
        The Position is always Value - 1
    - In worst case we will make N-1 Swaps and 5 comparisons
    (N-1) + N = (2N-1) = N
    Worst case complexity is O(N)
    */
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 4};
        sort(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void sort(int[] nums){
        int i = 0;

        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] nums, int firstIndex, int secondIndex){
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }
}
