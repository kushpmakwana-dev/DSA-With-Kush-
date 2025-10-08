package com.kush;

public class LinearSearch {
    /*
    Linear Search is an Algorithm that is going to iterate upon the entire "array" and check whether the target exists in that particular array or not
    if "yes" then it will send the position of that number and if "not" it will return "-1"

    time complexity of LinearSearch
    best case: O(1) it is the best case of time complexity
    worst case: O(N) it is the worst case of time complexity
    */

    public static void main(String[] args){
        int[] nums = {1, 4, 5, 22, 33, 45, 332, 223, 56};
        int target = 45;
        int results = search(nums, target);
        System.out.println(results);
    }

    static int search(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for (int i = 0; i <= arr.length-1; i++) {
            if (target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
