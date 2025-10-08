package com.kush;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
        System.out.println(duplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(j!=nums[j]){
                return nums[j];
            }
        }

        return nums.length;
    }

    static int duplicate(int[] nums){
        int i = 0;
        while(i<nums.length){
            if(nums[i] != i + 1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return Integer.MIN_VALUE;
    }

    static void swap(int[] arr, int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

}
